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
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, conlist
from openapi_client.models.cm_query_token import CMQueryToken

class CMResultsSection(BaseModel):
    """
    CMResultsSection
    """
    query_tokens: conlist(CMQueryToken) = Field(..., alias="queryTokens")
    caption: StrictStr = Field(...)
    has_sub_terms: StrictBool = Field(..., alias="hasSubTerms")
    count: StrictInt = Field(...)
    __properties = ["queryTokens", "caption", "hasSubTerms", "count"]

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
    def from_json(cls, json_str: str) -> CMResultsSection:
        """Create an instance of CMResultsSection from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in query_tokens (list)
        _items = []
        if self.query_tokens:
            for _item in self.query_tokens:
                if _item:
                    _items.append(_item.to_dict())
            _dict['queryTokens'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMResultsSection:
        """Create an instance of CMResultsSection from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMResultsSection.parse_obj(obj)

        _obj = CMResultsSection.parse_obj({
            "query_tokens": [CMQueryToken.from_dict(_item) for _item in obj.get("queryTokens")] if obj.get("queryTokens") is not None else None,
            "caption": obj.get("caption"),
            "has_sub_terms": obj.get("hasSubTerms"),
            "count": obj.get("count")
        })
        return _obj


