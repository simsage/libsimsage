# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.13.31
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, conlist
from openapi_client.models.cm_document_acl import CMDocumentAcl

class CMUpdateACLs(BaseModel):
    """
    the ACLs for the object  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id of this context item, a guid-string")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of the owner of the url")
    parent_id: StrictStr = Field(..., alias="parentId", description="the parent id of the update to update")
    object_id: StrictStr = Field(..., alias="objectId", description="the id of the update to update")
    item_type: StrictStr = Field(..., alias="itemType", description="the type of item to update, one of source, file or folder")
    acls: conlist(CMDocumentAcl) = Field(..., description="the initial ACLs for this source-folder.")
    apply_to_children: StrictBool = Field(..., alias="applyToChildren", description="apply these ACLs to any children of this object?")
    __properties = ["organisationId", "kbId", "sourceId", "parentId", "objectId", "itemType", "acls", "applyToChildren"]

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
    def from_json(cls, json_str: str) -> CMUpdateACLs:
        """Create an instance of CMUpdateACLs from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in acls (list)
        _items = []
        if self.acls:
            for _item in self.acls:
                if _item:
                    _items.append(_item.to_dict())
            _dict['acls'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUpdateACLs:
        """Create an instance of CMUpdateACLs from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUpdateACLs.parse_obj(obj)

        _obj = CMUpdateACLs.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "source_id": obj.get("sourceId"),
            "parent_id": obj.get("parentId"),
            "object_id": obj.get("objectId"),
            "item_type": obj.get("itemType"),
            "acls": [CMDocumentAcl.from_dict(_item) for _item in obj.get("acls")] if obj.get("acls") is not None else None,
            "apply_to_children": obj.get("applyToChildren")
        })
        return _obj


