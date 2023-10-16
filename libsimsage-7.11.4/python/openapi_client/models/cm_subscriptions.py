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
from pydantic import BaseModel, Field, conlist
from openapi_client.models.cm_document import CMDocument
from openapi_client.models.cm_document_folder import CMDocumentFolder

class CMSubscriptions(BaseModel):
    """
    A set of items subscribed to.  # noqa: E501
    """
    folder_list: conlist(CMDocumentFolder) = Field(..., alias="folderList", description="list of folders subscribed to")
    document_list: conlist(CMDocument) = Field(..., alias="documentList", description="list of documents subscribed to")
    __properties = ["folderList", "documentList"]

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
    def from_json(cls, json_str: str) -> CMSubscriptions:
        """Create an instance of CMSubscriptions from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in document_list (list)
        _items = []
        if self.document_list:
            for _item in self.document_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['documentList'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSubscriptions:
        """Create an instance of CMSubscriptions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSubscriptions.parse_obj(obj)

        _obj = CMSubscriptions.parse_obj({
            "folder_list": [CMDocumentFolder.from_dict(_item) for _item in obj.get("folderList")] if obj.get("folderList") is not None else None,
            "document_list": [CMDocument.from_dict(_item) for _item in obj.get("documentList")] if obj.get("documentList") is not None else None
        })
        return _obj


