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



from pydantic import BaseModel, Field, StrictInt, StrictStr

class CMStartCrawler(BaseModel):
    """
    the source id and org/kb to process.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id)")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id)")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of this crawler (ie. the crawler's id)")
    url_list: StrictStr = Field(..., alias="urlList", description="an optional list of URLs (comma separated)")
    __properties = ["organisationId", "kbId", "sourceId", "urlList"]

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
    def from_json(cls, json_str: str) -> CMStartCrawler:
        """Create an instance of CMStartCrawler from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMStartCrawler:
        """Create an instance of CMStartCrawler from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMStartCrawler.parse_obj(obj)

        _obj = CMStartCrawler.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "source_id": obj.get("sourceId"),
            "url_list": obj.get("urlList")
        })
        return _obj


