/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
 * Contact: info@simsage.co.uk
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing DmsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DmsApiTests : IDisposable
    {
        private DmsApi instance;

        public DmsApiTests()
        {
            instance = new DmsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DmsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DmsApi
            //Assert.IsType<DmsApi>(instance);
        }

        /// <summary>
        /// Test AddFolder
        /// </summary>
        [Fact]
        public void AddFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMAddFolder cMAddFolder = null;
            //string? aPIVersion = null;
            //var response = instance.AddFolder(sessionId, cMAddFolder, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test AddSourceFolder
        /// </summary>
        [Fact]
        public void AddSourceFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMAddSourceFolder cMAddSourceFolder = null;
            //string? aPIVersion = null;
            //var response = instance.AddSourceFolder(sessionId, cMAddSourceFolder, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test DeleteAllNotes
        /// </summary>
        [Fact]
        public void DeleteAllNotesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteAllNotes(sessionId, organisationId, kbId, url, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test DeleteBookmark
        /// </summary>
        [Fact]
        public void DeleteBookmarkTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteBookmark(sessionId, organisationId, kbId, userId, url, aPIVersion);
            //Assert.IsType<List<CMDocumentBookmark>>(response);
        }

        /// <summary>
        /// Test DeleteDocumentOrFolder
        /// </summary>
        [Fact]
        public void DeleteDocumentOrFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //bool isFolder = null;
            //int sourceId = null;
            //string url = null;
            //string folderId = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteDocumentOrFolder(sessionId, organisationId, kbId, isFolder, sourceId, url, folderId, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test DeleteNote
        /// </summary>
        [Fact]
        public void DeleteNoteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //int noteId = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteNote(sessionId, organisationId, kbId, url, noteId, aPIVersion);
            //Assert.IsType<List<CMDocumentNote>>(response);
        }

        /// <summary>
        /// Test DeleteSourceFolder
        /// </summary>
        [Fact]
        public void DeleteSourceFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int sourceId = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteSourceFolder(sessionId, organisationId, kbId, sourceId, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test DeleteSubscription
        /// </summary>
        [Fact]
        public void DeleteSubscriptionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteSubscription(sessionId, organisationId, kbId, userId, url, aPIVersion);
            //Assert.IsType<CMSubscriptions>(response);
        }

        /// <summary>
        /// Test DeleteUserSearch
        /// </summary>
        [Fact]
        public void DeleteUserSearchTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string text = null;
            //int top = null;
            //string? aPIVersion = null;
            //var response = instance.DeleteUserSearch(sessionId, organisationId, kbId, userId, text, top, aPIVersion);
            //Assert.IsType<List<CMSavedSearch>>(response);
        }

        /// <summary>
        /// Test Document1
        /// </summary>
        [Fact]
        public void Document1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int urlId = null;
            //var response = instance.Document1(sessionId, organisationId, kbId, urlId);
            //Assert.IsType<CMDocument>(response);
        }

        /// <summary>
        /// Test DocumentBinary
        /// </summary>
        [Fact]
        public void DocumentBinaryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //var response = instance.DocumentBinary(sessionId, organisationId, kbId, url);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test DocumentVersion
        /// </summary>
        [Fact]
        public void DocumentVersionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //int varVersion = null;
            //var response = instance.DocumentVersion(sessionId, organisationId, kbId, url, varVersion);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test FilterFolders
        /// </summary>
        [Fact]
        public void FilterFoldersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string text = null;
            //string? aPIVersion = null;
            //var response = instance.FilterFolders(sessionId, organisationId, kbId, text, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test ForceReleaseLock
        /// </summary>
        [Fact]
        public void ForceReleaseLockTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.ForceReleaseLock(sessionId, organisationId, kbId, userId, url, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test GetBookmarkList
        /// </summary>
        [Fact]
        public void GetBookmarkListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetBookmarkList(organisationId, kbId, userId, sessionId, aPIVersion);
            //Assert.IsType<List<CMDocumentBookmark>>(response);
        }

        /// <summary>
        /// Test GetDeletedDocuments
        /// </summary>
        [Fact]
        public void GetDeletedDocumentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string filter = null;
            //string? aPIVersion = null;
            //var response = instance.GetDeletedDocuments(sessionId, organisationId, kbId, filter, aPIVersion);
            //Assert.IsType<List<DocumentDeleted>>(response);
        }

        /// <summary>
        /// Test GetDocumentAudit
        /// </summary>
        [Fact]
        public void GetDocumentAuditTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int year = null;
            //int month = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.GetDocumentAudit(sessionId, organisationId, kbId, year, month, url, aPIVersion);
            //Assert.IsType<List<CMDocumentAudit>>(response);
        }

        /// <summary>
        /// Test GetFolder
        /// </summary>
        [Fact]
        public void GetFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int sourceId = null;
            //string folderId = null;
            //string prevUrl = null;
            //int pageSize = null;
            //string? aPIVersion = null;
            //var response = instance.GetFolder(sessionId, organisationId, kbId, sourceId, folderId, prevUrl, pageSize, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test GetFullAudit
        /// </summary>
        [Fact]
        public void GetFullAuditTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int year = null;
            //int month = null;
            //string? aPIVersion = null;
            //var response = instance.GetFullAudit(sessionId, organisationId, kbId, year, month, aPIVersion);
            //Assert.IsType<List<CMDocumentAudit>>(response);
        }

        /// <summary>
        /// Test GetLockedList
        /// </summary>
        [Fact]
        public void GetLockedListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetLockedList(organisationId, kbId, userId, sessionId, aPIVersion);
            //Assert.IsType<List<CMDocument>>(response);
        }

        /// <summary>
        /// Test GetNoteList
        /// </summary>
        [Fact]
        public void GetNoteListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.GetNoteList(sessionId, organisationId, kbId, url, aPIVersion);
            //Assert.IsType<List<CMDocumentNote>>(response);
        }

        /// <summary>
        /// Test GetSavedSearches
        /// </summary>
        [Fact]
        public void GetSavedSearchesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //int top = null;
            //string? aPIVersion = null;
            //var response = instance.GetSavedSearches(sessionId, organisationId, kbId, userId, top, aPIVersion);
            //Assert.IsType<List<CMSavedSearch>>(response);
        }

        /// <summary>
        /// Test GetSourceFolder
        /// </summary>
        [Fact]
        public void GetSourceFolderTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //int sourceId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetSourceFolder(organisationId, kbId, sourceId, sessionId, aPIVersion);
            //Assert.IsType<CMDocumentFolder>(response);
        }

        /// <summary>
        /// Test GetSubscriptionList
        /// </summary>
        [Fact]
        public void GetSubscriptionListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetSubscriptionList(organisationId, kbId, userId, sessionId, aPIVersion);
            //Assert.IsType<CMSubscriptions>(response);
        }

        /// <summary>
        /// Test GetUserDashboard
        /// </summary>
        [Fact]
        public void GetUserDashboardTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetUserDashboard(organisationId, kbId, sessionId, aPIVersion);
            //Assert.IsType<CMDUserDashboard>(response);
        }

        /// <summary>
        /// Test GetUserNotifications
        /// </summary>
        [Fact]
        public void GetUserNotificationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int year = null;
            //int month = null;
            //string? aPIVersion = null;
            //var response = instance.GetUserNotifications(sessionId, organisationId, kbId, year, month, aPIVersion);
            //Assert.IsType<List<CMUserNotification>>(response);
        }

        /// <summary>
        /// Test LockDocument
        /// </summary>
        [Fact]
        public void LockDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMDocumentLock cMDocumentLock = null;
            //string? aPIVersion = null;
            //var response = instance.LockDocument(sessionId, cMDocumentLock, aPIVersion);
            //Assert.IsType<List<CMDocument>>(response);
        }

        /// <summary>
        /// Test ReleaseLock
        /// </summary>
        [Fact]
        public void ReleaseLockTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string userId = null;
            //string url = null;
            //string? aPIVersion = null;
            //var response = instance.ReleaseLock(sessionId, organisationId, kbId, userId, url, aPIVersion);
            //Assert.IsType<List<CMDocument>>(response);
        }

        /// <summary>
        /// Test RestfulDMSClientQuery
        /// </summary>
        [Fact]
        public void RestfulDMSClientQueryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMClientQuery cMClientQuery = null;
            //var response = instance.RestfulDMSClientQuery(sessionId, cMClientQuery);
            //Assert.IsType<CMClientQueryResult>(response);
        }

        /// <summary>
        /// Test SaveBookmark
        /// </summary>
        [Fact]
        public void SaveBookmarkTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMDocumentBookmark cMDocumentBookmark = null;
            //string? aPIVersion = null;
            //var response = instance.SaveBookmark(sessionId, cMDocumentBookmark, aPIVersion);
            //Assert.IsType<List<DocumentBookmark>>(response);
        }

        /// <summary>
        /// Test SaveHashTags
        /// </summary>
        [Fact]
        public void SaveHashTagsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMDocumentHashTag cMDocumentHashTag = null;
            //string? aPIVersion = null;
            //var response = instance.SaveHashTags(sessionId, cMDocumentHashTag, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test SaveNote
        /// </summary>
        [Fact]
        public void SaveNoteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMDocumentNote cMDocumentNote = null;
            //string? aPIVersion = null;
            //var response = instance.SaveNote(sessionId, cMDocumentNote, aPIVersion);
            //Assert.IsType<List<CMDocumentNote>>(response);
        }

        /// <summary>
        /// Test SaveSearch
        /// </summary>
        [Fact]
        public void SaveSearchTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMSavedSearch cMSavedSearch = null;
            //string? aPIVersion = null;
            //var response = instance.SaveSearch(sessionId, cMSavedSearch, aPIVersion);
            //Assert.IsType<List<CMSavedSearch>>(response);
        }

        /// <summary>
        /// Test SaveSubscription
        /// </summary>
        [Fact]
        public void SaveSubscriptionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMDocumentSubscription cMDocumentSubscription = null;
            //string? aPIVersion = null;
            //var response = instance.SaveSubscription(sessionId, cMDocumentSubscription, aPIVersion);
            //Assert.IsType<CMSubscriptions>(response);
        }

        /// <summary>
        /// Test UndeleteDocument
        /// </summary>
        [Fact]
        public void UndeleteDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int sourceId = null;
            //string url = null;
            //string filter = null;
            //string? aPIVersion = null;
            //var response = instance.UndeleteDocument(sessionId, organisationId, kbId, sourceId, url, filter, aPIVersion);
            //Assert.IsType<List<DocumentDeleted>>(response);
        }

        /// <summary>
        /// Test UpdateACLs
        /// </summary>
        [Fact]
        public void UpdateACLsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMUpdateACLs cMUpdateACLs = null;
            //string? aPIVersion = null;
            //var response = instance.UpdateACLs(sessionId, cMUpdateACLs, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test UploadDocument
        /// </summary>
        [Fact]
        public void UploadDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //int sourceId = null;
            //string folderId = null;
            //string lastModified = null;
            //System.IO.Stream file = null;
            //var response = instance.UploadDocument(sessionId, organisationId, kbId, sourceId, folderId, lastModified, file);
            //Assert.IsType<CMDocumentFolder>(response);
        }
    }
}
