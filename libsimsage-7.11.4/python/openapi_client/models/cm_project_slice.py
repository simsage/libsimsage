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
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.cm_slice_reassignment import CMSliceReassignment

class CMProjectSlice(BaseModel):
    """
    CMProjectSlice
    """
    id: StrictStr = Field(...)
    project_id: StrictStr = Field(..., alias="projectId")
    name: StrictStr = Field(...)
    description: StrictStr = Field(...)
    action: StrictStr = Field(...)
    reassignment_options: conlist(CMSliceReassignment) = Field(..., alias="reassignmentOptions")
    __properties = ["id", "projectId", "name", "description", "action", "reassignmentOptions"]

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
    def from_json(cls, json_str: str) -> CMProjectSlice:
        """Create an instance of CMProjectSlice from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in reassignment_options (list)
        _items = []
        if self.reassignment_options:
            for _item in self.reassignment_options:
                if _item:
                    _items.append(_item.to_dict())
            _dict['reassignmentOptions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMProjectSlice:
        """Create an instance of CMProjectSlice from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMProjectSlice.parse_obj(obj)

        _obj = CMProjectSlice.parse_obj({
            "id": obj.get("id"),
            "project_id": obj.get("projectId"),
            "name": obj.get("name"),
            "description": obj.get("description"),
            "action": obj.get("action"),
            "reassignment_options": [CMSliceReassignment.from_dict(_item) for _item in obj.get("reassignmentOptions")] if obj.get("reassignmentOptions") is not None else None
        })
        return _obj


