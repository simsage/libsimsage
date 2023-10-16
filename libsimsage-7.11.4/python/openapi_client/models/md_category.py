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



from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr

class MDCategory(BaseModel):
    """
    A SimSage category is a metadata description in SimSage.  This object represents a single piece of categorical data that is uploaded to SimSage from external sources as part of a CMDocumentUpload request.  # noqa: E501
    """
    key: StrictStr = Field(..., description="The SimSage type of category")
    display: StrictStr = Field(..., description="A friendly display name for any UI component rendering this component")
    metadata: StrictStr = Field(..., description="The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string.")
    string_value_list: StrictStr = Field(..., alias="stringValueList", description="A list of string values (if string based) for this metadata category item.  These are the values this document \"belongs to\"")
    number_value_list: StrictStr = Field(..., alias="numberValueList", description="Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \"belongs to\"")
    sort: StrictBool = Field(..., description="Is this category to be sort-able in the UI?")
    order: StrictInt = Field(..., description="What order does this item have in the UI display?")
    sort_default: StrictStr = Field(..., alias="sortDefault", description="Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty.")
    sort_asc_text: StrictStr = Field(..., alias="sortAscText", description="If sortable, what label should the UI display for ascending sort?")
    sort_desc_text: StrictStr = Field(..., alias="sortDescText", description="If sortable, what label should the UI display for descending sort?")
    __properties = ["key", "display", "metadata", "stringValueList", "numberValueList", "sort", "order", "sortDefault", "sortAscText", "sortDescText"]

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
    def from_json(cls, json_str: str) -> MDCategory:
        """Create an instance of MDCategory from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> MDCategory:
        """Create an instance of MDCategory from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return MDCategory.parse_obj(obj)

        _obj = MDCategory.parse_obj({
            "key": obj.get("key"),
            "display": obj.get("display"),
            "metadata": obj.get("metadata"),
            "string_value_list": obj.get("stringValueList"),
            "number_value_list": obj.get("numberValueList"),
            "sort": obj.get("sort"),
            "order": obj.get("order"),
            "sort_default": obj.get("sortDefault"),
            "sort_asc_text": obj.get("sortAscText"),
            "sort_desc_text": obj.get("sortDescText")
        })
        return _obj


