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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CMSimpleQuery
    /// </summary>
    [DataContract(Name = "CMSimpleQuery")]
    [JsonConverter(typeof(JsonSubtypes), "Type")]
    public partial class CMSimpleQuery : CMSliceQueryDefinition, IEquatable<CMSimpleQuery>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSimpleQuery" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSimpleQuery() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSimpleQuery" /> class.
        /// </summary>
        /// <param name="type">type (required) (default to &quot;CMSimpleQuery&quot;).</param>
        /// <param name="tokenList">tokenList (required).</param>
        public CMSimpleQuery(string type = @"CMSimpleQuery", List<CMQueryToken> tokenList = default(List<CMQueryToken>)) : base()
        {
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for CMSimpleQuery and cannot be null");
            }
            this.Type = type;
            // to ensure "tokenList" is required (not null)
            if (tokenList == null)
            {
                throw new ArgumentNullException("tokenList is a required property for CMSimpleQuery and cannot be null");
            }
            this.TokenList = tokenList;
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets TokenList
        /// </summary>
        [DataMember(Name = "tokenList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMQueryToken> TokenList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSimpleQuery {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  TokenList: ").Append(TokenList).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
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
            return this.Equals(input as CMSimpleQuery);
        }

        /// <summary>
        /// Returns true if CMSimpleQuery instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSimpleQuery to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSimpleQuery input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && base.Equals(input) && 
                (
                    this.TokenList == input.TokenList ||
                    this.TokenList != null &&
                    input.TokenList != null &&
                    this.TokenList.SequenceEqual(input.TokenList)
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
                int hashCode = base.GetHashCode();
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.TokenList != null)
                {
                    hashCode = (hashCode * 59) + this.TokenList.GetHashCode();
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
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            foreach (var x in base.BaseValidate(validationContext))
            {
                yield return x;
            }
            yield break;
        }
    }

}
