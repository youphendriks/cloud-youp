// Copyright (C) 2023  Egon Willighagen
// License: MIT

import groovy.json.JsonSlurper

dataFile = args[0]
templateFile = "template.md"

fileContents = new File(dataFile).text
def data = new JsonSlurper().parseText(fileContents)

lines = new File(templateFile).readLines()
lines.each { String line ->
  if (line.contains("%id%")) { println line.replaceAll("%id%", data.id) } else
  if (line.contains("%service%")) { println line.replaceAll("%service%", data.service) } else
  if (line.contains("%url%")) { println line.replaceAll("%url%", data.url) } else
  if (line.contains("%description%")) { println line.replaceAll("%description%", data.description) } else
  if (line.contains("%screenshot%")) { println line.replaceAll("%screenshot%", data.screenshot) } else
  if (line.contains("%provider.name%")) { println line.replaceAll("%provider.name%", data.provider.name) } else
  if (line.contains("%provider.contact.name%")) { println line.replaceAll("%provider.contact.name%", data.provider.contact.name) } else
  if (line.contains("%access.login%")) { println line.replaceAll("%access.login%", data.access.login) } else
  { println line }
}

