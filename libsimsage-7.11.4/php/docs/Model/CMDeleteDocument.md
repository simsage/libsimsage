# # CMDeleteDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **string** | the organisation (its guid id) this document is to be deleted for. |
**kb_id** | **string** | the knowledge-base (its guid id) this document is to be deleted for. |
**sid** | **string** | the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. |
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this document belongs to. |
**url** | **string** | A unique URL for this document. |
**encrypted** | **bool** | Do we need to add transport encryption |
**seed** | **int** | The seed used if encrypted |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
