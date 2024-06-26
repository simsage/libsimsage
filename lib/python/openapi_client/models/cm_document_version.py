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



from pydantic import BaseModel, Field, StrictInt, StrictStr

class CMDocumentVersion(BaseModel):
    """
    A version object description for a binary-document.  # noqa: E501
    """
    url: StrictStr = Field(..., description="The unique URL of this document.")
    version: StrictInt = Field(..., description="version of this binary")
    change_hash: StrictStr = Field(..., alias="changeHash", description="A unique hash-string identifying SimSage level changes of this document.")
    created: StrictInt = Field(..., description="a unix-timestamp for the creation of this document version")
    __properties = ["url", "version", "changeHash", "created"]

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
    def from_json(cls, json_str: str) -> CMDocumentVersion:
        """Create an instance of CMDocumentVersion from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentVersion:
        """Create an instance of CMDocumentVersion from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentVersion.parse_obj(obj)

        _obj = CMDocumentVersion.parse_obj({
            "url": obj.get("url"),
            "version": obj.get("version"),
            "change_hash": obj.get("changeHash"),
            "created": obj.get("created")
        })
        return _obj


