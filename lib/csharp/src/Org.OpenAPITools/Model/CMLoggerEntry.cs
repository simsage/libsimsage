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
    /// This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.
    /// </summary>
    [DataContract(Name = "CMLoggerEntry")]
    public partial class CMLoggerEntry : IEquatable<CMLoggerEntry>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMLoggerEntry" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMLoggerEntry() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMLoggerEntry" /> class.
        /// </summary>
        /// <param name="message">the main message of the log entry (required).</param>
        /// <param name="type">the type of log entry (eg. Debug, Info, Warn, Error) (required).</param>
        /// <param name="service">the name of the service that generated this log (required).</param>
        /// <param name="stackTrace">the stack traces if applicable (required).</param>
        /// <param name="created">unit date-time of this log (required).</param>
        public CMLoggerEntry(string message = default(string), string type = default(string), string service = default(string), string stackTrace = default(string), long created = default(long))
        {
            // to ensure "message" is required (not null)
            if (message == null)
            {
                throw new ArgumentNullException("message is a required property for CMLoggerEntry and cannot be null");
            }
            this.Message = message;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for CMLoggerEntry and cannot be null");
            }
            this.Type = type;
            // to ensure "service" is required (not null)
            if (service == null)
            {
                throw new ArgumentNullException("service is a required property for CMLoggerEntry and cannot be null");
            }
            this.Service = service;
            // to ensure "stackTrace" is required (not null)
            if (stackTrace == null)
            {
                throw new ArgumentNullException("stackTrace is a required property for CMLoggerEntry and cannot be null");
            }
            this.StackTrace = stackTrace;
            this.Created = created;
        }

        /// <summary>
        /// the main message of the log entry
        /// </summary>
        /// <value>the main message of the log entry</value>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = true)]
        public string Message { get; set; }

        /// <summary>
        /// the type of log entry (eg. Debug, Info, Warn, Error)
        /// </summary>
        /// <value>the type of log entry (eg. Debug, Info, Warn, Error)</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// the name of the service that generated this log
        /// </summary>
        /// <value>the name of the service that generated this log</value>
        [DataMember(Name = "service", IsRequired = true, EmitDefaultValue = true)]
        public string Service { get; set; }

        /// <summary>
        /// the stack traces if applicable
        /// </summary>
        /// <value>the stack traces if applicable</value>
        [DataMember(Name = "stackTrace", IsRequired = true, EmitDefaultValue = true)]
        public string StackTrace { get; set; }

        /// <summary>
        /// unit date-time of this log
        /// </summary>
        /// <value>unit date-time of this log</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public long Created { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMLoggerEntry {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Service: ").Append(Service).Append("\n");
            sb.Append("  StackTrace: ").Append(StackTrace).Append("\n");
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
            return this.Equals(input as CMLoggerEntry);
        }

        /// <summary>
        /// Returns true if CMLoggerEntry instances are equal
        /// </summary>
        /// <param name="input">Instance of CMLoggerEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMLoggerEntry input)
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
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Service == input.Service ||
                    (this.Service != null &&
                    this.Service.Equals(input.Service))
                ) && 
                (
                    this.StackTrace == input.StackTrace ||
                    (this.StackTrace != null &&
                    this.StackTrace.Equals(input.StackTrace))
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
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Service != null)
                {
                    hashCode = (hashCode * 59) + this.Service.GetHashCode();
                }
                if (this.StackTrace != null)
                {
                    hashCode = (hashCode * 59) + this.StackTrace.GetHashCode();
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
