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
    /// CMProjectInfo
    /// </summary>
    [DataContract(Name = "CMProjectInfo")]
    public partial class CMProjectInfo : IEquatable<CMProjectInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMProjectInfo" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMProjectInfo() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMProjectInfo" /> class.
        /// </summary>
        /// <param name="key">key (required).</param>
        /// <param name="caption">caption (required).</param>
        /// <param name="description">description (required).</param>
        /// <param name="search">search (required).</param>
        /// <param name="steps">steps (required).</param>
        /// <param name="sliceActions">sliceActions (required).</param>
        /// <param name="screenConfigs">screenConfigs (required).</param>
        public CMProjectInfo(string key = default(string), string caption = default(string), string description = default(string), CMSearchDefinition search = default(CMSearchDefinition), List<CMStepConfig> steps = default(List<CMStepConfig>), Dictionary<string, string> sliceActions = default(Dictionary<string, string>), Dictionary<string, Dictionary<string, Object>> screenConfigs = default(Dictionary<string, Dictionary<string, Object>>))
        {
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for CMProjectInfo and cannot be null");
            }
            this.Key = key;
            // to ensure "caption" is required (not null)
            if (caption == null)
            {
                throw new ArgumentNullException("caption is a required property for CMProjectInfo and cannot be null");
            }
            this.Caption = caption;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for CMProjectInfo and cannot be null");
            }
            this.Description = description;
            // to ensure "search" is required (not null)
            if (search == null)
            {
                throw new ArgumentNullException("search is a required property for CMProjectInfo and cannot be null");
            }
            this.Search = search;
            // to ensure "steps" is required (not null)
            if (steps == null)
            {
                throw new ArgumentNullException("steps is a required property for CMProjectInfo and cannot be null");
            }
            this.Steps = steps;
            // to ensure "sliceActions" is required (not null)
            if (sliceActions == null)
            {
                throw new ArgumentNullException("sliceActions is a required property for CMProjectInfo and cannot be null");
            }
            this.SliceActions = sliceActions;
            // to ensure "screenConfigs" is required (not null)
            if (screenConfigs == null)
            {
                throw new ArgumentNullException("screenConfigs is a required property for CMProjectInfo and cannot be null");
            }
            this.ScreenConfigs = screenConfigs;
        }

        /// <summary>
        /// Gets or Sets Key
        /// </summary>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets Caption
        /// </summary>
        [DataMember(Name = "caption", IsRequired = true, EmitDefaultValue = true)]
        public string Caption { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Search
        /// </summary>
        [DataMember(Name = "search", IsRequired = true, EmitDefaultValue = true)]
        public CMSearchDefinition Search { get; set; }

        /// <summary>
        /// Gets or Sets Steps
        /// </summary>
        [DataMember(Name = "steps", IsRequired = true, EmitDefaultValue = true)]
        public List<CMStepConfig> Steps { get; set; }

        /// <summary>
        /// Gets or Sets SliceActions
        /// </summary>
        [DataMember(Name = "sliceActions", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, string> SliceActions { get; set; }

        /// <summary>
        /// Gets or Sets ScreenConfigs
        /// </summary>
        [DataMember(Name = "screenConfigs", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, Dictionary<string, Object>> ScreenConfigs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMProjectInfo {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Caption: ").Append(Caption).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Search: ").Append(Search).Append("\n");
            sb.Append("  Steps: ").Append(Steps).Append("\n");
            sb.Append("  SliceActions: ").Append(SliceActions).Append("\n");
            sb.Append("  ScreenConfigs: ").Append(ScreenConfigs).Append("\n");
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
            return this.Equals(input as CMProjectInfo);
        }

        /// <summary>
        /// Returns true if CMProjectInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of CMProjectInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMProjectInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Caption == input.Caption ||
                    (this.Caption != null &&
                    this.Caption.Equals(input.Caption))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Search == input.Search ||
                    (this.Search != null &&
                    this.Search.Equals(input.Search))
                ) && 
                (
                    this.Steps == input.Steps ||
                    this.Steps != null &&
                    input.Steps != null &&
                    this.Steps.SequenceEqual(input.Steps)
                ) && 
                (
                    this.SliceActions == input.SliceActions ||
                    this.SliceActions != null &&
                    input.SliceActions != null &&
                    this.SliceActions.SequenceEqual(input.SliceActions)
                ) && 
                (
                    this.ScreenConfigs == input.ScreenConfigs ||
                    this.ScreenConfigs != null &&
                    input.ScreenConfigs != null &&
                    this.ScreenConfigs.SequenceEqual(input.ScreenConfigs)
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
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                if (this.Caption != null)
                {
                    hashCode = (hashCode * 59) + this.Caption.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Search != null)
                {
                    hashCode = (hashCode * 59) + this.Search.GetHashCode();
                }
                if (this.Steps != null)
                {
                    hashCode = (hashCode * 59) + this.Steps.GetHashCode();
                }
                if (this.SliceActions != null)
                {
                    hashCode = (hashCode * 59) + this.SliceActions.GetHashCode();
                }
                if (this.ScreenConfigs != null)
                {
                    hashCode = (hashCode * 59) + this.ScreenConfigs.GetHashCode();
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