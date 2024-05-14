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
    /// CMNewComment
    /// </summary>
    [DataContract(Name = "CMNewComment")]
    public partial class CMNewComment : IEquatable<CMNewComment>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMNewComment" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMNewComment() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMNewComment" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="sliceId">sliceId (required).</param>
        /// <param name="documentKey">documentKey (required).</param>
        /// <param name="commentLevel">commentLevel (required).</param>
        /// <param name="comment">comment (required).</param>
        /// <param name="isAuditEvent">isAuditEvent (required).</param>
        public CMNewComment(string organisationId = default(string), string projectId = default(string), string sliceId = default(string), string documentKey = default(string), string commentLevel = default(string), string comment = default(string), bool isAuditEvent = default(bool))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMNewComment and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMNewComment and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "sliceId" is required (not null)
            if (sliceId == null)
            {
                throw new ArgumentNullException("sliceId is a required property for CMNewComment and cannot be null");
            }
            this.SliceId = sliceId;
            // to ensure "documentKey" is required (not null)
            if (documentKey == null)
            {
                throw new ArgumentNullException("documentKey is a required property for CMNewComment and cannot be null");
            }
            this.DocumentKey = documentKey;
            // to ensure "commentLevel" is required (not null)
            if (commentLevel == null)
            {
                throw new ArgumentNullException("commentLevel is a required property for CMNewComment and cannot be null");
            }
            this.CommentLevel = commentLevel;
            // to ensure "comment" is required (not null)
            if (comment == null)
            {
                throw new ArgumentNullException("comment is a required property for CMNewComment and cannot be null");
            }
            this.Comment = comment;
            this.IsAuditEvent = isAuditEvent;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets SliceId
        /// </summary>
        [DataMember(Name = "sliceId", IsRequired = true, EmitDefaultValue = true)]
        public string SliceId { get; set; }

        /// <summary>
        /// Gets or Sets DocumentKey
        /// </summary>
        [DataMember(Name = "documentKey", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentKey { get; set; }

        /// <summary>
        /// Gets or Sets CommentLevel
        /// </summary>
        [DataMember(Name = "commentLevel", IsRequired = true, EmitDefaultValue = true)]
        public string CommentLevel { get; set; }

        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name = "comment", IsRequired = true, EmitDefaultValue = true)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets IsAuditEvent
        /// </summary>
        [DataMember(Name = "isAuditEvent", IsRequired = true, EmitDefaultValue = true)]
        public bool IsAuditEvent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMNewComment {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  SliceId: ").Append(SliceId).Append("\n");
            sb.Append("  DocumentKey: ").Append(DocumentKey).Append("\n");
            sb.Append("  CommentLevel: ").Append(CommentLevel).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  IsAuditEvent: ").Append(IsAuditEvent).Append("\n");
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
            return this.Equals(input as CMNewComment);
        }

        /// <summary>
        /// Returns true if CMNewComment instances are equal
        /// </summary>
        /// <param name="input">Instance of CMNewComment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMNewComment input)
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
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.SliceId == input.SliceId ||
                    (this.SliceId != null &&
                    this.SliceId.Equals(input.SliceId))
                ) && 
                (
                    this.DocumentKey == input.DocumentKey ||
                    (this.DocumentKey != null &&
                    this.DocumentKey.Equals(input.DocumentKey))
                ) && 
                (
                    this.CommentLevel == input.CommentLevel ||
                    (this.CommentLevel != null &&
                    this.CommentLevel.Equals(input.CommentLevel))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.IsAuditEvent == input.IsAuditEvent ||
                    this.IsAuditEvent.Equals(input.IsAuditEvent)
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
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.SliceId != null)
                {
                    hashCode = (hashCode * 59) + this.SliceId.GetHashCode();
                }
                if (this.DocumentKey != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentKey.GetHashCode();
                }
                if (this.CommentLevel != null)
                {
                    hashCode = (hashCode * 59) + this.CommentLevel.GetHashCode();
                }
                if (this.Comment != null)
                {
                    hashCode = (hashCode * 59) + this.Comment.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsAuditEvent.GetHashCode();
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
