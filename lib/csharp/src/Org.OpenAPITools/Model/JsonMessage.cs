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
    /// A generic SimSage message class used throughout the system.  This class can be used to either send a success message (information) or an error message (error) but will never send you both at the same time.  Version might not always be set but is the version of the service-layer you&#39;re communicating with.
    /// </summary>
    [DataContract(Name = "JsonMessage")]
    public partial class JsonMessage : IEquatable<JsonMessage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="JsonMessage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected JsonMessage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="JsonMessage" /> class.
        /// </summary>
        /// <param name="error">A possible error message, empty if information is set (required).</param>
        /// <param name="information">An informational message, empty if error is set (required).</param>
        /// <param name="varVersion">The version of this service (can be empty) (required).</param>
        /// <param name="time">The time this event occurred (required).</param>
        public JsonMessage(string error = default(string), string information = default(string), string varVersion = default(string), long time = default(long))
        {
            // to ensure "error" is required (not null)
            if (error == null)
            {
                throw new ArgumentNullException("error is a required property for JsonMessage and cannot be null");
            }
            this.Error = error;
            // to ensure "information" is required (not null)
            if (information == null)
            {
                throw new ArgumentNullException("information is a required property for JsonMessage and cannot be null");
            }
            this.Information = information;
            // to ensure "varVersion" is required (not null)
            if (varVersion == null)
            {
                throw new ArgumentNullException("varVersion is a required property for JsonMessage and cannot be null");
            }
            this.VarVersion = varVersion;
            this.Time = time;
        }

        /// <summary>
        /// A possible error message, empty if information is set
        /// </summary>
        /// <value>A possible error message, empty if information is set</value>
        /// <example>something went wrong (empty if information is set)</example>
        [DataMember(Name = "error", IsRequired = true, EmitDefaultValue = true)]
        public string Error { get; set; }

        /// <summary>
        /// An informational message, empty if error is set
        /// </summary>
        /// <value>An informational message, empty if error is set</value>
        /// <example>OK (empty if error is set)</example>
        [DataMember(Name = "information", IsRequired = true, EmitDefaultValue = true)]
        public string Information { get; set; }

        /// <summary>
        /// The version of this service (can be empty)
        /// </summary>
        /// <value>The version of this service (can be empty)</value>
        /// <example>5.0.0</example>
        [DataMember(Name = "version", IsRequired = true, EmitDefaultValue = true)]
        public string VarVersion { get; set; }

        /// <summary>
        /// The time this event occurred
        /// </summary>
        /// <value>The time this event occurred</value>
        /// <example>0</example>
        [DataMember(Name = "time", IsRequired = true, EmitDefaultValue = true)]
        public long Time { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class JsonMessage {\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  Information: ").Append(Information).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
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
            return this.Equals(input as JsonMessage);
        }

        /// <summary>
        /// Returns true if JsonMessage instances are equal
        /// </summary>
        /// <param name="input">Instance of JsonMessage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JsonMessage input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.Information == input.Information ||
                    (this.Information != null &&
                    this.Information.Equals(input.Information))
                ) && 
                (
                    this.VarVersion == input.VarVersion ||
                    (this.VarVersion != null &&
                    this.VarVersion.Equals(input.VarVersion))
                ) && 
                (
                    this.Time == input.Time ||
                    this.Time.Equals(input.Time)
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
                if (this.Error != null)
                {
                    hashCode = (hashCode * 59) + this.Error.GetHashCode();
                }
                if (this.Information != null)
                {
                    hashCode = (hashCode * 59) + this.Information.GetHashCode();
                }
                if (this.VarVersion != null)
                {
                    hashCode = (hashCode * 59) + this.VarVersion.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Time.GetHashCode();
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
