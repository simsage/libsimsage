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
    /// An audit record for a document.
    /// </summary>
    [DataContract(Name = "CMDocumentAudit")]
    public partial class CMDocumentAudit : IEquatable<CMDocumentAudit>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentAudit" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentAudit() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentAudit" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="userId">The user&#39;s id (required).</param>
        /// <param name="email">the email address of the user for this audit record (required).</param>
        /// <param name="description">The description of the audit event (required).</param>
        /// <param name="created">a unix-timestamp of the creation date-time of this record (required).</param>
        public CMDocumentAudit(string organisationId = default(string), string kbId = default(string), string url = default(string), string userId = default(string), string email = default(string), string description = default(string), long created = default(long))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentAudit and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentAudit and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentAudit and cannot be null");
            }
            this.Url = url;
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for CMDocumentAudit and cannot be null");
            }
            this.UserId = userId;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for CMDocumentAudit and cannot be null");
            }
            this.Email = email;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for CMDocumentAudit and cannot be null");
            }
            this.Description = description;
            this.Created = created;
        }

        /// <summary>
        /// the main organisation (its guid id) for this source/crawler
        /// </summary>
        /// <value>the main organisation (its guid id) for this source/crawler</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id of this context item, a guid-string
        /// </summary>
        /// <value>the knowledge-base id of this context item, a guid-string</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// The unique URL of a document.
        /// </summary>
        /// <value>The unique URL of a document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// The user&#39;s id
        /// </summary>
        /// <value>The user&#39;s id</value>
        /// <example>1234</example>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// the email address of the user for this audit record
        /// </summary>
        /// <value>the email address of the user for this audit record</value>
        /// <example>joe@bloggs.com</example>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// The description of the audit event
        /// </summary>
        /// <value>The description of the audit event</value>
        /// <example>something happened</example>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// a unix-timestamp of the creation date-time of this record
        /// </summary>
        /// <value>a unix-timestamp of the creation date-time of this record</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public long Created { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentAudit {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
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
            return this.Equals(input as CMDocumentAudit);
        }

        /// <summary>
        /// Returns true if CMDocumentAudit instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentAudit to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentAudit input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OrganisationId == input.OrganisationId ||
                    (this.OrganisationId != null &&
                    this.OrganisationId.Equals(input.OrganisationId))
                ) && 
                (
                    this.KbId == input.KbId ||
                    (this.KbId != null &&
                    this.KbId.Equals(input.KbId))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Created == input.Created ||
                    this.Created.Equals(input.Created)
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
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.KbId != null)
                {
                    hashCode = (hashCode * 59) + this.KbId.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.UserId != null)
                {
                    hashCode = (hashCode * 59) + this.UserId.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Created.GetHashCode();
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