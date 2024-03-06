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



from pydantic import BaseModel, Field, StrictInt, StrictStr

class CMDocumentNote(BaseModel):
    """
    A note attached to a document.  # noqa: E501
    """
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id of this context item, a guid-string")
    url: StrictStr = Field(..., description="The unique URL of a document.")
    note_id: StrictInt = Field(..., alias="noteId", description="The id of the note, starting at 1 note of 0 means create a new note")
    note_text: StrictStr = Field(..., alias="noteText", description="The text of the note")
    user_id: StrictStr = Field(..., alias="userId", description="The user's id")
    email: StrictStr = Field(..., description="the email address of the user that made the change")
    created: StrictInt = Field(..., description="a unix-timestamp of the creation date-time of this record")
    __properties = ["organisationId", "kbId", "url", "noteId", "noteText", "userId", "email", "created"]

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
    def from_json(cls, json_str: str) -> CMDocumentNote:
        """Create an instance of CMDocumentNote from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMDocumentNote:
        """Create an instance of CMDocumentNote from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMDocumentNote.parse_obj(obj)

        _obj = CMDocumentNote.parse_obj({
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "url": obj.get("url"),
            "note_id": obj.get("noteId"),
            "note_text": obj.get("noteText"),
            "user_id": obj.get("userId"),
            "email": obj.get("email"),
            "created": obj.get("created")
        })
        return _obj


