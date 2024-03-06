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
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.cmd_paragraph_summary import CMDParagraphSummary

class CMQueryFocussedSummarization(BaseModel):
    """
    A document summarization result (Multi Document Summarization)  # noqa: E501
    """
    summary: conlist(CMDParagraphSummary) = Field(..., description="the list of summary items")
    message: StrictStr = Field(..., description="a possible return message if not empty")
    __properties = ["summary", "message"]

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
    def from_json(cls, json_str: str) -> CMQueryFocussedSummarization:
        """Create an instance of CMQueryFocussedSummarization from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in summary (list)
        _items = []
        if self.summary:
            for _item in self.summary:
                if _item:
                    _items.append(_item.to_dict())
            _dict['summary'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMQueryFocussedSummarization:
        """Create an instance of CMQueryFocussedSummarization from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMQueryFocussedSummarization.parse_obj(obj)

        _obj = CMQueryFocussedSummarization.parse_obj({
            "summary": [CMDParagraphSummary.from_dict(_item) for _item in obj.get("summary")] if obj.get("summary") is not None else None,
            "message": obj.get("message")
        })
        return _obj


