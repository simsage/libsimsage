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

class CMUserRole(BaseModel):
    """
    A user's SimSage-role inside an organisation.  SimSage roles determine what a user can do/access inside SimSage and are specific to SimSage.  Roles include admin (a SimSage administrator, super-user), manager (a SimSage manager, a user that has super-user access to one and one organisation only), operator (a SimSage operator, a user that can access the SimSage operator interface for a specific organisation), dms (a SimSage user that can sign-in to our Document Management System interface, specific to an organisation).  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id) this role applies to")
    role: StrictStr = Field(..., description="the SimSage role inside this organisation")
    __properties = ["organisationId", "role"]

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
    def from_json(cls, json_str: str) -> CMUserRole:
        """Create an instance of CMUserRole from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUserRole:
        """Create an instance of CMUserRole from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUserRole.parse_obj(obj)

        _obj = CMUserRole.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "role": obj.get("role")
        })
        return _obj


