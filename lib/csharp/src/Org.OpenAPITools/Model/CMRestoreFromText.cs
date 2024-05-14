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
    /// an object with the text to restore from
    /// </summary>
    [DataContract(Name = "CMRestoreFromText")]
    public partial class CMRestoreFromText : IEquatable<CMRestoreFromText>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRestoreFromText" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMRestoreFromText() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMRestoreFromText" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id). (required).</param>
        /// <param name="base64Text">the base64 text to restore from. (required).</param>
        /// <param name="fileType">the file-type of the base64 text (must be text/plain) (required).</param>
        public CMRestoreFromText(string organisationId = default(string), string base64Text = default(string), string fileType = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMRestoreFromText and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "base64Text" is required (not null)
            if (base64Text == null)
            {
                throw new ArgumentNullException("base64Text is a required property for CMRestoreFromText and cannot be null");
            }
            this.Base64Text = base64Text;
            // to ensure "fileType" is required (not null)
            if (fileType == null)
            {
                throw new ArgumentNullException("fileType is a required property for CMRestoreFromText and cannot be null");
            }
            this.FileType = fileType;
        }

        /// <summary>
        /// the organisation (its guid id).
        /// </summary>
        /// <value>the organisation (its guid id).</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the base64 text to restore from.
        /// </summary>
        /// <value>the base64 text to restore from.</value>
        [DataMember(Name = "base64Text", IsRequired = true, EmitDefaultValue = true)]
        public string Base64Text { get; set; }

        /// <summary>
        /// the file-type of the base64 text (must be text/plain)
        /// </summary>
        /// <value>the file-type of the base64 text (must be text/plain)</value>
        /// <example>text/plain</example>
        [DataMember(Name = "fileType", IsRequired = true, EmitDefaultValue = true)]
        public string FileType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMRestoreFromText {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Base64Text: ").Append(Base64Text).Append("\n");
            sb.Append("  FileType: ").Append(FileType).Append("\n");
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
            return this.Equals(input as CMRestoreFromText);
        }

        /// <summary>
        /// Returns true if CMRestoreFromText instances are equal
        /// </summary>
        /// <param name="input">Instance of CMRestoreFromText to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMRestoreFromText input)
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
                    this.Base64Text == input.Base64Text ||
                    (this.Base64Text != null &&
                    this.Base64Text.Equals(input.Base64Text))
                ) && 
                (
                    this.FileType == input.FileType ||
                    (this.FileType != null &&
                    this.FileType.Equals(input.FileType))
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
                if (this.Base64Text != null)
                {
                    hashCode = (hashCode * 59) + this.Base64Text.GetHashCode();
                }
                if (this.FileType != null)
                {
                    hashCode = (hashCode * 59) + this.FileType.GetHashCode();
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
