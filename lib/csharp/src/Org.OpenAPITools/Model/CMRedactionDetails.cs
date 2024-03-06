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
    /// CMRedactionDetails
    /// </summary>
    [DataContract(Name = "CMRedactionDetails")]
    public partial class CMRedactionDetails : IEquatable<CMRedactionDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRedactionDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMRedactionDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRedactionDetails" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="documentKey">documentKey (required).</param>
        /// <param name="redactions">redactions (required).</param>
        /// <param name="mode">mode (required).</param>
        public CMRedactionDetails(string organisationId = default(string), string projectId = default(string), string documentKey = default(string), List<CMLocatedRedaction> redactions = default(List<CMLocatedRedaction>), string mode = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMRedactionDetails and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMRedactionDetails and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "documentKey" is required (not null)
            if (documentKey == null)
            {
                throw new ArgumentNullException("documentKey is a required property for CMRedactionDetails and cannot be null");
            }
            this.DocumentKey = documentKey;
            // to ensure "redactions" is required (not null)
            if (redactions == null)
            {
                throw new ArgumentNullException("redactions is a required property for CMRedactionDetails and cannot be null");
            }
            this.Redactions = redactions;
            // to ensure "mode" is required (not null)
            if (mode == null)
            {
                throw new ArgumentNullException("mode is a required property for CMRedactionDetails and cannot be null");
            }
            this.Mode = mode;
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
        /// Gets or Sets DocumentKey
        /// </summary>
        [DataMember(Name = "documentKey", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentKey { get; set; }

        /// <summary>
        /// Gets or Sets Redactions
        /// </summary>
        [DataMember(Name = "redactions", IsRequired = true, EmitDefaultValue = true)]
        public List<CMLocatedRedaction> Redactions { get; set; }

        /// <summary>
        /// Gets or Sets Mode
        /// </summary>
        [DataMember(Name = "mode", IsRequired = true, EmitDefaultValue = true)]
        public string Mode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMRedactionDetails {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  DocumentKey: ").Append(DocumentKey).Append("\n");
            sb.Append("  Redactions: ").Append(Redactions).Append("\n");
            sb.Append("  Mode: ").Append(Mode).Append("\n");
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
            return this.Equals(input as CMRedactionDetails);
        }

        /// <summary>
        /// Returns true if CMRedactionDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of CMRedactionDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMRedactionDetails input)
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
                    this.DocumentKey == input.DocumentKey ||
                    (this.DocumentKey != null &&
                    this.DocumentKey.Equals(input.DocumentKey))
                ) && 
                (
                    this.Redactions == input.Redactions ||
                    this.Redactions != null &&
                    input.Redactions != null &&
                    this.Redactions.SequenceEqual(input.Redactions)
                ) && 
                (
                    this.Mode == input.Mode ||
                    (this.Mode != null &&
                    this.Mode.Equals(input.Mode))
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
                if (this.DocumentKey != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentKey.GetHashCode();
                }
                if (this.Redactions != null)
                {
                    hashCode = (hashCode * 59) + this.Redactions.GetHashCode();
                }
                if (this.Mode != null)
                {
                    hashCode = (hashCode * 59) + this.Mode.GetHashCode();
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
