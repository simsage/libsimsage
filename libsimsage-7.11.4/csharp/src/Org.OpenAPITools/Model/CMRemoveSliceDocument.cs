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
    /// CMRemoveSliceDocument
    /// </summary>
    [DataContract(Name = "CMRemoveSliceDocument")]
    public partial class CMRemoveSliceDocument : IEquatable<CMRemoveSliceDocument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRemoveSliceDocument" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMRemoveSliceDocument() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRemoveSliceDocument" /> class.
        /// </summary>
        /// <param name="taskId">taskId (required).</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="documentKey">documentKey (required).</param>
        public CMRemoveSliceDocument(string taskId = default(string), string organisationId = default(string), string documentKey = default(string))
        {
            // to ensure "taskId" is required (not null)
            if (taskId == null)
            {
                throw new ArgumentNullException("taskId is a required property for CMRemoveSliceDocument and cannot be null");
            }
            this.TaskId = taskId;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMRemoveSliceDocument and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "documentKey" is required (not null)
            if (documentKey == null)
            {
                throw new ArgumentNullException("documentKey is a required property for CMRemoveSliceDocument and cannot be null");
            }
            this.DocumentKey = documentKey;
        }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name = "taskId", IsRequired = true, EmitDefaultValue = true)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets DocumentKey
        /// </summary>
        [DataMember(Name = "documentKey", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentKey { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMRemoveSliceDocument {\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  DocumentKey: ").Append(DocumentKey).Append("\n");
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
            return this.Equals(input as CMRemoveSliceDocument);
        }

        /// <summary>
        /// Returns true if CMRemoveSliceDocument instances are equal
        /// </summary>
        /// <param name="input">Instance of CMRemoveSliceDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMRemoveSliceDocument input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                    this.DocumentKey == input.DocumentKey ||
                    (this.DocumentKey != null &&
                    this.DocumentKey.Equals(input.DocumentKey))
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
                if (this.TaskId != null)
                {
                    hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                }
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.DocumentKey != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentKey.GetHashCode();
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
