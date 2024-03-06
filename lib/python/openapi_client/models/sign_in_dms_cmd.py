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


from typing import List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, conlist
from openapi_client.models.session import Session
from openapi_client.models.user import User

class SignInDmsCmd(BaseModel):
    """
    SignInDmsCmd
    """
    job_id: StrictStr = Field(..., alias="jobId")
    return_address: StrictStr = Field(..., alias="returnAddress")
    error_str: StrictStr = Field(..., alias="errorStr")
    time_out: StrictInt = Field(..., alias="timeOut")
    var_async: StrictBool = Field(..., alias="async")
    is_return_result: StrictBool = Field(..., alias="isReturnResult")
    email: StrictStr = Field(...)
    password: StrictStr = Field(...)
    roles: conlist(StrictStr) = Field(...)
    remote_address: StrictStr = Field(..., alias="remoteAddress")
    session: Session = Field(...)
    user: User = Field(...)
    organisation_id: StrictStr = Field(..., alias="organisationId")
    return_result: Optional[StrictBool] = Field(None, alias="returnResult")
    __properties = ["jobId", "returnAddress", "errorStr", "timeOut", "async", "isReturnResult", "email", "password", "roles", "remoteAddress", "session", "user", "organisationId", "returnResult"]

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
    def from_json(cls, json_str: str) -> SignInDmsCmd:
        """Create an instance of SignInDmsCmd from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of session
        if self.session:
            _dict['session'] = self.session.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SignInDmsCmd:
        """Create an instance of SignInDmsCmd from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SignInDmsCmd.parse_obj(obj)

        _obj = SignInDmsCmd.parse_obj({
            "job_id": obj.get("jobId"),
            "return_address": obj.get("returnAddress"),
            "error_str": obj.get("errorStr"),
            "time_out": obj.get("timeOut"),
            "var_async": obj.get("async"),
            "is_return_result": obj.get("isReturnResult"),
            "email": obj.get("email"),
            "password": obj.get("password"),
            "roles": obj.get("roles"),
            "remote_address": obj.get("remoteAddress"),
            "session": Session.from_dict(obj.get("session")) if obj.get("session") is not None else None,
            "user": User.from_dict(obj.get("user")) if obj.get("user") is not None else None,
            "organisation_id": obj.get("organisationId"),
            "return_result": obj.get("returnResult")
        })
        return _obj


