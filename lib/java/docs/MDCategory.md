

# MDCategory

A SimSage category is a metadata description in SimSage.  This object represents a single piece of categorical data that is uploaded to SimSage from external sources as part of a CMDocumentUpload request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The SimSage type of category |  |
|**display** | **String** | A friendly display name for any UI component rendering this component |  |
|**metadata** | **String** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. |  |
|**stringValueList** | **String** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; |  |
|**numberValueList** | **String** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; |  |
|**sort** | **Boolean** | Is this category to be sort-able in the UI? |  |
|**order** | **Integer** | What order does this item have in the UI display? |  |
|**sortDefault** | **String** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. |  |
|**sortAscText** | **String** | If sortable, what label should the UI display for ascending sort? |  |
|**sortDescText** | **String** | If sortable, what label should the UI display for descending sort? |  |



