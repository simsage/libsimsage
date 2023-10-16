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
    /// This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.
    /// </summary>
    [DataContract(Name = "CMReturnStatistics")]
    public partial class CMReturnStatistics : IEquatable<CMReturnStatistics>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMReturnStatistics" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMReturnStatistics() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMReturnStatistics" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id) (required).</param>
        /// <param name="kbId">the knowledge-base id (its guid id) (required).</param>
        /// <param name="year">the year of the request (required).</param>
        /// <param name="month">the month of the request (required).</param>
        /// <param name="accessFrequency">A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month. (required).</param>
        /// <param name="queryWordFrequency">The top list of queries (the strings) and their frequencies (required).</param>
        /// <param name="generalStatistics">Some more general statistics (eg. number of documents) and their frequencies (required).</param>
        /// <param name="fileTypeStatistics">The breakdown of file-types (by file extension) and their frequencies (required).</param>
        public CMReturnStatistics(string organisationId = default(string), string kbId = default(string), int year = default(int), int month = default(int), int accessFrequency = default(int), Dictionary<string, int> queryWordFrequency = default(Dictionary<string, int>), Dictionary<string, long> generalStatistics = default(Dictionary<string, long>), Dictionary<string, int> fileTypeStatistics = default(Dictionary<string, int>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMReturnStatistics and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMReturnStatistics and cannot be null");
            }
            this.KbId = kbId;
            this.Year = year;
            this.Month = month;
            this.AccessFrequency = accessFrequency;
            // to ensure "queryWordFrequency" is required (not null)
            if (queryWordFrequency == null)
            {
                throw new ArgumentNullException("queryWordFrequency is a required property for CMReturnStatistics and cannot be null");
            }
            this.QueryWordFrequency = queryWordFrequency;
            // to ensure "generalStatistics" is required (not null)
            if (generalStatistics == null)
            {
                throw new ArgumentNullException("generalStatistics is a required property for CMReturnStatistics and cannot be null");
            }
            this.GeneralStatistics = generalStatistics;
            // to ensure "fileTypeStatistics" is required (not null)
            if (fileTypeStatistics == null)
            {
                throw new ArgumentNullException("fileTypeStatistics is a required property for CMReturnStatistics and cannot be null");
            }
            this.FileTypeStatistics = fileTypeStatistics;
        }

        /// <summary>
        /// the organisation (its guid id)
        /// </summary>
        /// <value>the organisation (its guid id)</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id (its guid id)
        /// </summary>
        /// <value>the knowledge-base id (its guid id)</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the year of the request
        /// </summary>
        /// <value>the year of the request</value>
        /// <example>2021</example>
        [DataMember(Name = "year", IsRequired = true, EmitDefaultValue = true)]
        public int Year { get; set; }

        /// <summary>
        /// the month of the request
        /// </summary>
        /// <value>the month of the request</value>
        /// <example>12</example>
        [DataMember(Name = "month", IsRequired = true, EmitDefaultValue = true)]
        public int Month { get; set; }

        /// <summary>
        /// A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month.
        /// </summary>
        /// <value>A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month.</value>
        /// <example>125</example>
        [DataMember(Name = "accessFrequency", IsRequired = true, EmitDefaultValue = true)]
        public int AccessFrequency { get; set; }

        /// <summary>
        /// The top list of queries (the strings) and their frequencies
        /// </summary>
        /// <value>The top list of queries (the strings) and their frequencies</value>
        /// <example>{&quot;what is SimSage&quot;:12}</example>
        [DataMember(Name = "queryWordFrequency", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, int> QueryWordFrequency { get; set; }

        /// <summary>
        /// Some more general statistics (eg. number of documents) and their frequencies
        /// </summary>
        /// <value>Some more general statistics (eg. number of documents) and their frequencies</value>
        /// <example>{&quot;numDocuments&quot;:3124}</example>
        [DataMember(Name = "generalStatistics", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, long> GeneralStatistics { get; set; }

        /// <summary>
        /// The breakdown of file-types (by file extension) and their frequencies
        /// </summary>
        /// <value>The breakdown of file-types (by file extension) and their frequencies</value>
        /// <example>{&quot;pdf&quot;:50,&quot;html&quot;:100}</example>
        [DataMember(Name = "fileTypeStatistics", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, int> FileTypeStatistics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMReturnStatistics {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
            sb.Append("  Month: ").Append(Month).Append("\n");
            sb.Append("  AccessFrequency: ").Append(AccessFrequency).Append("\n");
            sb.Append("  QueryWordFrequency: ").Append(QueryWordFrequency).Append("\n");
            sb.Append("  GeneralStatistics: ").Append(GeneralStatistics).Append("\n");
            sb.Append("  FileTypeStatistics: ").Append(FileTypeStatistics).Append("\n");
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
            return this.Equals(input as CMReturnStatistics);
        }

        /// <summary>
        /// Returns true if CMReturnStatistics instances are equal
        /// </summary>
        /// <param name="input">Instance of CMReturnStatistics to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMReturnStatistics input)
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
                    this.Year == input.Year ||
                    this.Year.Equals(input.Year)
                ) && 
                (
                    this.Month == input.Month ||
                    this.Month.Equals(input.Month)
                ) && 
                (
                    this.AccessFrequency == input.AccessFrequency ||
                    this.AccessFrequency.Equals(input.AccessFrequency)
                ) && 
                (
                    this.QueryWordFrequency == input.QueryWordFrequency ||
                    this.QueryWordFrequency != null &&
                    input.QueryWordFrequency != null &&
                    this.QueryWordFrequency.SequenceEqual(input.QueryWordFrequency)
                ) && 
                (
                    this.GeneralStatistics == input.GeneralStatistics ||
                    this.GeneralStatistics != null &&
                    input.GeneralStatistics != null &&
                    this.GeneralStatistics.SequenceEqual(input.GeneralStatistics)
                ) && 
                (
                    this.FileTypeStatistics == input.FileTypeStatistics ||
                    this.FileTypeStatistics != null &&
                    input.FileTypeStatistics != null &&
                    this.FileTypeStatistics.SequenceEqual(input.FileTypeStatistics)
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
                hashCode = (hashCode * 59) + this.Year.GetHashCode();
                hashCode = (hashCode * 59) + this.Month.GetHashCode();
                hashCode = (hashCode * 59) + this.AccessFrequency.GetHashCode();
                if (this.QueryWordFrequency != null)
                {
                    hashCode = (hashCode * 59) + this.QueryWordFrequency.GetHashCode();
                }
                if (this.GeneralStatistics != null)
                {
                    hashCode = (hashCode * 59) + this.GeneralStatistics.GetHashCode();
                }
                if (this.FileTypeStatistics != null)
                {
                    hashCode = (hashCode * 59) + this.FileTypeStatistics.GetHashCode();
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
