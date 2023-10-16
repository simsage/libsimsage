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


from typing import Any, Dict, List
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.cm_search_definition import CMSearchDefinition
from openapi_client.models.cm_step_config import CMStepConfig

class CMProjectInfo(BaseModel):
    """
    CMProjectInfo
    """
    key: StrictStr = Field(...)
    caption: StrictStr = Field(...)
    description: StrictStr = Field(...)
    search: CMSearchDefinition = Field(...)
    steps: conlist(CMStepConfig) = Field(...)
    slice_actions: Dict[str, StrictStr] = Field(..., alias="sliceActions")
    screen_configs: Dict[str, Dict[str, Dict[str, Any]]] = Field(..., alias="screenConfigs")
    __properties = ["key", "caption", "description", "search", "steps", "sliceActions", "screenConfigs"]

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
    def from_json(cls, json_str: str) -> CMProjectInfo:
        """Create an instance of CMProjectInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of search
        if self.search:
            _dict['search'] = self.search.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in steps (list)
        _items = []
        if self.steps:
            for _item in self.steps:
                if _item:
                    _items.append(_item.to_dict())
            _dict['steps'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMProjectInfo:
        """Create an instance of CMProjectInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMProjectInfo.parse_obj(obj)

        _obj = CMProjectInfo.parse_obj({
            "key": obj.get("key"),
            "caption": obj.get("caption"),
            "description": obj.get("description"),
            "search": CMSearchDefinition.from_dict(obj.get("search")) if obj.get("search") is not None else None,
            "steps": [CMStepConfig.from_dict(_item) for _item in obj.get("steps")] if obj.get("steps") is not None else None,
            "slice_actions": obj.get("sliceActions"),
            "screen_configs": obj.get("screenConfigs")
        })
        return _obj

