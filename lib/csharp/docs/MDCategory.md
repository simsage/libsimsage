# Org.OpenAPITools.Model.MDCategory
A SimSage category is a metadata description in SimSage.  This object represents a single piece of categorical data that is uploaded to SimSage from external sources as part of a CMDocumentUpload request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | The SimSage type of category | 
**Display** | **string** | A friendly display name for any UI component rendering this component | 
**Metadata** | **string** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**StringValueList** | **string** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**NumberValueList** | **string** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**Sort** | **bool** | Is this category to be sort-able in the UI? | 
**Order** | **int** | What order does this item have in the UI display? | 
**SortDefault** | **string** | Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. | 
**SortAscText** | **string** | If sortable, what label should the UI display for ascending sort? | 
**SortDescText** | **string** | If sortable, what label should the UI display for descending sort? | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

