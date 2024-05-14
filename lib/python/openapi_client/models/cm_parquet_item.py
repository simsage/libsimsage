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

class CMParquetItem(BaseModel):
    """
    A single parquet item, a name with a timestamp.  # noqa: E501
    """
    name: StrictStr = Field(..., description="the name / type of item")
    time: StrictInt = Field(..., description="a unix-time for this parquet item")
    __properties = ["name", "time"]

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
    def from_json(cls, json_str: str) -> CMParquetItem:
        """Create an instance of CMParquetItem from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMParquetItem:
        """Create an instance of CMParquetItem from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMParquetItem.parse_obj(obj)

        _obj = CMParquetItem.parse_obj({
            "name": obj.get("name"),
            "time": obj.get("time")
        })
        return _obj


