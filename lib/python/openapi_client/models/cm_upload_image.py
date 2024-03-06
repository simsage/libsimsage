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



from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr

class CMUploadImage(BaseModel):
    """
    An external image representation object.  # noqa: E501
    """
    object_type: StrictStr = Field(..., alias="objectType", description="the type of this class, just in case this object is encrypted")
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the organisation (its guid id) this image should go into.")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base (its guid id) this image should go into.")
    sid: StrictStr = Field(..., description="the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.")
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id of this crawler (ie. the crawler's id) this image came from.")
    url: StrictStr = Field(..., description="A unique URL for this image, this should be the same as the document's URL this image belongs to.")
    mime_type: StrictStr = Field(..., alias="mimeType", description="The mime-type of this image, must be either image/jpeg or image/png.")
    puid: StrictStr = Field(..., description="The Pronom Unique ID for this image.")
    data: StrictStr = Field(..., description="the base64 encoded content of this image.  Must be prefixed with ';base64,'.")
    encrypted: StrictBool = Field(..., description="Do we need to add transport encryption")
    seed: StrictInt = Field(..., description="The seed used if encrypted")
    __properties = ["objectType", "organisationId", "kbId", "sid", "sourceId", "url", "mimeType", "puid", "data", "encrypted", "seed"]

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
    def from_json(cls, json_str: str) -> CMUploadImage:
        """Create an instance of CMUploadImage from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CMUploadImage:
        """Create an instance of CMUploadImage from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMUploadImage.parse_obj(obj)

        _obj = CMUploadImage.parse_obj({
            "object_type": obj.get("objectType"),
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "sid": obj.get("sid"),
            "source_id": obj.get("sourceId"),
            "url": obj.get("url"),
            "mime_type": obj.get("mimeType"),
            "puid": obj.get("puid"),
            "data": obj.get("data"),
            "encrypted": obj.get("encrypted"),
            "seed": obj.get("seed")
        })
        return _obj


