/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
    /// CMSearchResultSummaryTask
    /// </summary>
    [DataContract(Name = "CMSearchResultSummaryTask")]
    public partial class CMSearchResultSummaryTask : IEquatable<CMSearchResultSummaryTask>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResultSummaryTask" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSearchResultSummaryTask() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSearchResultSummaryTask" /> class.
        /// </summary>
        /// <param name="taskInfo">taskInfo (required).</param>
        /// <param name="detail">detail (required).</param>
        public CMSearchResultSummaryTask(CMTaskInfo taskInfo = default(CMTaskInfo), CMSearchResultSummary detail = default(CMSearchResultSummary))
        {
            // to ensure "taskInfo" is required (not null)
            if (taskInfo == null)
            {
                throw new ArgumentNullException("taskInfo is a required property for CMSearchResultSummaryTask and cannot be null");
            }
            this.TaskInfo = taskInfo;
            // to ensure "detail" is required (not null)
            if (detail == null)
            {
                throw new ArgumentNullException("detail is a required property for CMSearchResultSummaryTask and cannot be null");
            }
            this.Detail = detail;
        }

        /// <summary>
        /// Gets or Sets TaskInfo
        /// </summary>
        [DataMember(Name = "taskInfo", IsRequired = true, EmitDefaultValue = true)]
        public CMTaskInfo TaskInfo { get; set; }

        /// <summary>
        /// Gets or Sets Detail
        /// </summary>
        [DataMember(Name = "detail", IsRequired = true, EmitDefaultValue = true)]
        public CMSearchResultSummary Detail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSearchResultSummaryTask {\n");
            sb.Append("  TaskInfo: ").Append(TaskInfo).Append("\n");
            sb.Append("  Detail: ").Append(Detail).Append("\n");
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
            return this.Equals(input as CMSearchResultSummaryTask);
        }

        /// <summary>
        /// Returns true if CMSearchResultSummaryTask instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSearchResultSummaryTask to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSearchResultSummaryTask input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TaskInfo == input.TaskInfo ||
                    (this.TaskInfo != null &&
                    this.TaskInfo.Equals(input.TaskInfo))
                ) && 
                (
                    this.Detail == input.Detail ||
                    (this.Detail != null &&
                    this.Detail.Equals(input.Detail))
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
                if (this.TaskInfo != null)
                {
                    hashCode = (hashCode * 59) + this.TaskInfo.GetHashCode();
                }
                if (this.Detail != null)
                {
                    hashCode = (hashCode * 59) + this.Detail.GetHashCode();
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
