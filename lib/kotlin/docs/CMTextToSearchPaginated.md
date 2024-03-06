
# CMTextToSearchPaginated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisationId** | **kotlin.String** | the organisation (its guid id). | 
**kbId** | **kotlin.String** | the knowledge-base (its guid id). | 
**prevWord** | **kotlin.String** | pagination control, the last text-to-search word we looked for previously | 
**pageSize** | **kotlin.Int** | the number of text-to-search to return at a time. | 
**filter** | **kotlin.String** | An optional string filter to apply to all text-to-search in the search.  Can be empty in which case SimSage will return all semantics paginated. | 



