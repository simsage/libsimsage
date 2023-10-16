# coding: utf-8

# flake8: noqa
"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.11.4
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from openapi_client.models.backup import Backup
from openapi_client.models.cm_add_folder import CMAddFolder
from openapi_client.models.cm_add_source_folder import CMAddSourceFolder
from openapi_client.models.cm_categorization import CMCategorization
from openapi_client.models.cm_categorization_paginated_list import CMCategorizationPaginatedList
from openapi_client.models.cm_change_task_phase import CMChangeTaskPhase
from openapi_client.models.cm_claim_document import CMClaimDocument
from openapi_client.models.cm_client_query import CMClientQuery
from openapi_client.models.cm_client_query_result import CMClientQueryResult
from openapi_client.models.cm_command_queue_item import CMCommandQueueItem
from openapi_client.models.cm_comment_filter import CMCommentFilter
from openapi_client.models.cm_compound_query import CMCompoundQuery
from openapi_client.models.cm_crawler_status import CMCrawlerStatus
from openapi_client.models.cm_crawler_status_task import CMCrawlerStatusTask
from openapi_client.models.cm_create_gdpr_project import CMCreateGdprProject
from openapi_client.models.cm_created_project import CMCreatedProject
from openapi_client.models.cmd_paragraph_summary import CMDParagraphSummary
from openapi_client.models.cmd_user_dashboard import CMDUserDashboard
from openapi_client.models.cm_delete_document import CMDeleteDocument
from openapi_client.models.cm_delete_project_cmd import CMDeleteProjectCmd
from openapi_client.models.cm_document import CMDocument
from openapi_client.models.cm_document_acl import CMDocumentAcl
from openapi_client.models.cm_document_audit import CMDocumentAudit
from openapi_client.models.cm_document_bookmark import CMDocumentBookmark
from openapi_client.models.cm_document_folder import CMDocumentFolder
from openapi_client.models.cm_document_hash_tag import CMDocumentHashTag
from openapi_client.models.cm_document_lock import CMDocumentLock
from openapi_client.models.cm_document_note import CMDocumentNote
from openapi_client.models.cm_document_question_and_answer import CMDocumentQuestionAndAnswer
from openapi_client.models.cm_document_relationship import CMDocumentRelationship
from openapi_client.models.cm_document_subscription import CMDocumentSubscription
from openapi_client.models.cm_document_type_frequency import CMDocumentTypeFrequency
from openapi_client.models.cm_document_un_changed import CMDocumentUnChanged
from openapi_client.models.cm_document_version import CMDocumentVersion
from openapi_client.models.cm_documents_by_token import CMDocumentsByToken
from openapi_client.models.cm_export_redacted_document import CMExportRedactedDocument
from openapi_client.models.cm_external_crawler import CMExternalCrawler
from openapi_client.models.cm_external_crawler_start import CMExternalCrawlerStart
from openapi_client.models.cm_external_crawler_stop import CMExternalCrawlerStop
from openapi_client.models.cm_filter import CMFilter
from openapi_client.models.cm_gdpr_search_details import CMGdprSearchDetails
from openapi_client.models.cm_get_html import CMGetHtml
from openapi_client.models.cm_group import CMGroup
from openapi_client.models.cm_group_list import CMGroupList
from openapi_client.models.cm_import_users import CMImportUsers
from openapi_client.models.cm_info import CMInfo
from openapi_client.models.cm_inventorize_parameters import CMInventorizeParameters
from openapi_client.models.cm_keyed_search_term import CMKeyedSearchTerm
from openapi_client.models.cm_knowledge_base import CMKnowledgeBase
from openapi_client.models.cm_knowledge_base_export import CMKnowledgeBaseExport
from openapi_client.models.cm_knowledge_base_info import CMKnowledgeBaseInfo
from openapi_client.models.cm_located_redaction import CMLocatedRedaction
from openapi_client.models.cm_logger_entry import CMLoggerEntry
from openapi_client.models.cm_new_comment import CMNewComment
from openapi_client.models.cm_next_document import CMNextDocument
from openapi_client.models.cm_operator_knowledge_base import CMOperatorKnowledgeBase
from openapi_client.models.cm_optimize_index import CMOptimizeIndex
from openapi_client.models.cm_organisation import CMOrganisation
from openapi_client.models.cm_paged_project_documents import CMPagedProjectDocuments
from openapi_client.models.cm_paged_queue_items import CMPagedQueueItems
from openapi_client.models.cm_paged_results_cm_sliced_document import CMPagedResultsCMSlicedDocument
from openapi_client.models.cm_parquet_item import CMParquetItem
from openapi_client.models.cm_parquet_time_list import CMParquetTimeList
from openapi_client.models.cm_password_reset_request import CMPasswordResetRequest
from openapi_client.models.cm_project_definition import CMProjectDefinition
from openapi_client.models.cm_project_definition_task import CMProjectDefinitionTask
from openapi_client.models.cm_project_document import CMProjectDocument
from openapi_client.models.cm_project_frame import CMProjectFrame
from openapi_client.models.cm_project_info import CMProjectInfo
from openapi_client.models.cm_project_slice import CMProjectSlice
from openapi_client.models.cm_project_slice_task import CMProjectSliceTask
from openapi_client.models.cm_query_focussed_summarization import CMQueryFocussedSummarization
from openapi_client.models.cm_query_focussed_summarization_request import CMQueryFocussedSummarizationRequest
from openapi_client.models.cm_query_token import CMQueryToken
from openapi_client.models.cm_queue_filter import CMQueueFilter
from openapi_client.models.cm_queue_item import CMQueueItem
from openapi_client.models.cm_reassign_slice_document import CMReassignSliceDocument
from openapi_client.models.cm_recorded_comment import CMRecordedComment
from openapi_client.models.cm_redaction import CMRedaction
from openapi_client.models.cm_redaction_data import CMRedactionData
from openapi_client.models.cm_redaction_details import CMRedactionDetails
from openapi_client.models.cm_remove_slice_document import CMRemoveSliceDocument
from openapi_client.models.cm_restore_from_text import CMRestoreFromText
from openapi_client.models.cm_results_section import CMResultsSection
from openapi_client.models.cm_return_statistics import CMReturnStatistics
from openapi_client.models.cm_saved_search import CMSavedSearch
from openapi_client.models.cm_search_definition import CMSearchDefinition
from openapi_client.models.cm_search_result import CMSearchResult
from openapi_client.models.cm_search_result_summary import CMSearchResultSummary
from openapi_client.models.cm_search_result_summary_task import CMSearchResultSummaryTask
from openapi_client.models.cm_search_sub_term import CMSearchSubTerm
from openapi_client.models.cm_search_term import CMSearchTerm
from openapi_client.models.cm_semantic import CMSemantic
from openapi_client.models.cm_semantic_model_edit import CMSemanticModelEdit
from openapi_client.models.cm_semantic_term import CMSemanticTerm
from openapi_client.models.cm_semantics_paginated import CMSemanticsPaginated
from openapi_client.models.cm_semantics_paginated_result import CMSemanticsPaginatedResult
from openapi_client.models.cm_session import CMSession
from openapi_client.models.cm_session_version import CMSessionVersion
from openapi_client.models.cm_set_slice_definitions import CMSetSliceDefinitions
from openapi_client.models.cm_short_summary import CMShortSummary
from openapi_client.models.cm_short_summary_result import CMShortSummaryResult
from openapi_client.models.cm_sign_in_parameters import CMSignInParameters
from openapi_client.models.cm_similar_document import CMSimilarDocument
from openapi_client.models.cm_simple_query import CMSimpleQuery
from openapi_client.models.cm_single_document_summary import CMSingleDocumentSummary
from openapi_client.models.cm_single_document_summary_request import CMSingleDocumentSummaryRequest
from openapi_client.models.cm_slice_config import CMSliceConfig
from openapi_client.models.cm_slice_config_query import CMSliceConfigQuery
from openapi_client.models.cm_slice_query_definition import CMSliceQueryDefinition
from openapi_client.models.cm_slice_reassignment import CMSliceReassignment
from openapi_client.models.cm_sliced_document import CMSlicedDocument
from openapi_client.models.cm_sliced_document_filter import CMSlicedDocumentFilter
from openapi_client.models.cm_sliced_document_list_and_totals import CMSlicedDocumentListAndTotals
from openapi_client.models.cm_sliced_document_request import CMSlicedDocumentRequest
from openapi_client.models.cm_source import CMSource
from openapi_client.models.cm_source_base_info import CMSourceBaseInfo
from openapi_client.models.cm_start_crawler import CMStartCrawler
from openapi_client.models.cm_start_project import CMStartProject
from openapi_client.models.cm_step_config import CMStepConfig
from openapi_client.models.cm_sub_term import CMSubTerm
from openapi_client.models.cm_subscriptions import CMSubscriptions
from openapi_client.models.cm_syn_set import CMSynSet
from openapi_client.models.cm_syn_set_find import CMSynSetFind
from openapi_client.models.cm_syn_set_list import CMSynSetList
from openapi_client.models.cm_synonym import CMSynonym
from openapi_client.models.cm_synonyms_paginated import CMSynonymsPaginated
from openapi_client.models.cm_synonyms_paginated_result import CMSynonymsPaginatedResult
from openapi_client.models.cm_task_info import CMTaskInfo
from openapi_client.models.cm_text_to_search_conversion import CMTextToSearchConversion
from openapi_client.models.cm_text_to_search_conversion_return import CMTextToSearchConversionReturn
from openapi_client.models.cm_text_to_search_edit import CMTextToSearchEdit
from openapi_client.models.cm_text_to_search_paginated import CMTextToSearchPaginated
from openapi_client.models.cm_text_to_search_paginated_return import CMTextToSearchPaginatedReturn
from openapi_client.models.cm_update_acls import CMUpdateACLs
from openapi_client.models.cm_update_document_set import CMUpdateDocumentSet
from openapi_client.models.cm_update_document_status import CMUpdateDocumentStatus
from openapi_client.models.cm_update_redactions import CMUpdateRedactions
from openapi_client.models.cm_upload_document import CMUploadDocument
from openapi_client.models.cm_upload_image import CMUploadImage
from openapi_client.models.cm_user import CMUser
from openapi_client.models.cm_user_list import CMUserList
from openapi_client.models.cm_user_notification import CMUserNotification
from openapi_client.models.cm_user_password_reset import CMUserPasswordReset
from openapi_client.models.cm_user_role import CMUserRole
from openapi_client.models.cm_user_with_extras import CMUserWithExtras
from openapi_client.models.cm_version import CMVersion
from openapi_client.models.cm_word_frequency import CMWordFrequency
from openapi_client.models.cm_zip_source import CMZipSource
from openapi_client.models.context_item import ContextItem
from openapi_client.models.document_bookmark import DocumentBookmark
from openapi_client.models.document_deleted import DocumentDeleted
from openapi_client.models.gdpr_project import GdprProject
from openapi_client.models.group import Group
from openapi_client.models.identifier import Identifier
from openapi_client.models.json_message import JsonMessage
from openapi_client.models.knowledge_base import KnowledgeBase
from openapi_client.models.located_redaction import LocatedRedaction
from openapi_client.models.md_category import MDCategory
from openapi_client.models.name_counter_level import NameCounterLevel
from openapi_client.models.operator_knowledge_base import OperatorKnowledgeBase
from openapi_client.models.optimize_indexes_get_report_cmd import OptimizeIndexesGetReportCmd
from openapi_client.models.optimize_indexes_get_reports_cmd import OptimizeIndexesGetReportsCmd
from openapi_client.models.organisation import Organisation
from openapi_client.models.returned_document import ReturnedDocument
from openapi_client.models.search_category import SearchCategory
from openapi_client.models.session import Session
from openapi_client.models.sign_in_admin import SignInAdmin
from openapi_client.models.sign_in_cmd import SignInCmd
from openapi_client.models.sign_in_dms_cmd import SignInDmsCmd
from openapi_client.models.text_to_search import TextToSearch
from openapi_client.models.user import User
from openapi_client.models.user_role import UserRole
