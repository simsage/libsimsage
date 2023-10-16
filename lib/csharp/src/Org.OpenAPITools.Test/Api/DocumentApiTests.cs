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
    ///  Class for testing DocumentApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DocumentApiTests : IDisposable
    {
        private DocumentApi instance;

        public DocumentApiTests()
        {
            instance = new DocumentApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DocumentApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DocumentApi
            //Assert.IsType<DocumentApi>(instance);
        }

        /// <summary>
        /// Test Document
        /// </summary>
        [Fact]
        public void DocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //var response = instance.Document(sessionId, organisationId, kbId, url);
            //Assert.IsType<CMDocument>(response);
        }

        /// <summary>
        /// Test GetParquetFile
        /// </summary>
        [Fact]
        public void GetParquetFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string ott = null;
            //string organisationId = null;
            //string kbId = null;
            //long dateTime = null;
            //var response = instance.GetParquetFile(ott, organisationId, kbId, dateTime);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test GetParquetList
        /// </summary>
        [Fact]
        public void GetParquetListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //int page = null;
            //int pageSize = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetParquetList(organisationId, kbId, page, pageSize, sessionId, aPIVersion);
            //Assert.IsType<CMParquetTimeList>(response);
        }

        /// <summary>
        /// Test GetSpreadsheet
        /// </summary>
        [Fact]
        public void GetSpreadsheetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string ott = null;
            //string organisationId = null;
            //string kbId = null;
            //long dateTime = null;
            //var response = instance.GetSpreadsheet(ott, organisationId, kbId, dateTime);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test GetStats1
        /// </summary>
        [Fact]
        public void GetStats1Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string ott = null;
            //string organisationId = null;
            //string kbId = null;
            //long dateTime = null;
            //var response = instance.GetStats1(ott, organisationId, kbId, dateTime);
            //Assert.IsType<List<CMDocumentTypeFrequency>>(response);
        }

        /// <summary>
        /// Test InventorizeDocuments
        /// </summary>
        [Fact]
        public void InventorizeDocumentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMInventorizeParameters cMInventorizeParameters = null;
            //string? aPIVersion = null;
            //var response = instance.InventorizeDocuments(sessionId, cMInventorizeParameters, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test InventorizeIndexes
        /// </summary>
        [Fact]
        public void InventorizeIndexesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMInventorizeParameters cMInventorizeParameters = null;
            //string? aPIVersion = null;
            //var response = instance.InventorizeIndexes(sessionId, cMInventorizeParameters, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test Preview
        /// </summary>
        [Fact]
        public void PreviewTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string clientId = null;
            //string sessionId = null;
            //int urlId = null;
            //int page = null;
            //var response = instance.Preview(organisationId, kbId, clientId, sessionId, urlId, page);
            //Assert.IsType<byte[]>(response);
        }

        /// <summary>
        /// Test PreviewHtml
        /// </summary>
        [Fact]
        public void PreviewHtmlTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMGetHtml cMGetHtml = null;
            //var response = instance.PreviewHtml(sessionId, cMGetHtml);
            //Assert.IsType<CMGetHtml>(response);
        }

        /// <summary>
        /// Test QueryFocussedSummarization
        /// </summary>
        [Fact]
        public void QueryFocussedSummarizationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMQueryFocussedSummarizationRequest cMQueryFocussedSummarizationRequest = null;
            //string? aPIVersion = null;
            //var response = instance.QueryFocussedSummarization(sessionId, cMQueryFocussedSummarizationRequest, aPIVersion);
            //Assert.IsType<CMQueryFocussedSummarization>(response);
        }

        /// <summary>
        /// Test RemoveDocument
        /// </summary>
        [Fact]
        public void RemoveDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string url = null;
            //int sourceId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.RemoveDocument(organisationId, kbId, url, sourceId, sessionId, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test RemoveParquetFile
        /// </summary>
        [Fact]
        public void RemoveParquetFileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //long dateTime = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.RemoveParquetFile(organisationId, kbId, dateTime, sessionId, aPIVersion);
            //Assert.IsType<List<JsonMessage>>(response);
        }

        /// <summary>
        /// Test SummarizeDocument
        /// </summary>
        [Fact]
        public void SummarizeDocumentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMSingleDocumentSummaryRequest cMSingleDocumentSummaryRequest = null;
            //string? aPIVersion = null;
            //var response = instance.SummarizeDocument(sessionId, cMSingleDocumentSummaryRequest, aPIVersion);
            //Assert.IsType<CMSingleDocumentSummary>(response);
        }

        /// <summary>
        /// Test Version4
        /// </summary>
        [Fact]
        public void Version4Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.Version4();
            //Assert.IsType<CMVersion>(response);
        }

        /// <summary>
        /// Test ZipSource
        /// </summary>
        [Fact]
        public void ZipSourceTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMZipSource cMZipSource = null;
            //string? aPIVersion = null;
            //var response = instance.ZipSource(sessionId, cMZipSource, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }
    }
}