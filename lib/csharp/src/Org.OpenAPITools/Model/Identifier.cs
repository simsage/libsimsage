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
    /// Identifier
    /// </summary>
    [DataContract(Name = "Identifier")]
    public partial class Identifier : IEquatable<Identifier>, IValidatableObject
    {
        /// <summary>
        /// Defines IdentifierType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IdentifierTypeEnum
        {
            /// <summary>
            /// Enum CREDITCARDNUMBER for value: CREDIT_CARD_NUMBER
            /// </summary>
            [EnumMember(Value = "CREDIT_CARD_NUMBER")]
            CREDITCARDNUMBER = 1,

            /// <summary>
            /// Enum ACCOUNTNUMBER for value: ACCOUNT_NUMBER
            /// </summary>
            [EnumMember(Value = "ACCOUNT_NUMBER")]
            ACCOUNTNUMBER = 2,

            /// <summary>
            /// Enum POLICYNUMBER for value: POLICY_NUMBER
            /// </summary>
            [EnumMember(Value = "POLICY_NUMBER")]
            POLICYNUMBER = 3
        }


        /// <summary>
        /// Gets or Sets IdentifierType
        /// </summary>
        [DataMember(Name = "identifierType", IsRequired = true, EmitDefaultValue = true)]
        public IdentifierTypeEnum IdentifierType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Identifier" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Identifier() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Identifier" /> class.
        /// </summary>
        /// <param name="identifierType">identifierType (required).</param>
        /// <param name="varIdentifier">varIdentifier (required).</param>
        public Identifier(IdentifierTypeEnum identifierType = default(IdentifierTypeEnum), string varIdentifier = default(string))
        {
            this.IdentifierType = identifierType;
            // to ensure "varIdentifier" is required (not null)
            if (varIdentifier == null)
            {
                throw new ArgumentNullException("varIdentifier is a required property for Identifier and cannot be null");
            }
            this.VarIdentifier = varIdentifier;
        }

        /// <summary>
        /// Gets or Sets VarIdentifier
        /// </summary>
        [DataMember(Name = "identifier", IsRequired = true, EmitDefaultValue = true)]
        public string VarIdentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Identifier {\n");
            sb.Append("  IdentifierType: ").Append(IdentifierType).Append("\n");
            sb.Append("  VarIdentifier: ").Append(VarIdentifier).Append("\n");
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
            return this.Equals(input as Identifier);
        }

        /// <summary>
        /// Returns true if Identifier instances are equal
        /// </summary>
        /// <param name="input">Instance of Identifier to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Identifier input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdentifierType == input.IdentifierType ||
                    this.IdentifierType.Equals(input.IdentifierType)
                ) && 
                (
                    this.VarIdentifier == input.VarIdentifier ||
                    (this.VarIdentifier != null &&
                    this.VarIdentifier.Equals(input.VarIdentifier))
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
                hashCode = (hashCode * 59) + this.IdentifierType.GetHashCode();
                if (this.VarIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.VarIdentifier.GetHashCode();
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
