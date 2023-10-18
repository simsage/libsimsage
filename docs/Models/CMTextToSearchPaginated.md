# CMTextToSearchPaginated
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **organisationId** | **String** | the organisation (its guid id). | [default to null] |
| **kbId** | **String** | the knowledge-base (its guid id). | [default to null] |
| **prevWord** | **String** | pagination control, the last text-to-search word we looked for previously | [default to null] |
| **pageSize** | **Integer** | the number of text-to-search to return at a time. | [default to null] |
| **filter** | **String** | An optional string filter to apply to all text-to-search in the search.  Can be empty in which case SimSage will return all semantics paginated. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

