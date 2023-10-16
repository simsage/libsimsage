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


from typing import Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr

class CMAddFolder(BaseModel):
    """
    the folder add object  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id of this context item, a guid-string")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of the owner of the url")
    folder_id: StrictStr = Field(..., alias="folderId", description="the id of the folder.")
    folder_name: StrictStr = Field(..., alias="folderName", description="the folder's new name.")
    prev_url: Optional[StrictStr] = Field(None, alias="prevUrl", description="pagination, the previous last URL for the page-set (null is first page)")
    page_size: StrictInt = Field(..., alias="pageSize", description="page-size for a paginated set")
    __properties = ["organisationId", "kbId", "sourceId", "folderId", "folderName", "prevUrl", "pageSize"]

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
    def from_json(cls, json_str: str) -> CMAddFolder:
        """Create an instance of CMAddFolder from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMAddFolder:
        """Create an instance of CMAddFolder from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMAddFolder.parse_obj(obj)

        _obj = CMAddFolder.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "source_id": obj.get("sourceId"),
            "folder_id": obj.get("folderId"),
            "folder_name": obj.get("folderName"),
            "prev_url": obj.get("prevUrl"),
            "page_size": obj.get("pageSize")
        })
        return _obj


