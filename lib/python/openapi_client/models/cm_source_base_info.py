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



from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr

class CMSourceBaseInfo(BaseModel):
    """
    Source base-info represents information needed by external UI systems interacting with SimSage.  This object has information pertaining to a source in SimSage.  Its name, id, what sort of a source it is, and what sort of security integration (if any) this source has.  This object is contained inside a CMKnowledgeBaseInfo object.  # noqa: E501
    """
    name: StrictStr = Field(..., description="the name of this source")
    source_id: StrictInt = Field(..., alias="sourceId", description="the id of this source")
    source_type: StrictStr = Field(..., alias="sourceType", description="the type of this source")
    custom_render: StrictBool = Field(..., alias="customRender", description="Does this source require custom render templates or use ordinary search-results?")
    __properties = ["name", "sourceId", "sourceType", "customRender"]

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
    def from_json(cls, json_str: str) -> CMSourceBaseInfo:
        """Create an instance of CMSourceBaseInfo from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSourceBaseInfo:
        """Create an instance of CMSourceBaseInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSourceBaseInfo.parse_obj(obj)

        _obj = CMSourceBaseInfo.parse_obj({
            "name": obj.get("name"),
            "source_id": obj.get("sourceId"),
            "source_type": obj.get("sourceType"),
            "custom_render": obj.get("customRender")
        })
        return _obj


