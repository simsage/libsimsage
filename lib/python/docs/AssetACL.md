# AssetACL


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**display_name** | **str** |  | 
**access** | **str** |  | 
**is_user** | **bool** |  | 
**membership_list** | **List[str]** |  | 
**user** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.asset_acl import AssetACL

# TODO update the JSON string below
json = "{}"
# create an instance of AssetACL from a JSON string
asset_acl_instance = AssetACL.from_json(json)
# print the JSON string representation of the object
print AssetACL.to_json()

# convert the object into a dict
asset_acl_dict = asset_acl_instance.to_dict()
# create an instance of AssetACL from a dict
asset_acl_form_dict = asset_acl.from_dict(asset_acl_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


