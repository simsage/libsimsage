/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
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
    /// OptimizeIndexesGetReportCmd
    /// </summary>
    [DataContract(Name = "OptimizeIndexesGetReportCmd")]
    public partial class OptimizeIndexesGetReportCmd : IEquatable<OptimizeIndexesGetReportCmd>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizeIndexesGetReportCmd" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OptimizeIndexesGetReportCmd() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizeIndexesGetReportCmd" /> class.
        /// </summary>
        /// <param name="jobId">jobId (required).</param>
        /// <param name="returnAddress">returnAddress (required).</param>
        /// <param name="errorStr">errorStr (required).</param>
        /// <param name="timeOut">timeOut (required).</param>
        /// <param name="async">async (required).</param>
        /// <param name="isReturnResult">isReturnResult (required).</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="kbId">kbId (required).</param>
        /// <param name="id">id (required).</param>
        /// <param name="numberOfShards">numberOfShards (required).</param>
        /// <param name="numUrls">numUrls (required).</param>
        /// <param name="indexSet">indexSet (required).</param>
        /// <param name="numUrlsRemoved">numUrlsRemoved (required).</param>
        /// <param name="totalOffsets">totalOffsets (required).</param>
        /// <param name="metadataItemCount">metadataItemCount (required).</param>
        /// <param name="numberOfTotalIndexes">numberOfTotalIndexes (required).</param>
        /// <param name="numOptimizedIndexes">numOptimizedIndexes (required).</param>
        /// <param name="numIndexesRemoved">numIndexesRemoved (required).</param>
        /// <param name="numOptimizedRemoved">numOptimizedRemoved (required).</param>
        /// <param name="numIndexesUpToDate">numIndexesUpToDate (required).</param>
        /// <param name="byteSize">byteSize (required).</param>
        /// <param name="returnResult">returnResult.</param>
        public OptimizeIndexesGetReportCmd(string jobId = default(string), string returnAddress = default(string), string errorStr = default(string), long timeOut = default(long), bool async = default(bool), bool isReturnResult = default(bool), string organisationId = default(string), string kbId = default(string), long id = default(long), int numberOfShards = default(int), int numUrls = default(int), int indexSet = default(int), int numUrlsRemoved = default(int), long totalOffsets = default(long), int metadataItemCount = default(int), int numberOfTotalIndexes = default(int), int numOptimizedIndexes = default(int), int numIndexesRemoved = default(int), int numOptimizedRemoved = default(int), int numIndexesUpToDate = default(int), long byteSize = default(long), bool returnResult = default(bool))
        {
            // to ensure "jobId" is required (not null)
            if (jobId == null)
            {
                throw new ArgumentNullException("jobId is a required property for OptimizeIndexesGetReportCmd and cannot be null");
            }
            this.JobId = jobId;
            // to ensure "returnAddress" is required (not null)
            if (returnAddress == null)
            {
                throw new ArgumentNullException("returnAddress is a required property for OptimizeIndexesGetReportCmd and cannot be null");
            }
            this.ReturnAddress = returnAddress;
            // to ensure "errorStr" is required (not null)
            if (errorStr == null)
            {
                throw new ArgumentNullException("errorStr is a required property for OptimizeIndexesGetReportCmd and cannot be null");
            }
            this.ErrorStr = errorStr;
            this.TimeOut = timeOut;
            this.Async = async;
            this.IsReturnResult = isReturnResult;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for OptimizeIndexesGetReportCmd and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for OptimizeIndexesGetReportCmd and cannot be null");
            }
            this.KbId = kbId;
            this.Id = id;
            this.NumberOfShards = numberOfShards;
            this.NumUrls = numUrls;
            this.IndexSet = indexSet;
            this.NumUrlsRemoved = numUrlsRemoved;
            this.TotalOffsets = totalOffsets;
            this.MetadataItemCount = metadataItemCount;
            this.NumberOfTotalIndexes = numberOfTotalIndexes;
            this.NumOptimizedIndexes = numOptimizedIndexes;
            this.NumIndexesRemoved = numIndexesRemoved;
            this.NumOptimizedRemoved = numOptimizedRemoved;
            this.NumIndexesUpToDate = numIndexesUpToDate;
            this.ByteSize = byteSize;
            this.ReturnResult = returnResult;
        }

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
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public long Id { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfShards
        /// </summary>
        [DataMember(Name = "numberOfShards", IsRequired = true, EmitDefaultValue = true)]
        public int NumberOfShards { get; set; }

        /// <summary>
        /// Gets or Sets NumUrls
        /// </summary>
        [DataMember(Name = "numUrls", IsRequired = true, EmitDefaultValue = true)]
        public int NumUrls { get; set; }

        /// <summary>
        /// Gets or Sets IndexSet
        /// </summary>
        [DataMember(Name = "indexSet", IsRequired = true, EmitDefaultValue = true)]
        public int IndexSet { get; set; }

        /// <summary>
        /// Gets or Sets NumUrlsRemoved
        /// </summary>
        [DataMember(Name = "numUrlsRemoved", IsRequired = true, EmitDefaultValue = true)]
        public int NumUrlsRemoved { get; set; }

        /// <summary>
        /// Gets or Sets TotalOffsets
        /// </summary>
        [DataMember(Name = "totalOffsets", IsRequired = true, EmitDefaultValue = true)]
        public long TotalOffsets { get; set; }

        /// <summary>
        /// Gets or Sets MetadataItemCount
        /// </summary>
        [DataMember(Name = "metadataItemCount", IsRequired = true, EmitDefaultValue = true)]
        public int MetadataItemCount { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfTotalIndexes
        /// </summary>
        [DataMember(Name = "numberOfTotalIndexes", IsRequired = true, EmitDefaultValue = true)]
        public int NumberOfTotalIndexes { get; set; }

        /// <summary>
        /// Gets or Sets NumOptimizedIndexes
        /// </summary>
        [DataMember(Name = "numOptimizedIndexes", IsRequired = true, EmitDefaultValue = true)]
        public int NumOptimizedIndexes { get; set; }

        /// <summary>
        /// Gets or Sets NumIndexesRemoved
        /// </summary>
        [DataMember(Name = "numIndexesRemoved", IsRequired = true, EmitDefaultValue = true)]
        public int NumIndexesRemoved { get; set; }

        /// <summary>
        /// Gets or Sets NumOptimizedRemoved
        /// </summary>
        [DataMember(Name = "numOptimizedRemoved", IsRequired = true, EmitDefaultValue = true)]
        public int NumOptimizedRemoved { get; set; }

        /// <summary>
        /// Gets or Sets NumIndexesUpToDate
        /// </summary>
        [DataMember(Name = "numIndexesUpToDate", IsRequired = true, EmitDefaultValue = true)]
        public int NumIndexesUpToDate { get; set; }

        /// <summary>
        /// Gets or Sets ByteSize
        /// </summary>
        [DataMember(Name = "byteSize", IsRequired = true, EmitDefaultValue = true)]
        public long ByteSize { get; set; }

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
            sb.Append("class OptimizeIndexesGetReportCmd {\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  ReturnAddress: ").Append(ReturnAddress).Append("\n");
            sb.Append("  ErrorStr: ").Append(ErrorStr).Append("\n");
            sb.Append("  TimeOut: ").Append(TimeOut).Append("\n");
            sb.Append("  Async: ").Append(Async).Append("\n");
            sb.Append("  IsReturnResult: ").Append(IsReturnResult).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  NumberOfShards: ").Append(NumberOfShards).Append("\n");
            sb.Append("  NumUrls: ").Append(NumUrls).Append("\n");
            sb.Append("  IndexSet: ").Append(IndexSet).Append("\n");
            sb.Append("  NumUrlsRemoved: ").Append(NumUrlsRemoved).Append("\n");
            sb.Append("  TotalOffsets: ").Append(TotalOffsets).Append("\n");
            sb.Append("  MetadataItemCount: ").Append(MetadataItemCount).Append("\n");
            sb.Append("  NumberOfTotalIndexes: ").Append(NumberOfTotalIndexes).Append("\n");
            sb.Append("  NumOptimizedIndexes: ").Append(NumOptimizedIndexes).Append("\n");
            sb.Append("  NumIndexesRemoved: ").Append(NumIndexesRemoved).Append("\n");
            sb.Append("  NumOptimizedRemoved: ").Append(NumOptimizedRemoved).Append("\n");
            sb.Append("  NumIndexesUpToDate: ").Append(NumIndexesUpToDate).Append("\n");
            sb.Append("  ByteSize: ").Append(ByteSize).Append("\n");
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
            return this.Equals(input as OptimizeIndexesGetReportCmd);
        }

        /// <summary>
        /// Returns true if OptimizeIndexesGetReportCmd instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizeIndexesGetReportCmd to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizeIndexesGetReportCmd input)
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
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.NumberOfShards == input.NumberOfShards ||
                    this.NumberOfShards.Equals(input.NumberOfShards)
                ) && 
                (
                    this.NumUrls == input.NumUrls ||
                    this.NumUrls.Equals(input.NumUrls)
                ) && 
                (
                    this.IndexSet == input.IndexSet ||
                    this.IndexSet.Equals(input.IndexSet)
                ) && 
                (
                    this.NumUrlsRemoved == input.NumUrlsRemoved ||
                    this.NumUrlsRemoved.Equals(input.NumUrlsRemoved)
                ) && 
                (
                    this.TotalOffsets == input.TotalOffsets ||
                    this.TotalOffsets.Equals(input.TotalOffsets)
                ) && 
                (
                    this.MetadataItemCount == input.MetadataItemCount ||
                    this.MetadataItemCount.Equals(input.MetadataItemCount)
                ) && 
                (
                    this.NumberOfTotalIndexes == input.NumberOfTotalIndexes ||
                    this.NumberOfTotalIndexes.Equals(input.NumberOfTotalIndexes)
                ) && 
                (
                    this.NumOptimizedIndexes == input.NumOptimizedIndexes ||
                    this.NumOptimizedIndexes.Equals(input.NumOptimizedIndexes)
                ) && 
                (
                    this.NumIndexesRemoved == input.NumIndexesRemoved ||
                    this.NumIndexesRemoved.Equals(input.NumIndexesRemoved)
                ) && 
                (
                    this.NumOptimizedRemoved == input.NumOptimizedRemoved ||
                    this.NumOptimizedRemoved.Equals(input.NumOptimizedRemoved)
                ) && 
                (
                    this.NumIndexesUpToDate == input.NumIndexesUpToDate ||
                    this.NumIndexesUpToDate.Equals(input.NumIndexesUpToDate)
                ) && 
                (
                    this.ByteSize == input.ByteSize ||
                    this.ByteSize.Equals(input.ByteSize)
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
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.KbId != null)
                {
                    hashCode = (hashCode * 59) + this.KbId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfShards.GetHashCode();
                hashCode = (hashCode * 59) + this.NumUrls.GetHashCode();
                hashCode = (hashCode * 59) + this.IndexSet.GetHashCode();
                hashCode = (hashCode * 59) + this.NumUrlsRemoved.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalOffsets.GetHashCode();
                hashCode = (hashCode * 59) + this.MetadataItemCount.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberOfTotalIndexes.GetHashCode();
                hashCode = (hashCode * 59) + this.NumOptimizedIndexes.GetHashCode();
                hashCode = (hashCode * 59) + this.NumIndexesRemoved.GetHashCode();
                hashCode = (hashCode * 59) + this.NumOptimizedRemoved.GetHashCode();
                hashCode = (hashCode * 59) + this.NumIndexesUpToDate.GetHashCode();
                hashCode = (hashCode * 59) + this.ByteSize.GetHashCode();
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
