# cpLogD

<!-- this file is autogenerated. edit cplogd.json instead -->

A model to predict water–octanol distribution coefficient (logD) for chemical compounds. It is a proxy for the lipophilicity which is a major determinant of drug properties and overall suitability of drug candidates.



## Documentation

<h4 id="tess-widget-materials-header"></h4>

<div id="tess-widget-materials-list" class="tess-widget tess-widget-list"></div>
<script>
function initTeSSWidgets() {
    var query = '';
    if (query.trim() != "") {
        TessWidget.Materials(document.getElementById('tess-widget-materials-list'),
            'SimpleList',
            {
                opts: {
                  enableSearch: false
                },
                params: {
                    pageSize: 5,
                    q: query
                }
            });
        document.getElementById('tess-widget-materials-header').innerHTML = "Documentation from ELIXIR TeSS"
    }
}
</script>
<script async="" defer="" src="https://elixirtess.github.io/TeSS_widgets/js/tess-widget-standalone.js" onload="initTeSSWidgets()"></script>

## External Service Metadata

* Development cloud: [https://cplogd.cloud.vhp4safety.nl/](https://cplogd.cloud.vhp4safety.nl/) []()
* Login required: 
* Implementation status: 
* TRL: 
* Type: -
* Contact: Ola Spjuth 
* API Type: 
* Demo: []()
* Categories: -
* Targeted users: -
* Relevant VHP4Safety Use case: -

## Technical tool specifications

* Provided by: ArosBio ([https://arosbio.com/index.html](https://arosbio.com/index.html))
* Citation: [https://doi.org/10.1186/s13321-018-0271-1](https://doi.org/10.1186/s13321-018-0271-1)
* Version: 2.0.0
* License: Copyrighted by Aros Bio
* Source Code: [https://github.com/pharmbio/cplogd-v2.0](https://github.com/pharmbio/cplogd-v2.0)
* Docker: [https://github.com/pharmbio/cplogd-v2.0/pkgs/container/cplogd-v2.0](https://github.com/pharmbio/cplogd-v2.0/pkgs/container/cplogd-v2.0)
* Bio.tools: 
* FAIRsharing: 
* TeSS: 
* RSD: 
* Wikipedia: 

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
  "@id" : "https://vhp4safety.github.io/cloud/service/cplogd",
  "name": "cpLogD", 
  "description": "A model to predict water–octanol distribution coefficient (logD) for chemical compounds. It is a proxy for the lipophilicity which is a major determinant of drug properties and overall suitability of drug candidates.",
  "url": "https://cplogd.cloud.vhp4safety.nl/"
}
</script>