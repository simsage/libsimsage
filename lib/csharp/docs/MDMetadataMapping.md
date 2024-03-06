# Org.OpenAPITools.Model.MDMetadataMapping
A SimSage metadata-mapping.  This object represents a map of metadata between an external source and SimSage.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataType** | **string** | The SimSage data-type of the item | 
**Display** | **string** | A friendly display name for any UI component rendering this component | 
**ExtMetadata** | **string** | the external metadata item being mapped | 
**Metadata** | **string** | The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. | 
**StringValueList** | **string** | A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 
**NumberValueList** | **string** | Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

