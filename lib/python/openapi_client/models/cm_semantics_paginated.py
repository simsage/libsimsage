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

class CMSemanticsPaginated(BaseModel):
    """
    A semantic pagination object.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id).")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id).")
    prev_word: StrictStr = Field(..., alias="prevWord", description="pagination control, the last semantic word we looked for previously")
    page_size: StrictInt = Field(..., alias="pageSize", description="the number of semantics to return at a time.")
    filter: StrictStr = Field(..., description="An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.")
    __properties = ["organisationId", "kbId", "prevWord", "pageSize", "filter"]

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
    def from_json(cls, json_str: str) -> CMSemanticsPaginated:
        """Create an instance of CMSemanticsPaginated from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMSemanticsPaginated:
        """Create an instance of CMSemanticsPaginated from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSemanticsPaginated.parse_obj(obj)

        _obj = CMSemanticsPaginated.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "prev_word": obj.get("prevWord"),
            "page_size": obj.get("pageSize"),
            "filter": obj.get("filter")
        })
        return _obj


