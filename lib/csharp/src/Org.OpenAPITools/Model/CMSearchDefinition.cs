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
    /// CMSearchDefinition
    /// </summary>
    [DataContract(Name = "CMSearchDefinition")]
    public partial class CMSearchDefinition : IEquatable<CMSearchDefinition>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchDefinition" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSearchDefinition() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchDefinition" /> class.
        /// </summary>
        /// <param name="keyedQueries">keyedQueries (required).</param>
        /// <param name="semanticTermQueries">semanticTermQueries (required).</param>
        public CMSearchDefinition(List<CMSearchTerm> keyedQueries = default(List<CMSearchTerm>), List<CMSearchTerm> semanticTermQueries = default(List<CMSearchTerm>))
        {
            // to ensure "keyedQueries" is required (not null)
            if (keyedQueries == null)
            {
                throw new ArgumentNullException("keyedQueries is a required property for CMSearchDefinition and cannot be null");
            }
            this.KeyedQueries = keyedQueries;
            // to ensure "semanticTermQueries" is required (not null)
            if (semanticTermQueries == null)
            {
                throw new ArgumentNullException("semanticTermQueries is a required property for CMSearchDefinition and cannot be null");
            }
            this.SemanticTermQueries = semanticTermQueries;
        }

        /// <summary>
        /// Gets or Sets KeyedQueries
        /// </summary>
        [DataMember(Name = "keyedQueries", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSearchTerm> KeyedQueries { get; set; }

        /// <summary>
        /// Gets or Sets SemanticTermQueries
        /// </summary>
        [DataMember(Name = "semanticTermQueries", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSearchTerm> SemanticTermQueries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSearchDefinition {\n");
            sb.Append("  KeyedQueries: ").Append(KeyedQueries).Append("\n");
            sb.Append("  SemanticTermQueries: ").Append(SemanticTermQueries).Append("\n");
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
            return this.Equals(input as CMSearchDefinition);
        }

        /// <summary>
        /// Returns true if CMSearchDefinition instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSearchDefinition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSearchDefinition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.KeyedQueries == input.KeyedQueries ||
                    this.KeyedQueries != null &&
                    input.KeyedQueries != null &&
                    this.KeyedQueries.SequenceEqual(input.KeyedQueries)
                ) && 
                (
                    this.SemanticTermQueries == input.SemanticTermQueries ||
                    this.SemanticTermQueries != null &&
                    input.SemanticTermQueries != null &&
                    this.SemanticTermQueries.SequenceEqual(input.SemanticTermQueries)
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
                if (this.KeyedQueries != null)
                {
                    hashCode = (hashCode * 59) + this.KeyedQueries.GetHashCode();
                }
                if (this.SemanticTermQueries != null)
                {
                    hashCode = (hashCode * 59) + this.SemanticTermQueries.GetHashCode();
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
