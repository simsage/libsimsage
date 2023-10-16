

# CMSynonymsPaginated

a synonym paginated filter object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id). |  |
|**kbId** | **String** | the knowledge-base (its guid id). |  |
|**prevId** | **Integer** | pagination control, the last synonym we looked for previously |  [optional] |
|**pageSize** | **Integer** | the number of synonyms to return at a time. |  |
|**filter** | **String** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. |  |



