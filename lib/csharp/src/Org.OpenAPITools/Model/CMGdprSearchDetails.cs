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
    /// CMGdprSearchDetails
    /// </summary>
    [DataContract(Name = "CMGdprSearchDetails")]
    public partial class CMGdprSearchDetails : IEquatable<CMGdprSearchDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGdprSearchDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMGdprSearchDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGdprSearchDetails" /> class.
        /// </summary>
        /// <param name="firstName">firstName (required).</param>
        /// <param name="lastName">lastName (required).</param>
        /// <param name="documentTitle">documentTitle (required).</param>
        /// <param name="otherIdentifiers">otherIdentifiers (required).</param>
        public CMGdprSearchDetails(string firstName = default(string), string lastName = default(string), string documentTitle = default(string), List<Identifier> otherIdentifiers = default(List<Identifier>))
        {
            // to ensure "firstName" is required (not null)
            if (firstName == null)
            {
                throw new ArgumentNullException("firstName is a required property for CMGdprSearchDetails and cannot be null");
            }
            this.FirstName = firstName;
            // to ensure "lastName" is required (not null)
            if (lastName == null)
            {
                throw new ArgumentNullException("lastName is a required property for CMGdprSearchDetails and cannot be null");
            }
            this.LastName = lastName;
            // to ensure "documentTitle" is required (not null)
            if (documentTitle == null)
            {
                throw new ArgumentNullException("documentTitle is a required property for CMGdprSearchDetails and cannot be null");
            }
            this.DocumentTitle = documentTitle;
            // to ensure "otherIdentifiers" is required (not null)
            if (otherIdentifiers == null)
            {
                throw new ArgumentNullException("otherIdentifiers is a required property for CMGdprSearchDetails and cannot be null");
            }
            this.OtherIdentifiers = otherIdentifiers;
        }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "firstName", IsRequired = true, EmitDefaultValue = true)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "lastName", IsRequired = true, EmitDefaultValue = true)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets DocumentTitle
        /// </summary>
        [DataMember(Name = "documentTitle", IsRequired = true, EmitDefaultValue = true)]
        public string DocumentTitle { get; set; }

        /// <summary>
        /// Gets or Sets OtherIdentifiers
        /// </summary>
        [DataMember(Name = "otherIdentifiers", IsRequired = true, EmitDefaultValue = true)]
        public List<Identifier> OtherIdentifiers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMGdprSearchDetails {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  DocumentTitle: ").Append(DocumentTitle).Append("\n");
            sb.Append("  OtherIdentifiers: ").Append(OtherIdentifiers).Append("\n");
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
            return this.Equals(input as CMGdprSearchDetails);
        }

        /// <summary>
        /// Returns true if CMGdprSearchDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of CMGdprSearchDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMGdprSearchDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.DocumentTitle == input.DocumentTitle ||
                    (this.DocumentTitle != null &&
                    this.DocumentTitle.Equals(input.DocumentTitle))
                ) && 
                (
                    this.OtherIdentifiers == input.OtherIdentifiers ||
                    this.OtherIdentifiers != null &&
                    input.OtherIdentifiers != null &&
                    this.OtherIdentifiers.SequenceEqual(input.OtherIdentifiers)
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
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.DocumentTitle != null)
                {
                    hashCode = (hashCode * 59) + this.DocumentTitle.GetHashCode();
                }
                if (this.OtherIdentifiers != null)
                {
                    hashCode = (hashCode * 59) + this.OtherIdentifiers.GetHashCode();
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
