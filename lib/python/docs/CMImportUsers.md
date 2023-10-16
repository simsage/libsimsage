# CMImportUsers

a CSV file with users and group memberships.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organisation_id** | **str** | the organisation to import the users into (its guid id) | 
**file_type** | **str** | the upload allows SimSage programs in text format (text/plain) or spreadsheets to be uploaded. | 
**base64_text** | **str** | the base64 encoded comma separated values (csv).  Must be prefixed with &#39;;base64,&#39; | 

## Example

```python
from openapi_client.models.cm_import_users import CMImportUsers

# TODO update the JSON string below
json = "{}"
# create an instance of CMImportUsers from a JSON string
cm_import_users_instance = CMImportUsers.from_json(json)
# print the JSON string representation of the object
print CMImportUsers.to_json()

# convert the object into a dict
cm_import_users_dict = cm_import_users_instance.to_dict()
# create an instance of CMImportUsers from a dict
cm_import_users_form_dict = cm_import_users.from_dict(cm_import_users_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


