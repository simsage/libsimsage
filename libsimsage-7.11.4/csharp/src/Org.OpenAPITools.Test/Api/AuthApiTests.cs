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
    ///  Class for testing AuthApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class AuthApiTests : IDisposable
    {
        private AuthApi instance;

        public AuthApiTests()
        {
            instance = new AuthApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of AuthApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' AuthApi
            //Assert.IsType<AuthApi>(instance);
        }

        /// <summary>
        /// Test DeleteGroup
        /// </summary>
        [Fact]
        public void DeleteGroupTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string name = null;
            //string sessionId = null;
            //var response = instance.DeleteGroup(organisationId, name, sessionId);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test DeleteOrganisation
        /// </summary>
        [Fact]
        public void DeleteOrganisationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.DeleteOrganisation(organisationId, sessionId);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test GetGroups
        /// </summary>
        [Fact]
        public void GetGroupsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.GetGroups(organisationId, sessionId);
            //Assert.IsType<CMGroupList>(response);
        }

        /// <summary>
        /// Test GetOTT
        /// </summary>
        [Fact]
        public void GetOTTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.GetOTT(organisationId, sessionId);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test GetUserOrganisationList
        /// </summary>
        [Fact]
        public void GetUserOrganisationListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //string sessionId = null;
            //var response = instance.GetUserOrganisationList(filter, sessionId);
            //Assert.IsType<List<CMOrganisation>>(response);
        }

        /// <summary>
        /// Test GetUsersPaginated
        /// </summary>
        [Fact]
        public void GetUsersPaginatedTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //int page = null;
            //int pageSize = null;
            //string filter = null;
            //string sessionId = null;
            //var response = instance.GetUsersPaginated(organisationId, page, pageSize, filter, sessionId);
            //Assert.IsType<CMUserList>(response);
        }

        /// <summary>
        /// Test ImportUsersAndGroups
        /// </summary>
        [Fact]
        public void ImportUsersAndGroupsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMImportUsers cMImportUsers = null;
            //string? aPIVersion = null;
            //var response = instance.ImportUsersAndGroups(sessionId, cMImportUsers, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test MyRoles
        /// </summary>
        [Fact]
        public void MyRolesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.MyRoles(organisationId, sessionId);
            //Assert.IsType<List<string>>(response);
        }

        /// <summary>
        /// Test RemoveUserFromOrganisation
        /// </summary>
        [Fact]
        public void RemoveUserFromOrganisationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string userId = null;
            //string organisationId = null;
            //string sessionId = null;
            //var response = instance.RemoveUserFromOrganisation(userId, organisationId, sessionId);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test ResetPassword
        /// </summary>
        [Fact]
        public void ResetPasswordTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CMUserPasswordReset cMUserPasswordReset = null;
            //var response = instance.ResetPassword(cMUserPasswordReset);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test ResetPasswordRequest
        /// </summary>
        [Fact]
        public void ResetPasswordRequestTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CMPasswordResetRequest cMPasswordResetRequest = null;
            //var response = instance.ResetPasswordRequest(cMPasswordResetRequest);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test SaveGroup
        /// </summary>
        [Fact]
        public void SaveGroupTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMGroup cMGroup = null;
            //var response = instance.SaveGroup(sessionId, cMGroup);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test SignIn
        /// </summary>
        [Fact]
        public void SignInTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CMSignInParameters cMSignInParameters = null;
            //var response = instance.SignIn(cMSignInParameters);
            //Assert.IsType<CMSessionVersion>(response);
        }

        /// <summary>
        /// Test SignInAdminUsingJWTMsal
        /// </summary>
        [Fact]
        public void SignInAdminUsingJWTMsalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string jwt = null;
            //var response = instance.SignInAdminUsingJWTMsal(jwt);
            //Assert.IsType<SignInAdmin>(response);
        }

        /// <summary>
        /// Test SignInDmsUsingJWTMsal
        /// </summary>
        [Fact]
        public void SignInDmsUsingJWTMsalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string jwt = null;
            //string organisationId = null;
            //var response = instance.SignInDmsUsingJWTMsal(jwt, organisationId);
            //Assert.IsType<SignInDmsCmd>(response);
        }

        /// <summary>
        /// Test SignInEvolveUsingJWTMsal
        /// </summary>
        [Fact]
        public void SignInEvolveUsingJWTMsalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string jwt = null;
            //string organisationId = null;
            //var response = instance.SignInEvolveUsingJWTMsal(jwt, organisationId);
            //Assert.IsType<SignInDmsCmd>(response);
        }

        /// <summary>
        /// Test SignInSearchUsingJWTMsal
        /// </summary>
        [Fact]
        public void SignInSearchUsingJWTMsalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string jwt = null;
            //string organisationId = null;
            //var response = instance.SignInSearchUsingJWTMsal(jwt, organisationId);
            //Assert.IsType<SignInCmd>(response);
        }

        /// <summary>
        /// Test SignOut
        /// </summary>
        [Fact]
        public void SignOutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //string? aPIVersion = null;
            //var response = instance.SignOut(sessionId, aPIVersion);
            //Assert.IsType<JsonMessage>(response);
        }

        /// <summary>
        /// Test UpdateOrganisation
        /// </summary>
        [Fact]
        public void UpdateOrganisationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string sessionId = null;
            //CMOrganisation cMOrganisation = null;
            //var response = instance.UpdateOrganisation(sessionId, cMOrganisation);
            //Assert.IsType<CMOrganisation>(response);
        }

        /// <summary>
        /// Test UpdateUser
        /// </summary>
        [Fact]
        public void UpdateUserTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string organisationId = null;
            //string sessionId = null;
            //CMUserWithExtras cMUserWithExtras = null;
            //var response = instance.UpdateUser(organisationId, sessionId, cMUserWithExtras);
            //Assert.IsType<CMUserWithExtras>(response);
        }

        /// <summary>
        /// Test Version8
        /// </summary>
        [Fact]
        public void Version8Test()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.Version8();
            //Assert.IsType<SignInCmd>(response);
        }
    }
}
