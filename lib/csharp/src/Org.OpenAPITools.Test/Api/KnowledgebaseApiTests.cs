/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
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
    ///  Class for testing KnowledgebaseApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class KnowledgebaseApiTests : IDisposable
    {
        private KnowledgebaseApi instance;

        public KnowledgebaseApiTests()
        {
            instance = new KnowledgebaseApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of KnowledgebaseApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' KnowledgebaseApi
            //Assert.IsType<KnowledgebaseApi>(instance);
        }

        /// <summary>
        /// Test ExportKnowledgeBase
        /// </summary>
        [Fact]
        public void ExportKnowledgeBaseTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMKnowledgeBaseExport cMKnowledgeBaseExport = null;
            //string? aPIVersion = null;
            //var response = instance.ExportKnowledgeBase(sessionId, cMKnowledgeBaseExport, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test GetKnowledgeBase
        /// </summary>
        [Fact]
        public void GetKnowledgeBaseTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.GetKnowledgeBase(organisationId, kbId, sessionId, aPIVersion);
            //Assert.IsType<CMKnowledgeBase>(response);
        }

        /// <summary>
        /// Test GetKnowledgeBases
        /// </summary>
        [Fact]
        public void GetKnowledgeBasesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.GetKnowledgeBases(organisationId, sessionId);
            //Assert.IsType<List<CMKnowledgeBase>>(response);
        }

        /// <summary>
        /// Test GetSearchInfo
        /// </summary>
        [Fact]
        public void GetSearchInfoTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string clientId = null;
            //string? aPIVersion = null;
            //var response = instance.GetSearchInfo(organisationId, clientId, aPIVersion);
            //Assert.IsType<CMInfo>(response);
        }

        /// <summary>
        /// Test GetSearchInfo2
        /// </summary>
        [Fact]
        public void GetSearchInfo2Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string? aPIVersion = null;
            //var response = instance.GetSearchInfo2(organisationId, aPIVersion);
            //Assert.IsType<CMInfo>(response);
        }

        /// <summary>
        /// Test RemoveKnowledgeBase
        /// </summary>
        [Fact]
        public void RemoveKnowledgeBaseTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string kbId = null;
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.RemoveKnowledgeBase(organisationId, kbId, sessionId, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test UpdateKnowledgeBase
        /// </summary>
        [Fact]
        public void UpdateKnowledgeBaseTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMKnowledgeBase cMKnowledgeBase = null;
            //string? aPIVersion = null;
            //var response = instance.UpdateKnowledgeBase(sessionId, cMKnowledgeBase, aPIVersion);
            //Assert.IsType<KnowledgeBase>(response);
        }

        /// <summary>
        /// Test Version3
        /// </summary>
        [Fact]
        public void Version3Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.Version3();
            //Assert.IsType<CMVersion>(response);
        }
    }
}
