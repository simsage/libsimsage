# MDMetadataMapping

A SimSage metadata-mapping.  This object represents a map of metadata between an external source and SimSage.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_type** | **str** | The SimSage data-type of the item | 
**display** | **str** | A friendly display name for any UI component rendering this component | 
**ext_metadata** | **str** | the external metadata item being mapped | 
**metadata** | **str** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**string_value_list** | **str** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**number_value_list** | **str** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 

## Example

```python
from openapi_client.models.md_metadata_mapping import MDMetadataMapping

# TODO update the JSON string below
json = "{}"
# create an instance of MDMetadataMapping from a JSON string
md_metadata_mapping_instance = MDMetadataMapping.from_json(json)
# print the JSON string representation of the object
print MDMetadataMapping.to_json()

# convert the object into a dict
md_metadata_mapping_dict = md_metadata_mapping_instance.to_dict()
# create an instance of MDMetadataMapping from a dict
md_metadata_mapping_form_dict = md_metadata_mapping.from_dict(md_metadata_mapping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


