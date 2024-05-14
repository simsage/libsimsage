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
    /// a progress/status item from the async command queue
    /// </summary>
    [DataContract(Name = "CMCommandQueueItem")]
    public partial class CMCommandQueueItem : IEquatable<CMCommandQueueItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMCommandQueueItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMCommandQueueItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMCommandQueueItem" /> class.
        /// </summary>
        /// <param name="jobId">the job-id, primary key (required).</param>
        /// <param name="key">the name of the lock (required).</param>
        /// <param name="expiry">when this lock will expire as a Unix date-time (required).</param>
        public CMCommandQueueItem(string jobId = default(string), string key = default(string), long expiry = default(long))
        {
            // to ensure "jobId" is required (not null)
            if (jobId == null)
            {
                throw new ArgumentNullException("jobId is a required property for CMCommandQueueItem and cannot be null");
            }
            this.JobId = jobId;
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for CMCommandQueueItem and cannot be null");
            }
            this.Key = key;
            this.Expiry = expiry;
        }

        /// <summary>
        /// the job-id, primary key
        /// </summary>
        /// <value>the job-id, primary key</value>
        [DataMember(Name = "jobId", IsRequired = true, EmitDefaultValue = true)]
        public string JobId { get; set; }

        /// <summary>
        /// the name of the lock
        /// </summary>
        /// <value>the name of the lock</value>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// when this lock will expire as a Unix date-time
        /// </summary>
        /// <value>when this lock will expire as a Unix date-time</value>
        [DataMember(Name = "expiry", IsRequired = true, EmitDefaultValue = true)]
        public long Expiry { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMCommandQueueItem {\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Expiry: ").Append(Expiry).Append("\n");
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
            return this.Equals(input as CMCommandQueueItem);
        }

        /// <summary>
        /// Returns true if CMCommandQueueItem instances are equal
        /// </summary>
        /// <param name="input">Instance of CMCommandQueueItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMCommandQueueItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.JobId == input.JobId ||
                    (this.JobId != null &&
                    this.JobId.Equals(input.JobId))
                ) && 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Expiry == input.Expiry ||
                    this.Expiry.Equals(input.Expiry)
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
                if (this.JobId != null)
                {
                    hashCode = (hashCode * 59) + this.JobId.GetHashCode();
                }
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Expiry.GetHashCode();
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
