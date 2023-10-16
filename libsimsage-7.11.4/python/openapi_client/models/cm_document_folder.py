# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.11.4
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from openapi_client.models.cm_document import CMDocument
from openapi_client.models.cm_document_acl import CMDocumentAcl

class CMDocumentFolder(BaseModel):
    """
    A document folder content item.  # noqa: E501
    """
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of the owner of this folder")
    url: StrictStr = Field(..., description="The unique URL of a document or folder.")
    parent_folder_id: StrictStr = Field(..., alias="parentFolderId", description="The id of the parent folder of this folder.")
    folder_id: StrictStr = Field(..., alias="folderId", description="The id of this folder.")
    url_id: StrictInt = Field(..., alias="urlId", description="the internal SimSage id for this url")
    folder_name: StrictStr = Field(..., alias="folderName", description="the display name of the folder")
    item_type: StrictStr = Field(..., alias="itemType", description="the type of folder (crawlerType for sources)")
    folder_list: conlist(CMDocumentFolder) = Field(..., alias="folderList", description="the folder items in this folder")
    file_list: conlist(CMDocument) = Field(..., alias="fileList", description="the files in this folder")
    acls: conlist(CMDocumentAcl) = Field(..., description="the security permissions for this item")
    __properties = ["sourceId", "url", "parentFolderId", "folderId", "urlId", "folderName", "itemType", "folderList", "fileList", "acls"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> CMDocumentFolder:
        """Create an instance of CMDocumentFolder from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in folder_list (list)
        _items = []
        if self.folder_list:
            for _item in self.folder_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['folderList'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in file_list (list)
        _items = []
        if self.file_list:
            for _item in self.file_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['fileList'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in acls (list)
        _items = []
        if self.acls:
            for _item in self.acls:
                if _item:
                    _items.append(_item.to_dict())
            _dict['acls'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentFolder:
        """Create an instance of CMDocumentFolder from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentFolder.parse_obj(obj)

        _obj = CMDocumentFolder.parse_obj({
            "source_id": obj.get("sourceId"),
            "url": obj.get("url"),
            "parent_folder_id": obj.get("parentFolderId"),
            "folder_id": obj.get("folderId"),
            "url_id": obj.get("urlId"),
            "folder_name": obj.get("folderName"),
            "item_type": obj.get("itemType"),
            "folder_list": [CMDocumentFolder.from_dict(_item) for _item in obj.get("folderList")] if obj.get("folderList") is not None else None,
            "file_list": [CMDocument.from_dict(_item) for _item in obj.get("fileList")] if obj.get("fileList") is not None else None,
            "acls": [CMDocumentAcl.from_dict(_item) for _item in obj.get("acls")] if obj.get("acls") is not None else None
        })
        return _obj

CMDocumentFolder.update_forward_refs()

