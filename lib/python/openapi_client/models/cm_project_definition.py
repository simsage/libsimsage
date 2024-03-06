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


from typing import Dict, List, Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr, conlist
from openapi_client.models.cm_filter import CMFilter
from openapi_client.models.cm_keyed_search_term import CMKeyedSearchTerm
from openapi_client.models.cm_project_frame import CMProjectFrame
from openapi_client.models.cm_semantic_term import CMSemanticTerm

class CMProjectDefinition(BaseModel):
    """
    CMProjectDefinition
    """
    project_id: Optional[StrictStr] = Field(None, alias="projectId")
    task_id: Optional[StrictStr] = Field(None, alias="taskId")
    organisation_id: StrictStr = Field(..., alias="organisationId")
    project_frame: CMProjectFrame = Field(..., alias="projectFrame")
    keyed_search_terms: Optional[conlist(CMKeyedSearchTerm)] = Field(None, alias="keyedSearchTerms")
    semantic_terms: Optional[conlist(CMSemanticTerm)] = Field(None, alias="semanticTerms")
    filters: CMFilter = Field(...)
    validation_result: Optional[Dict[str, StrictBool]] = Field(None, alias="validationResult")
    __properties = ["projectId", "taskId", "organisationId", "projectFrame", "keyedSearchTerms", "semanticTerms", "filters", "validationResult"]

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
    def from_json(cls, json_str: str) -> CMProjectDefinition:
        """Create an instance of CMProjectDefinition from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of project_frame
        if self.project_frame:
            _dict['projectFrame'] = self.project_frame.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in keyed_search_terms (list)
        _items = []
        if self.keyed_search_terms:
            for _item in self.keyed_search_terms:
                if _item:
                    _items.append(_item.to_dict())
            _dict['keyedSearchTerms'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in semantic_terms (list)
        _items = []
        if self.semantic_terms:
            for _item in self.semantic_terms:
                if _item:
                    _items.append(_item.to_dict())
            _dict['semanticTerms'] = _items
        # override the default output from pydantic by calling `to_dict()` of filters
        if self.filters:
            _dict['filters'] = self.filters.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMProjectDefinition:
        """Create an instance of CMProjectDefinition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMProjectDefinition.parse_obj(obj)

        _obj = CMProjectDefinition.parse_obj({
            "project_id": obj.get("projectId"),
            "task_id": obj.get("taskId"),
            "organisation_id": obj.get("organisationId"),
            "project_frame": CMProjectFrame.from_dict(obj.get("projectFrame")) if obj.get("projectFrame") is not None else None,
            "keyed_search_terms": [CMKeyedSearchTerm.from_dict(_item) for _item in obj.get("keyedSearchTerms")] if obj.get("keyedSearchTerms") is not None else None,
            "semantic_terms": [CMSemanticTerm.from_dict(_item) for _item in obj.get("semanticTerms")] if obj.get("semanticTerms") is not None else None,
            "filters": CMFilter.from_dict(obj.get("filters")) if obj.get("filters") is not None else None,
            "validation_result": obj.get("validationResult")
        })
        return _obj


