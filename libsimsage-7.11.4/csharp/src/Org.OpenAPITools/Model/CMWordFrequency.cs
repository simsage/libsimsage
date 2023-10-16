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
    /// A word or piece of text with a frequency counter.
    /// </summary>
    [DataContract(Name = "CMWordFrequency")]
    public partial class CMWordFrequency : IEquatable<CMWordFrequency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMWordFrequency" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMWordFrequency() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMWordFrequency" /> class.
        /// </summary>
        /// <param name="word">the word (required).</param>
        /// <param name="frequency">its frequency (required).</param>
        public CMWordFrequency(string word = default(string), int frequency = default(int))
        {
            // to ensure "word" is required (not null)
            if (word == null)
            {
                throw new ArgumentNullException("word is a required property for CMWordFrequency and cannot be null");
            }
            this.Word = word;
            this.Frequency = frequency;
        }

        /// <summary>
        /// the word
        /// </summary>
        /// <value>the word</value>
        /// <example>test</example>
        [DataMember(Name = "word", IsRequired = true, EmitDefaultValue = true)]
        public string Word { get; set; }

        /// <summary>
        /// its frequency
        /// </summary>
        /// <value>its frequency</value>
        /// <example>10</example>
        [DataMember(Name = "frequency", IsRequired = true, EmitDefaultValue = true)]
        public int Frequency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMWordFrequency {\n");
            sb.Append("  Word: ").Append(Word).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
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
            return this.Equals(input as CMWordFrequency);
        }

        /// <summary>
        /// Returns true if CMWordFrequency instances are equal
        /// </summary>
        /// <param name="input">Instance of CMWordFrequency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMWordFrequency input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Word == input.Word ||
                    (this.Word != null &&
                    this.Word.Equals(input.Word))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    this.Frequency.Equals(input.Frequency)
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
                if (this.Word != null)
                {
                    hashCode = (hashCode * 59) + this.Word.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
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
