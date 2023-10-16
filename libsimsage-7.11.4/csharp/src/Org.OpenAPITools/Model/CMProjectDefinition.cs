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
    /// CMProjectDefinition
    /// </summary>
    [DataContract(Name = "CMProjectDefinition")]
    public partial class CMProjectDefinition : IEquatable<CMProjectDefinition>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMProjectDefinition" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMProjectDefinition() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMProjectDefinition" /> class.
        /// </summary>
        /// <param name="projectId">projectId.</param>
        /// <param name="taskId">taskId.</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="projectFrame">projectFrame (required).</param>
        /// <param name="keyedSearchTerms">keyedSearchTerms.</param>
        /// <param name="semanticTerms">semanticTerms.</param>
        /// <param name="filters">filters (required).</param>
        /// <param name="validationResult">validationResult.</param>
        public CMProjectDefinition(string projectId = default(string), string taskId = default(string), string organisationId = default(string), CMProjectFrame projectFrame = default(CMProjectFrame), List<CMKeyedSearchTerm> keyedSearchTerms = default(List<CMKeyedSearchTerm>), List<CMSemanticTerm> semanticTerms = default(List<CMSemanticTerm>), CMFilter filters = default(CMFilter), Dictionary<string, bool> validationResult = default(Dictionary<string, bool>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMProjectDefinition and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "projectFrame" is required (not null)
            if (projectFrame == null)
            {
                throw new ArgumentNullException("projectFrame is a required property for CMProjectDefinition and cannot be null");
            }
            this.ProjectFrame = projectFrame;
            // to ensure "filters" is required (not null)
            if (filters == null)
            {
                throw new ArgumentNullException("filters is a required property for CMProjectDefinition and cannot be null");
            }
            this.Filters = filters;
            this.ProjectId = projectId;
            this.TaskId = taskId;
            this.KeyedSearchTerms = keyedSearchTerms;
            this.SemanticTerms = semanticTerms;
            this.ValidationResult = validationResult;
        }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", EmitDefaultValue = false)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name = "taskId", EmitDefaultValue = false)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectFrame
        /// </summary>
        [DataMember(Name = "projectFrame", IsRequired = true, EmitDefaultValue = true)]
        public CMProjectFrame ProjectFrame { get; set; }

        /// <summary>
        /// Gets or Sets KeyedSearchTerms
        /// </summary>
        [DataMember(Name = "keyedSearchTerms", EmitDefaultValue = false)]
        public List<CMKeyedSearchTerm> KeyedSearchTerms { get; set; }

        /// <summary>
        /// Gets or Sets SemanticTerms
        /// </summary>
        [DataMember(Name = "semanticTerms", EmitDefaultValue = false)]
        public List<CMSemanticTerm> SemanticTerms { get; set; }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", IsRequired = true, EmitDefaultValue = true)]
        public CMFilter Filters { get; set; }

        /// <summary>
        /// Gets or Sets ValidationResult
        /// </summary>
        [DataMember(Name = "validationResult", EmitDefaultValue = false)]
        public Dictionary<string, bool> ValidationResult { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMProjectDefinition {\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProjectFrame: ").Append(ProjectFrame).Append("\n");
            sb.Append("  KeyedSearchTerms: ").Append(KeyedSearchTerms).Append("\n");
            sb.Append("  SemanticTerms: ").Append(SemanticTerms).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
            sb.Append("  ValidationResult: ").Append(ValidationResult).Append("\n");
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
            return this.Equals(input as CMProjectDefinition);
        }

        /// <summary>
        /// Returns true if CMProjectDefinition instances are equal
        /// </summary>
        /// <param name="input">Instance of CMProjectDefinition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMProjectDefinition input)
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
                    this.TaskId == input.TaskId ||
                    (this.TaskId != null &&
                    this.TaskId.Equals(input.TaskId))
                ) && 
                (
                    this.OrganisationId == input.OrganisationId ||
                    (this.OrganisationId != null &&
                    this.OrganisationId.Equals(input.OrganisationId))
                ) && 
                (
                    this.ProjectFrame == input.ProjectFrame ||
                    (this.ProjectFrame != null &&
                    this.ProjectFrame.Equals(input.ProjectFrame))
                ) && 
                (
                    this.KeyedSearchTerms == input.KeyedSearchTerms ||
                    this.KeyedSearchTerms != null &&
                    input.KeyedSearchTerms != null &&
                    this.KeyedSearchTerms.SequenceEqual(input.KeyedSearchTerms)
                ) && 
                (
                    this.SemanticTerms == input.SemanticTerms ||
                    this.SemanticTerms != null &&
                    input.SemanticTerms != null &&
                    this.SemanticTerms.SequenceEqual(input.SemanticTerms)
                ) && 
                (
                    this.Filters == input.Filters ||
                    (this.Filters != null &&
                    this.Filters.Equals(input.Filters))
                ) && 
                (
                    this.ValidationResult == input.ValidationResult ||
                    this.ValidationResult != null &&
                    input.ValidationResult != null &&
                    this.ValidationResult.SequenceEqual(input.ValidationResult)
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
                if (this.TaskId != null)
                {
                    hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                }
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.ProjectFrame != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectFrame.GetHashCode();
                }
                if (this.KeyedSearchTerms != null)
                {
                    hashCode = (hashCode * 59) + this.KeyedSearchTerms.GetHashCode();
                }
                if (this.SemanticTerms != null)
                {
                    hashCode = (hashCode * 59) + this.SemanticTerms.GetHashCode();
                }
                if (this.Filters != null)
                {
                    hashCode = (hashCode * 59) + this.Filters.GetHashCode();
                }
                if (this.ValidationResult != null)
                {
                    hashCode = (hashCode * 59) + this.ValidationResult.GetHashCode();
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
