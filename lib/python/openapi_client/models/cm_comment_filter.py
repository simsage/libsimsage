# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.13.31
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json



from pydantic import BaseModel, Field, StrictStr

class CMCommentFilter(BaseModel):
    """
    CMCommentFilter
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    project_id: StrictStr = Field(..., alias="projectId")
    slice_id: StrictStr = Field(..., alias="sliceId")
    document_key: StrictStr = Field(..., alias="documentKey")
    comment_level: StrictStr = Field(..., alias="commentLevel")
    __properties = ["organisationId", "projectId", "sliceId", "documentKey", "commentLevel"]

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
    def from_json(cls, json_str: str) -> CMCommentFilter:
        """Create an instance of CMCommentFilter from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMCommentFilter:
        """Create an instance of CMCommentFilter from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMCommentFilter.parse_obj(obj)

        _obj = CMCommentFilter.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "project_id": obj.get("projectId"),
            "slice_id": obj.get("sliceId"),
            "document_key": obj.get("documentKey"),
            "comment_level": obj.get("commentLevel")
        })
        return _obj


