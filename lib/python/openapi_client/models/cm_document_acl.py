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


from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr

class CMDocumentAcl(BaseModel):
    """
    A document Access Control List (ACL) item.  This item represents a user's/group's access to a document (hasAccess or not).  # noqa: E501
    """
    acl: StrictStr = Field(..., description="Some acl value, can represent a user's email address or the name of a remote security-group.")
    access: StrictStr = Field(..., description="is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty)")
    is_user: StrictBool = Field(..., alias="isUser", description="\"true\" if this a security-user (email address), \"false\" if this ACL pertains to a security-group (group name)")
    user: Optional[StrictBool] = None
    __properties = ["acl", "access", "isUser", "user"]

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
    def from_json(cls, json_str: str) -> CMDocumentAcl:
        """Create an instance of CMDocumentAcl from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentAcl:
        """Create an instance of CMDocumentAcl from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentAcl.parse_obj(obj)

        _obj = CMDocumentAcl.parse_obj({
            "acl": obj.get("acl"),
            "access": obj.get("access"),
            "is_user": obj.get("isUser"),
            "user": obj.get("user")
        })
        return _obj


