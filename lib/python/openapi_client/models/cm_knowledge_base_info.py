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
from pydantic import BaseModel, Field, StrictBool, StrictStr, conlist
from openapi_client.models.cm_source_base_info import CMSourceBaseInfo
from openapi_client.models.search_category import SearchCategory

class CMKnowledgeBaseInfo(BaseModel):
    """
    Knowledge base-info represents information needed by external UX systems interacting with SimSage.  This object contains information of a SimSage knowledge-base.  The name, and id of, and sources inside this knowledge-base.  # noqa: E501
    """
    name: StrictStr = Field(..., description="the name of this knowledge-base")
    id: StrictStr = Field(..., description="the knowledge-base id (its guid id)")
    category_list: conlist(SearchCategory) = Field(..., alias="categoryList", description="a list of metadata-categories present in this source, names and values.")
    source_list: conlist(CMSourceBaseInfo) = Field(..., alias="sourceList", description="the list of sources that are in this knowledge-base")
    project_kb: StrictBool = Field(..., alias="projectKb", description="Flag to indicate whether this knowledge-base was created for an 'Automate' data project")
    __properties = ["name", "id", "categoryList", "sourceList", "projectKb"]

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
    def from_json(cls, json_str: str) -> CMKnowledgeBaseInfo:
        """Create an instance of CMKnowledgeBaseInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in category_list (list)
        _items = []
        if self.category_list:
            for _item in self.category_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['categoryList'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in source_list (list)
        _items = []
        if self.source_list:
            for _item in self.source_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['sourceList'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMKnowledgeBaseInfo:
        """Create an instance of CMKnowledgeBaseInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMKnowledgeBaseInfo.parse_obj(obj)

        _obj = CMKnowledgeBaseInfo.parse_obj({
            "name": obj.get("name"),
            "id": obj.get("id"),
            "category_list": [SearchCategory.from_dict(_item) for _item in obj.get("categoryList")] if obj.get("categoryList") is not None else None,
            "source_list": [CMSourceBaseInfo.from_dict(_item) for _item in obj.get("sourceList")] if obj.get("sourceList") is not None else None,
            "project_kb": obj.get("projectKb")
        })
        return _obj


