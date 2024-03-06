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
    /// the knowledge-base export config
    /// </summary>
    [DataContract(Name = "CMKnowledgeBaseExport")]
    public partial class CMKnowledgeBaseExport : IEquatable<CMKnowledgeBaseExport>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMKnowledgeBaseExport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMKnowledgeBaseExport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMKnowledgeBaseExport" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="kbId">kbId (required).</param>
        /// <param name="exporter">exporter (required).</param>
        /// <param name="exportConfig">exportConfig (required).</param>
        public CMKnowledgeBaseExport(string organisationId = default(string), string kbId = default(string), string exporter = default(string), Dictionary<string, Object> exportConfig = default(Dictionary<string, Object>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMKnowledgeBaseExport and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMKnowledgeBaseExport and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "exporter" is required (not null)
            if (exporter == null)
            {
                throw new ArgumentNullException("exporter is a required property for CMKnowledgeBaseExport and cannot be null");
            }
            this.Exporter = exporter;
            // to ensure "exportConfig" is required (not null)
            if (exportConfig == null)
            {
                throw new ArgumentNullException("exportConfig is a required property for CMKnowledgeBaseExport and cannot be null");
            }
            this.ExportConfig = exportConfig;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets KbId
        /// </summary>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// Gets or Sets Exporter
        /// </summary>
        [DataMember(Name = "exporter", IsRequired = true, EmitDefaultValue = true)]
        public string Exporter { get; set; }

        /// <summary>
        /// Gets or Sets ExportConfig
        /// </summary>
        [DataMember(Name = "exportConfig", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, Object> ExportConfig { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMKnowledgeBaseExport {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Exporter: ").Append(Exporter).Append("\n");
            sb.Append("  ExportConfig: ").Append(ExportConfig).Append("\n");
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
            return this.Equals(input as CMKnowledgeBaseExport);
        }

        /// <summary>
        /// Returns true if CMKnowledgeBaseExport instances are equal
        /// </summary>
        /// <param name="input">Instance of CMKnowledgeBaseExport to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMKnowledgeBaseExport input)
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
                    this.Exporter == input.Exporter ||
                    (this.Exporter != null &&
                    this.Exporter.Equals(input.Exporter))
                ) && 
                (
                    this.ExportConfig == input.ExportConfig ||
                    this.ExportConfig != null &&
                    input.ExportConfig != null &&
                    this.ExportConfig.SequenceEqual(input.ExportConfig)
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
                if (this.Exporter != null)
                {
                    hashCode = (hashCode * 59) + this.Exporter.GetHashCode();
                }
                if (this.ExportConfig != null)
                {
                    hashCode = (hashCode * 59) + this.ExportConfig.GetHashCode();
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
