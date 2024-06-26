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
from pydantic import BaseModel, Field, conlist
from openapi_client.models.cm_search_term import CMSearchTerm

class CMSearchDefinition(BaseModel):
    """
    CMSearchDefinition
    """
    keyed_queries: conlist(CMSearchTerm) = Field(..., alias="keyedQueries")
    semantic_term_queries: conlist(CMSearchTerm) = Field(..., alias="semanticTermQueries")
    __properties = ["keyedQueries", "semanticTermQueries"]

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
    def from_json(cls, json_str: str) -> CMSearchDefinition:
        """Create an instance of CMSearchDefinition from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in keyed_queries (list)
        _items = []
        if self.keyed_queries:
            for _item in self.keyed_queries:
                if _item:
                    _items.append(_item.to_dict())
            _dict['keyedQueries'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in semantic_term_queries (list)
        _items = []
        if self.semantic_term_queries:
            for _item in self.semantic_term_queries:
                if _item:
                    _items.append(_item.to_dict())
            _dict['semanticTermQueries'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSearchDefinition:
        """Create an instance of CMSearchDefinition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSearchDefinition.parse_obj(obj)

        _obj = CMSearchDefinition.parse_obj({
            "keyed_queries": [CMSearchTerm.from_dict(_item) for _item in obj.get("keyedQueries")] if obj.get("keyedQueries") is not None else None,
            "semantic_term_queries": [CMSearchTerm.from_dict(_item) for _item in obj.get("semanticTermQueries")] if obj.get("semanticTermQueries") is not None else None
        })
        return _obj


