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
    /// A multiple document summarization result.  Multi Document Summarization (MSD) uses SimSage&#39;s graph to create relevant extracts of series of documents matching a specific query.
    /// </summary>
    [DataContract(Name = "CMDParagraphSummary")]
    public partial class CMDParagraphSummary : IEquatable<CMDParagraphSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDParagraphSummary" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDParagraphSummary() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDParagraphSummary" /> class.
        /// </summary>
        /// <param name="url">the url this text came from (required).</param>
        /// <param name="text">a paragraph of text (required).</param>
        /// <param name="score">the score relative to the others of this sentence (required).</param>
        public CMDParagraphSummary(string url = default(string), string text = default(string), float score = default(float))
        {
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDParagraphSummary and cannot be null");
            }
            this.Url = url;
            // to ensure "text" is required (not null)
            if (text == null)
            {
                throw new ArgumentNullException("text is a required property for CMDParagraphSummary and cannot be null");
            }
            this.Text = text;
            this.Score = score;
        }

        /// <summary>
        /// the url this text came from
        /// </summary>
        /// <value>the url this text came from</value>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// a paragraph of text
        /// </summary>
        /// <value>a paragraph of text</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = true)]
        public string Text { get; set; }

        /// <summary>
        /// the score relative to the others of this sentence
        /// </summary>
        /// <value>the score relative to the others of this sentence</value>
        [DataMember(Name = "score", IsRequired = true, EmitDefaultValue = true)]
        public float Score { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDParagraphSummary {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
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
            return this.Equals(input as CMDParagraphSummary);
        }

        /// <summary>
        /// Returns true if CMDParagraphSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDParagraphSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDParagraphSummary input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Text == input.Text ||
                    (this.Text != null &&
                    this.Text.Equals(input.Text))
                ) && 
                (
                    this.Score == input.Score ||
                    this.Score.Equals(input.Score)
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.Text != null)
                {
                    hashCode = (hashCode * 59) + this.Text.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Score.GetHashCode();
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
