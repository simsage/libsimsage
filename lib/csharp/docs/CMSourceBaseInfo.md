# Org.OpenAPITools.Model.CMSourceBaseInfo
Source base-info represents information needed by external UI systems interacting with SimSage.  This object has information pertaining to a source in SimSage.  Its name, id, what sort of a source it is, and what sort of security integration (if any) this source has.  This object is contained inside a CMKnowledgeBaseInfo object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | the name of this source | 
**SourceId** | **int** | the id of this source | 
**SourceType** | **string** | the type of this source | 
**CustomRender** | **bool** | Does this source require custom render templates or use ordinary search-results? | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

