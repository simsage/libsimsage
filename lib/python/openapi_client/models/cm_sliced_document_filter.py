# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.13.31
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

class CMSlicedDocumentFilter(BaseModel):
    """
    CMSlicedDocumentFilter
    """
    page: StrictInt = Field(...)
    page_size: StrictInt = Field(..., alias="pageSize")
    sort_direction: StrictInt = Field(..., alias="sortDirection")
    sort_column: StrictStr = Field(..., alias="sortColumn")
    statuses: conlist(StrictStr) = Field(...)
    selected_users: conlist(StrictStr) = Field(..., alias="selectedUsers")
    selected_sources: conlist(StrictStr) = Field(..., alias="selectedSources")
    selected_confidences: conlist(StrictStr) = Field(..., alias="selectedConfidences")
    __properties = ["page", "pageSize", "sortDirection", "sortColumn", "statuses", "selectedUsers", "selectedSources", "selectedConfidences"]

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
    def from_json(cls, json_str: str) -> CMSlicedDocumentFilter:
        """Create an instance of CMSlicedDocumentFilter from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSlicedDocumentFilter:
        """Create an instance of CMSlicedDocumentFilter from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSlicedDocumentFilter.parse_obj(obj)

        _obj = CMSlicedDocumentFilter.parse_obj({
            "page": obj.get("page"),
            "page_size": obj.get("pageSize"),
            "sort_direction": obj.get("sortDirection"),
            "sort_column": obj.get("sortColumn"),
            "statuses": obj.get("statuses"),
            "selected_users": obj.get("selectedUsers"),
            "selected_sources": obj.get("selectedSources"),
            "selected_confidences": obj.get("selectedConfidences")
        })
        return _obj


