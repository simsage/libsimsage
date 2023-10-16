# openapi-client
SimSage REST API

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 7.11.4
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientCodegen
For more information, please visit [https://test.simsage.ai](https://test.simsage.ai)

## Requirements.

Python 3.7+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

### Tests

Execute `pytest` to run the tests.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python

import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://test.simsage.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://test.simsage.ai"
)



# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AuthApi(api_client)
    organisation_id = 'organisation_id_example' # str | the organisation (its guid id)
    name = 'name_example' # str | the name of the group to remove.
    session_id = 'session_id_example' # str | a valid SimSage Session id.

    try:
        # Delete Group
        api_response = api_instance.delete_group(organisation_id, name, session_id)
        print("The response of AuthApi->delete_group:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AuthApi->delete_group: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://test.simsage.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**delete_group**](docs/AuthApi.md#delete_group) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group
*AuthApi* | [**delete_organisation**](docs/AuthApi.md#delete_organisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation
*AuthApi* | [**get_groups**](docs/AuthApi.md#get_groups) | **GET** /api/auth/groups/{organisationId} | Get Groups
*AuthApi* | [**get_ott**](docs/AuthApi.md#get_ott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token.
*AuthApi* | [**get_user_organisation_list**](docs/AuthApi.md#get_user_organisation_list) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations
*AuthApi* | [**get_users_paginated**](docs/AuthApi.md#get_users_paginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated
*AuthApi* | [**import_users_and_groups**](docs/AuthApi.md#import_users_and_groups) | **PUT** /api/auth/user/import | 
*AuthApi* | [**my_roles**](docs/AuthApi.md#my_roles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles
*AuthApi* | [**remove_user_from_organisation**](docs/AuthApi.md#remove_user_from_organisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation
*AuthApi* | [**reset_password**](docs/AuthApi.md#reset_password) | **POST** /api/auth/reset-password | Perform a password-reset request.
*AuthApi* | [**reset_password_request**](docs/AuthApi.md#reset_password_request) | **POST** /api/auth/reset-password-request | Password Reset Request
*AuthApi* | [**save_group**](docs/AuthApi.md#save_group) | **PUT** /api/auth/group | Save Group
*AuthApi* | [**sign_in**](docs/AuthApi.md#sign_in) | **POST** /api/auth/sign-in | Sign In
*AuthApi* | [**sign_in_admin_using_jwt_msal**](docs/AuthApi.md#sign_in_admin_using_jwt_msal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In
*AuthApi* | [**sign_in_dms_using_jwt_msal**](docs/AuthApi.md#sign_in_dms_using_jwt_msal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**sign_in_evolve_using_jwt_msal**](docs/AuthApi.md#sign_in_evolve_using_jwt_msal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**sign_in_search_using_jwt_msal**](docs/AuthApi.md#sign_in_search_using_jwt_msal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**sign_out**](docs/AuthApi.md#sign_out) | **DELETE** /api/auth/sign-out | Sign Out
*AuthApi* | [**update_organisation**](docs/AuthApi.md#update_organisation) | **PUT** /api/auth/organisation | Save Organisation
*AuthApi* | [**update_user**](docs/AuthApi.md#update_user) | **PUT** /api/auth/user/{organisationId} | 
*AuthApi* | [**version8**](docs/AuthApi.md#version8) | **GET** /api/auth/version | Get Version
*BackupApi* | [**backup**](docs/BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup
*BackupApi* | [**delete_backup**](docs/BackupApi.md#delete_backup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup
*BackupApi* | [**get_backup**](docs/BackupApi.md#get_backup) | **GET** /api/backup/{organisationId}/{backupId} | get backup
*BackupApi* | [**get_backup_list**](docs/BackupApi.md#get_backup_list) | **GET** /api/backup/backups/{organisationId} | get backup list
*BackupApi* | [**restore_from_text**](docs/BackupApi.md#restore_from_text) | **POST** /api/backup/restore | restore backup
*ConversionApi* | [**preview_version**](docs/ConversionApi.md#preview_version) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version
*ConversionApi* | [**stt_version**](docs/ConversionApi.md#stt_version) | **GET** /api/conversion/stt/version | Get speech-to-text Version
*ConversionApi* | [**version7**](docs/ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version
*CrawlerApi* | [**crawler_external_document_delete**](docs/CrawlerApi.md#crawler_external_document_delete) | **PUT** /api/crawler/external/document/delete | Remove an External Document
*CrawlerApi* | [**crawler_external_document_un_changed**](docs/CrawlerApi.md#crawler_external_document_un_changed) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged
*CrawlerApi* | [**crawler_external_document_upload**](docs/CrawlerApi.md#crawler_external_document_upload) | **POST** /api/crawler/external/document/upload | Upload External Document
*CrawlerApi* | [**crawler_external_image_upload**](docs/CrawlerApi.md#crawler_external_image_upload) | **POST** /api/crawler/external/document/upload/image | Upload External Image
*CrawlerApi* | [**delete**](docs/CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source
*CrawlerApi* | [**delete_documents**](docs/CrawlerApi.md#delete_documents) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents
*CrawlerApi* | [**encrypted_communications**](docs/CrawlerApi.md#encrypted_communications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication
*CrawlerApi* | [**external_crawler**](docs/CrawlerApi.md#external_crawler) | **POST** /api/crawler/external/crawler | External Crawler
*CrawlerApi* | [**external_crawler_finished**](docs/CrawlerApi.md#external_crawler_finished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler
*CrawlerApi* | [**external_crawler_start**](docs/CrawlerApi.md#external_crawler_start) | **POST** /api/crawler/external/crawler/start | Start External Crawler
*CrawlerApi* | [**get_crawler**](docs/CrawlerApi.md#get_crawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source
*CrawlerApi* | [**get_source_list**](docs/CrawlerApi.md#get_source_list) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List
*CrawlerApi* | [**oidc_code**](docs/CrawlerApi.md#oidc_code) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver
*CrawlerApi* | [**process_all_files**](docs/CrawlerApi.md#process_all_files) | **POST** /api/crawler/process-all-files | Process all files of crawler/source
*CrawlerApi* | [**reset_source_delta**](docs/CrawlerApi.md#reset_source_delta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token
*CrawlerApi* | [**start_crawler**](docs/CrawlerApi.md#start_crawler) | **POST** /api/crawler/start | Start crawler
*CrawlerApi* | [**test_crawler**](docs/CrawlerApi.md#test_crawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler
*CrawlerApi* | [**update_crawler**](docs/CrawlerApi.md#update_crawler) | **POST** /api/crawler/crawler | Update Source
*CrawlerApi* | [**version6**](docs/CrawlerApi.md#version6) | **GET** /api/crawler/version | Version
*DataprojectApi* | [**add_comment**](docs/DataprojectApi.md#add_comment) | **POST** /api/dataproject/comment | Create Comment
*DataprojectApi* | [**all_tasks**](docs/DataprojectApi.md#all_tasks) | **POST** /api/dataproject/runningprojects | get Running Projects
*DataprojectApi* | [**change_task_phase**](docs/DataprojectApi.md#change_task_phase) | **POST** /api/dataproject/changetaskphase | Change Task Phase
*DataprojectApi* | [**claim_document**](docs/DataprojectApi.md#claim_document) | **POST** /api/dataproject/claimdocument | Claim sliced document
*DataprojectApi* | [**crawler_status**](docs/DataprojectApi.md#crawler_status) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status
*DataprojectApi* | [**documents_by_tokens**](docs/DataprojectApi.md#documents_by_tokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens
*DataprojectApi* | [**filtered_comments**](docs/DataprojectApi.md#filtered_comments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments
*DataprojectApi* | [**get_document_redaction_info**](docs/DataprojectApi.md#get_document_redaction_info) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info
*DataprojectApi* | [**get_project_definition**](docs/DataprojectApi.md#get_project_definition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition
*DataprojectApi* | [**get_project_slice**](docs/DataprojectApi.md#get_project_slice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice
*DataprojectApi* | [**get_search_result_summary**](docs/DataprojectApi.md#get_search_result_summary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary
*DataprojectApi* | [**next_document**](docs/DataprojectApi.md#next_document) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters
*DataprojectApi* | [**project_types**](docs/DataprojectApi.md#project_types) | **GET** /api/dataproject/projects/{organisationId} | get Project Types
*DataprojectApi* | [**reassign_slice_document**](docs/DataprojectApi.md#reassign_slice_document) | **POST** /api/dataproject/reassignslicedoc | 
*DataprojectApi* | [**redacted_document**](docs/DataprojectApi.md#redacted_document) | **POST** /api/dataproject/redacteddocument | Get Redacted Document
*DataprojectApi* | [**remove_slice_document**](docs/DataprojectApi.md#remove_slice_document) | **POST** /api/dataproject/removeslicedoc | 
*DataprojectApi* | [**reset_evolve**](docs/DataprojectApi.md#reset_evolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application
*DataprojectApi* | [**save_project_definition**](docs/DataprojectApi.md#save_project_definition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition
*DataprojectApi* | [**set_slice_config**](docs/DataprojectApi.md#set_slice_config) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration
*DataprojectApi* | [**sliced_documents**](docs/DataprojectApi.md#sliced_documents) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters
*DataprojectApi* | [**start_project**](docs/DataprojectApi.md#start_project) | **POST** /api/dataproject/startproject | 
*DataprojectApi* | [**update_document_status**](docs/DataprojectApi.md#update_document_status) | **POST** /api/dataproject/updatedocstatus | Update document status
*DataprojectApi* | [**update_redactions**](docs/DataprojectApi.md#update_redactions) | **POST** /api/dataproject/updateredactions | Update document redactions
*DiscoveryApi* | [**all_gdpr_projects**](docs/DiscoveryApi.md#all_gdpr_projects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
*DiscoveryApi* | [**apply_redactions**](docs/DiscoveryApi.md#apply_redactions) | **POST** /api/discovery/applyredactions | 
*DiscoveryApi* | [**create_gdpr_project**](docs/DiscoveryApi.md#create_gdpr_project) | **POST** /api/discovery/createproject | 
*DiscoveryApi* | [**delete_project**](docs/DiscoveryApi.md#delete_project) | **DELETE** /api/discovery/deleteproject | 
*DiscoveryApi* | [**export_redacted_doc**](docs/DiscoveryApi.md#export_redacted_doc) | **POST** /api/discovery/exportredacteddoc | 
*DiscoveryApi* | [**get_gdpr_document**](docs/DiscoveryApi.md#get_gdpr_document) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} | 
*DiscoveryApi* | [**get_paged_project_documents**](docs/DiscoveryApi.md#get_paged_project_documents) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
*DiscoveryApi* | [**growth_per_month**](docs/DiscoveryApi.md#growth_per_month) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth
*DiscoveryApi* | [**pdf_binary**](docs/DiscoveryApi.md#pdf_binary) | **GET** /api/discovery/pdf/latest/{organisationId}/{kbId}/{url} | Binary
*DiscoveryApi* | [**setdocumentredactions**](docs/DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument | 
*DiscoveryApi* | [**storage_by_source**](docs/DiscoveryApi.md#storage_by_source) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage
*DiscoveryApi* | [**summary_by_document_type**](docs/DiscoveryApi.md#summary_by_document_type) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage
*DiscoveryApi* | [**update_document_set**](docs/DiscoveryApi.md#update_document_set) | **POST** /api/discovery/updatedocumentset | 
*DiscoveryApi* | [**version5**](docs/DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version
*DmsApi* | [**add_folder**](docs/DmsApi.md#add_folder) | **POST** /api/dms/folder | Add a new folder
*DmsApi* | [**add_source_folder**](docs/DmsApi.md#add_source_folder) | **POST** /api/dms/source | Add a new source-folder
*DmsApi* | [**delete_all_notes**](docs/DmsApi.md#delete_all_notes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes
*DmsApi* | [**delete_bookmark**](docs/DmsApi.md#delete_bookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark
*DmsApi* | [**delete_document_or_folder**](docs/DmsApi.md#delete_document_or_folder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder
*DmsApi* | [**delete_note**](docs/DmsApi.md#delete_note) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note
*DmsApi* | [**delete_source_folder**](docs/DmsApi.md#delete_source_folder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder
*DmsApi* | [**delete_subscription**](docs/DmsApi.md#delete_subscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription
*DmsApi* | [**delete_user_search**](docs/DmsApi.md#delete_user_search) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search
*DmsApi* | [**document1**](docs/DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document
*DmsApi* | [**document_binary**](docs/DmsApi.md#document_binary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary
*DmsApi* | [**document_version**](docs/DmsApi.md#document_version) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document
*DmsApi* | [**filter_folders**](docs/DmsApi.md#filter_folders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders
*DmsApi* | [**force_release_lock**](docs/DmsApi.md#force_release_lock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock
*DmsApi* | [**get_bookmark_list**](docs/DmsApi.md#get_bookmark_list) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks
*DmsApi* | [**get_deleted_documents**](docs/DmsApi.md#get_deleted_documents) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter
*DmsApi* | [**get_document_audit**](docs/DmsApi.md#get_document_audit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month
*DmsApi* | [**get_folder**](docs/DmsApi.md#get_folder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content
*DmsApi* | [**get_full_audit**](docs/DmsApi.md#get_full_audit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month
*DmsApi* | [**get_locked_list**](docs/DmsApi.md#get_locked_list) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user
*DmsApi* | [**get_note_list**](docs/DmsApi.md#get_note_list) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes
*DmsApi* | [**get_saved_searches**](docs/DmsApi.md#get_saved_searches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches
*DmsApi* | [**get_source_folder**](docs/DmsApi.md#get_source_folder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder
*DmsApi* | [**get_subscription_list**](docs/DmsApi.md#get_subscription_list) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions
*DmsApi* | [**get_user_dashboard**](docs/DmsApi.md#get_user_dashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard
*DmsApi* | [**get_user_notifications**](docs/DmsApi.md#get_user_notifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications
*DmsApi* | [**lock_document**](docs/DmsApi.md#lock_document) | **POST** /api/dms/lock | Document Lock
*DmsApi* | [**release_lock**](docs/DmsApi.md#release_lock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock
*DmsApi* | [**restful_dms_client_query**](docs/DmsApi.md#restful_dms_client_query) | **POST** /api/dms/query | DMS Client Query
*DmsApi* | [**save_bookmark**](docs/DmsApi.md#save_bookmark) | **POST** /api/dms/bookmark | Save Bookmark
*DmsApi* | [**save_hash_tags**](docs/DmsApi.md#save_hash_tags) | **POST** /api/dms/hash-tag | Save HashTag set for a document
*DmsApi* | [**save_note**](docs/DmsApi.md#save_note) | **POST** /api/dms/note | Save Note
*DmsApi* | [**save_search**](docs/DmsApi.md#save_search) | **POST** /api/dms/save-search | Save Search
*DmsApi* | [**save_subscription**](docs/DmsApi.md#save_subscription) | **POST** /api/dms/subscription | Save Subscription
*DmsApi* | [**undelete_document**](docs/DmsApi.md#undelete_document) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record
*DmsApi* | [**update_acls**](docs/DmsApi.md#update_acls) | **POST** /api/dms/acls | Update an item&#39;s ACLs
*DmsApi* | [**upload_document**](docs/DmsApi.md#upload_document) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document
*DocumentApi* | [**document**](docs/DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document
*DocumentApi* | [**get_parquet_file**](docs/DocumentApi.md#get_parquet_file) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File
*DocumentApi* | [**get_parquet_list**](docs/DocumentApi.md#get_parquet_list) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list
*DocumentApi* | [**get_spreadsheet**](docs/DocumentApi.md#get_spreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet
*DocumentApi* | [**get_stats1**](docs/DocumentApi.md#get_stats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics
*DocumentApi* | [**inventorize_documents**](docs/DocumentApi.md#inventorize_documents) | **POST** /api/document/inventorize | Document Inventory
*DocumentApi* | [**inventorize_indexes**](docs/DocumentApi.md#inventorize_indexes) | **POST** /api/document/inventorize-indexes | Index Inventory
*DocumentApi* | [**preview**](docs/DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview
*DocumentApi* | [**preview_html**](docs/DocumentApi.md#preview_html) | **POST** /api/document/preview/html | Preview HTML
*DocumentApi* | [**query_focussed_summarization**](docs/DocumentApi.md#query_focussed_summarization) | **POST** /api/document/qfs | Summarize Documents for Query
*DocumentApi* | [**remove_document**](docs/DocumentApi.md#remove_document) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document
*DocumentApi* | [**remove_parquet_file**](docs/DocumentApi.md#remove_parquet_file) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File
*DocumentApi* | [**summarize_document**](docs/DocumentApi.md#summarize_document) | **POST** /api/document/summarize/document | Summarize a document
*DocumentApi* | [**version4**](docs/DocumentApi.md#version4) | **GET** /api/document/version | Version
*DocumentApi* | [**zip_source**](docs/DocumentApi.md#zip_source) | **POST** /api/document/zip/source | Zip source documents
*KnowledgebaseApi* | [**export_knowledge_base**](docs/KnowledgebaseApi.md#export_knowledge_base) | **POST** /api/knowledgebase/export | export Knowledge-base
*KnowledgebaseApi* | [**get_knowledge_base**](docs/KnowledgebaseApi.md#get_knowledge_base) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base
*KnowledgebaseApi* | [**get_knowledge_bases**](docs/KnowledgebaseApi.md#get_knowledge_bases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases
*KnowledgebaseApi* | [**get_search_info**](docs/KnowledgebaseApi.md#get_search_info) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info
*KnowledgebaseApi* | [**get_search_info2**](docs/KnowledgebaseApi.md#get_search_info2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated]
*KnowledgebaseApi* | [**remove_knowledge_base**](docs/KnowledgebaseApi.md#remove_knowledge_base) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base
*KnowledgebaseApi* | [**update_knowledge_base**](docs/KnowledgebaseApi.md#update_knowledge_base) | **PUT** /api/knowledgebase/save | Save Knowledge-base
*KnowledgebaseApi* | [**version3**](docs/KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version
*LanguageApi* | [**add_default_syn_sets**](docs/LanguageApi.md#add_default_syn_sets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets
*LanguageApi* | [**delete_all_synonyms**](docs/LanguageApi.md#delete_all_synonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms
*LanguageApi* | [**delete_categorization**](docs/LanguageApi.md#delete_categorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization
*LanguageApi* | [**delete_semantic**](docs/LanguageApi.md#delete_semantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic
*LanguageApi* | [**delete_syn_set**](docs/LanguageApi.md#delete_syn_set) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet
*LanguageApi* | [**delete_synonym**](docs/LanguageApi.md#delete_synonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym
*LanguageApi* | [**find_syn_sets**](docs/LanguageApi.md#find_syn_sets) | **PUT** /api/language/find-syn-sets | Find SynSets
*LanguageApi* | [**get_categorization_list**](docs/LanguageApi.md#get_categorization_list) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list
*LanguageApi* | [**get_paginated**](docs/LanguageApi.md#get_paginated) | **PUT** /api/language/synonyms | get Synonyms Paginated
*LanguageApi* | [**get_semantics_paginated**](docs/LanguageApi.md#get_semantics_paginated) | **PUT** /api/language/semantics | Semantics Paginated
*LanguageApi* | [**optimize_indexes**](docs/LanguageApi.md#optimize_indexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes
*LanguageApi* | [**redact_document**](docs/LanguageApi.md#redact_document) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document
*LanguageApi* | [**save_categorization**](docs/LanguageApi.md#save_categorization) | **PUT** /api/language/categorization | save categorization
*LanguageApi* | [**save_semantic**](docs/LanguageApi.md#save_semantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic
*LanguageApi* | [**save_syn_set**](docs/LanguageApi.md#save_syn_set) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet
*LanguageApi* | [**save_synonym**](docs/LanguageApi.md#save_synonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym
*LanguageApi* | [**truncate_slow_indexes**](docs/LanguageApi.md#truncate_slow_indexes) | **GET** /api/language/truncate-slow-indexes/{organisationId}/{kbId} | Truncate slow Indexes
*LanguageApi* | [**tune_language_graph**](docs/LanguageApi.md#tune_language_graph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph
*LanguageApi* | [**version2**](docs/LanguageApi.md#version2) | **GET** /api/language/version | Version
*SemanticApi* | [**delete_text_to_search**](docs/SemanticApi.md#delete_text_to_search) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search
*SemanticApi* | [**document_question_and_answer**](docs/SemanticApi.md#document_question_and_answer) | **POST** /api/semantic/document-qa | Document Q&amp;A
*SemanticApi* | [**get_text_to_search_paginated**](docs/SemanticApi.md#get_text_to_search_paginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings
*SemanticApi* | [**restful_client_query**](docs/SemanticApi.md#restful_client_query) | **POST** /api/semantic/query | Client Query
*SemanticApi* | [**save_text_to_search**](docs/SemanticApi.md#save_text_to_search) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item
*SemanticApi* | [**short_summary**](docs/SemanticApi.md#short_summary) | **POST** /api/semantic/short-summary | Short summary
*SemanticApi* | [**try_text_to_search_conversion**](docs/SemanticApi.md#try_text_to_search_conversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search
*SemanticApi* | [**version1**](docs/SemanticApi.md#version1) | **GET** /api/semantic/version | Version
*StatsApi* | [**get_index_optimzation_report**](docs/StatsApi.md#get_index_optimzation_report) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report
*StatsApi* | [**get_index_optimzation_reports**](docs/StatsApi.md#get_index_optimzation_reports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list
*StatsApi* | [**get_stats**](docs/StatsApi.md#get_stats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics
*StatsApi* | [**sim_sage_status**](docs/StatsApi.md#sim_sage_status) | **PUT** /api/stats/status/{organisationId} | SimSage status
*StatsApi* | [**system_logs**](docs/StatsApi.md#system_logs) | **GET** /api/stats/system-logs/{organisationId}/{year}/{month}/{day}/{hour}/{hours} | System Logs
*StatsApi* | [**version**](docs/StatsApi.md#version) | **GET** /api/stats/version | Version


## Documentation For Models

 - [Backup](docs/Backup.md)
 - [CMAddFolder](docs/CMAddFolder.md)
 - [CMAddSourceFolder](docs/CMAddSourceFolder.md)
 - [CMCategorization](docs/CMCategorization.md)
 - [CMCategorizationPaginatedList](docs/CMCategorizationPaginatedList.md)
 - [CMChangeTaskPhase](docs/CMChangeTaskPhase.md)
 - [CMClaimDocument](docs/CMClaimDocument.md)
 - [CMClientQuery](docs/CMClientQuery.md)
 - [CMClientQueryResult](docs/CMClientQueryResult.md)
 - [CMCommandQueueItem](docs/CMCommandQueueItem.md)
 - [CMCommentFilter](docs/CMCommentFilter.md)
 - [CMCompoundQuery](docs/CMCompoundQuery.md)
 - [CMCrawlerStatus](docs/CMCrawlerStatus.md)
 - [CMCrawlerStatusTask](docs/CMCrawlerStatusTask.md)
 - [CMCreateGdprProject](docs/CMCreateGdprProject.md)
 - [CMCreatedProject](docs/CMCreatedProject.md)
 - [CMDParagraphSummary](docs/CMDParagraphSummary.md)
 - [CMDUserDashboard](docs/CMDUserDashboard.md)
 - [CMDeleteDocument](docs/CMDeleteDocument.md)
 - [CMDeleteProjectCmd](docs/CMDeleteProjectCmd.md)
 - [CMDocument](docs/CMDocument.md)
 - [CMDocumentAcl](docs/CMDocumentAcl.md)
 - [CMDocumentAudit](docs/CMDocumentAudit.md)
 - [CMDocumentBookmark](docs/CMDocumentBookmark.md)
 - [CMDocumentFolder](docs/CMDocumentFolder.md)
 - [CMDocumentHashTag](docs/CMDocumentHashTag.md)
 - [CMDocumentLock](docs/CMDocumentLock.md)
 - [CMDocumentNote](docs/CMDocumentNote.md)
 - [CMDocumentQuestionAndAnswer](docs/CMDocumentQuestionAndAnswer.md)
 - [CMDocumentRelationship](docs/CMDocumentRelationship.md)
 - [CMDocumentSubscription](docs/CMDocumentSubscription.md)
 - [CMDocumentTypeFrequency](docs/CMDocumentTypeFrequency.md)
 - [CMDocumentUnChanged](docs/CMDocumentUnChanged.md)
 - [CMDocumentVersion](docs/CMDocumentVersion.md)
 - [CMDocumentsByToken](docs/CMDocumentsByToken.md)
 - [CMExportRedactedDocument](docs/CMExportRedactedDocument.md)
 - [CMExternalCrawler](docs/CMExternalCrawler.md)
 - [CMExternalCrawlerStart](docs/CMExternalCrawlerStart.md)
 - [CMExternalCrawlerStop](docs/CMExternalCrawlerStop.md)
 - [CMFilter](docs/CMFilter.md)
 - [CMGdprSearchDetails](docs/CMGdprSearchDetails.md)
 - [CMGetHtml](docs/CMGetHtml.md)
 - [CMGroup](docs/CMGroup.md)
 - [CMGroupList](docs/CMGroupList.md)
 - [CMImportUsers](docs/CMImportUsers.md)
 - [CMInfo](docs/CMInfo.md)
 - [CMInventorizeParameters](docs/CMInventorizeParameters.md)
 - [CMKeyedSearchTerm](docs/CMKeyedSearchTerm.md)
 - [CMKnowledgeBase](docs/CMKnowledgeBase.md)
 - [CMKnowledgeBaseExport](docs/CMKnowledgeBaseExport.md)
 - [CMKnowledgeBaseInfo](docs/CMKnowledgeBaseInfo.md)
 - [CMLocatedRedaction](docs/CMLocatedRedaction.md)
 - [CMLoggerEntry](docs/CMLoggerEntry.md)
 - [CMNewComment](docs/CMNewComment.md)
 - [CMNextDocument](docs/CMNextDocument.md)
 - [CMOperatorKnowledgeBase](docs/CMOperatorKnowledgeBase.md)
 - [CMOptimizeIndex](docs/CMOptimizeIndex.md)
 - [CMOrganisation](docs/CMOrganisation.md)
 - [CMPagedProjectDocuments](docs/CMPagedProjectDocuments.md)
 - [CMPagedQueueItems](docs/CMPagedQueueItems.md)
 - [CMPagedResultsCMSlicedDocument](docs/CMPagedResultsCMSlicedDocument.md)
 - [CMParquetItem](docs/CMParquetItem.md)
 - [CMParquetTimeList](docs/CMParquetTimeList.md)
 - [CMPasswordResetRequest](docs/CMPasswordResetRequest.md)
 - [CMProjectDefinition](docs/CMProjectDefinition.md)
 - [CMProjectDefinitionTask](docs/CMProjectDefinitionTask.md)
 - [CMProjectDocument](docs/CMProjectDocument.md)
 - [CMProjectFrame](docs/CMProjectFrame.md)
 - [CMProjectInfo](docs/CMProjectInfo.md)
 - [CMProjectSlice](docs/CMProjectSlice.md)
 - [CMProjectSliceTask](docs/CMProjectSliceTask.md)
 - [CMQueryFocussedSummarization](docs/CMQueryFocussedSummarization.md)
 - [CMQueryFocussedSummarizationRequest](docs/CMQueryFocussedSummarizationRequest.md)
 - [CMQueryToken](docs/CMQueryToken.md)
 - [CMQueueFilter](docs/CMQueueFilter.md)
 - [CMQueueItem](docs/CMQueueItem.md)
 - [CMReassignSliceDocument](docs/CMReassignSliceDocument.md)
 - [CMRecordedComment](docs/CMRecordedComment.md)
 - [CMRedaction](docs/CMRedaction.md)
 - [CMRedactionData](docs/CMRedactionData.md)
 - [CMRedactionDetails](docs/CMRedactionDetails.md)
 - [CMRemoveSliceDocument](docs/CMRemoveSliceDocument.md)
 - [CMRestoreFromText](docs/CMRestoreFromText.md)
 - [CMResultsSection](docs/CMResultsSection.md)
 - [CMReturnStatistics](docs/CMReturnStatistics.md)
 - [CMSavedSearch](docs/CMSavedSearch.md)
 - [CMSearchDefinition](docs/CMSearchDefinition.md)
 - [CMSearchResult](docs/CMSearchResult.md)
 - [CMSearchResultSummary](docs/CMSearchResultSummary.md)
 - [CMSearchResultSummaryTask](docs/CMSearchResultSummaryTask.md)
 - [CMSearchSubTerm](docs/CMSearchSubTerm.md)
 - [CMSearchTerm](docs/CMSearchTerm.md)
 - [CMSemantic](docs/CMSemantic.md)
 - [CMSemanticModelEdit](docs/CMSemanticModelEdit.md)
 - [CMSemanticTerm](docs/CMSemanticTerm.md)
 - [CMSemanticsPaginated](docs/CMSemanticsPaginated.md)
 - [CMSemanticsPaginatedResult](docs/CMSemanticsPaginatedResult.md)
 - [CMSession](docs/CMSession.md)
 - [CMSessionVersion](docs/CMSessionVersion.md)
 - [CMSetSliceDefinitions](docs/CMSetSliceDefinitions.md)
 - [CMShortSummary](docs/CMShortSummary.md)
 - [CMShortSummaryResult](docs/CMShortSummaryResult.md)
 - [CMSignInParameters](docs/CMSignInParameters.md)
 - [CMSimilarDocument](docs/CMSimilarDocument.md)
 - [CMSimpleQuery](docs/CMSimpleQuery.md)
 - [CMSingleDocumentSummary](docs/CMSingleDocumentSummary.md)
 - [CMSingleDocumentSummaryRequest](docs/CMSingleDocumentSummaryRequest.md)
 - [CMSliceConfig](docs/CMSliceConfig.md)
 - [CMSliceConfigQuery](docs/CMSliceConfigQuery.md)
 - [CMSliceQueryDefinition](docs/CMSliceQueryDefinition.md)
 - [CMSliceReassignment](docs/CMSliceReassignment.md)
 - [CMSlicedDocument](docs/CMSlicedDocument.md)
 - [CMSlicedDocumentFilter](docs/CMSlicedDocumentFilter.md)
 - [CMSlicedDocumentListAndTotals](docs/CMSlicedDocumentListAndTotals.md)
 - [CMSlicedDocumentRequest](docs/CMSlicedDocumentRequest.md)
 - [CMSource](docs/CMSource.md)
 - [CMSourceBaseInfo](docs/CMSourceBaseInfo.md)
 - [CMStartCrawler](docs/CMStartCrawler.md)
 - [CMStartProject](docs/CMStartProject.md)
 - [CMStepConfig](docs/CMStepConfig.md)
 - [CMSubTerm](docs/CMSubTerm.md)
 - [CMSubscriptions](docs/CMSubscriptions.md)
 - [CMSynSet](docs/CMSynSet.md)
 - [CMSynSetFind](docs/CMSynSetFind.md)
 - [CMSynSetList](docs/CMSynSetList.md)
 - [CMSynonym](docs/CMSynonym.md)
 - [CMSynonymsPaginated](docs/CMSynonymsPaginated.md)
 - [CMSynonymsPaginatedResult](docs/CMSynonymsPaginatedResult.md)
 - [CMTaskInfo](docs/CMTaskInfo.md)
 - [CMTextToSearchConversion](docs/CMTextToSearchConversion.md)
 - [CMTextToSearchConversionReturn](docs/CMTextToSearchConversionReturn.md)
 - [CMTextToSearchEdit](docs/CMTextToSearchEdit.md)
 - [CMTextToSearchPaginated](docs/CMTextToSearchPaginated.md)
 - [CMTextToSearchPaginatedReturn](docs/CMTextToSearchPaginatedReturn.md)
 - [CMUpdateACLs](docs/CMUpdateACLs.md)
 - [CMUpdateDocumentSet](docs/CMUpdateDocumentSet.md)
 - [CMUpdateDocumentStatus](docs/CMUpdateDocumentStatus.md)
 - [CMUpdateRedactions](docs/CMUpdateRedactions.md)
 - [CMUploadDocument](docs/CMUploadDocument.md)
 - [CMUploadImage](docs/CMUploadImage.md)
 - [CMUser](docs/CMUser.md)
 - [CMUserList](docs/CMUserList.md)
 - [CMUserNotification](docs/CMUserNotification.md)
 - [CMUserPasswordReset](docs/CMUserPasswordReset.md)
 - [CMUserRole](docs/CMUserRole.md)
 - [CMUserWithExtras](docs/CMUserWithExtras.md)
 - [CMVersion](docs/CMVersion.md)
 - [CMWordFrequency](docs/CMWordFrequency.md)
 - [CMZipSource](docs/CMZipSource.md)
 - [ContextItem](docs/ContextItem.md)
 - [DocumentBookmark](docs/DocumentBookmark.md)
 - [DocumentDeleted](docs/DocumentDeleted.md)
 - [GdprProject](docs/GdprProject.md)
 - [Group](docs/Group.md)
 - [Identifier](docs/Identifier.md)
 - [JsonMessage](docs/JsonMessage.md)
 - [KnowledgeBase](docs/KnowledgeBase.md)
 - [LocatedRedaction](docs/LocatedRedaction.md)
 - [MDCategory](docs/MDCategory.md)
 - [NameCounterLevel](docs/NameCounterLevel.md)
 - [OperatorKnowledgeBase](docs/OperatorKnowledgeBase.md)
 - [OptimizeIndexesGetReportCmd](docs/OptimizeIndexesGetReportCmd.md)
 - [OptimizeIndexesGetReportsCmd](docs/OptimizeIndexesGetReportsCmd.md)
 - [Organisation](docs/Organisation.md)
 - [ReturnedDocument](docs/ReturnedDocument.md)
 - [SearchCategory](docs/SearchCategory.md)
 - [Session](docs/Session.md)
 - [SignInAdmin](docs/SignInAdmin.md)
 - [SignInCmd](docs/SignInCmd.md)
 - [SignInDmsCmd](docs/SignInDmsCmd.md)
 - [TextToSearch](docs/TextToSearch.md)
 - [User](docs/User.md)
 - [UserRole](docs/UserRole.md)


<a id="documentation-for-authorization"></a>
## Documentation For Authorization

Endpoints do not require authorization.


## Author

info@simsage.co.uk

