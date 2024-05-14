# OpenAPIClient-php

SimSage REST API

For more information, please visit [https://training.simsage.ai](https://training.simsage.ai).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$organisation_id = 'organisation_id_example'; // string | the organisation (its guid id)
$name = 'name_example'; // string | the name of the group to remove.
$session_id = 'session_id_example'; // string | a valid SimSage Session id.

try {
    $result = $apiInstance->deleteGroup($organisation_id, $name, $session_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->deleteGroup: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://training.simsage.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**deleteGroup**](docs/Api/AuthApi.md#deletegroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group
*AuthApi* | [**deleteOrganisation**](docs/Api/AuthApi.md#deleteorganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation
*AuthApi* | [**getGroups**](docs/Api/AuthApi.md#getgroups) | **GET** /api/auth/groups/{organisationId} | Get Groups
*AuthApi* | [**getOTT**](docs/Api/AuthApi.md#getott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token.
*AuthApi* | [**getUserOrganisationList**](docs/Api/AuthApi.md#getuserorganisationlist) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations
*AuthApi* | [**getUsersPaginated**](docs/Api/AuthApi.md#getuserspaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated
*AuthApi* | [**groupEditInfo**](docs/Api/AuthApi.md#groupeditinfo) | **POST** /api/auth/group-edit-info/{organisationId} | Get Group edit information
*AuthApi* | [**importUsersAndGroups**](docs/Api/AuthApi.md#importusersandgroups) | **PUT** /api/auth/user/import | 
*AuthApi* | [**myRoles**](docs/Api/AuthApi.md#myroles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles
*AuthApi* | [**removeUserFromOrganisation**](docs/Api/AuthApi.md#removeuserfromorganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation
*AuthApi* | [**resetPassword**](docs/Api/AuthApi.md#resetpassword) | **POST** /api/auth/reset-password | Perform a password-reset request.
*AuthApi* | [**resetPasswordRequest**](docs/Api/AuthApi.md#resetpasswordrequest) | **POST** /api/auth/reset-password-request | Password Reset Request
*AuthApi* | [**saveGroup**](docs/Api/AuthApi.md#savegroup) | **PUT** /api/auth/group | Save Group
*AuthApi* | [**signIn**](docs/Api/AuthApi.md#signin) | **POST** /api/auth/sign-in | Sign In
*AuthApi* | [**signInAdminUsingJWTMsal**](docs/Api/AuthApi.md#signinadminusingjwtmsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In
*AuthApi* | [**signInAdminUsingSessionId**](docs/Api/AuthApi.md#signinadminusingsessionid) | **GET** /api/auth/admin/authenticate/session-id | session-id Sign-in
*AuthApi* | [**signInDmsUsingJWTMsal**](docs/Api/AuthApi.md#signindmsusingjwtmsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**signInEvolveUsingJWTMsal**](docs/Api/AuthApi.md#signinevolveusingjwtmsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**signInSearchUsingJWTMsal**](docs/Api/AuthApi.md#signinsearchusingjwtmsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In
*AuthApi* | [**signOut**](docs/Api/AuthApi.md#signout) | **DELETE** /api/auth/sign-out | Sign Out
*AuthApi* | [**updateOrganisation**](docs/Api/AuthApi.md#updateorganisation) | **PUT** /api/auth/organisation | Save Organisation
*AuthApi* | [**updateUser**](docs/Api/AuthApi.md#updateuser) | **PUT** /api/auth/user/{organisationId} | 
*AuthApi* | [**version8**](docs/Api/AuthApi.md#version8) | **GET** /api/auth/version | Get Version
*BackupApi* | [**backup**](docs/Api/BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup
*BackupApi* | [**deleteBackup**](docs/Api/BackupApi.md#deletebackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup
*BackupApi* | [**getBackup**](docs/Api/BackupApi.md#getbackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup
*BackupApi* | [**getBackupList**](docs/Api/BackupApi.md#getbackuplist) | **GET** /api/backup/backups/{organisationId} | get backup list
*BackupApi* | [**restoreFromText**](docs/Api/BackupApi.md#restorefromtext) | **POST** /api/backup/restore | restore backup
*ConversionApi* | [**previewVersion**](docs/Api/ConversionApi.md#previewversion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version
*ConversionApi* | [**sttVersion**](docs/Api/ConversionApi.md#sttversion) | **GET** /api/conversion/stt/version | Get speech-to-text Version
*ConversionApi* | [**version7**](docs/Api/ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version
*CrawlerApi* | [**crawlerDeleteFolder**](docs/Api/CrawlerApi.md#crawlerdeletefolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder
*CrawlerApi* | [**crawlerDeleteUrl**](docs/Api/CrawlerApi.md#crawlerdeleteurl) | **POST** /api/crawler/external/crawler/delete-url | Delete document
*CrawlerApi* | [**crawlerExternalDocumentDelete**](docs/Api/CrawlerApi.md#crawlerexternaldocumentdelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document
*CrawlerApi* | [**crawlerExternalDocumentFailed**](docs/Api/CrawlerApi.md#crawlerexternaldocumentfailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document
*CrawlerApi* | [**crawlerExternalDocumentUpload**](docs/Api/CrawlerApi.md#crawlerexternaldocumentupload) | **POST** /api/crawler/external/document/upload | Upload External Document
*CrawlerApi* | [**crawlerExternalImageUpload**](docs/Api/CrawlerApi.md#crawlerexternalimageupload) | **POST** /api/crawler/external/document/upload/image | Upload External Image
*CrawlerApi* | [**crawlerRenameFolder**](docs/Api/CrawlerApi.md#crawlerrenamefolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder
*CrawlerApi* | [**crawlerUpdateDeltaToken**](docs/Api/CrawlerApi.md#crawlerupdatedeltatoken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token
*CrawlerApi* | [**delete**](docs/Api/CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source
*CrawlerApi* | [**deleteDocuments**](docs/Api/CrawlerApi.md#deletedocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source&#39;s documents
*CrawlerApi* | [**encryptedCommunications**](docs/Api/CrawlerApi.md#encryptedcommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication
*CrawlerApi* | [**externalCrawler**](docs/Api/CrawlerApi.md#externalcrawler) | **POST** /api/crawler/external/crawler | External Crawler
*CrawlerApi* | [**externalCrawlerFinished**](docs/Api/CrawlerApi.md#externalcrawlerfinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler
*CrawlerApi* | [**externalCrawlerStart**](docs/Api/CrawlerApi.md#externalcrawlerstart) | **POST** /api/crawler/external/crawler/start | Start External Crawler
*CrawlerApi* | [**getCrawler**](docs/Api/CrawlerApi.md#getcrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source
*CrawlerApi* | [**getFailedDocuments**](docs/Api/CrawlerApi.md#getfaileddocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List
*CrawlerApi* | [**getSourceList**](docs/Api/CrawlerApi.md#getsourcelist) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List
*CrawlerApi* | [**markCrawlAsDeltaReset**](docs/Api/CrawlerApi.md#markcrawlasdeltareset) | **POST** /api/crawler/external/crawler/mark-as-reset | Update delta token
*CrawlerApi* | [**markFileAsSeen**](docs/Api/CrawlerApi.md#markfileasseen) | **POST** /api/crawler/external/crawler/mark-file-as-seen | Mark file as seen
*CrawlerApi* | [**oidcCode**](docs/Api/CrawlerApi.md#oidccode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver
*CrawlerApi* | [**processAllFiles**](docs/Api/CrawlerApi.md#processallfiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source
*CrawlerApi* | [**processorSchema**](docs/Api/CrawlerApi.md#processorschema) | **GET** /api/crawler/processor_schema | 
*CrawlerApi* | [**receiveExternalLogEntry**](docs/Api/CrawlerApi.md#receiveexternallogentry) | **POST** /api/crawler/external/crawler/log | External Crawler log-entry
*CrawlerApi* | [**resetSourceDelta**](docs/Api/CrawlerApi.md#resetsourcedelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token
*CrawlerApi* | [**sdcSchema**](docs/Api/CrawlerApi.md#sdcschema) | **GET** /api/crawler/sdc_schema | 
*CrawlerApi* | [**startCrawler**](docs/Api/CrawlerApi.md#startcrawler) | **POST** /api/crawler/start | Start crawler
*CrawlerApi* | [**sync**](docs/Api/CrawlerApi.md#sync) | **POST** /api/crawler/syncgdrivegroups | 
*CrawlerApi* | [**testCrawler**](docs/Api/CrawlerApi.md#testcrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler
*CrawlerApi* | [**updateCrawler**](docs/Api/CrawlerApi.md#updatecrawler) | **POST** /api/crawler/crawler | Update Source
*CrawlerApi* | [**version6**](docs/Api/CrawlerApi.md#version6) | **GET** /api/crawler/version | Version
*DataprojectApi* | [**addComment**](docs/Api/DataprojectApi.md#addcomment) | **POST** /api/dataproject/comment | Create Comment
*DataprojectApi* | [**allTasks**](docs/Api/DataprojectApi.md#alltasks) | **POST** /api/dataproject/runningprojects | get Running Projects
*DataprojectApi* | [**changeTaskPhase**](docs/Api/DataprojectApi.md#changetaskphase) | **POST** /api/dataproject/changetaskphase | Change Task Phase
*DataprojectApi* | [**claimDocument**](docs/Api/DataprojectApi.md#claimdocument) | **POST** /api/dataproject/claimdocument | Claim sliced document
*DataprojectApi* | [**crawlerStatus**](docs/Api/DataprojectApi.md#crawlerstatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status
*DataprojectApi* | [**documentsByTokens**](docs/Api/DataprojectApi.md#documentsbytokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens
*DataprojectApi* | [**filteredComments**](docs/Api/DataprojectApi.md#filteredcomments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments
*DataprojectApi* | [**getDocumentRedactionInfo**](docs/Api/DataprojectApi.md#getdocumentredactioninfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info
*DataprojectApi* | [**getProjectDefinition**](docs/Api/DataprojectApi.md#getprojectdefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition
*DataprojectApi* | [**getProjectReview**](docs/Api/DataprojectApi.md#getprojectreview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition
*DataprojectApi* | [**getProjectSlice**](docs/Api/DataprojectApi.md#getprojectslice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice
*DataprojectApi* | [**getSearchResultSummary**](docs/Api/DataprojectApi.md#getsearchresultsummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary
*DataprojectApi* | [**getSearchResultSummaryForReview**](docs/Api/DataprojectApi.md#getsearchresultsummaryforreview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary
*DataprojectApi* | [**nextDocument**](docs/Api/DataprojectApi.md#nextdocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters
*DataprojectApi* | [**pdfBinary**](docs/Api/DataprojectApi.md#pdfbinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary
*DataprojectApi* | [**projectTypes**](docs/Api/DataprojectApi.md#projecttypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types
*DataprojectApi* | [**reassignSliceDocument**](docs/Api/DataprojectApi.md#reassignslicedocument) | **POST** /api/dataproject/reassignslicedoc | 
*DataprojectApi* | [**redactedDocument**](docs/Api/DataprojectApi.md#redacteddocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document
*DataprojectApi* | [**removeSliceDocument**](docs/Api/DataprojectApi.md#removeslicedocument) | **POST** /api/dataproject/removeslicedoc | 
*DataprojectApi* | [**resetEvolve**](docs/Api/DataprojectApi.md#resetevolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application
*DataprojectApi* | [**saveProjectDefinition**](docs/Api/DataprojectApi.md#saveprojectdefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition
*DataprojectApi* | [**setSliceConfig**](docs/Api/DataprojectApi.md#setsliceconfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration
*DataprojectApi* | [**slicedDocuments**](docs/Api/DataprojectApi.md#sliceddocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters
*DataprojectApi* | [**startProject**](docs/Api/DataprojectApi.md#startproject) | **POST** /api/dataproject/startproject | 
*DataprojectApi* | [**updateDocumentStatus**](docs/Api/DataprojectApi.md#updatedocumentstatus) | **POST** /api/dataproject/updatedocstatus | Update document status
*DataprojectApi* | [**updateRedactions**](docs/Api/DataprojectApi.md#updateredactions) | **POST** /api/dataproject/updateredactions | Update document redactions
*DiscoveryApi* | [**allGdprProjects**](docs/Api/DiscoveryApi.md#allgdprprojects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
*DiscoveryApi* | [**applyRedactions**](docs/Api/DiscoveryApi.md#applyredactions) | **POST** /api/discovery/applyredactions | 
*DiscoveryApi* | [**createGdprProject**](docs/Api/DiscoveryApi.md#creategdprproject) | **POST** /api/discovery/createproject | 
*DiscoveryApi* | [**deleteProject**](docs/Api/DiscoveryApi.md#deleteproject) | **DELETE** /api/discovery/deleteproject | 
*DiscoveryApi* | [**exportRedactedDoc**](docs/Api/DiscoveryApi.md#exportredacteddoc) | **POST** /api/discovery/exportredacteddoc | 
*DiscoveryApi* | [**getGdprDocument**](docs/Api/DiscoveryApi.md#getgdprdocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} | 
*DiscoveryApi* | [**getPagedProjectDocuments**](docs/Api/DiscoveryApi.md#getpagedprojectdocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} | 
*DiscoveryApi* | [**growthPerMonth**](docs/Api/DiscoveryApi.md#growthpermonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth
*DiscoveryApi* | [**setdocumentredactions**](docs/Api/DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument | 
*DiscoveryApi* | [**storageBySource**](docs/Api/DiscoveryApi.md#storagebysource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage
*DiscoveryApi* | [**summaryByDocumentType**](docs/Api/DiscoveryApi.md#summarybydocumenttype) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage
*DiscoveryApi* | [**updateDocumentSet**](docs/Api/DiscoveryApi.md#updatedocumentset) | **POST** /api/discovery/updatedocumentset | 
*DiscoveryApi* | [**version5**](docs/Api/DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version
*DmsApi* | [**addFolder**](docs/Api/DmsApi.md#addfolder) | **POST** /api/dms/folder | Add a new folder
*DmsApi* | [**addSourceFolder**](docs/Api/DmsApi.md#addsourcefolder) | **POST** /api/dms/source | Add a new source-folder
*DmsApi* | [**deleteAllNotes**](docs/Api/DmsApi.md#deleteallnotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes
*DmsApi* | [**deleteBookmark**](docs/Api/DmsApi.md#deletebookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark
*DmsApi* | [**deleteDocumentOrFolder**](docs/Api/DmsApi.md#deletedocumentorfolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder
*DmsApi* | [**deleteNote**](docs/Api/DmsApi.md#deletenote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note
*DmsApi* | [**deleteSourceFolder**](docs/Api/DmsApi.md#deletesourcefolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder
*DmsApi* | [**deleteSubscription**](docs/Api/DmsApi.md#deletesubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription
*DmsApi* | [**deleteUserSearch**](docs/Api/DmsApi.md#deleteusersearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search
*DmsApi* | [**document1**](docs/Api/DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document
*DmsApi* | [**documentBinary**](docs/Api/DmsApi.md#documentbinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary
*DmsApi* | [**documentVersion**](docs/Api/DmsApi.md#documentversion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document
*DmsApi* | [**filterFolders**](docs/Api/DmsApi.md#filterfolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders
*DmsApi* | [**forceReleaseLock**](docs/Api/DmsApi.md#forcereleaselock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock
*DmsApi* | [**getBookmarkList**](docs/Api/DmsApi.md#getbookmarklist) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks
*DmsApi* | [**getDeletedDocuments**](docs/Api/DmsApi.md#getdeleteddocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter
*DmsApi* | [**getDocumentAudit**](docs/Api/DmsApi.md#getdocumentaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month
*DmsApi* | [**getFolder**](docs/Api/DmsApi.md#getfolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content
*DmsApi* | [**getFullAudit**](docs/Api/DmsApi.md#getfullaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month
*DmsApi* | [**getLockedList**](docs/Api/DmsApi.md#getlockedlist) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user
*DmsApi* | [**getNoteList**](docs/Api/DmsApi.md#getnotelist) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes
*DmsApi* | [**getSavedSearches**](docs/Api/DmsApi.md#getsavedsearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User&#39;s saved searches
*DmsApi* | [**getSourceFolder**](docs/Api/DmsApi.md#getsourcefolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder
*DmsApi* | [**getSubscriptionList**](docs/Api/DmsApi.md#getsubscriptionlist) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions
*DmsApi* | [**getUserDashboard**](docs/Api/DmsApi.md#getuserdashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard
*DmsApi* | [**getUserNotifications**](docs/Api/DmsApi.md#getusernotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications
*DmsApi* | [**lockDocument**](docs/Api/DmsApi.md#lockdocument) | **POST** /api/dms/lock | Document Lock
*DmsApi* | [**releaseLock**](docs/Api/DmsApi.md#releaselock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock
*DmsApi* | [**restfulDMSClientQuery**](docs/Api/DmsApi.md#restfuldmsclientquery) | **POST** /api/dms/query | DMS Client Query
*DmsApi* | [**saveBookmark**](docs/Api/DmsApi.md#savebookmark) | **POST** /api/dms/bookmark | Save Bookmark
*DmsApi* | [**saveHashTags**](docs/Api/DmsApi.md#savehashtags) | **POST** /api/dms/hash-tag | Save HashTag set for a document
*DmsApi* | [**saveNote**](docs/Api/DmsApi.md#savenote) | **POST** /api/dms/note | Save Note
*DmsApi* | [**saveSearch**](docs/Api/DmsApi.md#savesearch) | **POST** /api/dms/save-search | Save Search
*DmsApi* | [**saveSubscription**](docs/Api/DmsApi.md#savesubscription) | **POST** /api/dms/subscription | Save Subscription
*DmsApi* | [**undeleteDocument**](docs/Api/DmsApi.md#undeletedocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record
*DmsApi* | [**updateACLs**](docs/Api/DmsApi.md#updateacls) | **POST** /api/dms/acls | Update an item&#39;s ACLs
*DmsApi* | [**uploadDocument**](docs/Api/DmsApi.md#uploaddocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document
*DocumentApi* | [**document**](docs/Api/DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document
*DocumentApi* | [**getParquetFile**](docs/Api/DocumentApi.md#getparquetfile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File
*DocumentApi* | [**getParquetList**](docs/Api/DocumentApi.md#getparquetlist) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list
*DocumentApi* | [**getSpreadsheet**](docs/Api/DocumentApi.md#getspreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet
*DocumentApi* | [**getStats1**](docs/Api/DocumentApi.md#getstats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics
*DocumentApi* | [**inventorizeDocuments**](docs/Api/DocumentApi.md#inventorizedocuments) | **POST** /api/document/inventorize | Document Inventory
*DocumentApi* | [**inventorizeIndexes**](docs/Api/DocumentApi.md#inventorizeindexes) | **POST** /api/document/inventorize-indexes | Index Inventory
*DocumentApi* | [**preview**](docs/Api/DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview
*DocumentApi* | [**previewHtml**](docs/Api/DocumentApi.md#previewhtml) | **POST** /api/document/preview/html | Preview HTML
*DocumentApi* | [**queryFocussedSummarization**](docs/Api/DocumentApi.md#queryfocussedsummarization) | **POST** /api/document/qfs | Summarize Documents for Query
*DocumentApi* | [**removeDocument**](docs/Api/DocumentApi.md#removedocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document
*DocumentApi* | [**removeParquetFile**](docs/Api/DocumentApi.md#removeparquetfile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File
*DocumentApi* | [**summarizeDocument**](docs/Api/DocumentApi.md#summarizedocument) | **POST** /api/document/summarize/document | Summarize a document
*DocumentApi* | [**version4**](docs/Api/DocumentApi.md#version4) | **GET** /api/document/version | Version
*KnowledgebaseApi* | [**exportKnowledgeBase**](docs/Api/KnowledgebaseApi.md#exportknowledgebase) | **POST** /api/knowledgebase/export | export Knowledge-base
*KnowledgebaseApi* | [**getKnowledgeBase**](docs/Api/KnowledgebaseApi.md#getknowledgebase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base
*KnowledgebaseApi* | [**getKnowledgeBases**](docs/Api/KnowledgebaseApi.md#getknowledgebases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases
*KnowledgebaseApi* | [**getSearchInfo**](docs/Api/KnowledgebaseApi.md#getsearchinfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info
*KnowledgebaseApi* | [**getSearchInfo2**](docs/Api/KnowledgebaseApi.md#getsearchinfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated]
*KnowledgebaseApi* | [**removeKnowledgeBase**](docs/Api/KnowledgebaseApi.md#removeknowledgebase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base
*KnowledgebaseApi* | [**updateKnowledgeBase**](docs/Api/KnowledgebaseApi.md#updateknowledgebase) | **PUT** /api/knowledgebase/save | Save Knowledge-base
*KnowledgebaseApi* | [**version3**](docs/Api/KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version
*LanguageApi* | [**addDefaultSynSets**](docs/Api/LanguageApi.md#adddefaultsynsets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets
*LanguageApi* | [**deleteAllSynonyms**](docs/Api/LanguageApi.md#deleteallsynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms
*LanguageApi* | [**deleteCategorization**](docs/Api/LanguageApi.md#deletecategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization
*LanguageApi* | [**deleteSemantic**](docs/Api/LanguageApi.md#deletesemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic
*LanguageApi* | [**deleteSynSet**](docs/Api/LanguageApi.md#deletesynset) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet
*LanguageApi* | [**deleteSynonym**](docs/Api/LanguageApi.md#deletesynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym
*LanguageApi* | [**findSynSets**](docs/Api/LanguageApi.md#findsynsets) | **PUT** /api/language/find-syn-sets | Find SynSets
*LanguageApi* | [**getCategorizationList**](docs/Api/LanguageApi.md#getcategorizationlist) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list
*LanguageApi* | [**getPaginated**](docs/Api/LanguageApi.md#getpaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated
*LanguageApi* | [**getSemanticsPaginated**](docs/Api/LanguageApi.md#getsemanticspaginated) | **PUT** /api/language/semantics | Semantics Paginated
*LanguageApi* | [**optimizeIndexes**](docs/Api/LanguageApi.md#optimizeindexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes
*LanguageApi* | [**optimizeIndexesAbort**](docs/Api/LanguageApi.md#optimizeindexesabort) | **PUT** /api/language/optimize-indexes-abort | Abort Index Optimization
*LanguageApi* | [**redactDocument**](docs/Api/LanguageApi.md#redactdocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document
*LanguageApi* | [**saveCategorization**](docs/Api/LanguageApi.md#savecategorization) | **PUT** /api/language/categorization | save categorization
*LanguageApi* | [**saveSemantic**](docs/Api/LanguageApi.md#savesemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic
*LanguageApi* | [**saveSynSet**](docs/Api/LanguageApi.md#savesynset) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet
*LanguageApi* | [**saveSynonym**](docs/Api/LanguageApi.md#savesynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym
*LanguageApi* | [**tuneLanguageGraph**](docs/Api/LanguageApi.md#tunelanguagegraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph
*LanguageApi* | [**version2**](docs/Api/LanguageApi.md#version2) | **GET** /api/language/version | Version
*SemanticApi* | [**deleteTextToSearch**](docs/Api/SemanticApi.md#deletetexttosearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search
*SemanticApi* | [**documentQuestionAndAnswer**](docs/Api/SemanticApi.md#documentquestionandanswer) | **POST** /api/semantic/document-qa | Document Q&amp;A
*SemanticApi* | [**getTextToSearchPaginated**](docs/Api/SemanticApi.md#gettexttosearchpaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings
*SemanticApi* | [**restfulClientQuery**](docs/Api/SemanticApi.md#restfulclientquery) | **POST** /api/semantic/query | Client Query
*SemanticApi* | [**saveTextToSearch**](docs/Api/SemanticApi.md#savetexttosearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item
*SemanticApi* | [**shortSummary**](docs/Api/SemanticApi.md#shortsummary) | **POST** /api/semantic/short-summary | Short summary
*SemanticApi* | [**tryTextToSearchConversion**](docs/Api/SemanticApi.md#trytexttosearchconversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search
*SemanticApi* | [**version1**](docs/Api/SemanticApi.md#version1) | **GET** /api/semantic/version | Version
*StatsApi* | [**getIndexOptimizationReport**](docs/Api/StatsApi.md#getindexoptimizationreport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report
*StatsApi* | [**getIndexOptimizationReports**](docs/Api/StatsApi.md#getindexoptimizationreports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list
*StatsApi* | [**getStats**](docs/Api/StatsApi.md#getstats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics
*StatsApi* | [**simSageStatus**](docs/Api/StatsApi.md#simsagestatus) | **PUT** /api/stats/status/{organisationId} | SimSage status
*StatsApi* | [**systemLogs**](docs/Api/StatsApi.md#systemlogs) | **GET** /api/stats/system-logs/{organisationId}/{service}/{numLines} | System Logs
*StatsApi* | [**version**](docs/Api/StatsApi.md#version) | **GET** /api/stats/version | Version

## Models

- [Asset](docs/Model/Asset.md)
- [AssetACL](docs/Model/AssetACL.md)
- [Backup](docs/Model/Backup.md)
- [CMAddFolder](docs/Model/CMAddFolder.md)
- [CMAddSourceFolder](docs/Model/CMAddSourceFolder.md)
- [CMCategorization](docs/Model/CMCategorization.md)
- [CMCategorizationPaginatedList](docs/Model/CMCategorizationPaginatedList.md)
- [CMChangeTaskPhase](docs/Model/CMChangeTaskPhase.md)
- [CMClaimDocument](docs/Model/CMClaimDocument.md)
- [CMClientQuery](docs/Model/CMClientQuery.md)
- [CMClientQueryResult](docs/Model/CMClientQueryResult.md)
- [CMCommandQueueItem](docs/Model/CMCommandQueueItem.md)
- [CMCommentFilter](docs/Model/CMCommentFilter.md)
- [CMCompoundQuery](docs/Model/CMCompoundQuery.md)
- [CMCrawlerStatus](docs/Model/CMCrawlerStatus.md)
- [CMCrawlerStatusTask](docs/Model/CMCrawlerStatusTask.md)
- [CMCreateGdprProject](docs/Model/CMCreateGdprProject.md)
- [CMCreatedProject](docs/Model/CMCreatedProject.md)
- [CMDParagraphSummary](docs/Model/CMDParagraphSummary.md)
- [CMDUserDashboard](docs/Model/CMDUserDashboard.md)
- [CMDeleteDocument](docs/Model/CMDeleteDocument.md)
- [CMDeleteProjectCmd](docs/Model/CMDeleteProjectCmd.md)
- [CMDocument](docs/Model/CMDocument.md)
- [CMDocumentAcl](docs/Model/CMDocumentAcl.md)
- [CMDocumentAudit](docs/Model/CMDocumentAudit.md)
- [CMDocumentBookmark](docs/Model/CMDocumentBookmark.md)
- [CMDocumentFolder](docs/Model/CMDocumentFolder.md)
- [CMDocumentHashTag](docs/Model/CMDocumentHashTag.md)
- [CMDocumentLock](docs/Model/CMDocumentLock.md)
- [CMDocumentNote](docs/Model/CMDocumentNote.md)
- [CMDocumentQuestionAndAnswer](docs/Model/CMDocumentQuestionAndAnswer.md)
- [CMDocumentRelationship](docs/Model/CMDocumentRelationship.md)
- [CMDocumentSubscription](docs/Model/CMDocumentSubscription.md)
- [CMDocumentTypeFrequency](docs/Model/CMDocumentTypeFrequency.md)
- [CMDocumentVersion](docs/Model/CMDocumentVersion.md)
- [CMDocumentsByToken](docs/Model/CMDocumentsByToken.md)
- [CMExportRedactedDocument](docs/Model/CMExportRedactedDocument.md)
- [CMExternalCrawler](docs/Model/CMExternalCrawler.md)
- [CMExternalCrawlerDeleteFolder](docs/Model/CMExternalCrawlerDeleteFolder.md)
- [CMExternalCrawlerDeleteUrl](docs/Model/CMExternalCrawlerDeleteUrl.md)
- [CMExternalCrawlerMarkFileAsSeen](docs/Model/CMExternalCrawlerMarkFileAsSeen.md)
- [CMExternalCrawlerRenameFolder](docs/Model/CMExternalCrawlerRenameFolder.md)
- [CMExternalCrawlerSetDeltaToken](docs/Model/CMExternalCrawlerSetDeltaToken.md)
- [CMExternalCrawlerStart](docs/Model/CMExternalCrawlerStart.md)
- [CMExternalCrawlerStop](docs/Model/CMExternalCrawlerStop.md)
- [CMExternalLogEntry](docs/Model/CMExternalLogEntry.md)
- [CMExternalMarkResetCrawl](docs/Model/CMExternalMarkResetCrawl.md)
- [CMFailedSourceDocument](docs/Model/CMFailedSourceDocument.md)
- [CMFilter](docs/Model/CMFilter.md)
- [CMGdprSearchDetails](docs/Model/CMGdprSearchDetails.md)
- [CMGetHtml](docs/Model/CMGetHtml.md)
- [CMGroup](docs/Model/CMGroup.md)
- [CMGroupEditInfo](docs/Model/CMGroupEditInfo.md)
- [CMGroupList](docs/Model/CMGroupList.md)
- [CMImportUsers](docs/Model/CMImportUsers.md)
- [CMInfo](docs/Model/CMInfo.md)
- [CMInventorizeParameters](docs/Model/CMInventorizeParameters.md)
- [CMKeyedSearchTerm](docs/Model/CMKeyedSearchTerm.md)
- [CMKnowledgeBase](docs/Model/CMKnowledgeBase.md)
- [CMKnowledgeBaseExport](docs/Model/CMKnowledgeBaseExport.md)
- [CMKnowledgeBaseInfo](docs/Model/CMKnowledgeBaseInfo.md)
- [CMLocatedRedaction](docs/Model/CMLocatedRedaction.md)
- [CMLoggerEntry](docs/Model/CMLoggerEntry.md)
- [CMNewComment](docs/Model/CMNewComment.md)
- [CMNextDocument](docs/Model/CMNextDocument.md)
- [CMOperatorKnowledgeBase](docs/Model/CMOperatorKnowledgeBase.md)
- [CMOptimizeIndex](docs/Model/CMOptimizeIndex.md)
- [CMOrganisation](docs/Model/CMOrganisation.md)
- [CMPagedProjectDocuments](docs/Model/CMPagedProjectDocuments.md)
- [CMPagedQueueItems](docs/Model/CMPagedQueueItems.md)
- [CMPagedResultsCMSlicedDocument](docs/Model/CMPagedResultsCMSlicedDocument.md)
- [CMParquetItem](docs/Model/CMParquetItem.md)
- [CMParquetTimeList](docs/Model/CMParquetTimeList.md)
- [CMPasswordResetRequest](docs/Model/CMPasswordResetRequest.md)
- [CMProjectDefinition](docs/Model/CMProjectDefinition.md)
- [CMProjectDefinitionTask](docs/Model/CMProjectDefinitionTask.md)
- [CMProjectDocument](docs/Model/CMProjectDocument.md)
- [CMProjectFrame](docs/Model/CMProjectFrame.md)
- [CMProjectInfo](docs/Model/CMProjectInfo.md)
- [CMProjectReview](docs/Model/CMProjectReview.md)
- [CMProjectSlice](docs/Model/CMProjectSlice.md)
- [CMProjectSliceTask](docs/Model/CMProjectSliceTask.md)
- [CMQueryFocussedSummarization](docs/Model/CMQueryFocussedSummarization.md)
- [CMQueryFocussedSummarizationRequest](docs/Model/CMQueryFocussedSummarizationRequest.md)
- [CMQueryToken](docs/Model/CMQueryToken.md)
- [CMQueueFilter](docs/Model/CMQueueFilter.md)
- [CMQueueItem](docs/Model/CMQueueItem.md)
- [CMReassignSliceDocument](docs/Model/CMReassignSliceDocument.md)
- [CMRecordedComment](docs/Model/CMRecordedComment.md)
- [CMRedaction](docs/Model/CMRedaction.md)
- [CMRedactionData](docs/Model/CMRedactionData.md)
- [CMRedactionDetails](docs/Model/CMRedactionDetails.md)
- [CMRemoveSliceDocument](docs/Model/CMRemoveSliceDocument.md)
- [CMRestoreFromText](docs/Model/CMRestoreFromText.md)
- [CMResultsSection](docs/Model/CMResultsSection.md)
- [CMReturnStatistics](docs/Model/CMReturnStatistics.md)
- [CMSavedSearch](docs/Model/CMSavedSearch.md)
- [CMSearchDefinition](docs/Model/CMSearchDefinition.md)
- [CMSearchResult](docs/Model/CMSearchResult.md)
- [CMSearchResultSummary](docs/Model/CMSearchResultSummary.md)
- [CMSearchResultSummaryTask](docs/Model/CMSearchResultSummaryTask.md)
- [CMSearchSubTerm](docs/Model/CMSearchSubTerm.md)
- [CMSearchTerm](docs/Model/CMSearchTerm.md)
- [CMSemantic](docs/Model/CMSemantic.md)
- [CMSemanticModelEdit](docs/Model/CMSemanticModelEdit.md)
- [CMSemanticTerm](docs/Model/CMSemanticTerm.md)
- [CMSemanticsPaginated](docs/Model/CMSemanticsPaginated.md)
- [CMSemanticsPaginatedResult](docs/Model/CMSemanticsPaginatedResult.md)
- [CMSession](docs/Model/CMSession.md)
- [CMSessionVersion](docs/Model/CMSessionVersion.md)
- [CMSetSliceDefinitions](docs/Model/CMSetSliceDefinitions.md)
- [CMShortSummary](docs/Model/CMShortSummary.md)
- [CMShortSummaryResult](docs/Model/CMShortSummaryResult.md)
- [CMSignInParameters](docs/Model/CMSignInParameters.md)
- [CMSimilarDocument](docs/Model/CMSimilarDocument.md)
- [CMSimpleQuery](docs/Model/CMSimpleQuery.md)
- [CMSingleDocumentSummary](docs/Model/CMSingleDocumentSummary.md)
- [CMSingleDocumentSummaryRequest](docs/Model/CMSingleDocumentSummaryRequest.md)
- [CMSliceConfig](docs/Model/CMSliceConfig.md)
- [CMSliceConfigQuery](docs/Model/CMSliceConfigQuery.md)
- [CMSliceQueryDefinition](docs/Model/CMSliceQueryDefinition.md)
- [CMSliceReassignment](docs/Model/CMSliceReassignment.md)
- [CMSlicedDocument](docs/Model/CMSlicedDocument.md)
- [CMSlicedDocumentFilter](docs/Model/CMSlicedDocumentFilter.md)
- [CMSlicedDocumentListAndTotals](docs/Model/CMSlicedDocumentListAndTotals.md)
- [CMSlicedDocumentRequest](docs/Model/CMSlicedDocumentRequest.md)
- [CMSource](docs/Model/CMSource.md)
- [CMSourceBaseInfo](docs/Model/CMSourceBaseInfo.md)
- [CMSourceError](docs/Model/CMSourceError.md)
- [CMStartCrawler](docs/Model/CMStartCrawler.md)
- [CMStartProject](docs/Model/CMStartProject.md)
- [CMStepConfig](docs/Model/CMStepConfig.md)
- [CMSubTerm](docs/Model/CMSubTerm.md)
- [CMSubscriptions](docs/Model/CMSubscriptions.md)
- [CMSynSet](docs/Model/CMSynSet.md)
- [CMSynSetFind](docs/Model/CMSynSetFind.md)
- [CMSynSetList](docs/Model/CMSynSetList.md)
- [CMSyncGDrive](docs/Model/CMSyncGDrive.md)
- [CMSynonym](docs/Model/CMSynonym.md)
- [CMSynonymsPaginated](docs/Model/CMSynonymsPaginated.md)
- [CMSynonymsPaginatedResult](docs/Model/CMSynonymsPaginatedResult.md)
- [CMTaskInfo](docs/Model/CMTaskInfo.md)
- [CMTextToSearchConversion](docs/Model/CMTextToSearchConversion.md)
- [CMTextToSearchConversionReturn](docs/Model/CMTextToSearchConversionReturn.md)
- [CMTextToSearchEdit](docs/Model/CMTextToSearchEdit.md)
- [CMTextToSearchPaginated](docs/Model/CMTextToSearchPaginated.md)
- [CMTextToSearchPaginatedReturn](docs/Model/CMTextToSearchPaginatedReturn.md)
- [CMUpdateACLs](docs/Model/CMUpdateACLs.md)
- [CMUpdateDocumentSet](docs/Model/CMUpdateDocumentSet.md)
- [CMUpdateDocumentStatus](docs/Model/CMUpdateDocumentStatus.md)
- [CMUpdateRedactions](docs/Model/CMUpdateRedactions.md)
- [CMUploadDocument](docs/Model/CMUploadDocument.md)
- [CMUploadImage](docs/Model/CMUploadImage.md)
- [CMUser](docs/Model/CMUser.md)
- [CMUserList](docs/Model/CMUserList.md)
- [CMUserNotification](docs/Model/CMUserNotification.md)
- [CMUserPasswordReset](docs/Model/CMUserPasswordReset.md)
- [CMUserRole](docs/Model/CMUserRole.md)
- [CMUserWithExtras](docs/Model/CMUserWithExtras.md)
- [CMVersion](docs/Model/CMVersion.md)
- [CMWordFrequency](docs/Model/CMWordFrequency.md)
- [ContextItem](docs/Model/ContextItem.md)
- [DocumentBookmark](docs/Model/DocumentBookmark.md)
- [DocumentDeleted](docs/Model/DocumentDeleted.md)
- [GdprProject](docs/Model/GdprProject.md)
- [Group](docs/Model/Group.md)
- [Identifier](docs/Model/Identifier.md)
- [JsonMessage](docs/Model/JsonMessage.md)
- [KnowledgeBase](docs/Model/KnowledgeBase.md)
- [LocatedRedaction](docs/Model/LocatedRedaction.md)
- [MDMetadataMapping](docs/Model/MDMetadataMapping.md)
- [NameCounterLevel](docs/Model/NameCounterLevel.md)
- [OperatorKnowledgeBase](docs/Model/OperatorKnowledgeBase.md)
- [OptimizeIndexesGetReportCmd](docs/Model/OptimizeIndexesGetReportCmd.md)
- [OptimizeIndexesGetReportsCmd](docs/Model/OptimizeIndexesGetReportsCmd.md)
- [Organisation](docs/Model/Organisation.md)
- [ReturnedDocument](docs/Model/ReturnedDocument.md)
- [SearchCategory](docs/Model/SearchCategory.md)
- [Session](docs/Model/Session.md)
- [SignInAdmin](docs/Model/SignInAdmin.md)
- [SignInCmd](docs/Model/SignInCmd.md)
- [SignInDmsCmd](docs/Model/SignInDmsCmd.md)
- [TextToSearch](docs/Model/TextToSearch.md)
- [User](docs/Model/User.md)
- [UserRole](docs/Model/UserRole.md)

## Authorization
Endpoints do not require authorization.

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

info@simsage.co.uk

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `7.14.12`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
