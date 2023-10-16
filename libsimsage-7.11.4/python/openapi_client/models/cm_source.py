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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictBool, StrictFloat, StrictInt, StrictStr, conlist
from openapi_client.models.cm_document_acl import CMDocumentAcl

class CMSource(BaseModel):
    """
    A SimSage source object used for updating and creating SimSage crawlers/connections to external silos like Sharepoint, OneDrive, Exchange, DropBox, Box, iManage, and others.  # noqa: E501
    """
    source_id: StrictInt = Field(..., alias="sourceId", description="the source-id, primary key of the source")
    organisation_id: StrictStr = Field(..., alias="organisationId", description="the main organisation (its guid id) for this source/crawler")
    kb_id: StrictStr = Field(..., alias="kbId", description="the knowledge-base id (its guid id) for this source/crawler")
    node_id: StrictInt = Field(..., alias="nodeId", description="the system's node id of this source (what kubernetes-node to run on, starting with zero, set NODE_ID in env to manipulate this value).  Sources will only run on machines with a matching node-id")
    name: StrictStr = Field(..., description="the display-name (descriptive name) of this source.  The source's name must be unique within a knowledge-base.")
    crawler_type: StrictStr = Field(..., alias="crawlerType", description="the type of this source")
    schedule: StrictStr = Field(..., description="the time-schedule of this crawler, when active and when not repeating in a weekly-per hour cycle in GMT time.  Empty string means not active at all")
    delete_files: StrictBool = Field(..., alias="deleteFiles", description="Should this crawler remove files that are no longer visible after a crawl completes without errors?  Used for sources that cannot report on file/data removal.")
    allow_anonymous: StrictBool = Field(..., alias="allowAnonymous", description="Is the content of this crawler accessible anonymously (ie. no permissions/ACLs required).  Some crawlers like the web crawler always have this value as true.  NB.  Setting this flag to \"true\" will bypass any security on the source's own ACLs and make all its content available to everyone.")
    processing_level: StrictStr = Field(..., alias="processingLevel", description="How much processing should SimSage give each file of this source.  As defined internally in ProcessingLevel.  level 1, CONVERT: convert all document binaries to text (creates metadata text).  level 2, PARSE: NLP process the files (creates sentences and tokens for all text).  level 3, INDEX: create inverted indexes for files (creates indexes).")
    enable_preview: StrictBool = Field(..., alias="enablePreview", description="Generate per-document image-preview information as well as full HTML previews if set to \"true\".")
    files_per_second: Union[StrictFloat, StrictInt] = Field(..., alias="filesPerSecond", description="Any value greater than 0.0 (can be fractional) indicates SimSage should limit how many requests it makes from the remote entity we're integrating with.")
    specific_json: StrictStr = Field(..., alias="specificJson", description="A json string with specific values for this type of source.  Generated by the SimSage administrative system.")
    session_id: StrictStr = Field(..., alias="sessionId", description="a valid session-guid id.")
    max_items: StrictInt = Field(..., alias="maxItems", description="Set a content limit for the maximum number of items to contain for this source.  A value of zero (0) indicates no limits.")
    max_bot_items: StrictInt = Field(..., alias="maxBotItems", description="Set a Question and Answer content limit for the maximum number of deep-learning Q&A items this source can contain.  A value of zero (0) indicates no limits.")
    custom_render: StrictBool = Field(..., alias="customRender", description="Does this source require custom render templates or use ordinary search-results?")
    edge_device_id: StrictStr = Field(..., alias="edgeDeviceId", description="The associated Edge device for this source (or empty string if not associated with one)")
    qa_match_strength: Union[StrictFloat, StrictInt] = Field(..., alias="qaMatchStrength", description="the default threshold for matching deep-learning vector matching results (value should be between 0.7 and 0.99)")
    num_results: StrictInt = Field(..., alias="numResults", description="the default number of search results to return from the semantic-search system")
    num_fragments: StrictInt = Field(..., alias="numFragments", description="the number of fragments to return per search-result from the semantic-search system.  Affects accuracy, a value of \"1\" will only look at the first match.  Higher values look for more matches inside a single document.  Too high a value will affect performance.  Default value \"3\".")
    num_errors: StrictInt = Field(..., alias="numErrors", description="the number of errors from the last source-run")
    error_threshold: StrictInt = Field(..., alias="errorThreshold", description="the number of errors allowed before failing the source and not force-removing any files at the end of a run through an external source.")
    start_time: StrictInt = Field(..., alias="startTime", description="when the last run of this source started")
    end_time: StrictInt = Field(..., alias="endTime", description="when the last run of this source finished")
    acls: conlist(CMDocumentAcl) = Field(..., description="A list for overwriting security permission for a source.  Can be empty.  Use this to override security on external systems.")
    is_crawling: StrictBool = Field(..., alias="isCrawling", description="\"true\" if this source busy/active.")
    num_crawled_documents: StrictInt = Field(..., alias="numCrawledDocuments", description="the number of documents seen by the crawler thus-far.")
    num_converted_documents: StrictInt = Field(..., alias="numConvertedDocuments", description="the number of documents converted by SimSage thus-far.")
    num_parsed_documents: StrictInt = Field(..., alias="numParsedDocuments", description="the number of documents parsed by SimSage thus-far.")
    num_indexed_documents: StrictInt = Field(..., alias="numIndexedDocuments", description="the number of documents indexed by SimSage thus-far.")
    num_finished_documents: StrictInt = Field(..., alias="numFinishedDocuments", description="the number of finished (fully processed) by SimSage thus-far.")
    num_total_documents: StrictInt = Field(..., alias="numTotalDocuments", description="the total number of documents for this source in SimSage.")
    use_default_relationships: StrictBool = Field(..., alias="useDefaultRelationships", description="\"true\" if this source is to use the default (built-in) SimSage relationships.  All user-defined relationships and language-entities will be used regardless of the value of this flag.")
    is_busy: StrictBool = Field(..., alias="isBusy", description="\"true\" if this source is currently being optimized / processed by the index-optimizer.")
    auto_optimize: StrictBool = Field(..., alias="autoOptimize", description="Do we run the index-optimizer automatically after this source finishes crawling?")
    store_binary: StrictBool = Field(..., alias="storeBinary", description="\"true\" if this source is to store all documents locally on the SimSage platform")
    versioned: StrictBool = Field(..., description="\"true\" if this source is to store all versions of documents locally on the SimSage platform")
    write_to_cassandra: StrictBool = Field(..., alias="writeToCassandra", description="\"true\" if this source is to write any changes direct to Cassandra, otherwise this source will collect indexes on disk first (for initial loading)")
    processor_config: StrictStr = Field(..., alias="processorConfig", description="Json string defining any optional processors configured on the source")
    enable_document_similarity: StrictBool = Field(..., alias="enableDocumentSimilarity", description="enable document similarity calculations.")
    document_similarity_threshold: Union[StrictFloat, StrictInt] = Field(..., alias="documentSimilarityThreshold", description="the document similarity threshold for grouping documents, a value between 0.75 and 1.0")
    is_external: StrictBool = Field(..., alias="isExternal", description="is this crawler to be connected as an external source using our external crawler software?")
    use_ocr: StrictBool = Field(..., alias="useOCR", description="enable OCR processing for files in this source?")
    use_stt: StrictBool = Field(..., alias="useSTT", description="enable Speech-to-text processing for files in this source?")
    external: Optional[StrictBool] = None
    crawling: Optional[StrictBool] = None
    busy: Optional[StrictBool] = None
    __properties = ["sourceId", "organisationId", "kbId", "nodeId", "name", "crawlerType", "schedule", "deleteFiles", "allowAnonymous", "processingLevel", "enablePreview", "filesPerSecond", "specificJson", "sessionId", "maxItems", "maxBotItems", "customRender", "edgeDeviceId", "qaMatchStrength", "numResults", "numFragments", "numErrors", "errorThreshold", "startTime", "endTime", "acls", "isCrawling", "numCrawledDocuments", "numConvertedDocuments", "numParsedDocuments", "numIndexedDocuments", "numFinishedDocuments", "numTotalDocuments", "useDefaultRelationships", "isBusy", "autoOptimize", "storeBinary", "versioned", "writeToCassandra", "processorConfig", "enableDocumentSimilarity", "documentSimilarityThreshold", "isExternal", "useOCR", "useSTT", "external", "crawling", "busy"]

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
    def from_json(cls, json_str: str) -> CMSource:
        """Create an instance of CMSource from a JSON string"""
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
    def from_dict(cls, obj: dict) -> CMSource:
        """Create an instance of CMSource from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CMSource.parse_obj(obj)

        _obj = CMSource.parse_obj({
            "source_id": obj.get("sourceId"),
            "organisation_id": obj.get("organisationId"),
            "kb_id": obj.get("kbId"),
            "node_id": obj.get("nodeId"),
            "name": obj.get("name"),
            "crawler_type": obj.get("crawlerType"),
            "schedule": obj.get("schedule"),
            "delete_files": obj.get("deleteFiles"),
            "allow_anonymous": obj.get("allowAnonymous"),
            "processing_level": obj.get("processingLevel"),
            "enable_preview": obj.get("enablePreview"),
            "files_per_second": obj.get("filesPerSecond"),
            "specific_json": obj.get("specificJson"),
            "session_id": obj.get("sessionId"),
            "max_items": obj.get("maxItems"),
            "max_bot_items": obj.get("maxBotItems"),
            "custom_render": obj.get("customRender"),
            "edge_device_id": obj.get("edgeDeviceId"),
            "qa_match_strength": obj.get("qaMatchStrength"),
            "num_results": obj.get("numResults"),
            "num_fragments": obj.get("numFragments"),
            "num_errors": obj.get("numErrors"),
            "error_threshold": obj.get("errorThreshold"),
            "start_time": obj.get("startTime"),
            "end_time": obj.get("endTime"),
            "acls": [CMDocumentAcl.from_dict(_item) for _item in obj.get("acls")] if obj.get("acls") is not None else None,
            "is_crawling": obj.get("isCrawling"),
            "num_crawled_documents": obj.get("numCrawledDocuments"),
            "num_converted_documents": obj.get("numConvertedDocuments"),
            "num_parsed_documents": obj.get("numParsedDocuments"),
            "num_indexed_documents": obj.get("numIndexedDocuments"),
            "num_finished_documents": obj.get("numFinishedDocuments"),
            "num_total_documents": obj.get("numTotalDocuments"),
            "use_default_relationships": obj.get("useDefaultRelationships"),
            "is_busy": obj.get("isBusy"),
            "auto_optimize": obj.get("autoOptimize"),
            "store_binary": obj.get("storeBinary"),
            "versioned": obj.get("versioned"),
            "write_to_cassandra": obj.get("writeToCassandra"),
            "processor_config": obj.get("processorConfig"),
            "enable_document_similarity": obj.get("enableDocumentSimilarity"),
            "document_similarity_threshold": obj.get("documentSimilarityThreshold"),
            "is_external": obj.get("isExternal"),
            "use_ocr": obj.get("useOCR"),
            "use_stt": obj.get("useSTT"),
            "external": obj.get("external"),
            "crawling": obj.get("crawling"),
            "busy": obj.get("busy")
        })
        return _obj


