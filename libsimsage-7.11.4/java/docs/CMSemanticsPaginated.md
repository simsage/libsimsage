

# CMSemanticsPaginated

A semantic pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id). |  |
|**kbId** | **String** | the knowledge-base (its guid id). |  |
|**prevWord** | **String** | pagination control, the last semantic word we looked for previously |  |
|**pageSize** | **Integer** | the number of semantics to return at a time. |  |
|**filter** | **String** | An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated. |  |



