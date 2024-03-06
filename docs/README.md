# Documentation for SimSage REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://demo.simsage.ai*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *AuthApi* | [**deleteGroup**](Apis/AuthApi.md#deletegroup) | **DELETE** /api/auth/group/{organisationId}/{name} | Delete Group |
*AuthApi* | [**deleteOrganisation**](Apis/AuthApi.md#deleteorganisation) | **DELETE** /api/auth/organisation/{organisationId} | Delete Organisation |
*AuthApi* | [**getGroups**](Apis/AuthApi.md#getgroups) | **GET** /api/auth/groups/{organisationId} | Get Groups |
*AuthApi* | [**getOTT**](Apis/AuthApi.md#getott) | **PUT** /api/auth/ott/{organisationId} | Get a one-time token. |
*AuthApi* | [**getUserOrganisationList**](Apis/AuthApi.md#getuserorganisationlist) | **GET** /api/auth/user/organisations/{filter} | Get a list of Organisations |
*AuthApi* | [**getUsersPaginated**](Apis/AuthApi.md#getuserspaginated) | **GET** /api/auth/users-paginated/{organisationId}/{page}/{pageSize}/{filter} | Get Users paginated |
*AuthApi* | [**importUsersAndGroups**](Apis/AuthApi.md#importusersandgroups) | **PUT** /api/auth/user/import | Import users and groups. |
*AuthApi* | [**myRoles**](Apis/AuthApi.md#myroles) | **GET** /api/auth/myroles/{organisationId} | Get users application roles |
*AuthApi* | [**removeUserFromOrganisation**](Apis/AuthApi.md#removeuserfromorganisation) | **DELETE** /api/auth/organisation/user/{userId}/{organisationId} | Remove User from Organisation |
*AuthApi* | [**resetPassword**](Apis/AuthApi.md#resetpassword) | **POST** /api/auth/reset-password | Perform a password-reset request. |
*AuthApi* | [**resetPasswordRequest**](Apis/AuthApi.md#resetpasswordrequest) | **POST** /api/auth/reset-password-request | Password Reset Request |
*AuthApi* | [**saveGroup**](Apis/AuthApi.md#savegroup) | **PUT** /api/auth/group | Save Group |
*AuthApi* | [**signIn**](Apis/AuthApi.md#signin) | **POST** /api/auth/sign-in | Sign In |
*AuthApi* | [**signInAdminUsingJWTMsal**](Apis/AuthApi.md#signinadminusingjwtmsal) | **GET** /api/auth/admin/authenticate/msal | JWT MSal Sign In |
*AuthApi* | [**signInDmsUsingJWTMsal**](Apis/AuthApi.md#signindmsusingjwtmsal) | **GET** /api/auth/dms/authenticate/msal/{organisationId} | JWT MSal Sign In |
*AuthApi* | [**signInEvolveUsingJWTMsal**](Apis/AuthApi.md#signinevolveusingjwtmsal) | **GET** /api/auth/evolve/authenticate/msal/{organisationId} | JWT MSal Sign In |
*AuthApi* | [**signInSearchUsingJWTMsal**](Apis/AuthApi.md#signinsearchusingjwtmsal) | **GET** /api/auth/search/authenticate/msal/{organisationId} | JWT MSal Sign In |
*AuthApi* | [**signOut**](Apis/AuthApi.md#signout) | **DELETE** /api/auth/sign-out | Sign Out |
*AuthApi* | [**updateOrganisation**](Apis/AuthApi.md#updateorganisation) | **PUT** /api/auth/organisation | Save Organisation |
*AuthApi* | [**updateUser**](Apis/AuthApi.md#updateuser) | **PUT** /api/auth/user/{organisationId} | Update or Create a user (save a user). |
*AuthApi* | [**version8**](Apis/AuthApi.md#version8) | **GET** /api/auth/version | Get Version |
| *BackupApi* | [**backup**](Apis/BackupApi.md#backup) | **POST** /api/backup/backup/{organisationId}/{regime} | create backup |
*BackupApi* | [**deleteBackup**](Apis/BackupApi.md#deletebackup) | **DELETE** /api/backup/backup/{organisationId}/{backupId} | remove backup |
*BackupApi* | [**getBackup**](Apis/BackupApi.md#getbackup) | **GET** /api/backup/{organisationId}/{backupId} | get backup |
*BackupApi* | [**getBackupList**](Apis/BackupApi.md#getbackuplist) | **GET** /api/backup/backups/{organisationId} | get backup list |
*BackupApi* | [**restoreFromText**](Apis/BackupApi.md#restorefromtext) | **POST** /api/backup/restore | restore backup |
| *ConversionApi* | [**previewVersion**](Apis/ConversionApi.md#previewversion) | **GET** /api/conversion/preview-generator/version | Get preview-generator Version |
*ConversionApi* | [**sttVersion**](Apis/ConversionApi.md#sttversion) | **GET** /api/conversion/stt/version | Get speech-to-text Version |
*ConversionApi* | [**version7**](Apis/ConversionApi.md#version7) | **GET** /api/conversion/version | Get Version |
| *CrawlerApi* | [**crawlerDeleteFolder**](Apis/CrawlerApi.md#crawlerdeletefolder) | **POST** /api/crawler/external/crawler/delete-folder | Delete document folder |
*CrawlerApi* | [**crawlerDeleteUrl**](Apis/CrawlerApi.md#crawlerdeleteurl) | **POST** /api/crawler/external/crawler/delete-url | Delete document |
*CrawlerApi* | [**crawlerExternalDocumentDelete**](Apis/CrawlerApi.md#crawlerexternaldocumentdelete) | **PUT** /api/crawler/external/document/delete | Remove an External Document |
*CrawlerApi* | [**crawlerExternalDocumentFailed**](Apis/CrawlerApi.md#crawlerexternaldocumentfailed) | **POST** /api/crawler/external/document/recordfailure | Upload External Document |
*CrawlerApi* | [**crawlerExternalDocumentUnChanged**](Apis/CrawlerApi.md#crawlerexternaldocumentunchanged) | **POST** /api/crawler/external/document/un-changed | Mark External Document Unchanged |
*CrawlerApi* | [**crawlerExternalDocumentUpload**](Apis/CrawlerApi.md#crawlerexternaldocumentupload) | **POST** /api/crawler/external/document/upload | Upload External Document |
*CrawlerApi* | [**crawlerExternalImageUpload**](Apis/CrawlerApi.md#crawlerexternalimageupload) | **POST** /api/crawler/external/document/upload/image | Upload External Image |
*CrawlerApi* | [**crawlerRenameFolder**](Apis/CrawlerApi.md#crawlerrenamefolder) | **POST** /api/crawler/external/crawler/rename-folder | Rename document folder |
*CrawlerApi* | [**crawlerUpdateDeltaToken**](Apis/CrawlerApi.md#crawlerupdatedeltatoken) | **POST** /api/crawler/external/crawler/delta-token | Update delta token |
*CrawlerApi* | [**delete**](Apis/CrawlerApi.md#delete) | **DELETE** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Delete source |
*CrawlerApi* | [**deleteDocuments**](Apis/CrawlerApi.md#deletedocuments) | **DELETE** /api/crawler/crawler/document/{organisationId}/{kbId}/{sourceId} | Delete source's documents |
*CrawlerApi* | [**encryptedCommunications**](Apis/CrawlerApi.md#encryptedcommunications) | **POST** /api/crawler/external/secure/{seed} | Secure Communication |
*CrawlerApi* | [**externalCrawler**](Apis/CrawlerApi.md#externalcrawler) | **POST** /api/crawler/external/crawler | External Crawler |
*CrawlerApi* | [**externalCrawlerFinished**](Apis/CrawlerApi.md#externalcrawlerfinished) | **POST** /api/crawler/external/crawler/finish | Stop External Crawler |
*CrawlerApi* | [**externalCrawlerStart**](Apis/CrawlerApi.md#externalcrawlerstart) | **POST** /api/crawler/external/crawler/start | Start External Crawler |
*CrawlerApi* | [**getCrawler**](Apis/CrawlerApi.md#getcrawler) | **GET** /api/crawler/crawler/{organisationId}/{kbId}/{sourceId} | Get source |
*CrawlerApi* | [**getFailedDocuments**](Apis/CrawlerApi.md#getfaileddocuments) | **GET** /api/crawler/faileddocs/{organisationId}/{kbId}/{sourceId}/{page}/{pageSize} | Get source List |
*CrawlerApi* | [**getSourceList**](Apis/CrawlerApi.md#getsourcelist) | **GET** /api/crawler/crawlers/{organisationId}/{kbId} | Get source List |
*CrawlerApi* | [**oidcCode**](Apis/CrawlerApi.md#oidccode) | **GET** /api/crawler/dropbox-oidc-code/{oidcKey} | OIDC code receiver |
*CrawlerApi* | [**processAllFiles**](Apis/CrawlerApi.md#processallfiles) | **POST** /api/crawler/process-all-files | Process all files of crawler/source |
*CrawlerApi* | [**resetSourceDelta**](Apis/CrawlerApi.md#resetsourcedelta) | **POST** /api/crawler/crawler/reset-delta/{organisationId}/{kbId}/{sourceId} | Reset Source delta-token |
*CrawlerApi* | [**startCrawler**](Apis/CrawlerApi.md#startcrawler) | **POST** /api/crawler/start | Start crawler |
*CrawlerApi* | [**testCrawler**](Apis/CrawlerApi.md#testcrawler) | **GET** /api/crawler/crawler/test/{organisationId}/{kbId}/{sourceId} | Test Crawler |
*CrawlerApi* | [**updateCrawler**](Apis/CrawlerApi.md#updatecrawler) | **POST** /api/crawler/crawler | Update Source |
*CrawlerApi* | [**version6**](Apis/CrawlerApi.md#version6) | **GET** /api/crawler/version | Version |
| *DataprojectApi* | [**addComment**](Apis/DataprojectApi.md#addcomment) | **POST** /api/dataproject/comment | Create Comment |
*DataprojectApi* | [**allTasks**](Apis/DataprojectApi.md#alltasks) | **POST** /api/dataproject/runningprojects | get Running Projects |
*DataprojectApi* | [**changeTaskPhase**](Apis/DataprojectApi.md#changetaskphase) | **POST** /api/dataproject/changetaskphase | Change Task Phase |
*DataprojectApi* | [**claimDocument**](Apis/DataprojectApi.md#claimdocument) | **POST** /api/dataproject/claimdocument | Claim sliced document |
*DataprojectApi* | [**crawlerStatus**](Apis/DataprojectApi.md#crawlerstatus) | **GET** /api/dataproject/crawlerstatus/{organisationId}/{taskId} | get Crawler Status |
*DataprojectApi* | [**documentsByTokens**](Apis/DataprojectApi.md#documentsbytokens) | **POST** /api/dataproject/documentsbytokens | Returns document list for tokens |
*DataprojectApi* | [**filteredComments**](Apis/DataprojectApi.md#filteredcomments) | **POST** /api/dataproject/filteredcomments | Retrieve Comments |
*DataprojectApi* | [**getDocumentRedactionInfo**](Apis/DataprojectApi.md#getdocumentredactioninfo) | **GET** /api/dataproject/docredactioninfo/{organisationId}/{sliceId}/{documentKey} | Get Document Redaction info |
*DataprojectApi* | [**getProjectDefinition**](Apis/DataprojectApi.md#getprojectdefinition) | **GET** /api/dataproject/projectdefinition/{organisationId}/{taskId} | get Project Definition |
*DataprojectApi* | [**getProjectReview**](Apis/DataprojectApi.md#getprojectreview) | **GET** /api/dataproject/projectreview/{organisationId}/{projectId} | get Project Definition |
*DataprojectApi* | [**getProjectSlice**](Apis/DataprojectApi.md#getprojectslice) | **GET** /api/dataproject/projectslice/{organisationId}/{taskId} | get project slice |
*DataprojectApi* | [**getSearchResultSummary**](Apis/DataprojectApi.md#getsearchresultsummary) | **GET** /api/dataproject/searchresult/{organisationId}/{taskId} | get Search Result Summary |
*DataprojectApi* | [**getSearchResultSummaryForReview**](Apis/DataprojectApi.md#getsearchresultsummaryforreview) | **GET** /api/dataproject/searchresultreview/{organisationId}/{projectId} | get Search Result Summary |
*DataprojectApi* | [**nextDocument**](Apis/DataprojectApi.md#nextdocument) | **POST** /api/dataproject/nextdocument | Document list for given slice and filters |
*DataprojectApi* | [**pdfBinary**](Apis/DataprojectApi.md#pdfbinary) | **GET** /api/dataproject/pdf/latest/{organisationId}/{kbId}/{url} | Binary |
*DataprojectApi* | [**projectTypes**](Apis/DataprojectApi.md#projecttypes) | **GET** /api/dataproject/projects/{organisationId} | get Project Types |
*DataprojectApi* | [**reassignSliceDocument**](Apis/DataprojectApi.md#reassignslicedocument) | **POST** /api/dataproject/reassignslicedoc |  |
*DataprojectApi* | [**redactedDocument**](Apis/DataprojectApi.md#redacteddocument) | **POST** /api/dataproject/redacteddocument | Get Redacted Document |
*DataprojectApi* | [**removeSliceDocument**](Apis/DataprojectApi.md#removeslicedocument) | **POST** /api/dataproject/removeslicedoc |  |
*DataprojectApi* | [**resetEvolve**](Apis/DataprojectApi.md#resetevolve) | **POST** /api/dataproject/reset/{organisationId} | Reset Evolve Application |
*DataprojectApi* | [**saveProjectDefinition**](Apis/DataprojectApi.md#saveprojectdefinition) | **POST** /api/dataproject/saveprojectdefinition | Inserts/Updates a project definition |
*DataprojectApi* | [**setSliceConfig**](Apis/DataprojectApi.md#setsliceconfig) | **POST** /api/dataproject/setsliceconfig | Set Slice configuration |
*DataprojectApi* | [**slicedDocuments**](Apis/DataprojectApi.md#sliceddocuments) | **POST** /api/dataproject/sliceddocuments | Document list for given slice and filters |
*DataprojectApi* | [**startProject**](Apis/DataprojectApi.md#startproject) | **POST** /api/dataproject/startproject |  |
*DataprojectApi* | [**updateDocumentStatus**](Apis/DataprojectApi.md#updatedocumentstatus) | **POST** /api/dataproject/updatedocstatus | Update document status |
*DataprojectApi* | [**updateRedactions**](Apis/DataprojectApi.md#updateredactions) | **POST** /api/dataproject/updateredactions | Update document redactions |
| *DiscoveryApi* | [**allGdprProjects**](Apis/DiscoveryApi.md#allgdprprojects) | **GET** /api/discovery/gdprproject/{organisationId}/{kbId}/{page}/{pageSize}/{textFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
*DiscoveryApi* | [**applyRedactions**](Apis/DiscoveryApi.md#applyredactions) | **POST** /api/discovery/applyredactions |  |
*DiscoveryApi* | [**createGdprProject**](Apis/DiscoveryApi.md#creategdprproject) | **POST** /api/discovery/createproject |  |
*DiscoveryApi* | [**deleteProject**](Apis/DiscoveryApi.md#deleteproject) | **DELETE** /api/discovery/deleteproject |  |
*DiscoveryApi* | [**exportRedactedDoc**](Apis/DiscoveryApi.md#exportredacteddoc) | **POST** /api/discovery/exportredacteddoc |  |
*DiscoveryApi* | [**getGdprDocument**](Apis/DiscoveryApi.md#getgdprdocument) | **GET** /api/discovery/gdprdocument/{organisationId}/{kbId}/{projectId}/{url} |  |
*DiscoveryApi* | [**getPagedProjectDocuments**](Apis/DiscoveryApi.md#getpagedprojectdocuments) | **GET** /api/discovery/projectdocument/{organisationId}/{kbId}/{projectId}/{page}/{pageSize}/{textFilter}/{typeFilter}/{statusFilter}/{sortColumn}/{sortDirection} |  |
*DiscoveryApi* | [**growthPerMonth**](Apis/DiscoveryApi.md#growthpermonth) | **GET** /api/discovery/growth/{organisationId}/{kbId} | growth |
*DiscoveryApi* | [**setdocumentredactions**](Apis/DiscoveryApi.md#setdocumentredactions) | **PUT** /api/discovery/updategdprdocument |  |
*DiscoveryApi* | [**storageBySource**](Apis/DiscoveryApi.md#storagebysource) | **GET** /api/discovery/storage/{organisationId}/{kbId} | storage |
*DiscoveryApi* | [**summaryByDocumentType**](Apis/DiscoveryApi.md#summarybydocumenttype) | **GET** /api/discovery/doctypesummary/{organisationId}/{kbId} | storage |
*DiscoveryApi* | [**updateDocumentSet**](Apis/DiscoveryApi.md#updatedocumentset) | **POST** /api/discovery/updatedocumentset |  |
*DiscoveryApi* | [**version5**](Apis/DiscoveryApi.md#version5) | **GET** /api/discovery/version | Version |
| *DmsApi* | [**addFolder**](Apis/DmsApi.md#addfolder) | **POST** /api/dms/folder | Add a new folder |
*DmsApi* | [**addSourceFolder**](Apis/DmsApi.md#addsourcefolder) | **POST** /api/dms/source | Add a new source-folder |
*DmsApi* | [**deleteAllNotes**](Apis/DmsApi.md#deleteallnotes) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url} | delete all Notes |
*DmsApi* | [**deleteBookmark**](Apis/DmsApi.md#deletebookmark) | **DELETE** /api/dms/bookmark/{organisationId}/{kbId}/{userId}/{url} | Delete a Bookmark |
*DmsApi* | [**deleteDocumentOrFolder**](Apis/DmsApi.md#deletedocumentorfolder) | **DELETE** /api/dms/document/delete/{organisationId}/{kbId}/{isFolder}/{sourceId}/{url}/{folderId} | Delete a document or a folder |
*DmsApi* | [**deleteNote**](Apis/DmsApi.md#deletenote) | **DELETE** /api/dms/note/{organisationId}/{kbId}/{url}/{noteId} | Delete a Note |
*DmsApi* | [**deleteSourceFolder**](Apis/DmsApi.md#deletesourcefolder) | **DELETE** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Remove source-folder |
*DmsApi* | [**deleteSubscription**](Apis/DmsApi.md#deletesubscription) | **DELETE** /api/dms/subscription/{organisationId}/{kbId}/{userId}/{url} | Delete a Subscription |
*DmsApi* | [**deleteUserSearch**](Apis/DmsApi.md#deleteusersearch) | **DELETE** /api/dms/saved-search/{organisationId}/{kbId}/{userId}/{text}/{top} | Delete a Saved Search |
*DmsApi* | [**document1**](Apis/DmsApi.md#document1) | **GET** /api/dms/document/{organisationId}/{kbId}/{urlId} | Get Document |
*DmsApi* | [**documentBinary**](Apis/DmsApi.md#documentbinary) | **GET** /api/dms/binary/latest/{organisationId}/{kbId}/{url} | Binary |
*DmsApi* | [**documentVersion**](Apis/DmsApi.md#documentversion) | **GET** /api/dms/binary/{organisationId}/{kbId}/{url}/{version} | Get Binary Document |
*DmsApi* | [**filterFolders**](Apis/DmsApi.md#filterfolders) | **GET** /api/dms/folder/filter/{organisationId}/{kbId}/{text} | Filter Folders |
*DmsApi* | [**forceReleaseLock**](Apis/DmsApi.md#forcereleaselock) | **DELETE** /api/dms/lock/release/{organisationId}/{kbId}/{userId}/{url} | Force-release a lock |
*DmsApi* | [**getBookmarkList**](Apis/DmsApi.md#getbookmarklist) | **GET** /api/dms/bookmark/{organisationId}/{kbId}/{userId} | Get Bookmarks |
*DmsApi* | [**getDeletedDocuments**](Apis/DmsApi.md#getdeleteddocuments) | **GET** /api/dms/deleted/{organisationId}/{kbId}/{filter} | Deleted records with optional filter |
*DmsApi* | [**getDocumentAudit**](Apis/DmsApi.md#getdocumentaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month}/{url} | Audit records for a document for a month |
*DmsApi* | [**getFolder**](Apis/DmsApi.md#getfolder) | **GET** /api/dms/folder/{organisationId}/{kbId}/{sourceId}/{folderId}/{prevUrl}/{pageSize} | Get Folder Content |
*DmsApi* | [**getFullAudit**](Apis/DmsApi.md#getfullaudit) | **GET** /api/dms/audit/{organisationId}/{kbId}/{year}/{month} | Audit records for a month |
*DmsApi* | [**getLockedList**](Apis/DmsApi.md#getlockedlist) | **GET** /api/dms/lock/{organisationId}/{kbId}/{userId} | Get locked documents for user |
*DmsApi* | [**getNoteList**](Apis/DmsApi.md#getnotelist) | **GET** /api/dms/note/{organisationId}/{kbId}/{url} | Get Notes |
*DmsApi* | [**getSavedSearches**](Apis/DmsApi.md#getsavedsearches) | **GET** /api/dms/saved-searches/{organisationId}/{kbId}/{userId}/{top} | User's saved searches |
*DmsApi* | [**getSourceFolder**](Apis/DmsApi.md#getsourcefolder) | **GET** /api/dms/source/{organisationId}/{kbId}/{sourceId} | Get source-folder |
*DmsApi* | [**getSubscriptionList**](Apis/DmsApi.md#getsubscriptionlist) | **GET** /api/dms/subscriptions/{organisationId}/{kbId}/{userId} | Get Subscriptions |
*DmsApi* | [**getUserDashboard**](Apis/DmsApi.md#getuserdashboard) | **GET** /api/dms/dashboard/{organisationId}/{kbId} | User Dashboard |
*DmsApi* | [**getUserNotifications**](Apis/DmsApi.md#getusernotifications) | **GET** /api/dms/notifications/{organisationId}/{kbId}/{year}/{month} | Get User Notifications |
*DmsApi* | [**lockDocument**](Apis/DmsApi.md#lockdocument) | **POST** /api/dms/lock | Document Lock |
*DmsApi* | [**releaseLock**](Apis/DmsApi.md#releaselock) | **DELETE** /api/dms/lock/{organisationId}/{kbId}/{userId}/{url} | Release a lock |
*DmsApi* | [**restfulDMSClientQuery**](Apis/DmsApi.md#restfuldmsclientquery) | **POST** /api/dms/query | DMS Client Query |
*DmsApi* | [**saveBookmark**](Apis/DmsApi.md#savebookmark) | **POST** /api/dms/bookmark | Save Bookmark |
*DmsApi* | [**saveHashTags**](Apis/DmsApi.md#savehashtags) | **POST** /api/dms/hash-tag | Save HashTag set for a document |
*DmsApi* | [**saveNote**](Apis/DmsApi.md#savenote) | **POST** /api/dms/note | Save Note |
*DmsApi* | [**saveSearch**](Apis/DmsApi.md#savesearch) | **POST** /api/dms/save-search | Save Search |
*DmsApi* | [**saveSubscription**](Apis/DmsApi.md#savesubscription) | **POST** /api/dms/subscription | Save Subscription |
*DmsApi* | [**undeleteDocument**](Apis/DmsApi.md#undeletedocument) | **DELETE** /api/dms/un-delete/{organisationId}/{kbId}/{sourceId}/{url}/{filter} | un-delete a record |
*DmsApi* | [**updateACLs**](Apis/DmsApi.md#updateacls) | **POST** /api/dms/acls | Update an item's ACLs |
*DmsApi* | [**uploadDocument**](Apis/DmsApi.md#uploaddocument) | **POST** /api/dms/upload/document/{organisationId}/{kbId}/{sourceId}/{folderId}/{lastModified} | Upload a Document |
| *DocumentApi* | [**document**](Apis/DocumentApi.md#document) | **GET** /api/document/document/{organisationId}/{kbId}/{url} | get Document |
*DocumentApi* | [**getParquetFile**](Apis/DocumentApi.md#getparquetfile) | **POST** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Download Parquet File |
*DocumentApi* | [**getParquetList**](Apis/DocumentApi.md#getparquetlist) | **GET** /api/document/parquets/{organisationId}/{kbId}/{page}/{pageSize} | Parquet available time list |
*DocumentApi* | [**getSpreadsheet**](Apis/DocumentApi.md#getspreadsheet) | **POST** /api/document/spreadsheet/{organisationId}/{kbId}/{dateTime} | Inventory breakdown Spreadsheet |
*DocumentApi* | [**getStats1**](Apis/DocumentApi.md#getstats1) | **GET** /api/document/stats/frequencies/{organisationId}/{kbId}/{dateTime} | Document Frequency Statistics |
*DocumentApi* | [**inventorizeDocuments**](Apis/DocumentApi.md#inventorizedocuments) | **POST** /api/document/inventorize | Document Inventory |
*DocumentApi* | [**inventorizeIndexes**](Apis/DocumentApi.md#inventorizeindexes) | **POST** /api/document/inventorize-indexes | Index Inventory |
*DocumentApi* | [**preview**](Apis/DocumentApi.md#preview) | **GET** /api/document/preview/{organisationId}/{kbId}/{clientId}/{sessionId}/{urlId}/{page} | get Preview |
*DocumentApi* | [**previewHtml**](Apis/DocumentApi.md#previewhtml) | **POST** /api/document/preview/html | Preview HTML |
*DocumentApi* | [**queryFocussedSummarization**](Apis/DocumentApi.md#queryfocussedsummarization) | **POST** /api/document/qfs | Summarize Documents for Query |
*DocumentApi* | [**removeDocument**](Apis/DocumentApi.md#removedocument) | **DELETE** /api/document/document/{organisationId}/{kbId}/{url}/{sourceId} | Remove Document |
*DocumentApi* | [**removeParquetFile**](Apis/DocumentApi.md#removeparquetfile) | **DELETE** /api/document/parquet/{organisationId}/{kbId}/{dateTime} | Delete Parquet File |
*DocumentApi* | [**summarizeDocument**](Apis/DocumentApi.md#summarizedocument) | **POST** /api/document/summarize/document | Summarize a document |
*DocumentApi* | [**version4**](Apis/DocumentApi.md#version4) | **GET** /api/document/version | Version |
*DocumentApi* | [**zipSource**](Apis/DocumentApi.md#zipsource) | **POST** /api/document/zip/source | Zip source documents |
| *KnowledgebaseApi* | [**exportKnowledgeBase**](Apis/KnowledgebaseApi.md#exportknowledgebase) | **POST** /api/knowledgebase/export | export Knowledge-base |
*KnowledgebaseApi* | [**getKnowledgeBase**](Apis/KnowledgebaseApi.md#getknowledgebase) | **GET** /api/knowledgebase/{organisationId}/{kbId} | Get Knowledge-base |
*KnowledgebaseApi* | [**getKnowledgeBases**](Apis/KnowledgebaseApi.md#getknowledgebases) | **GET** /api/knowledgebase/{organisationId} | Get Knowledge-bases |
*KnowledgebaseApi* | [**getSearchInfo**](Apis/KnowledgebaseApi.md#getsearchinfo) | **GET** /api/knowledgebase/search/info/{organisationId}/{clientId} | Search Info |
*KnowledgebaseApi* | [**getSearchInfo2**](Apis/KnowledgebaseApi.md#getsearchinfo2) | **GET** /api/knowledgebase/search/info/{organisationId} | Search Info [deprecated] |
*KnowledgebaseApi* | [**removeKnowledgeBase**](Apis/KnowledgebaseApi.md#removeknowledgebase) | **DELETE** /api/knowledgebase/{organisationId}/{kbId} | Delete Knowledge-base |
*KnowledgebaseApi* | [**updateKnowledgeBase**](Apis/KnowledgebaseApi.md#updateknowledgebase) | **PUT** /api/knowledgebase/save | Save Knowledge-base |
*KnowledgebaseApi* | [**version3**](Apis/KnowledgebaseApi.md#version3) | **GET** /api/knowledgebase/version | Version |
| *LanguageApi* | [**addDefaultSynSets**](Apis/LanguageApi.md#adddefaultsynsets) | **PUT** /api/language/default-syn-sets/{organisationId}/{kbId} | Add all default SynSets |
*LanguageApi* | [**deleteAllSynonyms**](Apis/LanguageApi.md#deleteallsynonyms) | **DELETE** /api/language/delete-all-synonyms/{organisationId}/{kbId} | Delete All Synonyms |
*LanguageApi* | [**deleteCategorization**](Apis/LanguageApi.md#deletecategorization) | **DELETE** /api/language/categorization/{organisationId}/{kbId}/{categorizationLabel} | remove categorization |
*LanguageApi* | [**deleteSemantic**](Apis/LanguageApi.md#deletesemantic) | **DELETE** /api/language/delete-semantic/{organisationId}/{kbId}/{word}/{semantic} | Delete Semantic |
*LanguageApi* | [**deleteSynSet**](Apis/LanguageApi.md#deletesynset) | **DELETE** /api/language/delete-syn-set/{organisationId}/{kbId}/{lemma} | Delete SynSet |
*LanguageApi* | [**deleteSynonym**](Apis/LanguageApi.md#deletesynonym) | **DELETE** /api/language/delete-synonym/{organisationId}/{kbId}/{id} | Delete Synonym |
*LanguageApi* | [**findSynSets**](Apis/LanguageApi.md#findsynsets) | **PUT** /api/language/find-syn-sets | Find SynSets |
*LanguageApi* | [**getCategorizationList**](Apis/LanguageApi.md#getcategorizationlist) | **GET** /api/language/categorization/{organisationId}/{kbId}/{prevCategorizationLabel}/{pageSize} | categorization list |
*LanguageApi* | [**getPaginated**](Apis/LanguageApi.md#getpaginated) | **PUT** /api/language/synonyms | get Synonyms Paginated |
*LanguageApi* | [**getSemanticsPaginated**](Apis/LanguageApi.md#getsemanticspaginated) | **PUT** /api/language/semantics | Semantics Paginated |
*LanguageApi* | [**optimizeIndexes**](Apis/LanguageApi.md#optimizeindexes) | **PUT** /api/language/optimize-indexes | Optimize Indexes |
*LanguageApi* | [**redactDocument**](Apis/LanguageApi.md#redactdocument) | **GET** /api/language/redact/{organisationId}/{kbId}/{url}/{entityCsv}/{wordCsv}/{allowWordsCsv} | Redact Document |
*LanguageApi* | [**saveCategorization**](Apis/LanguageApi.md#savecategorization) | **PUT** /api/language/categorization | save categorization |
*LanguageApi* | [**saveSemantic**](Apis/LanguageApi.md#savesemantic) | **PUT** /api/language/save-semantic/{organisationId}/{kbId} | Save Semantic |
*LanguageApi* | [**saveSynSet**](Apis/LanguageApi.md#savesynset) | **PUT** /api/language/save-syn-set/{organisationId}/{kbId} | Save SynSet |
*LanguageApi* | [**saveSynonym**](Apis/LanguageApi.md#savesynonym) | **PUT** /api/language/save-synonym/{organisationId}/{kbId} | Save Synonym |
*LanguageApi* | [**truncateSlowIndexes**](Apis/LanguageApi.md#truncateslowindexes) | **GET** /api/language/truncate-slow-indexes/{organisationId}/{kbId} | Truncate slow Indexes |
*LanguageApi* | [**tuneLanguageGraph**](Apis/LanguageApi.md#tunelanguagegraph) | **GET** /api/language/tune-graph/{organisationId}/{kbId} | Tune Graph |
*LanguageApi* | [**version2**](Apis/LanguageApi.md#version2) | **GET** /api/language/version | Version |
| *SemanticApi* | [**deleteTextToSearch**](Apis/SemanticApi.md#deletetexttosearch) | **DELETE** /api/semantic/text-to-search/{organisationId}/{kbId}/{word} | Delete text-to-search |
*SemanticApi* | [**documentQuestionAndAnswer**](Apis/SemanticApi.md#documentquestionandanswer) | **POST** /api/semantic/document-qa | Document Q&A |
*SemanticApi* | [**getTextToSearchPaginated**](Apis/SemanticApi.md#gettexttosearchpaginated) | **PUT** /api/semantic/text-to-search | Text to Search mappings |
*SemanticApi* | [**restfulClientQuery**](Apis/SemanticApi.md#restfulclientquery) | **POST** /api/semantic/query | Client Query |
*SemanticApi* | [**saveTextToSearch**](Apis/SemanticApi.md#savetexttosearch) | **PUT** /api/semantic/text-to-search/{organisationId}/{kbId} | Save a text-to-search item |
*SemanticApi* | [**shortSummary**](Apis/SemanticApi.md#shortsummary) | **POST** /api/semantic/short-summary | Short summary |
*SemanticApi* | [**tryTextToSearchConversion**](Apis/SemanticApi.md#trytexttosearchconversion) | **PUT** /api/semantic/text-to-search-try | try converting text-to-search |
*SemanticApi* | [**version1**](Apis/SemanticApi.md#version1) | **GET** /api/semantic/version | Version |
| *StatsApi* | [**getIndexOptimizationReport**](Apis/StatsApi.md#getindexoptimizationreport) | **GET** /api/stats/report/{organisationId}/{kbId}/{id} | get an optimization report |
*StatsApi* | [**getIndexOptimizationReports**](Apis/StatsApi.md#getindexoptimizationreports) | **GET** /api/stats/reports/{organisationId}/{kbId} | get optimization report list |
*StatsApi* | [**getStats**](Apis/StatsApi.md#getstats) | **GET** /api/stats/stats/{organisationId}/{kbId}/{year}/{month}/{top} | Get usage Statistics |
*StatsApi* | [**simSageStatus**](Apis/StatsApi.md#simsagestatus) | **PUT** /api/stats/status/{organisationId} | SimSage status |
*StatsApi* | [**systemLogs**](Apis/StatsApi.md#systemlogs) | **GET** /api/stats/system-logs/{organisationId}/{year}/{month}/{day}/{hour}/{hours} | System Logs |
*StatsApi* | [**version**](Apis/StatsApi.md#version) | **GET** /api/stats/version | Version |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Backup](./Models/Backup.md)
 - [CMAddFolder](./Models/CMAddFolder.md)
 - [CMAddSourceFolder](./Models/CMAddSourceFolder.md)
 - [CMCategorization](./Models/CMCategorization.md)
 - [CMCategorizationPaginatedList](./Models/CMCategorizationPaginatedList.md)
 - [CMChangeTaskPhase](./Models/CMChangeTaskPhase.md)
 - [CMClaimDocument](./Models/CMClaimDocument.md)
 - [CMClientQuery](./Models/CMClientQuery.md)
 - [CMClientQueryResult](./Models/CMClientQueryResult.md)
 - [CMCommandQueueItem](./Models/CMCommandQueueItem.md)
 - [CMCommentFilter](./Models/CMCommentFilter.md)
 - [CMCompoundQuery](./Models/CMCompoundQuery.md)
 - [CMCrawlerStatus](./Models/CMCrawlerStatus.md)
 - [CMCrawlerStatusTask](./Models/CMCrawlerStatusTask.md)
 - [CMCreateGdprProject](./Models/CMCreateGdprProject.md)
 - [CMCreatedProject](./Models/CMCreatedProject.md)
 - [CMDParagraphSummary](./Models/CMDParagraphSummary.md)
 - [CMDUserDashboard](./Models/CMDUserDashboard.md)
 - [CMDeleteDocument](./Models/CMDeleteDocument.md)
 - [CMDeleteProjectCmd](./Models/CMDeleteProjectCmd.md)
 - [CMDocument](./Models/CMDocument.md)
 - [CMDocumentAcl](./Models/CMDocumentAcl.md)
 - [CMDocumentAudit](./Models/CMDocumentAudit.md)
 - [CMDocumentBookmark](./Models/CMDocumentBookmark.md)
 - [CMDocumentFolder](./Models/CMDocumentFolder.md)
 - [CMDocumentHashTag](./Models/CMDocumentHashTag.md)
 - [CMDocumentLock](./Models/CMDocumentLock.md)
 - [CMDocumentNote](./Models/CMDocumentNote.md)
 - [CMDocumentQuestionAndAnswer](./Models/CMDocumentQuestionAndAnswer.md)
 - [CMDocumentRelationship](./Models/CMDocumentRelationship.md)
 - [CMDocumentSubscription](./Models/CMDocumentSubscription.md)
 - [CMDocumentTypeFrequency](./Models/CMDocumentTypeFrequency.md)
 - [CMDocumentUnChanged](./Models/CMDocumentUnChanged.md)
 - [CMDocumentVersion](./Models/CMDocumentVersion.md)
 - [CMDocumentsByToken](./Models/CMDocumentsByToken.md)
 - [CMExportRedactedDocument](./Models/CMExportRedactedDocument.md)
 - [CMExternalCrawler](./Models/CMExternalCrawler.md)
 - [CMExternalCrawlerDeleteFolder](./Models/CMExternalCrawlerDeleteFolder.md)
 - [CMExternalCrawlerDeleteUrl](./Models/CMExternalCrawlerDeleteUrl.md)
 - [CMExternalCrawlerRenameFolder](./Models/CMExternalCrawlerRenameFolder.md)
 - [CMExternalCrawlerSetDeltaToken](./Models/CMExternalCrawlerSetDeltaToken.md)
 - [CMExternalCrawlerStart](./Models/CMExternalCrawlerStart.md)
 - [CMExternalCrawlerStop](./Models/CMExternalCrawlerStop.md)
 - [CMFailedSourceDocument](./Models/CMFailedSourceDocument.md)
 - [CMFilter](./Models/CMFilter.md)
 - [CMGdprSearchDetails](./Models/CMGdprSearchDetails.md)
 - [CMGetHtml](./Models/CMGetHtml.md)
 - [CMGroup](./Models/CMGroup.md)
 - [CMGroupList](./Models/CMGroupList.md)
 - [CMImportUsers](./Models/CMImportUsers.md)
 - [CMInfo](./Models/CMInfo.md)
 - [CMInventorizeParameters](./Models/CMInventorizeParameters.md)
 - [CMKeyedSearchTerm](./Models/CMKeyedSearchTerm.md)
 - [CMKnowledgeBase](./Models/CMKnowledgeBase.md)
 - [CMKnowledgeBaseExport](./Models/CMKnowledgeBaseExport.md)
 - [CMKnowledgeBaseInfo](./Models/CMKnowledgeBaseInfo.md)
 - [CMLocatedRedaction](./Models/CMLocatedRedaction.md)
 - [CMLoggerEntry](./Models/CMLoggerEntry.md)
 - [CMNewComment](./Models/CMNewComment.md)
 - [CMNextDocument](./Models/CMNextDocument.md)
 - [CMOperatorKnowledgeBase](./Models/CMOperatorKnowledgeBase.md)
 - [CMOptimizeIndex](./Models/CMOptimizeIndex.md)
 - [CMOrganisation](./Models/CMOrganisation.md)
 - [CMPagedProjectDocuments](./Models/CMPagedProjectDocuments.md)
 - [CMPagedQueueItems](./Models/CMPagedQueueItems.md)
 - [CMPagedResultsCMSlicedDocument](./Models/CMPagedResultsCMSlicedDocument.md)
 - [CMParquetItem](./Models/CMParquetItem.md)
 - [CMParquetTimeList](./Models/CMParquetTimeList.md)
 - [CMPasswordResetRequest](./Models/CMPasswordResetRequest.md)
 - [CMProjectDefinition](./Models/CMProjectDefinition.md)
 - [CMProjectDefinitionTask](./Models/CMProjectDefinitionTask.md)
 - [CMProjectDocument](./Models/CMProjectDocument.md)
 - [CMProjectFrame](./Models/CMProjectFrame.md)
 - [CMProjectInfo](./Models/CMProjectInfo.md)
 - [CMProjectReview](./Models/CMProjectReview.md)
 - [CMProjectSlice](./Models/CMProjectSlice.md)
 - [CMProjectSliceTask](./Models/CMProjectSliceTask.md)
 - [CMQueryFocussedSummarization](./Models/CMQueryFocussedSummarization.md)
 - [CMQueryFocussedSummarizationRequest](./Models/CMQueryFocussedSummarizationRequest.md)
 - [CMQueryToken](./Models/CMQueryToken.md)
 - [CMQueueFilter](./Models/CMQueueFilter.md)
 - [CMQueueItem](./Models/CMQueueItem.md)
 - [CMReassignSliceDocument](./Models/CMReassignSliceDocument.md)
 - [CMRecordedComment](./Models/CMRecordedComment.md)
 - [CMRedaction](./Models/CMRedaction.md)
 - [CMRedactionData](./Models/CMRedactionData.md)
 - [CMRedactionDetails](./Models/CMRedactionDetails.md)
 - [CMRemoveSliceDocument](./Models/CMRemoveSliceDocument.md)
 - [CMRestoreFromText](./Models/CMRestoreFromText.md)
 - [CMResultsSection](./Models/CMResultsSection.md)
 - [CMReturnStatistics](./Models/CMReturnStatistics.md)
 - [CMSavedSearch](./Models/CMSavedSearch.md)
 - [CMSearchDefinition](./Models/CMSearchDefinition.md)
 - [CMSearchResult](./Models/CMSearchResult.md)
 - [CMSearchResultSummary](./Models/CMSearchResultSummary.md)
 - [CMSearchResultSummaryTask](./Models/CMSearchResultSummaryTask.md)
 - [CMSearchSubTerm](./Models/CMSearchSubTerm.md)
 - [CMSearchTerm](./Models/CMSearchTerm.md)
 - [CMSemantic](./Models/CMSemantic.md)
 - [CMSemanticModelEdit](./Models/CMSemanticModelEdit.md)
 - [CMSemanticTerm](./Models/CMSemanticTerm.md)
 - [CMSemanticsPaginated](./Models/CMSemanticsPaginated.md)
 - [CMSemanticsPaginatedResult](./Models/CMSemanticsPaginatedResult.md)
 - [CMSession](./Models/CMSession.md)
 - [CMSessionVersion](./Models/CMSessionVersion.md)
 - [CMSetSliceDefinitions](./Models/CMSetSliceDefinitions.md)
 - [CMShortSummary](./Models/CMShortSummary.md)
 - [CMShortSummaryResult](./Models/CMShortSummaryResult.md)
 - [CMSignInParameters](./Models/CMSignInParameters.md)
 - [CMSimilarDocument](./Models/CMSimilarDocument.md)
 - [CMSimpleQuery](./Models/CMSimpleQuery.md)
 - [CMSingleDocumentSummary](./Models/CMSingleDocumentSummary.md)
 - [CMSingleDocumentSummaryRequest](./Models/CMSingleDocumentSummaryRequest.md)
 - [CMSliceConfig](./Models/CMSliceConfig.md)
 - [CMSliceConfig_query](./Models/CMSliceConfig_query.md)
 - [CMSliceQueryDefinition](./Models/CMSliceQueryDefinition.md)
 - [CMSliceReassignment](./Models/CMSliceReassignment.md)
 - [CMSlicedDocument](./Models/CMSlicedDocument.md)
 - [CMSlicedDocumentFilter](./Models/CMSlicedDocumentFilter.md)
 - [CMSlicedDocumentListAndTotals](./Models/CMSlicedDocumentListAndTotals.md)
 - [CMSlicedDocumentRequest](./Models/CMSlicedDocumentRequest.md)
 - [CMSource](./Models/CMSource.md)
 - [CMSourceBaseInfo](./Models/CMSourceBaseInfo.md)
 - [CMStartCrawler](./Models/CMStartCrawler.md)
 - [CMStartProject](./Models/CMStartProject.md)
 - [CMStepConfig](./Models/CMStepConfig.md)
 - [CMSubTerm](./Models/CMSubTerm.md)
 - [CMSubscriptions](./Models/CMSubscriptions.md)
 - [CMSynSet](./Models/CMSynSet.md)
 - [CMSynSetFind](./Models/CMSynSetFind.md)
 - [CMSynSetList](./Models/CMSynSetList.md)
 - [CMSynonym](./Models/CMSynonym.md)
 - [CMSynonymsPaginated](./Models/CMSynonymsPaginated.md)
 - [CMSynonymsPaginatedResult](./Models/CMSynonymsPaginatedResult.md)
 - [CMTaskInfo](./Models/CMTaskInfo.md)
 - [CMTextToSearchConversion](./Models/CMTextToSearchConversion.md)
 - [CMTextToSearchConversionReturn](./Models/CMTextToSearchConversionReturn.md)
 - [CMTextToSearchEdit](./Models/CMTextToSearchEdit.md)
 - [CMTextToSearchPaginated](./Models/CMTextToSearchPaginated.md)
 - [CMTextToSearchPaginatedReturn](./Models/CMTextToSearchPaginatedReturn.md)
 - [CMUpdateACLs](./Models/CMUpdateACLs.md)
 - [CMUpdateDocumentSet](./Models/CMUpdateDocumentSet.md)
 - [CMUpdateDocumentStatus](./Models/CMUpdateDocumentStatus.md)
 - [CMUpdateRedactions](./Models/CMUpdateRedactions.md)
 - [CMUploadDocument](./Models/CMUploadDocument.md)
 - [CMUploadImage](./Models/CMUploadImage.md)
 - [CMUser](./Models/CMUser.md)
 - [CMUserList](./Models/CMUserList.md)
 - [CMUserNotification](./Models/CMUserNotification.md)
 - [CMUserPasswordReset](./Models/CMUserPasswordReset.md)
 - [CMUserRole](./Models/CMUserRole.md)
 - [CMUserWithExtras](./Models/CMUserWithExtras.md)
 - [CMVersion](./Models/CMVersion.md)
 - [CMWordFrequency](./Models/CMWordFrequency.md)
 - [CMZipSource](./Models/CMZipSource.md)
 - [ContextItem](./Models/ContextItem.md)
 - [DocumentBookmark](./Models/DocumentBookmark.md)
 - [DocumentDeleted](./Models/DocumentDeleted.md)
 - [GdprProject](./Models/GdprProject.md)
 - [Group](./Models/Group.md)
 - [Identifier](./Models/Identifier.md)
 - [JsonMessage](./Models/JsonMessage.md)
 - [KnowledgeBase](./Models/KnowledgeBase.md)
 - [LocatedRedaction](./Models/LocatedRedaction.md)
 - [MDCategory](./Models/MDCategory.md)
 - [NameCounterLevel](./Models/NameCounterLevel.md)
 - [OperatorKnowledgeBase](./Models/OperatorKnowledgeBase.md)
 - [OptimizeIndexesGetReportCmd](./Models/OptimizeIndexesGetReportCmd.md)
 - [OptimizeIndexesGetReportsCmd](./Models/OptimizeIndexesGetReportsCmd.md)
 - [Organisation](./Models/Organisation.md)
 - [ReturnedDocument](./Models/ReturnedDocument.md)
 - [SearchCategory](./Models/SearchCategory.md)
 - [Session](./Models/Session.md)
 - [SignInAdmin](./Models/SignInAdmin.md)
 - [SignInCmd](./Models/SignInCmd.md)
 - [SignInDmsCmd](./Models/SignInDmsCmd.md)
 - [TextToSearch](./Models/TextToSearch.md)
 - [User](./Models/User.md)
 - [UserRole](./Models/UserRole.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
