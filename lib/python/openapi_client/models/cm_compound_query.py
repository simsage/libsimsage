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
from pydantic import Field, StrictStr, conlist
from openapi_client.models.cm_slice_query_definition import CMSliceQueryDefinition

class CMCompoundQuery(CMSliceQueryDefinition):
    """
    CMCompoundQuery
    """
    type: StrictStr = Field(...)
    components: conlist(CMSliceQueryDefinition) = Field(...)
    __properties = ["type", "components"]

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
    def from_json(cls, json_str: str) -> CMCompoundQuery:
        """Create an instance of CMCompoundQuery from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in components (list)
        _items = []
        if self.components:
            for _item in self.components:
                if _item:
                    _items.append(_item.to_dict())
            _dict['components'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMCompoundQuery:
        """Create an instance of CMCompoundQuery from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMCompoundQuery.parse_obj(obj)

        _obj = CMCompoundQuery.parse_obj({
            "type": obj.get("type"),
            "components": [CMSliceQueryDefinition.from_dict(_item) for _item in obj.get("components")] if obj.get("components") is not None else None
        })
        return _obj


