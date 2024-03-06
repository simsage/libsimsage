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



from pydantic import BaseModel, Field, StrictStr

class CMPasswordResetRequest(BaseModel):
    """
    the password request object  # noqa: E501
    """
    email: StrictStr = Field(..., description="email address of the user wishing to reset their password.")
    reset_url: StrictStr = Field(..., alias="resetUrl", description="the callback url for the password.")
    __properties = ["email", "resetUrl"]

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
    def from_json(cls, json_str: str) -> CMPasswordResetRequest:
        """Create an instance of CMPasswordResetRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMPasswordResetRequest:
        """Create an instance of CMPasswordResetRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMPasswordResetRequest.parse_obj(obj)

        _obj = CMPasswordResetRequest.parse_obj({
            "email": obj.get("email"),
            "reset_url": obj.get("resetUrl")
        })
        return _obj


