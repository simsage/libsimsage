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

class CMCreatedProject(BaseModel):
    """
    CMCreatedProject
    """
    define_project_task_id: StrictStr = Field(..., alias="defineProjectTaskId")
    project_id: StrictStr = Field(..., alias="projectId")
    __properties = ["defineProjectTaskId", "projectId"]

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
    def from_json(cls, json_str: str) -> CMCreatedProject:
        """Create an instance of CMCreatedProject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMCreatedProject:
        """Create an instance of CMCreatedProject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMCreatedProject.parse_obj(obj)

        _obj = CMCreatedProject.parse_obj({
            "define_project_task_id": obj.get("defineProjectTaskId"),
            "project_id": obj.get("projectId")
        })
        return _obj


