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


from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr
from openapi_client.models.gdpr_project import GdprProject

class CMUpdateDocumentSet(BaseModel):
    """
    CMUpdateDocumentSet
    """
    organisation_id: StrictStr = Field(..., alias="organisationId")
    kb_id: StrictStr = Field(..., alias="kbId")
    project_details: GdprProject = Field(..., alias="projectDetails")
    job_id: StrictStr = Field(..., alias="jobId")
    return_address: StrictStr = Field(..., alias="returnAddress")
    error_str: StrictStr = Field(..., alias="errorStr")
    time_out: StrictInt = Field(..., alias="timeOut")
    var_async: StrictBool = Field(..., alias="async")
    is_return_result: StrictBool = Field(..., alias="isReturnResult")
    return_result: Optional[StrictBool] = Field(None, alias="returnResult")
    __properties = ["organisationId", "kbId", "projectDetails", "jobId", "returnAddress", "errorStr", "timeOut", "async", "isReturnResult", "returnResult"]

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
    def from_json(cls, json_str: str) -> CMUpdateDocumentSet:
        """Create an instance of CMUpdateDocumentSet from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of project_details
        if self.project_details:
            _dict['projectDetails'] = self.project_details.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUpdateDocumentSet:
        """Create an instance of CMUpdateDocumentSet from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUpdateDocumentSet.parse_obj(obj)

        _obj = CMUpdateDocumentSet.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "project_details": GdprProject.from_dict(obj.get("projectDetails")) if obj.get("projectDetails") is not None else None,
            "job_id": obj.get("jobId"),
            "return_address": obj.get("returnAddress"),
            "error_str": obj.get("errorStr"),
            "time_out": obj.get("timeOut"),
            "var_async": obj.get("async"),
            "is_return_result": obj.get("isReturnResult"),
            "return_result": obj.get("returnResult")
        })
        return _obj


