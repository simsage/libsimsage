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

class CMExternalCrawlerStart(BaseModel):
    """
    Start parameters.  # noqa: E501
    """
    object_type: StrictStr = Field(..., alias="objectType", description="the type of this class, just in case this object is encrypted")
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id of this context item, a guid-string")
    sid: StrictStr = Field(..., description="the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of this crawler (ie. the crawler's id)")
    run_id: StrictInt = Field(..., alias="runId", description="the id (a unix timestamp) of the current 'go through the source once'.  This is a unique per-run identifier.")
    encrypted: StrictBool = Field(..., description="Do we need to add transport encryption")
    seed: StrictInt = Field(..., description="The seed used if encrypted")
    __properties = ["objectType", "organisationId", "kbId", "sid", "sourceId", "runId", "encrypted", "seed"]

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
    def from_json(cls, json_str: str) -> CMExternalCrawlerStart:
        """Create an instance of CMExternalCrawlerStart from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMExternalCrawlerStart:
        """Create an instance of CMExternalCrawlerStart from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMExternalCrawlerStart.parse_obj(obj)

        _obj = CMExternalCrawlerStart.parse_obj({
            "object_type": obj.get("objectType"),
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "sid": obj.get("sid"),
            "source_id": obj.get("sourceId"),
            "run_id": obj.get("runId"),
            "encrypted": obj.get("encrypted"),
            "seed": obj.get("seed")
        })
        return _obj


