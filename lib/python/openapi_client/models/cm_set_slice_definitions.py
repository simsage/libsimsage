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
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.cm_slice_config import CMSliceConfig

class CMSetSliceDefinitions(BaseModel):
    """
    CMSetSliceDefinitions
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    task_id: StrictStr = Field(..., alias="taskId")
    slices: conlist(CMSliceConfig) = Field(...)
    __properties = ["organisationId", "taskId", "slices"]

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
    def from_json(cls, json_str: str) -> CMSetSliceDefinitions:
        """Create an instance of CMSetSliceDefinitions from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in slices (list)
        _items = []
        if self.slices:
            for _item in self.slices:
                if _item:
                    _items.append(_item.to_dict())
            _dict['slices'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSetSliceDefinitions:
        """Create an instance of CMSetSliceDefinitions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSetSliceDefinitions.parse_obj(obj)

        _obj = CMSetSliceDefinitions.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "task_id": obj.get("taskId"),
            "slices": [CMSliceConfig.from_dict(_item) for _item in obj.get("slices")] if obj.get("slices") is not None else None
        })
        return _obj


