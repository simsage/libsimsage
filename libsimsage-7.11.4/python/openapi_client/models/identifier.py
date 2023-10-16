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



from pydantic import BaseModel, Field, StrictStr, validator

class Identifier(BaseModel):
    """
    Identifier
    """
    identifier_type: StrictStr = Field(..., alias="identifierType")
    identifier: StrictStr = Field(...)
    __properties = ["identifierType", "identifier"]

    @validator('identifier_type')
    def identifier_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('CREDIT_CARD_NUMBER', 'ACCOUNT_NUMBER', 'POLICY_NUMBER'):
            raise ValueError("must be one of enum values ('CREDIT_CARD_NUMBER', 'ACCOUNT_NUMBER', 'POLICY_NUMBER')")
        return value

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
    def from_json(cls, json_str: str) -> Identifier:
        """Create an instance of Identifier from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Identifier:
        """Create an instance of Identifier from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Identifier.parse_obj(obj)

        _obj = Identifier.parse_obj({
            "identifier_type": obj.get("identifierType"),
            "identifier": obj.get("identifier")
        })
        return _obj


