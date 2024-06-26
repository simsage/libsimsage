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
from pydantic import BaseModel, Field, StrictBool, StrictStr, conlist

class CMOrganisation(BaseModel):
    """
    A SimSage organisation object.  Represents a SimSage top-level tenant, aka. an organisation.  # noqa: E501
    """
    id: StrictStr = Field(..., description="the organisation (its guid id).")
    name: StrictStr = Field(..., description="the name of the organisation")
    enabled: StrictBool = Field(..., description="true if the organisation is enabled (active/operational)")
    auto_create_sso_users: StrictBool = Field(..., alias="autoCreateSSOUsers", description="if enabled, SSO users will auto-create their accounts")
    auto_create_sso_domain_list: conlist(StrictStr) = Field(..., alias="autoCreateSSODomainList", description="a list of the allowed domain postfixes for the emails (e.g. simsage.co.uk)")
    auto_create_ssoacl_list: conlist(StrictStr) = Field(..., alias="autoCreateSSOACLList", description="a list of the ACLs initially assigned to each new user of they need creating")
    auto_create_sso_role_list: conlist(StrictStr) = Field(..., alias="autoCreateSSORoleList", description="a list of the SimSage Roles initially assigned to each new user of they need creating")
    __properties = ["id", "name", "enabled", "autoCreateSSOUsers", "autoCreateSSODomainList", "autoCreateSSOACLList", "autoCreateSSORoleList"]

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
    def from_json(cls, json_str: str) -> CMOrganisation:
        """Create an instance of CMOrganisation from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMOrganisation:
        """Create an instance of CMOrganisation from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMOrganisation.parse_obj(obj)

        _obj = CMOrganisation.parse_obj({
            "id": obj.get("id"),
            "name": obj.get("name"),
            "enabled": obj.get("enabled"),
            "auto_create_sso_users": obj.get("autoCreateSSOUsers"),
            "auto_create_sso_domain_list": obj.get("autoCreateSSODomainList"),
            "auto_create_ssoacl_list": obj.get("autoCreateSSOACLList"),
            "auto_create_sso_role_list": obj.get("autoCreateSSORoleList")
        })
        return _obj


