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


from typing import Any, Dict
from pydantic import BaseModel, Field, StrictStr

class CMKnowledgeBaseExport(BaseModel):
    """
    the knowledge-base export config  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    kb_id: StrictStr = Field(..., alias="kbId")
    exporter: StrictStr = Field(...)
    export_config: Dict[str, Dict[str, Any]] = Field(..., alias="exportConfig")
    __properties = ["organisationId", "kbId", "exporter", "exportConfig"]

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
    def from_json(cls, json_str: str) -> CMKnowledgeBaseExport:
        """Create an instance of CMKnowledgeBaseExport from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMKnowledgeBaseExport:
        """Create an instance of CMKnowledgeBaseExport from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMKnowledgeBaseExport.parse_obj(obj)

        _obj = CMKnowledgeBaseExport.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "exporter": obj.get("exporter"),
            "export_config": obj.get("exportConfig")
        })
        return _obj


