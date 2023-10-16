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


from typing import List, Optional
from pydantic import BaseModel, Field, StrictStr, conlist

class CMFilter(BaseModel):
    """
    CMFilter
    """
    knowledge_base: StrictStr = Field(..., alias="knowledgeBase")
    filetypes: Optional[conlist(StrictStr)] = None
    sources: Optional[conlist(StrictStr)] = None
    __properties = ["knowledgeBase", "filetypes", "sources"]

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
    def from_json(cls, json_str: str) -> CMFilter:
        """Create an instance of CMFilter from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMFilter:
        """Create an instance of CMFilter from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMFilter.parse_obj(obj)

        _obj = CMFilter.parse_obj({
            "knowledge_base": obj.get("knowledgeBase"),
            "filetypes": obj.get("filetypes"),
            "sources": obj.get("sources")
        })
        return _obj


