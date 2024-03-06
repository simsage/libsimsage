/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
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
    /// CMSetSliceDefinitions
    /// </summary>
    [DataContract(Name = "CMSetSliceDefinitions")]
    public partial class CMSetSliceDefinitions : IEquatable<CMSetSliceDefinitions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSetSliceDefinitions" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSetSliceDefinitions() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSetSliceDefinitions" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="taskId">taskId (required).</param>
        /// <param name="slices">slices (required).</param>
        public CMSetSliceDefinitions(string organisationId = default(string), string taskId = default(string), List<CMSliceConfig> slices = default(List<CMSliceConfig>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMSetSliceDefinitions and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "taskId" is required (not null)
            if (taskId == null)
            {
                throw new ArgumentNullException("taskId is a required property for CMSetSliceDefinitions and cannot be null");
            }
            this.TaskId = taskId;
            // to ensure "slices" is required (not null)
            if (slices == null)
            {
                throw new ArgumentNullException("slices is a required property for CMSetSliceDefinitions and cannot be null");
            }
            this.Slices = slices;
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
        /// Gets or Sets Slices
        /// </summary>
        [DataMember(Name = "slices", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSliceConfig> Slices { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSetSliceDefinitions {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  Slices: ").Append(Slices).Append("\n");
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
            return this.Equals(input as CMSetSliceDefinitions);
        }

        /// <summary>
        /// Returns true if CMSetSliceDefinitions instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSetSliceDefinitions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSetSliceDefinitions input)
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
                    this.Slices == input.Slices ||
                    this.Slices != null &&
                    input.Slices != null &&
                    this.Slices.SequenceEqual(input.Slices)
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
                if (this.Slices != null)
                {
                    hashCode = (hashCode * 59) + this.Slices.GetHashCode();
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
