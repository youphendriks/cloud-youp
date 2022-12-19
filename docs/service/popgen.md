# PopGen

Service to generate online virtual human population.

## External Service

* Website: [http://xnet.hsl.gov.uk/Popgen/](http://xnet.hsl.gov.uk/Popgen/)
* Login required: No
* Implementation status: 
* TLR: -
* Type: -
* Contact: infoline@hse.gov.uk
* API Type: [SOAP](http://xnet.hsl.gov.uk/Popgen/service.aspx)
* Categories: -
* Targeted users: Researchers
* Relevant VHP4Safety Use case: -

## Tool specifications

* Provided by: [UK Health and Safety Laboratory](http://www.hsl.gov.uk/)
* Citation: Willmann, S., Höhn, K., Edginton, A., Sevestre, M., Solodenko, J., Weiss, W., Lippert, J. and Schmitt, W. (2007). Development of a physiology-based whole-body population model for assessing the influence of individual variability on the pharmacokinetics of drugs. Journal of pharmacokinetics and pharmacodynamics, 34(3), 401-431. doi: [10.1007/s10928-007-9053-5](https://doi.org/10.1007/s10928-007-9053-5)
* Version: 0.3.11183.0
* License: Copyright by Bayer CropScience AG 2008
* Source Code: -
* Docker: -
* Bio.tools: -
* TeSS: -

## Tool integration

- [ ] Utilises the VHP4Safety APIs to ensure that each service is accessible to our proposed interoperability layer.
- [ ] Is annotated according to the semantic interoperability layer concept using defined ontologies.
- [ ] Is containerised for easy deployment in virtual environments of VHP4Safety instances.
- [ ] Has documented scientific and technical background.
- [ ] Is deployed into the VHP4Safety development environment.
- [ ] Is deployed into the VHP4Safety production environment.
- [ ] Is listed in the VHP4Safety discovery services.
- [ ] Is listed in other central repositories like eInfraCentral, bio.tools and TeSS (ELIXIR).
- [ ] Provides legal and ethical statements on how the service can be used.

<script type="application/ld+json">
{
  "@context": "https://schema.org/",
  "@type": "SoftwareApplication",
  "http://purl.org/dc/terms/conformsTo": {
      "@type": "CreativeWork", "@id": "https://bioschemas.org/profiles/ComputationalTool/1.0-RELEASE"
  },
  "@id" : "https://vhp4safety.github.io/cloud/service/popgen",
  "name": "PopGen", 
  "description": "Online virtual human population generator.",
  "url": "http://xnet.hsl.gov.uk/Popgen/"
}
</script>
