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



from pydantic import BaseModel, Field, StrictStr

class CMRestoreFromText(BaseModel):
    """
    an object with the text to restore from  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id).")
    base64_text: StrictStr = Field(..., alias="base64Text", description="the base64 text to restore from.")
    file_type: StrictStr = Field(..., alias="fileType", description="the file-type of the base64 text (must be text/plain)")
    __properties = ["organisationId", "base64Text", "fileType"]

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
    def from_json(cls, json_str: str) -> CMRestoreFromText:
        """Create an instance of CMRestoreFromText from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMRestoreFromText:
        """Create an instance of CMRestoreFromText from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMRestoreFromText.parse_obj(obj)

        _obj = CMRestoreFromText.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "base64_text": obj.get("base64Text"),
            "file_type": obj.get("fileType")
        })
        return _obj


