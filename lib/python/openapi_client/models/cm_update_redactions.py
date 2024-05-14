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
from openapi_client.models.cm_located_redaction import CMLocatedRedaction

class CMUpdateRedactions(BaseModel):
    """
    CMUpdateRedactions
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    project_id: StrictStr = Field(..., alias="projectId")
    slice_id: StrictStr = Field(..., alias="sliceId")
    document_key: StrictStr = Field(..., alias="documentKey")
    next_status: StrictStr = Field(..., alias="nextStatus")
    redactions: conlist(CMLocatedRedaction) = Field(...)
    __properties = ["organisationId", "projectId", "sliceId", "documentKey", "nextStatus", "redactions"]

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
    def from_json(cls, json_str: str) -> CMUpdateRedactions:
        """Create an instance of CMUpdateRedactions from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in redactions (list)
        _items = []
        if self.redactions:
            for _item in self.redactions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['redactions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUpdateRedactions:
        """Create an instance of CMUpdateRedactions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUpdateRedactions.parse_obj(obj)

        _obj = CMUpdateRedactions.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "project_id": obj.get("projectId"),
            "slice_id": obj.get("sliceId"),
            "document_key": obj.get("documentKey"),
            "next_status": obj.get("nextStatus"),
            "redactions": [CMLocatedRedaction.from_dict(_item) for _item in obj.get("redactions")] if obj.get("redactions") is not None else None
        })
        return _obj


