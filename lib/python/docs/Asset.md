# Asset

the asset that was seen

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | 
**parent_url** | **str** |  | 
**mime_type** | **str** |  | 
**acls** | [**List[AssetACL]**](AssetACL.md) |  | 
**title** | **str** |  | 
**author** | **str** |  | 
**binary_size** | **int** |  | 
**template** | **str** |  | 
**created** | **int** |  | 
**last_modified** | **int** |  | 
**metadata** | **Dict[str, str]** |  | 
**data** | **bytearray** |  | [optional] 
**preview_image** | **bytearray** |  | [optional] 

## Example

```python
from openapi_client.models.asset import Asset

# TODO update the JSON string below
json = "{}"
# create an instance of Asset from a JSON string
asset_instance = Asset.from_json(json)
# print the JSON string representation of the object
print Asset.to_json()

# convert the object into a dict
asset_dict = asset_instance.to_dict()
# create an instance of Asset from a dict
asset_form_dict = asset.from_dict(asset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


