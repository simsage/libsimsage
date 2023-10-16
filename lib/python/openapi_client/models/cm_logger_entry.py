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



from pydantic import BaseModel, Field, StrictInt, StrictStr

class CMLoggerEntry(BaseModel):
    """
    This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.  # noqa: E501
    """
    message: StrictStr = Field(..., description="the main message of the log entry")
    type: StrictStr = Field(..., description="the type of log entry (eg. Debug, Info, Warn, Error)")
    service: StrictStr = Field(..., description="the name of the service that generated this log")
    stack_trace: StrictStr = Field(..., alias="stackTrace", description="the stack traces if applicable")
    created: StrictInt = Field(..., description="unit date-time of this log")
    __properties = ["message", "type", "service", "stackTrace", "created"]

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
    def from_json(cls, json_str: str) -> CMLoggerEntry:
        """Create an instance of CMLoggerEntry from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMLoggerEntry:
        """Create an instance of CMLoggerEntry from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMLoggerEntry.parse_obj(obj)

        _obj = CMLoggerEntry.parse_obj({
            "message": obj.get("message"),
            "type": obj.get("type"),
            "service": obj.get("service"),
            "stack_trace": obj.get("stackTrace"),
            "created": obj.get("created")
        })
        return _obj

