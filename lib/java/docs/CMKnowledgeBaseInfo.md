

# CMKnowledgeBaseInfo

Knowledge base-info represents information needed by external UX systems interacting with SimSage.  This object contains information of a SimSage knowledge-base.  The name, and id of, and sources inside this knowledge-base.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | the name of this knowledge-base |  |
|**id** | **String** | the knowledge-base id (its guid id) |  |
|**categoryList** | [**List&lt;SearchCategory&gt;**](SearchCategory.md) | a list of metadata-categories present in this source, names and values. |  |
|**sourceList** | [**List&lt;CMSourceBaseInfo&gt;**](CMSourceBaseInfo.md) | the list of sources that are in this knowledge-base |  |
|**projectKb** | **Boolean** | Flag to indicate whether this knowledge-base was created for an &#39;Automate&#39; data project |  |



