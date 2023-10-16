

# CMTextToSearchPaginated

A text-to-search pagination object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organisationId** | **String** | the organisation (its guid id). |  |
|**kbId** | **String** | the knowledge-base (its guid id). |  |
|**prevWord** | **String** | pagination control, the last text-to-search word we looked for previously |  |
|**pageSize** | **Integer** | the number of text-to-search to return at a time. |  |
|**filter** | **String** | An optional string filter to apply to all text-to-search in the search.  Can be empty in which case SimSage will return all semantics paginated. |  |



