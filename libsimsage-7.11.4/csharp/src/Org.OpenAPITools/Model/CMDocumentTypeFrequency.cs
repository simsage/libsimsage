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
    /// An entity for holding document type and a count for that type.
    /// </summary>
    [DataContract(Name = "CMDocumentTypeFrequency")]
    public partial class CMDocumentTypeFrequency : IEquatable<CMDocumentTypeFrequency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentTypeFrequency" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentTypeFrequency() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentTypeFrequency" /> class.
        /// </summary>
        /// <param name="documentType">The file extension of a document, its type. (required).</param>
        /// <param name="count">The count of this type in SimSage. (required).</param>
        public CMDocumentTypeFrequency(string documentType = default(string), long count = default(long))
        {
            // to ensure "documentType" is required (not null)
            if (documentType == null)
            {
                throw new ArgumentNullException("documentType is a required property for CMDocumentTypeFrequency and cannot be null");
            }
            this.DocumentType = documentType;
            this.Count = count;
        }

        /// <summary>
        /// The file extension of a document, its type.
        /// </summary>
        /// <value>The file extension of a document, its type.</value>
        /// <example>many possible values, eg. doc,pdf,html</example>
        [DataMember(Name = "documentType", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentType { get; set; }

        /// <summary>
        /// The count of this type in SimSage.
        /// </summary>
        /// <value>The count of this type in SimSage.</value>
        /// <example>312</example>
        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public long Count { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentTypeFrequency {\n");
            sb.Append("  DocumentType: ").Append(DocumentType).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
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
            return this.Equals(input as CMDocumentTypeFrequency);
        }

        /// <summary>
        /// Returns true if CMDocumentTypeFrequency instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentTypeFrequency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentTypeFrequency input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DocumentType == input.DocumentType ||
                    (this.DocumentType != null &&
                    this.DocumentType.Equals(input.DocumentType))
                ) && 
                (
                    this.Count == input.Count ||
                    this.Count.Equals(input.Count)
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
                if (this.DocumentType != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Count.GetHashCode();
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
