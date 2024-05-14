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
    /// LocatedRedaction
    /// </summary>
    [DataContract(Name = "LocatedRedaction")]
    public partial class LocatedRedaction : IEquatable<LocatedRedaction>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LocatedRedaction" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LocatedRedaction() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LocatedRedaction" /> class.
        /// </summary>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="sliceId">sliceId (required).</param>
        /// <param name="documentKey">documentKey (required).</param>
        /// <param name="redactionType">redactionType (required).</param>
        /// <param name="queryId">queryId.</param>
        /// <param name="redactionKey">redactionKey.</param>
        /// <param name="word">word.</param>
        /// <param name="isRedacted">isRedacted (required).</param>
        /// <param name="page">page (required).</param>
        /// <param name="left">left (required).</param>
        /// <param name="bottom">bottom (required).</param>
        /// <param name="width">width (required).</param>
        /// <param name="height">height (required).</param>
        public LocatedRedaction(string projectId = default(string), string sliceId = default(string), string documentKey = default(string), string redactionType = default(string), int queryId = default(int), string redactionKey = default(string), string word = default(string), bool isRedacted = default(bool), int page = default(int), float left = default(float), float bottom = default(float), float width = default(float), float height = default(float))
        {
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for LocatedRedaction and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "sliceId" is required (not null)
            if (sliceId == null)
            {
                throw new ArgumentNullException("sliceId is a required property for LocatedRedaction and cannot be null");
            }
            this.SliceId = sliceId;
            // to ensure "documentKey" is required (not null)
            if (documentKey == null)
            {
                throw new ArgumentNullException("documentKey is a required property for LocatedRedaction and cannot be null");
            }
            this.DocumentKey = documentKey;
            // to ensure "redactionType" is required (not null)
            if (redactionType == null)
            {
                throw new ArgumentNullException("redactionType is a required property for LocatedRedaction and cannot be null");
            }
            this.RedactionType = redactionType;
            this.IsRedacted = isRedacted;
            this.Page = page;
            this.Left = left;
            this.Bottom = bottom;
            this.Width = width;
            this.Height = height;
            this.QueryId = queryId;
            this.RedactionKey = redactionKey;
            this.Word = word;
        }

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
        /// Gets or Sets RedactionType
        /// </summary>
        [DataMember(Name = "redactionType", IsRequired = true, EmitDefaultValue = true)]
        public string RedactionType { get; set; }

        /// <summary>
        /// Gets or Sets QueryId
        /// </summary>
        [DataMember(Name = "queryId", EmitDefaultValue = false)]
        public int QueryId { get; set; }

        /// <summary>
        /// Gets or Sets RedactionKey
        /// </summary>
        [DataMember(Name = "redactionKey", EmitDefaultValue = false)]
        public string RedactionKey { get; set; }

        /// <summary>
        /// Gets or Sets Word
        /// </summary>
        [DataMember(Name = "word", EmitDefaultValue = false)]
        public string Word { get; set; }

        /// <summary>
        /// Gets or Sets IsRedacted
        /// </summary>
        [DataMember(Name = "isRedacted", IsRequired = true, EmitDefaultValue = true)]
        public bool IsRedacted { get; set; }

        /// <summary>
        /// Gets or Sets Page
        /// </summary>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// Gets or Sets Left
        /// </summary>
        [DataMember(Name = "left", IsRequired = true, EmitDefaultValue = true)]
        public float Left { get; set; }

        /// <summary>
        /// Gets or Sets Bottom
        /// </summary>
        [DataMember(Name = "bottom", IsRequired = true, EmitDefaultValue = true)]
        public float Bottom { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name = "width", IsRequired = true, EmitDefaultValue = true)]
        public float Width { get; set; }

        /// <summary>
        /// Gets or Sets Height
        /// </summary>
        [DataMember(Name = "height", IsRequired = true, EmitDefaultValue = true)]
        public float Height { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class LocatedRedaction {\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  SliceId: ").Append(SliceId).Append("\n");
            sb.Append("  DocumentKey: ").Append(DocumentKey).Append("\n");
            sb.Append("  RedactionType: ").Append(RedactionType).Append("\n");
            sb.Append("  QueryId: ").Append(QueryId).Append("\n");
            sb.Append("  RedactionKey: ").Append(RedactionKey).Append("\n");
            sb.Append("  Word: ").Append(Word).Append("\n");
            sb.Append("  IsRedacted: ").Append(IsRedacted).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Left: ").Append(Left).Append("\n");
            sb.Append("  Bottom: ").Append(Bottom).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
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
            return this.Equals(input as LocatedRedaction);
        }

        /// <summary>
        /// Returns true if LocatedRedaction instances are equal
        /// </summary>
        /// <param name="input">Instance of LocatedRedaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LocatedRedaction input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                    this.RedactionType == input.RedactionType ||
                    (this.RedactionType != null &&
                    this.RedactionType.Equals(input.RedactionType))
                ) && 
                (
                    this.QueryId == input.QueryId ||
                    this.QueryId.Equals(input.QueryId)
                ) && 
                (
                    this.RedactionKey == input.RedactionKey ||
                    (this.RedactionKey != null &&
                    this.RedactionKey.Equals(input.RedactionKey))
                ) && 
                (
                    this.Word == input.Word ||
                    (this.Word != null &&
                    this.Word.Equals(input.Word))
                ) && 
                (
                    this.IsRedacted == input.IsRedacted ||
                    this.IsRedacted.Equals(input.IsRedacted)
                ) && 
                (
                    this.Page == input.Page ||
                    this.Page.Equals(input.Page)
                ) && 
                (
                    this.Left == input.Left ||
                    this.Left.Equals(input.Left)
                ) && 
                (
                    this.Bottom == input.Bottom ||
                    this.Bottom.Equals(input.Bottom)
                ) && 
                (
                    this.Width == input.Width ||
                    this.Width.Equals(input.Width)
                ) && 
                (
                    this.Height == input.Height ||
                    this.Height.Equals(input.Height)
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
                if (this.RedactionType != null)
                {
                    hashCode = (hashCode * 59) + this.RedactionType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.QueryId.GetHashCode();
                if (this.RedactionKey != null)
                {
                    hashCode = (hashCode * 59) + this.RedactionKey.GetHashCode();
                }
                if (this.Word != null)
                {
                    hashCode = (hashCode * 59) + this.Word.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsRedacted.GetHashCode();
                hashCode = (hashCode * 59) + this.Page.GetHashCode();
                hashCode = (hashCode * 59) + this.Left.GetHashCode();
                hashCode = (hashCode * 59) + this.Bottom.GetHashCode();
                hashCode = (hashCode * 59) + this.Width.GetHashCode();
                hashCode = (hashCode * 59) + this.Height.GetHashCode();
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
