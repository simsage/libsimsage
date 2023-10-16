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
    /// the synonym object to update or create.  If it has no id, it will be created, otherwise SimSage will use it&#39;s id to find it and update it.
    /// </summary>
    [DataContract(Name = "CMSynonym")]
    public partial class CMSynonym : IEquatable<CMSynonym>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSynonym" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSynonym() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSynonym" /> class.
        /// </summary>
        /// <param name="id">A unique id for this synonym, an integer (required).</param>
        /// <param name="words">A csv list of words (per word with spaces and hyphens allowed) forming the synonyms (required).</param>
        public CMSynonym(string id = default(string), string words = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for CMSynonym and cannot be null");
            }
            this.Id = id;
            // to ensure "words" is required (not null)
            if (words == null)
            {
                throw new ArgumentNullException("words is a required property for CMSynonym and cannot be null");
            }
            this.Words = words;
        }

        /// <summary>
        /// A unique id for this synonym, an integer
        /// </summary>
        /// <value>A unique id for this synonym, an integer</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// A csv list of words (per word with spaces and hyphens allowed) forming the synonyms
        /// </summary>
        /// <value>A csv list of words (per word with spaces and hyphens allowed) forming the synonyms</value>
        /// <example>dog, canine, woof-woof</example>
        [DataMember(Name = "words", IsRequired = true, EmitDefaultValue = true)]
        public string Words { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSynonym {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Words: ").Append(Words).Append("\n");
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
            return this.Equals(input as CMSynonym);
        }

        /// <summary>
        /// Returns true if CMSynonym instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSynonym to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSynonym input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Words == input.Words ||
                    (this.Words != null &&
                    this.Words.Equals(input.Words))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Words != null)
                {
                    hashCode = (hashCode * 59) + this.Words.GetHashCode();
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