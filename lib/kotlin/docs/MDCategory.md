
# MDCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **kotlin.String** | The SimSage type of category | 
**display** | **kotlin.String** | A friendly display name for any UI component rendering this component | 
**metadata** | **kotlin.String** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**stringValueList** | **kotlin.String** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**numberValueList** | **kotlin.String** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**sort** | **kotlin.Boolean** | Is this category to be sort-able in the UI? | 
**order** | **kotlin.Int** | What order does this item have in the UI display? | 
**sortDefault** | **kotlin.String** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. | 
**sortAscText** | **kotlin.String** | If sortable, what label should the UI display for ascending sort? | 
**sortDescText** | **kotlin.String** | If sortable, what label should the UI display for descending sort? | 



