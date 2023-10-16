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
    /// CMStepConfig
    /// </summary>
    [DataContract(Name = "CMStepConfig")]
    public partial class CMStepConfig : IEquatable<CMStepConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMStepConfig" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMStepConfig() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMStepConfig" /> class.
        /// </summary>
        /// <param name="caption">caption (required).</param>
        /// <param name="config">config (required).</param>
        public CMStepConfig(string caption = default(string), Object config = default(Object))
        {
            // to ensure "caption" is required (not null)
            if (caption == null)
            {
                throw new ArgumentNullException("caption is a required property for CMStepConfig and cannot be null");
            }
            this.Caption = caption;
            // to ensure "config" is required (not null)
            if (config == null)
            {
                throw new ArgumentNullException("config is a required property for CMStepConfig and cannot be null");
            }
            this.Config = config;
        }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name = "caption", IsRequired = true, EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets Config
        /// </summary>
        [DataMember(Name = "config", IsRequired = true, EmitDefaultValue = true)]
        public Object Config { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMStepConfig {\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Config: ").Append(Config).Append("\n");
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
            return this.Equals(input as CMStepConfig);
        }

        /// <summary>
        /// Returns true if CMStepConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of CMStepConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMStepConfig input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.Config == input.Config ||
                    (this.Config != null &&
                    this.Config.Equals(input.Config))
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
                if (this.Caption != null)
                {
                    hashCode = (hashCode * 59) + this.Caption.GetHashCode();
                }
                if (this.Config != null)
                {
                    hashCode = (hashCode * 59) + this.Config.GetHashCode();
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
