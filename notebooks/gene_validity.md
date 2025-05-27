# ClinGen Gene Validity Data

```clj
(ns gene-validity
  {:nextjournal.clerk/toc true
   :nextjournal.clerk/visibility {:code :hide}}
  (:require [nextjournal.clerk :as clerk]
            [genegraph.docs :as docs]))
```

We present the full, structured standardized ClinGen Gene Validity data. The data set has been divided into two sets, one including only the latest curation on a given topic, the other includes all historical revisions. Both sets are available in JSON-LD and RDF formats.

* Latest revisions
  * [JSON-LD]()
  * [RDF]()
* All revisions
  * [JSON-LD]()
  * [RDF]()

ClinGen has a commitment to promoting and using data standards. The core structure as well as many of the attributes and classes are based on the [GA4GH Genomic Knowledge Standards](). Additional attribute and class defintions are drawn from standard ontologies and vocabularies whenever possible, such as [Sequence Ontology](), [Dublin Core](), [OWL](), and [RDFS](). Many other standard ontologies and vocabulares are used for ClinGen curation, including [HGNC](), [MONDO](), [Human Phenotype Ontology](), and [Gene Ontology]().

## Quickstart

### Assertion and Proposition

The root of a Gene Validity curation is an [EvidenceStrengthAssertion]() with a [GeneValidityProposition]() [subject]().

```clojure
	^{::clerk/auto-expand-results? true}
	(select-keys docs/zeb2 ["subject" "type" "evidenceStrength" "id" "specifiedBy"])
```

There's (a lot) more to a Gene Validity assertion than these few fields, but these give all the information needed to know the ClinGen assessment for a gene, disease, and mode of inheritance.

The Gene Validity Proposition represents the proposition that a gene is associated with a disease given a mode of inheritance. The example above translates to the statement:
 
> The ZEB2 gene (hgnc:14881) is associated with Mowat Wilson Syndrome (mondo:0009341), given an Autosomal Dominant (hp:0000006) mode of inheritance.

Creating the proposition says nothing at all about whether there's any evidence at all supporting (or rejecting!) the statement. An [EvidenceStrengthAssertion]() is needed for this. Taken all together, the example above translates to 

> There is a Definitive level of evidence supporting the association of the ZEB2 gene (hgnc:14881) with Mowat Wilson Syndrome (mondo:0009341), given an Autosomal Dominant (hp:0000006) mode of inheritance, according to the ClinGen Gene Validity Criteria, version 5.

### Contributions

The next obvious question is: "says who?" and also "when?".

```clojure
	^{::clerk/auto-expand-results? true}
	(select-keys docs/zeb2 ["subject" "type" "evidenceStrength" "id" "specifiedBy"])
```
