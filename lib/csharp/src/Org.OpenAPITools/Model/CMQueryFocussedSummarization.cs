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
    /// A document summarization result (Multi Document Summarization)
    /// </summary>
    [DataContract(Name = "CMQueryFocussedSummarization")]
    public partial class CMQueryFocussedSummarization : IEquatable<CMQueryFocussedSummarization>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueryFocussedSummarization" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMQueryFocussedSummarization() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueryFocussedSummarization" /> class.
        /// </summary>
        /// <param name="summary">the list of summary items (required).</param>
        /// <param name="message">a possible return message if not empty (required).</param>
        public CMQueryFocussedSummarization(List<CMDParagraphSummary> summary = default(List<CMDParagraphSummary>), string message = default(string))
        {
            // to ensure "summary" is required (not null)
            if (summary == null)
            {
                throw new ArgumentNullException("summary is a required property for CMQueryFocussedSummarization and cannot be null");
            }
            this.Summary = summary;
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for CMQueryFocussedSummarization and cannot be null");
            }
            this.Message = message;
        }

        /// <summary>
        /// the list of summary items
        /// </summary>
        /// <value>the list of summary items</value>
        [DataMember(Name = "summary", IsRequired = true, EmitDefaultValue = true)]
        public List<CMDParagraphSummary> Summary { get; set; }

        /// <summary>
        /// a possible return message if not empty
        /// </summary>
        /// <value>a possible return message if not empty</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMQueryFocussedSummarization {\n");
            sb.Append("  Summary: ").Append(Summary).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
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
            return this.Equals(input as CMQueryFocussedSummarization);
        }

        /// <summary>
        /// Returns true if CMQueryFocussedSummarization instances are equal
        /// </summary>
        /// <param name="input">Instance of CMQueryFocussedSummarization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMQueryFocussedSummarization input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Summary == input.Summary ||
                    this.Summary != null &&
                    input.Summary != null &&
                    this.Summary.SequenceEqual(input.Summary)
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
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
                if (this.Summary != null)
                {
                    hashCode = (hashCode * 59) + this.Summary.GetHashCode();
                }
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
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
