# CMSynSet

A SynSet is an ambiguous noun.  A SynSet tells SimSage how to distinguish between different homoglyphs (same word) with different meanings.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**word** | **str** | the word that makes a synset group (an ambiguous noun language concept) (eg. &#39;bank&#39;) | 
**lemma** | **str** | the lemma of this word (ie. the simplified base, usually the same as the word, but the lemma of &#39;banks&#39; is &#39;bank&#39;) | 
**word_cloud_csv_list** | **str** | A list of word-clouds that form each distinct synset.  Each string in this variable is itself a csv string.  The first word of this cloud forms the distinct marker of the synset. | 

## Example

```python
from openapi_client.models.cm_syn_set import CMSynSet

# TODO update the JSON string below
json = "{}"
# create an instance of CMSynSet from a JSON string
cm_syn_set_instance = CMSynSet.from_json(json)
# print the JSON string representation of the object
print CMSynSet.to_json()

# convert the object into a dict
cm_syn_set_dict = cm_syn_set_instance.to_dict()
# create an instance of CMSynSet from a dict
cm_syn_set_form_dict = cm_syn_set.from_dict(cm_syn_set_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


