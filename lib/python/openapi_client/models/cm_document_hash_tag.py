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

class CMDocumentHashTag(BaseModel):
    """
    the document hash-tag object.  A list of hash-tags.  Each hash-tag must start with a '#' and only contain a..z,A..Z.  Minimum size 3 characters, maximum size 50 characters.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id of this context item, a guid-string")
    url: StrictStr = Field(..., description="The unique URL of a document.")
    hash_tag_list: conlist(StrictStr) = Field(..., alias="hashTagList", description="a list of hash-tags for this document")
    __properties = ["organisationId", "kbId", "url", "hashTagList"]

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
    def from_json(cls, json_str: str) -> CMDocumentHashTag:
        """Create an instance of CMDocumentHashTag from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentHashTag:
        """Create an instance of CMDocumentHashTag from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentHashTag.parse_obj(obj)

        _obj = CMDocumentHashTag.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "url": obj.get("url"),
            "hash_tag_list": obj.get("hashTagList")
        })
        return _obj


