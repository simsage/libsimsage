# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.12.19
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
from openapi_client.models.cm_categorization import CMCategorization

class CMCategorizationPaginatedList(BaseModel):
    """
    A categorization pagination list.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id)")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id)")
    categorization_list: conlist(CMCategorization) = Field(..., alias="categorizationList", description="a list of categorizations, paginated")
    total_categorization_count: StrictInt = Field(..., alias="totalCategorizationCount", description="the total number of categorizations in SimSage for this org/kb")
    __properties = ["organisationId", "kbId", "categorizationList", "totalCategorizationCount"]

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
    def from_json(cls, json_str: str) -> CMCategorizationPaginatedList:
        """Create an instance of CMCategorizationPaginatedList from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in categorization_list (list)
        _items = []
        if self.categorization_list:
            for _item in self.categorization_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['categorizationList'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMCategorizationPaginatedList:
        """Create an instance of CMCategorizationPaginatedList from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMCategorizationPaginatedList.parse_obj(obj)

        _obj = CMCategorizationPaginatedList.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "categorization_list": [CMCategorization.from_dict(_item) for _item in obj.get("categorizationList")] if obj.get("categorizationList") is not None else None,
            "total_categorization_count": obj.get("totalCategorizationCount")
        })
        return _obj


