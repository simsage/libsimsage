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
    ///  Class for testing BackupApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class BackupApiTests : IDisposable
    {
        private BackupApi instance;

        public BackupApiTests()
        {
            instance = new BackupApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of BackupApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' BackupApi
            //Assert.IsType<BackupApi>(instance);
        }

        /// <summary>
        /// Test Backup
        /// </summary>
        [Fact]
        public void BackupTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //string regime = null;
            //var response = instance.Backup(sessionId, organisationId, regime);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test DeleteBackup
        /// </summary>
        [Fact]
        public void DeleteBackupTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //long backupId = null;
            //var response = instance.DeleteBackup(sessionId, organisationId, backupId);
            //Assert.IsType<List<Backup>>(response);
        }

        /// <summary>
        /// Test GetBackup
        /// </summary>
        [Fact]
        public void GetBackupTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //long backupId = null;
            //var response = instance.GetBackup(sessionId, organisationId, backupId);
            //Assert.IsType<Backup>(response);
        }

        /// <summary>
        /// Test GetBackupList
        /// </summary>
        [Fact]
        public void GetBackupListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string organisationId = null;
            //var response = instance.GetBackupList(sessionId, organisationId);
            //Assert.IsType<List<Backup>>(response);
        }

        /// <summary>
        /// Test RestoreFromText
        /// </summary>
        [Fact]
        public void RestoreFromTextTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMRestoreFromText cMRestoreFromText = null;
            //var response = instance.RestoreFromText(sessionId, cMRestoreFromText);
            //Assert.IsType<JsonMessage>(response);
        }
    }
}
