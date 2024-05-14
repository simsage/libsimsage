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

class JsonMessage(BaseModel):
    """
    A generic SimSage message class used throughout the system.  This class can be used to either send a success message (information) or an error message (error) but will never send you both at the same time.  Version might not always be set but is the version of the service-layer you're communicating with.  # noqa: E501
    """
    error: StrictStr = Field(..., description="A possible error message, empty if information is set")
    information: StrictStr = Field(..., description="An informational message, empty if error is set")
    version: StrictStr = Field(..., description="The version of this service (can be empty)")
    time: StrictInt = Field(..., description="The time this event occurred")
    __properties = ["error", "information", "version", "time"]

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
    def from_json(cls, json_str: str) -> JsonMessage:
        """Create an instance of JsonMessage from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> JsonMessage:
        """Create an instance of JsonMessage from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return JsonMessage.parse_obj(obj)

        _obj = JsonMessage.parse_obj({
            "error": obj.get("error"),
            "information": obj.get("information"),
            "version": obj.get("version"),
            "time": obj.get("time")
        })
        return _obj


