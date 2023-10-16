# # CMSemanticsPaginated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the organisation (its guid id). |
**kb_id** | **string** | the knowledge-base (its guid id). |
**prev_word** | **string** | pagination control, the last semantic word we looked for previously |
**page_size** | **int** | the number of semantics to return at a time. |
**filter** | **string** | An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
