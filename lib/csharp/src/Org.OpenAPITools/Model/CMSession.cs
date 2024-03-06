/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
    /// A session object, A session&#39;s id is the \&quot;session-id\&quot; used throughout the SimSage API.
    /// </summary>
    [DataContract(Name = "CMSession")]
    public partial class CMSession : IEquatable<CMSession>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSession" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSession() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSession" /> class.
        /// </summary>
        /// <param name="id">the session-id, a guid (required).</param>
        /// <param name="userId">the user associated with this session, their id, a guid (required).</param>
        /// <param name="organisationId">the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association) (required).</param>
        /// <param name="email">email address of this user (required).</param>
        /// <param name="ipAddress">the ip-address of the user logging in if captured (required).</param>
        /// <param name="lastAccess">a unix-timestamp of the last time this session was accessed/refreshed (required).</param>
        /// <param name="role">the main/highest role of the user signed-in (required).</param>
        /// <param name="sessionType">the type of sign-in (Anonymous (i.e. valid but search only) or SimSage) (required).</param>
        public CMSession(string id = default(string), string userId = default(string), string organisationId = default(string), string email = default(string), string ipAddress = default(string), long lastAccess = default(long), string role = default(string), string sessionType = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CMSession and cannot be null");
            }
            this.Id = id;
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for CMSession and cannot be null");
            }
            this.UserId = userId;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMSession and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for CMSession and cannot be null");
            }
            this.Email = email;
            // to ensure "ipAddress" is required (not null)
            if (ipAddress == null)
            {
                throw new ArgumentNullException("ipAddress is a required property for CMSession and cannot be null");
            }
            this.IpAddress = ipAddress;
            this.LastAccess = lastAccess;
            // to ensure "role" is required (not null)
            if (role == null)
            {
                throw new ArgumentNullException("role is a required property for CMSession and cannot be null");
            }
            this.Role = role;
            // to ensure "sessionType" is required (not null)
            if (sessionType == null)
            {
                throw new ArgumentNullException("sessionType is a required property for CMSession and cannot be null");
            }
            this.SessionType = sessionType;
        }

        /// <summary>
        /// the session-id, a guid
        /// </summary>
        /// <value>the session-id, a guid</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// the user associated with this session, their id, a guid
        /// </summary>
        /// <value>the user associated with this session, their id, a guid</value>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)
        /// </summary>
        /// <value>the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// email address of this user
        /// </summary>
        /// <value>email address of this user</value>
        /// <example>example@simsage.co.uk</example>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// the ip-address of the user logging in if captured
        /// </summary>
        /// <value>the ip-address of the user logging in if captured</value>
        [DataMember(Name = "ipAddress", IsRequired = true, EmitDefaultValue = true)]
        public string IpAddress { get; set; }

        /// <summary>
        /// a unix-timestamp of the last time this session was accessed/refreshed
        /// </summary>
        /// <value>a unix-timestamp of the last time this session was accessed/refreshed</value>
        [DataMember(Name = "lastAccess", IsRequired = true, EmitDefaultValue = true)]
        public long LastAccess { get; set; }

        /// <summary>
        /// the main/highest role of the user signed-in
        /// </summary>
        /// <value>the main/highest role of the user signed-in</value>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public string Role { get; set; }

        /// <summary>
        /// the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)
        /// </summary>
        /// <value>the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)</value>
        [DataMember(Name = "sessionType", IsRequired = true, EmitDefaultValue = true)]
        public string SessionType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSession {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  IpAddress: ").Append(IpAddress).Append("\n");
            sb.Append("  LastAccess: ").Append(LastAccess).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  SessionType: ").Append(SessionType).Append("\n");
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
            return this.Equals(input as CMSession);
        }

        /// <summary>
        /// Returns true if CMSession instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSession to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSession input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.OrganisationId == input.OrganisationId ||
                    (this.OrganisationId != null &&
                    this.OrganisationId.Equals(input.OrganisationId))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.IpAddress == input.IpAddress ||
                    (this.IpAddress != null &&
                    this.IpAddress.Equals(input.IpAddress))
                ) && 
                (
                    this.LastAccess == input.LastAccess ||
                    this.LastAccess.Equals(input.LastAccess)
                ) && 
                (
                    this.Role == input.Role ||
                    (this.Role != null &&
                    this.Role.Equals(input.Role))
                ) && 
                (
                    this.SessionType == input.SessionType ||
                    (this.SessionType != null &&
                    this.SessionType.Equals(input.SessionType))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.UserId != null)
                {
                    hashCode = (hashCode * 59) + this.UserId.GetHashCode();
                }
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.IpAddress != null)
                {
                    hashCode = (hashCode * 59) + this.IpAddress.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.LastAccess.GetHashCode();
                if (this.Role != null)
                {
                    hashCode = (hashCode * 59) + this.Role.GetHashCode();
                }
                if (this.SessionType != null)
                {
                    hashCode = (hashCode * 59) + this.SessionType.GetHashCode();
                }
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
