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
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from openapi_client.models.cm_query_token import CMQueryToken

class CMDocumentsByToken(BaseModel):
    """
    CMDocumentsByToken
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    project_id: StrictStr = Field(..., alias="projectId")
    query_tokens: conlist(CMQueryToken) = Field(..., alias="queryTokens")
    page_size: StrictInt = Field(..., alias="pageSize")
    offset: StrictInt = Field(...)
    __properties = ["organisationId", "projectId", "queryTokens", "pageSize", "offset"]

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
    def from_json(cls, json_str: str) -> CMDocumentsByToken:
        """Create an instance of CMDocumentsByToken from a JSON string"""
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
    def from_dict(cls, obj: dict) -> CMDocumentsByToken:
        """Create an instance of CMDocumentsByToken from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentsByToken.parse_obj(obj)

        _obj = CMDocumentsByToken.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "project_id": obj.get("projectId"),
            "query_tokens": [CMQueryToken.from_dict(_item) for _item in obj.get("queryTokens")] if obj.get("queryTokens") is not None else None,
            "page_size": obj.get("pageSize"),
            "offset": obj.get("offset")
        })
        return _obj


