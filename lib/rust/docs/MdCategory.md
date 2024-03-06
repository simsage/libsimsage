# MdCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The SimSage type of category | 
**display** | **String** | A friendly display name for any UI component rendering this component | 
**metadata** | **String** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**string_value_list** | **String** | A list of string values (if string based) for this metadata category item.  These are the values this document \"belongs to\" | 
**number_value_list** | **String** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \"belongs to\" | 
**sort** | **bool** | Is this category to be sort-able in the UI? | 
**order** | **i32** | What order does this item have in the UI display? | 
**sort_default** | **String** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. | 
**sort_asc_text** | **String** | If sortable, what label should the UI display for ascending sort? | 
**sort_desc_text** | **String** | If sortable, what label should the UI display for descending sort? | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


