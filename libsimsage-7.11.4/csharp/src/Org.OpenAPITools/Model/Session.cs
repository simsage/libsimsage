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
    /// Session
    /// </summary>
    [DataContract(Name = "Session")]
    public partial class Session : IEquatable<Session>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Session" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Session() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Session" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="userId">userId (required).</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="email">email (required).</param>
        /// <param name="ipAddress">ipAddress (required).</param>
        /// <param name="lastAccess">lastAccess (required).</param>
        /// <param name="role">role (required).</param>
        /// <param name="sessionType">sessionType (required).</param>
        /// <param name="contextStack">contextStack (required).</param>
        public Session(string id = default(string), string userId = default(string), string organisationId = default(string), string email = default(string), string ipAddress = default(string), long lastAccess = default(long), string role = default(string), string sessionType = default(string), List<ContextItem> contextStack = default(List<ContextItem>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for Session and cannot be null");
            }
            this.Id = id;
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for Session and cannot be null");
            }
            this.UserId = userId;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for Session and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for Session and cannot be null");
            }
            this.Email = email;
            // to ensure "ipAddress" is required (not null)
            if (ipAddress == null)
            {
                throw new ArgumentNullException("ipAddress is a required property for Session and cannot be null");
            }
            this.IpAddress = ipAddress;
            this.LastAccess = lastAccess;
            // to ensure "role" is required (not null)
            if (role == null)
            {
                throw new ArgumentNullException("role is a required property for Session and cannot be null");
            }
            this.Role = role;
            // to ensure "sessionType" is required (not null)
            if (sessionType == null)
            {
                throw new ArgumentNullException("sessionType is a required property for Session and cannot be null");
            }
            this.SessionType = sessionType;
            // to ensure "contextStack" is required (not null)
            if (contextStack == null)
            {
                throw new ArgumentNullException("contextStack is a required property for Session and cannot be null");
            }
            this.ContextStack = contextStack;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets IpAddress
        /// </summary>
        [DataMember(Name = "ipAddress", IsRequired = true, EmitDefaultValue = true)]
        public string IpAddress { get; set; }

        /// <summary>
        /// Gets or Sets LastAccess
        /// </summary>
        [DataMember(Name = "lastAccess", IsRequired = true, EmitDefaultValue = true)]
        public long LastAccess { get; set; }

        /// <summary>
        /// Gets or Sets Role
        /// </summary>
        [DataMember(Name = "role", IsRequired = true, EmitDefaultValue = true)]
        public string Role { get; set; }

        /// <summary>
        /// Gets or Sets SessionType
        /// </summary>
        [DataMember(Name = "sessionType", IsRequired = true, EmitDefaultValue = true)]
        public string SessionType { get; set; }

        /// <summary>
        /// Gets or Sets ContextStack
        /// </summary>
        [DataMember(Name = "contextStack", IsRequired = true, EmitDefaultValue = true)]
        public List<ContextItem> ContextStack { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Session {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  IpAddress: ").Append(IpAddress).Append("\n");
            sb.Append("  LastAccess: ").Append(LastAccess).Append("\n");
            sb.Append("  Role: ").Append(Role).Append("\n");
            sb.Append("  SessionType: ").Append(SessionType).Append("\n");
            sb.Append("  ContextStack: ").Append(ContextStack).Append("\n");
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
            return this.Equals(input as Session);
        }

        /// <summary>
        /// Returns true if Session instances are equal
        /// </summary>
        /// <param name="input">Instance of Session to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Session input)
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
                ) && 
                (
                    this.ContextStack == input.ContextStack ||
                    this.ContextStack != null &&
                    input.ContextStack != null &&
                    this.ContextStack.SequenceEqual(input.ContextStack)
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
                if (this.ContextStack != null)
                {
                    hashCode = (hashCode * 59) + this.ContextStack.GetHashCode();
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
