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
    /// the source-folder add object
    /// </summary>
    [DataContract(Name = "CMAddSourceFolder")]
    public partial class CMAddSourceFolder : IEquatable<CMAddSourceFolder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMAddSourceFolder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMAddSourceFolder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMAddSourceFolder" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="sourceName">the source-folder&#39;s new name. (required).</param>
        /// <param name="acls">the initial ACLs for this source-folder. (required).</param>
        public CMAddSourceFolder(string organisationId = default(string), string kbId = default(string), string sourceName = default(string), List<CMDocumentAcl> acls = default(List<CMDocumentAcl>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMAddSourceFolder and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMAddSourceFolder and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "sourceName" is required (not null)
            if (sourceName == null)
            {
                throw new ArgumentNullException("sourceName is a required property for CMAddSourceFolder and cannot be null");
            }
            this.SourceName = sourceName;
            // to ensure "acls" is required (not null)
            if (acls == null)
            {
                throw new ArgumentNullException("acls is a required property for CMAddSourceFolder and cannot be null");
            }
            this.Acls = acls;
        }

        /// <summary>
        /// the main organisation (its guid id) for this source/crawler
        /// </summary>
        /// <value>the main organisation (its guid id) for this source/crawler</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id of this context item, a guid-string
        /// </summary>
        /// <value>the knowledge-base id of this context item, a guid-string</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the source-folder&#39;s new name.
        /// </summary>
        /// <value>the source-folder&#39;s new name.</value>
        /// <example>source-folder 1</example>
        [DataMember(Name = "sourceName", IsRequired = true, EmitDefaultValue = true)]
        public string SourceName { get; set; }

        /// <summary>
        /// the initial ACLs for this source-folder.
        /// </summary>
        /// <value>the initial ACLs for this source-folder.</value>
        [DataMember(Name = "acls", IsRequired = true, EmitDefaultValue = true)]
        public List<CMDocumentAcl> Acls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMAddSourceFolder {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  SourceName: ").Append(SourceName).Append("\n");
            sb.Append("  Acls: ").Append(Acls).Append("\n");
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
            return this.Equals(input as CMAddSourceFolder);
        }

        /// <summary>
        /// Returns true if CMAddSourceFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of CMAddSourceFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMAddSourceFolder input)
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
                    this.SourceName == input.SourceName ||
                    (this.SourceName != null &&
                    this.SourceName.Equals(input.SourceName))
                ) && 
                (
                    this.Acls == input.Acls ||
                    this.Acls != null &&
                    input.Acls != null &&
                    this.Acls.SequenceEqual(input.Acls)
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
                if (this.SourceName != null)
                {
                    hashCode = (hashCode * 59) + this.SourceName.GetHashCode();
                }
                if (this.Acls != null)
                {
                    hashCode = (hashCode * 59) + this.Acls.GetHashCode();
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
