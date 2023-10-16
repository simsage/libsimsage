# CMDocument

A document is the main data carrying entity in SimSage.  A document can literally be a document like a pdf file found on a file-server, or a database-record, or something captured from a remote system like a web-page, or an image on a web-page.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) | 
**kb_id** | **str** | the knowledge-base id (its guid id) | 
**url** | **str** | A unique URL for this document. | 
**url_id** | **int** | A unique URL-id for this document. | 
**origin** | **str** | Where the document was sourced from (for external documents). | 
**title** | **str** | The title of this document, can be empty. | 
**author** | **str** | The author of this document, can be empty. | 
**document_type** | **str** | The file extension of this document, its type. | 
**created** | **int** | a unix-timestamp for the creation date-time of this document | 
**uploaded** | **int** | a unix-timestamp for the upload date-time of this document to SimSage | 
**last_modified** | **int** | a unix-timestamp for the last-modified date-time of this document | 
**crawled** | **int** | a unix-timestamp for when a SimSage crawler last looked at this document | 
**converted** | **int** | a unix-timestamp for when a SimSage converter last looked at this document | 
**parsed** | **int** | a unix-timestamp for when a SimSage parser last looked at this document | 
**indexed** | **int** | a unix-timestamp for when a SimSage indexer last looked at this document | 
**previewed** | **int** | a unix-timestamp for when a SimSage image-converter last looked at this document | 
**change_hash** | **str** | A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last. | 
**content_hash** | **str** | A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) | 
**parent_url** | **str** | a related url if there is parentage to be considered for an item | 
**acls** | [**List[CMDocumentAcl]**](CMDocumentAcl.md) | a list of the exact ACLs applying to this document (can be empty) | 
**metadata** | **Dict[str, str]** | a series of name values for other metadata values found in the container of this document | 
**num_sentences** | **int** | the number of sentences in this document. | 
**num_words** | **int** | the total number of words in this document. | 
**num_relationships** | **int** | the total number of relationships in this document. | 
**binary_size** | **int** | the size of the original document&#39;s binary in bytes. | 
**text_size** | **int** | the size of the converted document&#39;s text in bytes. | 
**version_list** | [**List[CMDocumentVersion]**](CMDocumentVersion.md) | list of binary versions of this document | 
**note_list** | [**List[CMDocumentNote]**](CMDocumentNote.md) | list of checkout notes about this document | 
**activity_list** | [**List[CMDocumentAudit]**](CMDocumentAudit.md) | list of activities for the last two months of this document | 
**type_description** | **str** | a description of the type of this document | 
**filename** | **str** | the filename of this document in the DMS system | 
**folder_id** | **str** | the folderId of this item in the DMS system | 

## Example

```python
from openapi_client.models.cm_document import CMDocument

# TODO update the JSON string below
json = "{}"
# create an instance of CMDocument from a JSON string
cm_document_instance = CMDocument.from_json(json)
# print the JSON string representation of the object
print CMDocument.to_json()

# convert the object into a dict
cm_document_dict = cm_document_instance.to_dict()
# create an instance of CMDocument from a dict
cm_document_form_dict = cm_document.from_dict(cm_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


