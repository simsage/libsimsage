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

class CMSession(BaseModel):
    """
    A session object, A session's id is the \"session-id\" used throughout the SimSage API.  # noqa: E501
    """
    id: StrictStr = Field(..., description="the session-id, a guid")
    user_id: StrictStr = Field(..., alias="userId", description="the user associated with this session, their id, a guid")
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)")
    email: StrictStr = Field(..., description="email address of this user")
    ip_address: StrictStr = Field(..., alias="ipAddress", description="the ip-address of the user logging in if captured")
    last_access: StrictInt = Field(..., alias="lastAccess", description="a unix-timestamp of the last time this session was accessed/refreshed")
    role: StrictStr = Field(..., description="the main/highest role of the user signed-in")
    session_type: StrictStr = Field(..., alias="sessionType", description="the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)")
    __properties = ["id", "userId", "organisationId", "email", "ipAddress", "lastAccess", "role", "sessionType"]

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
    def from_json(cls, json_str: str) -> CMSession:
        """Create an instance of CMSession from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSession:
        """Create an instance of CMSession from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSession.parse_obj(obj)

        _obj = CMSession.parse_obj({
            "id": obj.get("id"),
            "user_id": obj.get("userId"),
            "organisation_id": obj.get("organisationId"),
            "email": obj.get("email"),
            "ip_address": obj.get("ipAddress"),
            "last_access": obj.get("lastAccess"),
            "role": obj.get("role"),
            "session_type": obj.get("sessionType")
        })
        return _obj

