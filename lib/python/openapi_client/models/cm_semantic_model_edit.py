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

class CMSemanticModelEdit(BaseModel):
    """
    a semantic update/create object  # noqa: E501
    """
    word: StrictStr = Field(..., description="The word of a semantic is the more specific concept (eg. in 'John is a person', then 'John' is the more specific concept, and 'person' is the semantic).")
    prev_word: StrictStr = Field(..., alias="prevWord", description="The previous value for 'word' if this is a semantic changing its word value (update)")
    semantic: StrictStr = Field(..., description="The semantic is the more general concept (eg. in 'John is a person', 'person' is the more general concept, and 'John' is more specific).")
    __properties = ["word", "prevWord", "semantic"]

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
    def from_json(cls, json_str: str) -> CMSemanticModelEdit:
        """Create an instance of CMSemanticModelEdit from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSemanticModelEdit:
        """Create an instance of CMSemanticModelEdit from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSemanticModelEdit.parse_obj(obj)

        _obj = CMSemanticModelEdit.parse_obj({
            "word": obj.get("word"),
            "prev_word": obj.get("prevWord"),
            "semantic": obj.get("semantic")
        })
        return _obj


