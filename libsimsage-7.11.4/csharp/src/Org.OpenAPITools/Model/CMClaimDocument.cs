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
    /// CMClaimDocument
    /// </summary>
    [DataContract(Name = "CMClaimDocument")]
    public partial class CMClaimDocument : IEquatable<CMClaimDocument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMClaimDocument" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMClaimDocument() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMClaimDocument" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="sliceId">sliceId (required).</param>
        /// <param name="documentKey">documentKey (required).</param>
        /// <param name="varLock">varLock (required).</param>
        /// <param name="force">force (required).</param>
        public CMClaimDocument(string organisationId = default(string), string projectId = default(string), string sliceId = default(string), string documentKey = default(string), bool varLock = default(bool), bool force = default(bool))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMClaimDocument and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMClaimDocument and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "sliceId" is required (not null)
            if (sliceId == null)
            {
                throw new ArgumentNullException("sliceId is a required property for CMClaimDocument and cannot be null");
            }
            this.SliceId = sliceId;
            // to ensure "documentKey" is required (not null)
            if (documentKey == null)
            {
                throw new ArgumentNullException("documentKey is a required property for CMClaimDocument and cannot be null");
            }
            this.DocumentKey = documentKey;
            this.VarLock = varLock;
            this.Force = force;
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
        /// Gets or Sets VarLock
        /// </summary>
        [DataMember(Name = "lock", IsRequired = true, EmitDefaultValue = true)]
        public bool VarLock { get; set; }

        /// <summary>
        /// Gets or Sets Force
        /// </summary>
        [DataMember(Name = "force", IsRequired = true, EmitDefaultValue = true)]
        public bool Force { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMClaimDocument {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  SliceId: ").Append(SliceId).Append("\n");
            sb.Append("  DocumentKey: ").Append(DocumentKey).Append("\n");
            sb.Append("  VarLock: ").Append(VarLock).Append("\n");
            sb.Append("  Force: ").Append(Force).Append("\n");
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
            return this.Equals(input as CMClaimDocument);
        }

        /// <summary>
        /// Returns true if CMClaimDocument instances are equal
        /// </summary>
        /// <param name="input">Instance of CMClaimDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMClaimDocument input)
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
                    this.VarLock == input.VarLock ||
                    this.VarLock.Equals(input.VarLock)
                ) && 
                (
                    this.Force == input.Force ||
                    this.Force.Equals(input.Force)
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
                hashCode = (hashCode * 59) + this.VarLock.GetHashCode();
                hashCode = (hashCode * 59) + this.Force.GetHashCode();
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
