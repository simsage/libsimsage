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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// SignInAdmin
    /// </summary>
    [DataContract(Name = "SignInAdmin")]
    public partial class SignInAdmin : IEquatable<SignInAdmin>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SignInAdmin" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SignInAdmin() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SignInAdmin" /> class.
        /// </summary>
        /// <param name="jobId">jobId (required).</param>
        /// <param name="returnAddress">returnAddress (required).</param>
        /// <param name="errorStr">errorStr (required).</param>
        /// <param name="timeOut">timeOut (required).</param>
        /// <param name="async">async (required).</param>
        /// <param name="isReturnResult">isReturnResult (required).</param>
        /// <param name="email">email (required).</param>
        /// <param name="password">password (required).</param>
        /// <param name="roles">roles (required).</param>
        /// <param name="remoteAddress">remoteAddress (required).</param>
        /// <param name="session">session (required).</param>
        /// <param name="user">user (required).</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="organisationList">organisationList (required).</param>
        /// <param name="returnResult">returnResult.</param>
        public SignInAdmin(string jobId = default(string), string returnAddress = default(string), string errorStr = default(string), long timeOut = default(long), bool async = default(bool), bool isReturnResult = default(bool), string email = default(string), string password = default(string), List<string> roles = default(List<string>), string remoteAddress = default(string), Session session = default(Session), User user = default(User), string organisationId = default(string), List<Organisation> organisationList = default(List<Organisation>), bool returnResult = default(bool))
        {
            // to ensure "jobId" is required (not null)
            if (jobId == null)
            {
                throw new ArgumentNullException("jobId is a required property for SignInAdmin and cannot be null");
            }
            this.JobId = jobId;
            // to ensure "returnAddress" is required (not null)
            if (returnAddress == null)
            {
                throw new ArgumentNullException("returnAddress is a required property for SignInAdmin and cannot be null");
            }
            this.ReturnAddress = returnAddress;
            // to ensure "errorStr" is required (not null)
            if (errorStr == null)
            {
                throw new ArgumentNullException("errorStr is a required property for SignInAdmin and cannot be null");
            }
            this.ErrorStr = errorStr;
            this.TimeOut = timeOut;
            this.Async = async;
            this.IsReturnResult = isReturnResult;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for SignInAdmin and cannot be null");
            }
            this.Email = email;
            // to ensure "password" is required (not null)
            if (password == null)
            {
                throw new ArgumentNullException("password is a required property for SignInAdmin and cannot be null");
            }
            this.Password = password;
            // to ensure "roles" is required (not null)
            if (roles == null)
            {
                throw new ArgumentNullException("roles is a required property for SignInAdmin and cannot be null");
            }
            this.Roles = roles;
            // to ensure "remoteAddress" is required (not null)
            if (remoteAddress == null)
            {
                throw new ArgumentNullException("remoteAddress is a required property for SignInAdmin and cannot be null");
            }
            this.RemoteAddress = remoteAddress;
            // to ensure "session" is required (not null)
            if (session == null)
            {
                throw new ArgumentNullException("session is a required property for SignInAdmin and cannot be null");
            }
            this.Session = session;
            // to ensure "user" is required (not null)
            if (user == null)
            {
                throw new ArgumentNullException("user is a required property for SignInAdmin and cannot be null");
            }
            this.User = user;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for SignInAdmin and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "organisationList" is required (not null)
            if (organisationList == null)
            {
                throw new ArgumentNullException("organisationList is a required property for SignInAdmin and cannot be null");
            }
            this.OrganisationList = organisationList;
            this.ReturnResult = returnResult;
        }

        /// <summary>
        /// Gets or Sets JobId
        /// </summary>
        [DataMember(Name = "jobId", IsRequired = true, EmitDefaultValue = true)]
        public string JobId { get; set; }

        /// <summary>
        /// Gets or Sets ReturnAddress
        /// </summary>
        [DataMember(Name = "returnAddress", IsRequired = true, EmitDefaultValue = true)]
        public string ReturnAddress { get; set; }

        /// <summary>
        /// Gets or Sets ErrorStr
        /// </summary>
        [DataMember(Name = "errorStr", IsRequired = true, EmitDefaultValue = true)]
        public string ErrorStr { get; set; }

        /// <summary>
        /// Gets or Sets TimeOut
        /// </summary>
        [DataMember(Name = "timeOut", IsRequired = true, EmitDefaultValue = true)]
        public long TimeOut { get; set; }

        /// <summary>
        /// Gets or Sets Async
        /// </summary>
        [DataMember(Name = "async", IsRequired = true, EmitDefaultValue = true)]
        public bool Async { get; set; }

        /// <summary>
        /// Gets or Sets IsReturnResult
        /// </summary>
        [DataMember(Name = "isReturnResult", IsRequired = true, EmitDefaultValue = true)]
        public bool IsReturnResult { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name = "password", IsRequired = true, EmitDefaultValue = true)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets Roles
        /// </summary>
        [DataMember(Name = "roles", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Roles { get; set; }

        /// <summary>
        /// Gets or Sets RemoteAddress
        /// </summary>
        [DataMember(Name = "remoteAddress", IsRequired = true, EmitDefaultValue = true)]
        public string RemoteAddress { get; set; }

        /// <summary>
        /// Gets or Sets Session
        /// </summary>
        [DataMember(Name = "session", IsRequired = true, EmitDefaultValue = true)]
        public Session Session { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", IsRequired = true, EmitDefaultValue = true)]
        public User User { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationList
        /// </summary>
        [DataMember(Name = "organisationList", IsRequired = true, EmitDefaultValue = true)]
        public List<Organisation> OrganisationList { get; set; }

        /// <summary>
        /// Gets or Sets ReturnResult
        /// </summary>
        [DataMember(Name = "returnResult", EmitDefaultValue = true)]
        public bool ReturnResult { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SignInAdmin {\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  ReturnAddress: ").Append(ReturnAddress).Append("\n");
            sb.Append("  ErrorStr: ").Append(ErrorStr).Append("\n");
            sb.Append("  TimeOut: ").Append(TimeOut).Append("\n");
            sb.Append("  Async: ").Append(Async).Append("\n");
            sb.Append("  IsReturnResult: ").Append(IsReturnResult).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Roles: ").Append(Roles).Append("\n");
            sb.Append("  RemoteAddress: ").Append(RemoteAddress).Append("\n");
            sb.Append("  Session: ").Append(Session).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  OrganisationList: ").Append(OrganisationList).Append("\n");
            sb.Append("  ReturnResult: ").Append(ReturnResult).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SignInAdmin);
        }

        /// <summary>
        /// Returns true if SignInAdmin instances are equal
        /// </summary>
        /// <param name="input">Instance of SignInAdmin to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SignInAdmin input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.JobId == input.JobId ||
                    (this.JobId != null &&
                    this.JobId.Equals(input.JobId))
                ) && 
                (
                    this.ReturnAddress == input.ReturnAddress ||
                    (this.ReturnAddress != null &&
                    this.ReturnAddress.Equals(input.ReturnAddress))
                ) && 
                (
                    this.ErrorStr == input.ErrorStr ||
                    (this.ErrorStr != null &&
                    this.ErrorStr.Equals(input.ErrorStr))
                ) && 
                (
                    this.TimeOut == input.TimeOut ||
                    this.TimeOut.Equals(input.TimeOut)
                ) && 
                (
                    this.Async == input.Async ||
                    this.Async.Equals(input.Async)
                ) && 
                (
                    this.IsReturnResult == input.IsReturnResult ||
                    this.IsReturnResult.Equals(input.IsReturnResult)
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
                ) && 
                (
                    this.Roles == input.Roles ||
                    this.Roles != null &&
                    input.Roles != null &&
                    this.Roles.SequenceEqual(input.Roles)
                ) && 
                (
                    this.RemoteAddress == input.RemoteAddress ||
                    (this.RemoteAddress != null &&
                    this.RemoteAddress.Equals(input.RemoteAddress))
                ) && 
                (
                    this.Session == input.Session ||
                    (this.Session != null &&
                    this.Session.Equals(input.Session))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.OrganisationId == input.OrganisationId ||
                    (this.OrganisationId != null &&
                    this.OrganisationId.Equals(input.OrganisationId))
                ) && 
                (
                    this.OrganisationList == input.OrganisationList ||
                    this.OrganisationList != null &&
                    input.OrganisationList != null &&
                    this.OrganisationList.SequenceEqual(input.OrganisationList)
                ) && 
                (
                    this.ReturnResult == input.ReturnResult ||
                    this.ReturnResult.Equals(input.ReturnResult)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.JobId != null)
                {
                    hashCode = (hashCode * 59) + this.JobId.GetHashCode();
                }
                if (this.ReturnAddress != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnAddress.GetHashCode();
                }
                if (this.ErrorStr != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorStr.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TimeOut.GetHashCode();
                hashCode = (hashCode * 59) + this.Async.GetHashCode();
                hashCode = (hashCode * 59) + this.IsReturnResult.GetHashCode();
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Password != null)
                {
                    hashCode = (hashCode * 59) + this.Password.GetHashCode();
                }
                if (this.Roles != null)
                {
                    hashCode = (hashCode * 59) + this.Roles.GetHashCode();
                }
                if (this.RemoteAddress != null)
                {
                    hashCode = (hashCode * 59) + this.RemoteAddress.GetHashCode();
                }
                if (this.Session != null)
                {
                    hashCode = (hashCode * 59) + this.Session.GetHashCode();
                }
                if (this.User != null)
                {
                    hashCode = (hashCode * 59) + this.User.GetHashCode();
                }
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.OrganisationList != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationList.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ReturnResult.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
