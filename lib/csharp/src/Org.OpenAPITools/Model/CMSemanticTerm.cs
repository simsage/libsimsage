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
    /// CMSemanticTerm
    /// </summary>
    [DataContract(Name = "CMSemanticTerm")]
    public partial class CMSemanticTerm : IEquatable<CMSemanticTerm>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticTerm" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSemanticTerm() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticTerm" /> class.
        /// </summary>
        /// <param name="key">key (required).</param>
        /// <param name="redact">redact (required).</param>
        /// <param name="redactionDisabled">redactionDisabled (required).</param>
        /// <param name="search">search (required).</param>
        /// <param name="searchDisabled">searchDisabled (required).</param>
        /// <param name="caption">caption (required).</param>
        public CMSemanticTerm(string key = default(string), bool redact = default(bool), bool redactionDisabled = default(bool), bool search = default(bool), bool searchDisabled = default(bool), string caption = default(string))
        {
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for CMSemanticTerm and cannot be null");
            }
            this.Key = key;
            this.Redact = redact;
            this.RedactionDisabled = redactionDisabled;
            this.Search = search;
            this.SearchDisabled = searchDisabled;
            // to ensure "caption" is required (not null)
            if (caption == null)
            {
                throw new ArgumentNullException("caption is a required property for CMSemanticTerm and cannot be null");
            }
            this.Caption = caption;
        }

        /// <summary>
        /// Gets or Sets Key
        /// </summary>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets Redact
        /// </summary>
        [DataMember(Name = "redact", IsRequired = true, EmitDefaultValue = true)]
        public bool Redact { get; set; }

        /// <summary>
        /// Gets or Sets RedactionDisabled
        /// </summary>
        [DataMember(Name = "redactionDisabled", IsRequired = true, EmitDefaultValue = true)]
        public bool RedactionDisabled { get; set; }

        /// <summary>
        /// Gets or Sets Search
        /// </summary>
        [DataMember(Name = "search", IsRequired = true, EmitDefaultValue = true)]
        public bool Search { get; set; }

        /// <summary>
        /// Gets or Sets SearchDisabled
        /// </summary>
        [DataMember(Name = "searchDisabled", IsRequired = true, EmitDefaultValue = true)]
        public bool SearchDisabled { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name = "caption", IsRequired = true, EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSemanticTerm {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Redact: ").Append(Redact).Append("\n");
            sb.Append("  RedactionDisabled: ").Append(RedactionDisabled).Append("\n");
            sb.Append("  Search: ").Append(Search).Append("\n");
            sb.Append("  SearchDisabled: ").Append(SearchDisabled).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
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
            return this.Equals(input as CMSemanticTerm);
        }

        /// <summary>
        /// Returns true if CMSemanticTerm instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSemanticTerm to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSemanticTerm input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Redact == input.Redact ||
                    this.Redact.Equals(input.Redact)
                ) && 
                (
                    this.RedactionDisabled == input.RedactionDisabled ||
                    this.RedactionDisabled.Equals(input.RedactionDisabled)
                ) && 
                (
                    this.Search == input.Search ||
                    this.Search.Equals(input.Search)
                ) && 
                (
                    this.SearchDisabled == input.SearchDisabled ||
                    this.SearchDisabled.Equals(input.SearchDisabled)
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
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
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Redact.GetHashCode();
                hashCode = (hashCode * 59) + this.RedactionDisabled.GetHashCode();
                hashCode = (hashCode * 59) + this.Search.GetHashCode();
                hashCode = (hashCode * 59) + this.SearchDisabled.GetHashCode();
                if (this.Caption != null)
                {
                    hashCode = (hashCode * 59) + this.Caption.GetHashCode();
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
