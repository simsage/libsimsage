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


from typing import List
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from openapi_client.models.cm_synonym import CMSynonym

class CMSynonymsPaginatedResult(BaseModel):
    """
    A paginated synonym return list matching a request for the same.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id).")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id).")
    filter: StrictStr = Field(..., description="The filter that was used to find these items.")
    synonym_list: conlist(CMSynonym) = Field(..., alias="synonymList", description="the resulting list of synonyms (return)")
    num_synonyms: StrictInt = Field(..., alias="numSynonyms", description="the total number of synonyms that matched.")
    __properties = ["organisationId", "kbId", "filter", "synonymList", "numSynonyms"]

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
    def from_json(cls, json_str: str) -> CMSynonymsPaginatedResult:
        """Create an instance of CMSynonymsPaginatedResult from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in synonym_list (list)
        _items = []
        if self.synonym_list:
            for _item in self.synonym_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['synonymList'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSynonymsPaginatedResult:
        """Create an instance of CMSynonymsPaginatedResult from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSynonymsPaginatedResult.parse_obj(obj)

        _obj = CMSynonymsPaginatedResult.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "filter": obj.get("filter"),
            "synonym_list": [CMSynonym.from_dict(_item) for _item in obj.get("synonymList")] if obj.get("synonymList") is not None else None,
            "num_synonyms": obj.get("numSynonyms")
        })
        return _obj


