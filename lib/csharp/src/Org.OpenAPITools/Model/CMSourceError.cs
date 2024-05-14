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
    /// A source error object (if set) indicating something is wrong with the source.
    /// </summary>
    [DataContract(Name = "CMSourceError")]
    public partial class CMSourceError : IEquatable<CMSourceError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSourceError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSourceError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSourceError" /> class.
        /// </summary>
        /// <param name="message">The error message (required).</param>
        /// <param name="created">When this error was set, a unix date-time stamp (required).</param>
        public CMSourceError(string message = default(string), long created = default(long))
        {
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for CMSourceError and cannot be null");
            }
            this.Message = message;
            this.Created = created;
        }

        /// <summary>
        /// The error message
        /// </summary>
        /// <value>The error message</value>
        /// <example>something went wrong</example>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// When this error was set, a unix date-time stamp
        /// </summary>
        /// <value>When this error was set, a unix date-time stamp</value>
        /// <example>131231211</example>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public long Created { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSourceError {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
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
            return this.Equals(input as CMSourceError);
        }

        /// <summary>
        /// Returns true if CMSourceError instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSourceError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSourceError input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.Created == input.Created ||
                    this.Created.Equals(input.Created)
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
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Created.GetHashCode();
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
