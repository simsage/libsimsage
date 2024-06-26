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

class MDMetadataMapping(BaseModel):
    """
    A SimSage metadata-mapping.  This object represents a map of metadata between an external source and SimSage.  # noqa: E501
    """
    data_type: StrictStr = Field(..., alias="dataType", description="The SimSage data-type of the item")
    display: StrictStr = Field(..., description="A friendly display name for any UI component rendering this component")
    ext_metadata: StrictStr = Field(..., alias="extMetadata", description="the external metadata item being mapped")
    metadata: StrictStr = Field(..., description="The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string.")
    string_value_list: StrictStr = Field(..., alias="stringValueList", description="A list of string values (if string based) for this metadata category item.  These are the values this document \"belongs to\"")
    number_value_list: StrictStr = Field(..., alias="numberValueList", description="Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \"belongs to\"")
    __properties = ["dataType", "display", "extMetadata", "metadata", "stringValueList", "numberValueList"]

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
    def from_json(cls, json_str: str) -> MDMetadataMapping:
        """Create an instance of MDMetadataMapping from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> MDMetadataMapping:
        """Create an instance of MDMetadataMapping from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return MDMetadataMapping.parse_obj(obj)

        _obj = MDMetadataMapping.parse_obj({
            "data_type": obj.get("dataType"),
            "display": obj.get("display"),
            "ext_metadata": obj.get("extMetadata"),
            "metadata": obj.get("metadata"),
            "string_value_list": obj.get("stringValueList"),
            "number_value_list": obj.get("numberValueList")
        })
        return _obj


