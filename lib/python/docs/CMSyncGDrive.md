# CMSyncGDrive

This object is used bythe GDrive crawler to synchronize Google Drive groups.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation (its guid id) this image should go into. | 
**kb_id** | **str** | the knowledge-base (its guid id) this image should go into. | 
**source_id** | **int** | the source-id of this crawler (ie. the crawler&#39;s id) this image came from. | 

## Example

```python
from openapi_client.models.cm_sync_g_drive import CMSyncGDrive

# TODO update the JSON string below
json = "{}"
# create an instance of CMSyncGDrive from a JSON string
cm_sync_g_drive_instance = CMSyncGDrive.from_json(json)
# print the JSON string representation of the object
print CMSyncGDrive.to_json()

# convert the object into a dict
cm_sync_g_drive_dict = cm_sync_g_drive_instance.to_dict()
# create an instance of CMSyncGDrive from a dict
cm_sync_g_drive_form_dict = cm_sync_g_drive.from_dict(cm_sync_g_drive_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


