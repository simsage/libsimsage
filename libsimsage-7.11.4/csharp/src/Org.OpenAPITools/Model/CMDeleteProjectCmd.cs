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
    /// CMDeleteProjectCmd
    /// </summary>
    [DataContract(Name = "CMDeleteProjectCmd")]
    public partial class CMDeleteProjectCmd : IEquatable<CMDeleteProjectCmd>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDeleteProjectCmd" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDeleteProjectCmd() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDeleteProjectCmd" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="kbId">kbId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="jobId">jobId (required).</param>
        /// <param name="returnAddress">returnAddress (required).</param>
        /// <param name="errorStr">errorStr (required).</param>
        /// <param name="timeOut">timeOut (required).</param>
        /// <param name="async">async (required).</param>
        /// <param name="isReturnResult">isReturnResult (required).</param>
        /// <param name="returnResult">returnResult.</param>
        public CMDeleteProjectCmd(string organisationId = default(string), string kbId = default(string), string projectId = default(string), string jobId = default(string), string returnAddress = default(string), string errorStr = default(string), long timeOut = default(long), bool async = default(bool), bool isReturnResult = default(bool), bool returnResult = default(bool))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "jobId" is required (not null)
            if (jobId == null)
            {
                throw new ArgumentNullException("jobId is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.JobId = jobId;
            // to ensure "returnAddress" is required (not null)
            if (returnAddress == null)
            {
                throw new ArgumentNullException("returnAddress is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.ReturnAddress = returnAddress;
            // to ensure "errorStr" is required (not null)
            if (errorStr == null)
            {
                throw new ArgumentNullException("errorStr is a required property for CMDeleteProjectCmd and cannot be null");
            }
            this.ErrorStr = errorStr;
            this.TimeOut = timeOut;
            this.Async = async;
            this.IsReturnResult = isReturnResult;
            this.ReturnResult = returnResult;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets KbId
        /// </summary>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets JobId
        /// </summary>
        [DataMember(Name = "jobId", IsRequired = true, EmitDefaultValue = true)]
        public string JobId { get; set; }

        /// <summary>
        /// Gets or Sets ReturnAddress
        /// </summary>
        [DataMember(Name = "returnAddress", IsRequired = true, EmitDefaultValue = true)]
        public string ReturnAddress { get; set; }

        /// <summary>
        /// Gets or Sets ErrorStr
        /// </summary>
        [DataMember(Name = "errorStr", IsRequired = true, EmitDefaultValue = true)]
        public string ErrorStr { get; set; }

        /// <summary>
        /// Gets or Sets TimeOut
        /// </summary>
        [DataMember(Name = "timeOut", IsRequired = true, EmitDefaultValue = true)]
        public long TimeOut { get; set; }

        /// <summary>
        /// Gets or Sets Async
        /// </summary>
        [DataMember(Name = "async", IsRequired = true, EmitDefaultValue = true)]
        public bool Async { get; set; }

        /// <summary>
        /// Gets or Sets IsReturnResult
        /// </summary>
        [DataMember(Name = "isReturnResult", IsRequired = true, EmitDefaultValue = true)]
        public bool IsReturnResult { get; set; }

        /// <summary>
        /// Gets or Sets ReturnResult
        /// </summary>
        [DataMember(Name = "returnResult", EmitDefaultValue = true)]
        public bool ReturnResult { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDeleteProjectCmd {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  ReturnAddress: ").Append(ReturnAddress).Append("\n");
            sb.Append("  ErrorStr: ").Append(ErrorStr).Append("\n");
            sb.Append("  TimeOut: ").Append(TimeOut).Append("\n");
            sb.Append("  Async: ").Append(Async).Append("\n");
            sb.Append("  IsReturnResult: ").Append(IsReturnResult).Append("\n");
            sb.Append("  ReturnResult: ").Append(ReturnResult).Append("\n");
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
            return this.Equals(input as CMDeleteProjectCmd);
        }

        /// <summary>
        /// Returns true if CMDeleteProjectCmd instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDeleteProjectCmd to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDeleteProjectCmd input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OrganisationId == input.OrganisationId ||
                    (this.OrganisationId != null &&
                    this.OrganisationId.Equals(input.OrganisationId))
                ) && 
                (
                    this.KbId == input.KbId ||
                    (this.KbId != null &&
                    this.KbId.Equals(input.KbId))
                ) && 
                (
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.JobId == input.JobId ||
                    (this.JobId != null &&
                    this.JobId.Equals(input.JobId))
                ) && 
                (
                    this.ReturnAddress == input.ReturnAddress ||
                    (this.ReturnAddress != null &&
                    this.ReturnAddress.Equals(input.ReturnAddress))
                ) && 
                (
                    this.ErrorStr == input.ErrorStr ||
                    (this.ErrorStr != null &&
                    this.ErrorStr.Equals(input.ErrorStr))
                ) && 
                (
                    this.TimeOut == input.TimeOut ||
                    this.TimeOut.Equals(input.TimeOut)
                ) && 
                (
                    this.Async == input.Async ||
                    this.Async.Equals(input.Async)
                ) && 
                (
                    this.IsReturnResult == input.IsReturnResult ||
                    this.IsReturnResult.Equals(input.IsReturnResult)
                ) && 
                (
                    this.ReturnResult == input.ReturnResult ||
                    this.ReturnResult.Equals(input.ReturnResult)
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
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.KbId != null)
                {
                    hashCode = (hashCode * 59) + this.KbId.GetHashCode();
                }
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.JobId != null)
                {
                    hashCode = (hashCode * 59) + this.JobId.GetHashCode();
                }
                if (this.ReturnAddress != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnAddress.GetHashCode();
                }
                if (this.ErrorStr != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorStr.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TimeOut.GetHashCode();
                hashCode = (hashCode * 59) + this.Async.GetHashCode();
                hashCode = (hashCode * 59) + this.IsReturnResult.GetHashCode();
                hashCode = (hashCode * 59) + this.ReturnResult.GetHashCode();
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