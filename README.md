# VHP4Safety Cloud

Repository to document the services on the VHP4Safety Cloud, see this [index](docs/index.md)
or the [online website](https://vhp4safety.github.io/cloud/).

## Adding new services

* copy the `docs/services/template.json` file and adapt the content to the new service
* update the content and safe the file under `docs/services/uniqueID.json`

The GitHub website will take "action" and use the `JSON` to create a Markdown file, update
the catalog pages, as well as the `sitemap.xml` accordingly.

After the page is online:

* test the Bioschemas annotation with https://validator.schema.org/

Example Bioschemas annotation:

```json
{
  "@context": "https://schema.org/",
  "@type": "SoftwareApplication",
  "http://purl.org/dc/terms/conformsTo": {
      "@type": "CreativeWork", "@id": "https://bioschemas.org/profiles/ComputationalTool/1.0-RELEASE"
  },
  "@id" : "https://vhp4safety.github.io/cloud/service/aopwiki",
  "name": "AOP-Wiki Snorql UI", 
  "description": "Graphical interface to an AOP-Wiki SPARQL endpoint.",
  "url": "https://aopwiki.cloud.vhp4safety.nl/"
}
```
