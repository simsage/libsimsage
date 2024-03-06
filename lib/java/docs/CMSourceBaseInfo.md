

# CMSourceBaseInfo

Source base-info represents information needed by external UI systems interacting with SimSage.  This object has information pertaining to a source in SimSage.  Its name, id, what sort of a source it is, and what sort of security integration (if any) this source has.  This object is contained inside a CMKnowledgeBaseInfo object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | the name of this source |  |
|**sourceId** | **Integer** | the id of this source |  |
|**sourceType** | **String** | the type of this source |  |
|**customRender** | **Boolean** | Does this source require custom render templates or use ordinary search-results? |  |



