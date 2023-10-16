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



from pydantic import BaseModel, Field, StrictStr

class CMTextToSearchEdit(BaseModel):
    """
    a semantic update/create object  # noqa: E501
    """
    search_type: StrictStr = Field(..., alias="searchType", description="the type, either \"and\" or \"sub\"")
    search_part: StrictStr = Field(..., alias="searchPart", description="the search-part")
    match_word_csv: StrictStr = Field(..., alias="matchWordCsv", description="A list of query matches")
    __properties = ["searchType", "searchPart", "matchWordCsv"]

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
    def from_json(cls, json_str: str) -> CMTextToSearchEdit:
        """Create an instance of CMTextToSearchEdit from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMTextToSearchEdit:
        """Create an instance of CMTextToSearchEdit from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMTextToSearchEdit.parse_obj(obj)

        _obj = CMTextToSearchEdit.parse_obj({
            "search_type": obj.get("searchType"),
            "search_part": obj.get("searchPart"),
            "match_word_csv": obj.get("matchWordCsv")
        })
        return _obj


