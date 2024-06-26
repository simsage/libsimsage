# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.14.12
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List
from pydantic import BaseModel, Field, StrictInt, conlist
from openapi_client.models.cm_project_document import CMProjectDocument

class CMPagedProjectDocuments(BaseModel):
    """
    CMPagedProjectDocuments
    """
    total: StrictInt = Field(...)
    results: conlist(CMProjectDocument) = Field(...)
    __properties = ["total", "results"]

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
    def from_json(cls, json_str: str) -> CMPagedProjectDocuments:
        """Create an instance of CMPagedProjectDocuments from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in results (list)
        _items = []
        if self.results:
            for _item in self.results:
                if _item:
                    _items.append(_item.to_dict())
            _dict['results'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMPagedProjectDocuments:
        """Create an instance of CMPagedProjectDocuments from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMPagedProjectDocuments.parse_obj(obj)

        _obj = CMPagedProjectDocuments.parse_obj({
            "total": obj.get("total"),
            "results": [CMProjectDocument.from_dict(_item) for _item in obj.get("results")] if obj.get("results") is not None else None
        })
        return _obj


