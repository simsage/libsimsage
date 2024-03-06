# # MDCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **string** | The SimSage type of category |
**display** | **string** | A friendly display name for any UI component rendering this component |
**metadata** | **string** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. |
**string_value_list** | **string** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; |
**number_value_list** | **string** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; |
**sort** | **bool** | Is this category to be sort-able in the UI? |
**order** | **int** | What order does this item have in the UI display? |
**sort_default** | **string** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. |
**sort_asc_text** | **string** | If sortable, what label should the UI display for ascending sort? |
**sort_desc_text** | **string** | If sortable, what label should the UI display for descending sort? |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
