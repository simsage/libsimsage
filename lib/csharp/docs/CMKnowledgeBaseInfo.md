# Org.OpenAPITools.Model.CMKnowledgeBaseInfo
Knowledge base-info represents information needed by external UX systems interacting with SimSage.  This object contains information of a SimSage knowledge-base.  The name, and id of, and sources inside this knowledge-base.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | the name of this knowledge-base | 
**Id** | **string** | the knowledge-base id (its guid id) | 
**CategoryList** | [**List&lt;SearchCategory&gt;**](SearchCategory.md) | a list of metadata-categories present in this source, names and values. | 
**SourceList** | [**List&lt;CMSourceBaseInfo&gt;**](CMSourceBaseInfo.md) | the list of sources that are in this knowledge-base | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

