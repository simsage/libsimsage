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



from pydantic import BaseModel, Field, StrictStr

class CMOperatorKnowledgeBase(BaseModel):
    """
    An association between a user (with an operator role) and a knowledge-base  # noqa: E501
    """
    user_id: StrictStr = Field(..., alias="userId", description="the user's id (its guid id) that is an operator")
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id) this operator applies to")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id) this operator applies to")
    __properties = ["userId", "organisationId", "kbId"]

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
    def from_json(cls, json_str: str) -> CMOperatorKnowledgeBase:
        """Create an instance of CMOperatorKnowledgeBase from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMOperatorKnowledgeBase:
        """Create an instance of CMOperatorKnowledgeBase from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMOperatorKnowledgeBase.parse_obj(obj)

        _obj = CMOperatorKnowledgeBase.parse_obj({
            "user_id": obj.get("userId"),
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId")
        })
        return _obj


