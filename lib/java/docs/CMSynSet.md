

# CMSynSet

A SynSet is an ambiguous noun.  A SynSet tells SimSage how to distinguish between different homoglyphs (same word) with different meanings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**word** | **String** | the word that makes a synset group (an ambiguous noun language concept) (eg. &#39;bank&#39;) |  |
|**lemma** | **String** | the lemma of this word (ie. the simplified base, usually the same as the word, but the lemma of &#39;banks&#39; is &#39;bank&#39;) |  |
|**wordCloudCsvList** | **String** | A list of word-clouds that form each distinct synset.  Each string in this variable is itself a csv string.  The first word of this cloud forms the distinct marker of the synset. |  |



