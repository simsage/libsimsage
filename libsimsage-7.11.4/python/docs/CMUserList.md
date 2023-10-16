# CMUserList

A paginated/filtered list of users with a total user count.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_list** | [**List[CMUser]**](CMUser.md) | the list of user objects. | 
**user_count** | **int** | the total user count. | 

## Example

```python
from openapi_client.models.cm_user_list import CMUserList

# TODO update the JSON string below
json = "{}"
# create an instance of CMUserList from a JSON string
cm_user_list_instance = CMUserList.from_json(json)
# print the JSON string representation of the object
print CMUserList.to_json()

# convert the object into a dict
cm_user_list_dict = cm_user_list_instance.to_dict()
# create an instance of CMUserList from a dict
cm_user_list_form_dict = cm_user_list.from_dict(cm_user_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


