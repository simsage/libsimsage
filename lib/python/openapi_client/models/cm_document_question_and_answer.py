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

class CMDocumentQuestionAndAnswer(BaseModel):
    """
    A basic document question/answer pair for AI  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id).")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id (guid) to use")
    url: StrictStr = Field(..., description="The unique URL of a document.")
    url_id: StrictInt = Field(..., alias="urlId", description="The unique URL-ID of a document.")
    conversation_list: StrictStr = Field(..., alias="conversationList", description="the context of the conversation thusfar")
    answer: StrictStr = Field(..., description="The answer for the given question")
    __properties = ["organisationId", "kbId", "url", "urlId", "conversationList", "answer"]

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
    def from_json(cls, json_str: str) -> CMDocumentQuestionAndAnswer:
        """Create an instance of CMDocumentQuestionAndAnswer from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentQuestionAndAnswer:
        """Create an instance of CMDocumentQuestionAndAnswer from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentQuestionAndAnswer.parse_obj(obj)

        _obj = CMDocumentQuestionAndAnswer.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "url": obj.get("url"),
            "url_id": obj.get("urlId"),
            "conversation_list": obj.get("conversationList"),
            "answer": obj.get("answer")
        })
        return _obj


