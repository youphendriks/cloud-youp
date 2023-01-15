// Copyright (C) 2023  Egon Willighagen
// License: MIT

// groovy createMarkdown.groovy *.json

import groovy.json.JsonSlurper

templateFile = "template.md"

def getData(data, selector) {
  if (selector.contains(".")) {
    index = selector.indexOf(".")
    first = selector.substring(0,index)
    second = selector.substring(index+1)
    println first + " + " + second
    return getData(data[first], second)
  } else {
    if (data[selector]) {
      return data[selector]
    } else {
      return null
    }
  }
}

def process(line, data, selector) {
  return processRich(line, data, selector, null)
}

def processRich(line, data, selector, expanding) {
  toReplace = "%" + selector + "%"
  content = getData(data, selector)
  if (content == null) return line.replaceAll(toReplace, "")
  if (expanding != null) content = expanding.replaceAll(toReplace, content)
  return line.replaceAll(toReplace, content)
}


args.each { dataFile ->
if (dataFile != "template.json") {
  println dataFile
  fileContents = new File(dataFile).text
  def data = new JsonSlurper().parseText(fileContents)

  outputFile = new File(data.id + ".md")
  outputFile.text = ""

  lines = new File(templateFile).readLines()
  lines.each { String line ->
    if (line.contains("%id%")) { line = process(line, data, "id") }
    if (line.contains("%service%")) { line = process(line, data, "service") }
    if (line.contains("%url%")) { line = process(line, data, "url") }
    if (line.contains("%doi%")) { line = processRich(line, data, "doi", "[https://doi.org/%doi%](https://doi.org/%doi%)") }
    if (line.contains("%description%")) { line = process(line, data, "description") }
    if (line.contains("%screenshot%")) { line = processRich(line, data, "screenshot", "<img width=\"300\" align=\"right\" alt=\"screenshot of the service\" src=\"%screenshot%\">") }
    if (line.contains("%provider.name%")) { line = process(line, data, "provider.name") }
    if (line.contains("%provider.url%")) { line = processRich(line, data, "provider.url", "([%provider.url%](%provider.url%))") }
    if (line.contains("%provider.contact.name%")) { line = process(line, data, "provider.contact.name") }
    if (line.contains("%access.login%")) { line = process(line, data, "access.login") }
    outputFile << line + "\n"
  }
}
}
