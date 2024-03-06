# # CMFailedSourceDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the main organisation (its guid id) for this source/crawler |
**kb_id** | **string** | the knowledge-base id (its guid id) for this source/crawler |
**source_id** | **int** | the source-id, primary key of the source |
**source_system_id** | **string** | the unique id of the document in the source system, mostly same as web url |
**web_url** | **string** | the web url to access the document, can be different from url |
**run_id** | **int** | the timestamp of the crawler run adding the exception |
**error_message** | **string** | the error message added by the system |
**encrypted** | **bool** | Do we need to add transport encryption |
**seed** | **int** | The seed used if encrypted |
**sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
