# # CMSynonymsPaginated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the organisation (its guid id). |
**kb_id** | **string** | the knowledge-base (its guid id). |
**prev_id** | **int** | pagination control, the last synonym we looked for previously | [optional]
**page_size** | **int** | the number of synonyms to return at a time. |
**filter** | **string** | An optional string filter to apply to all synonyms in the search.  Can be empty in which case SimSage will return all synonyms paginated. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
