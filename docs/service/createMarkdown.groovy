// Copyright (C) 2023  Egon Willighagen
// License: MIT

// groovy createMarkdown.groovy *.json

import groovy.json.JsonSlurper

templateFile = "template.md"

args.each { dataFile ->
if (dataFile != "template.json") {
  println dataFile
  fileContents = new File(dataFile).text
  def data = new JsonSlurper().parseText(fileContents)

  outputFile = new File(data.id + ".md")
  outputFile.text = ""

  lines = new File(templateFile).readLines()
  lines.each { String line ->
    if (line.contains("%id%")) { outputFile << line.replaceAll("%id%", data.id) } else
    if (line.contains("%service%")) { outputFile << line.replaceAll("%service%", data.service) } else
    if (line.contains("%url%")) { outputFile << line.replaceAll("%url%", data.url) } else
    if (line.contains("%description%")) { outputFile << line.replaceAll("%description%", data.description) } else
    if (line.contains("%screenshot%")) { outputFile << line.replaceAll("%screenshot%", data.screenshot) } else
    if (line.contains("%provider.name%")) { outputFile << line.replaceAll("%provider.name%", data.provider.name) } else
    if (line.contains("%provider.contact.name%")) { outputFile << line.replaceAll("%provider.contact.name%", data.provider.contact.name) } else
    if (line.contains("%access.login%")) { outputFile << line.replaceAll("%access.login%", data.access.login) } else
    { outputFile << line }
    outputFile << "\n"
  }
}
}
