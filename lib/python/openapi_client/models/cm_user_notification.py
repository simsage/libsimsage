# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.12.19
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr

class CMUserNotification(BaseModel):
    """
    A notification to a user from a subscription.  # noqa: E501
    """
    url: StrictStr = Field(..., description="The unique URL of a folder.")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of the owner of this folder")
    is_folder: StrictBool = Field(..., alias="isFolder", description="is this a notification for a folder or a file?")
    user_id: StrictStr = Field(..., alias="userId", description="the user to be notified, a guid")
    who_id: StrictStr = Field(..., alias="whoId", description="the user that made the change, a guid")
    email: StrictStr = Field(..., description="the email address of the user that made the change")
    notification_type: StrictStr = Field(..., alias="notificationType", description="the type of the notification")
    description: StrictStr = Field(..., description="the contents of the notification")
    created: StrictInt = Field(..., description="a unix-timestamp of the creation date-time of this record")
    folder: Optional[StrictBool] = None
    __properties = ["url", "sourceId", "isFolder", "userId", "whoId", "email", "notificationType", "description", "created", "folder"]

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
    def from_json(cls, json_str: str) -> CMUserNotification:
        """Create an instance of CMUserNotification from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUserNotification:
        """Create an instance of CMUserNotification from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUserNotification.parse_obj(obj)

        _obj = CMUserNotification.parse_obj({
            "url": obj.get("url"),
            "source_id": obj.get("sourceId"),
            "is_folder": obj.get("isFolder"),
            "user_id": obj.get("userId"),
            "who_id": obj.get("whoId"),
            "email": obj.get("email"),
            "notification_type": obj.get("notificationType"),
            "description": obj.get("description"),
            "created": obj.get("created"),
            "folder": obj.get("folder")
        })
        return _obj


