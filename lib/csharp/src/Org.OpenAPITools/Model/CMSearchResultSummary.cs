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
    /// CMSearchResultSummary
    /// </summary>
    [DataContract(Name = "CMSearchResultSummary")]
    public partial class CMSearchResultSummary : IEquatable<CMSearchResultSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResultSummary" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSearchResultSummary() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResultSummary" /> class.
        /// </summary>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="kbId">kbId (required).</param>
        /// <param name="projectType">projectType (required).</param>
        /// <param name="projectTitle">projectTitle (required).</param>
        /// <param name="documentCount">documentCount (required).</param>
        /// <param name="results">results (required).</param>
        public CMSearchResultSummary(string projectId = default(string), string kbId = default(string), string projectType = default(string), string projectTitle = default(string), int documentCount = default(int), List<CMResultsSection> results = default(List<CMResultsSection>))
        {
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMSearchResultSummary and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMSearchResultSummary and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "projectType" is required (not null)
            if (projectType == null)
            {
                throw new ArgumentNullException("projectType is a required property for CMSearchResultSummary and cannot be null");
            }
            this.ProjectType = projectType;
            // to ensure "projectTitle" is required (not null)
            if (projectTitle == null)
            {
                throw new ArgumentNullException("projectTitle is a required property for CMSearchResultSummary and cannot be null");
            }
            this.ProjectTitle = projectTitle;
            this.DocumentCount = documentCount;
            // to ensure "results" is required (not null)
            if (results == null)
            {
                throw new ArgumentNullException("results is a required property for CMSearchResultSummary and cannot be null");
            }
            this.Results = results;
        }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets KbId
        /// </summary>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectType
        /// </summary>
        [DataMember(Name = "projectType", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectType { get; set; }

        /// <summary>
        /// Gets or Sets ProjectTitle
        /// </summary>
        [DataMember(Name = "projectTitle", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectTitle { get; set; }

        /// <summary>
        /// Gets or Sets DocumentCount
        /// </summary>
        [DataMember(Name = "documentCount", IsRequired = true, EmitDefaultValue = true)]
        public int DocumentCount { get; set; }

        /// <summary>
        /// Gets or Sets Results
        /// </summary>
        [DataMember(Name = "results", IsRequired = true, EmitDefaultValue = true)]
        public List<CMResultsSection> Results { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSearchResultSummary {\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  ProjectType: ").Append(ProjectType).Append("\n");
            sb.Append("  ProjectTitle: ").Append(ProjectTitle).Append("\n");
            sb.Append("  DocumentCount: ").Append(DocumentCount).Append("\n");
            sb.Append("  Results: ").Append(Results).Append("\n");
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
            return this.Equals(input as CMSearchResultSummary);
        }

        /// <summary>
        /// Returns true if CMSearchResultSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSearchResultSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSearchResultSummary input)
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
                    this.KbId == input.KbId ||
                    (this.KbId != null &&
                    this.KbId.Equals(input.KbId))
                ) && 
                (
                    this.ProjectType == input.ProjectType ||
                    (this.ProjectType != null &&
                    this.ProjectType.Equals(input.ProjectType))
                ) && 
                (
                    this.ProjectTitle == input.ProjectTitle ||
                    (this.ProjectTitle != null &&
                    this.ProjectTitle.Equals(input.ProjectTitle))
                ) && 
                (
                    this.DocumentCount == input.DocumentCount ||
                    this.DocumentCount.Equals(input.DocumentCount)
                ) && 
                (
                    this.Results == input.Results ||
                    this.Results != null &&
                    input.Results != null &&
                    this.Results.SequenceEqual(input.Results)
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
                if (this.KbId != null)
                {
                    hashCode = (hashCode * 59) + this.KbId.GetHashCode();
                }
                if (this.ProjectType != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectType.GetHashCode();
                }
                if (this.ProjectTitle != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectTitle.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.DocumentCount.GetHashCode();
                if (this.Results != null)
                {
                    hashCode = (hashCode * 59) + this.Results.GetHashCode();
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
