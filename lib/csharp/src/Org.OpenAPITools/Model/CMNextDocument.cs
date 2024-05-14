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
    /// CMNextDocument
    /// </summary>
    [DataContract(Name = "CMNextDocument")]
    public partial class CMNextDocument : IEquatable<CMNextDocument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMNextDocument" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMNextDocument() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMNextDocument" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="taskId">taskId (required).</param>
        /// <param name="sliceId">sliceId (required).</param>
        /// <param name="includedStatuses">includedStatuses (required).</param>
        public CMNextDocument(string organisationId = default(string), string taskId = default(string), string sliceId = default(string), List<string> includedStatuses = default(List<string>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMNextDocument and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "taskId" is required (not null)
            if (taskId == null)
            {
                throw new ArgumentNullException("taskId is a required property for CMNextDocument and cannot be null");
            }
            this.TaskId = taskId;
            // to ensure "sliceId" is required (not null)
            if (sliceId == null)
            {
                throw new ArgumentNullException("sliceId is a required property for CMNextDocument and cannot be null");
            }
            this.SliceId = sliceId;
            // to ensure "includedStatuses" is required (not null)
            if (includedStatuses == null)
            {
                throw new ArgumentNullException("includedStatuses is a required property for CMNextDocument and cannot be null");
            }
            this.IncludedStatuses = includedStatuses;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name = "taskId", IsRequired = true, EmitDefaultValue = true)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets SliceId
        /// </summary>
        [DataMember(Name = "sliceId", IsRequired = true, EmitDefaultValue = true)]
        public string SliceId { get; set; }

        /// <summary>
        /// Gets or Sets IncludedStatuses
        /// </summary>
        [DataMember(Name = "includedStatuses", IsRequired = true, EmitDefaultValue = true)]
        public List<string> IncludedStatuses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMNextDocument {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  SliceId: ").Append(SliceId).Append("\n");
            sb.Append("  IncludedStatuses: ").Append(IncludedStatuses).Append("\n");
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
            return this.Equals(input as CMNextDocument);
        }

        /// <summary>
        /// Returns true if CMNextDocument instances are equal
        /// </summary>
        /// <param name="input">Instance of CMNextDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMNextDocument input)
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
                    this.TaskId == input.TaskId ||
                    (this.TaskId != null &&
                    this.TaskId.Equals(input.TaskId))
                ) && 
                (
                    this.SliceId == input.SliceId ||
                    (this.SliceId != null &&
                    this.SliceId.Equals(input.SliceId))
                ) && 
                (
                    this.IncludedStatuses == input.IncludedStatuses ||
                    this.IncludedStatuses != null &&
                    input.IncludedStatuses != null &&
                    this.IncludedStatuses.SequenceEqual(input.IncludedStatuses)
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
                if (this.TaskId != null)
                {
                    hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                }
                if (this.SliceId != null)
                {
                    hashCode = (hashCode * 59) + this.SliceId.GetHashCode();
                }
                if (this.IncludedStatuses != null)
                {
                    hashCode = (hashCode * 59) + this.IncludedStatuses.GetHashCode();
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
