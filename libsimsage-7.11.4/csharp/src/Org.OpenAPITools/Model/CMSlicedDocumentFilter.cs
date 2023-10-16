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
    /// CMSlicedDocumentFilter
    /// </summary>
    [DataContract(Name = "CMSlicedDocumentFilter")]
    public partial class CMSlicedDocumentFilter : IEquatable<CMSlicedDocumentFilter>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSlicedDocumentFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSlicedDocumentFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSlicedDocumentFilter" /> class.
        /// </summary>
        /// <param name="page">page (required).</param>
        /// <param name="pageSize">pageSize (required).</param>
        /// <param name="sortDirection">sortDirection (required).</param>
        /// <param name="sortColumn">sortColumn (required).</param>
        /// <param name="statuses">statuses (required).</param>
        /// <param name="selectedUsers">selectedUsers (required).</param>
        /// <param name="selectedSources">selectedSources (required).</param>
        /// <param name="selectedConfidences">selectedConfidences (required).</param>
        public CMSlicedDocumentFilter(int page = default(int), int pageSize = default(int), int sortDirection = default(int), string sortColumn = default(string), List<string> statuses = default(List<string>), List<string> selectedUsers = default(List<string>), List<string> selectedSources = default(List<string>), List<string> selectedConfidences = default(List<string>))
        {
            this.Page = page;
            this.PageSize = pageSize;
            this.SortDirection = sortDirection;
            // to ensure "sortColumn" is required (not null)
            if (sortColumn == null)
            {
                throw new ArgumentNullException("sortColumn is a required property for CMSlicedDocumentFilter and cannot be null");
            }
            this.SortColumn = sortColumn;
            // to ensure "statuses" is required (not null)
            if (statuses == null)
            {
                throw new ArgumentNullException("statuses is a required property for CMSlicedDocumentFilter and cannot be null");
            }
            this.Statuses = statuses;
            // to ensure "selectedUsers" is required (not null)
            if (selectedUsers == null)
            {
                throw new ArgumentNullException("selectedUsers is a required property for CMSlicedDocumentFilter and cannot be null");
            }
            this.SelectedUsers = selectedUsers;
            // to ensure "selectedSources" is required (not null)
            if (selectedSources == null)
            {
                throw new ArgumentNullException("selectedSources is a required property for CMSlicedDocumentFilter and cannot be null");
            }
            this.SelectedSources = selectedSources;
            // to ensure "selectedConfidences" is required (not null)
            if (selectedConfidences == null)
            {
                throw new ArgumentNullException("selectedConfidences is a required property for CMSlicedDocumentFilter and cannot be null");
            }
            this.SelectedConfidences = selectedConfidences;
        }

        /// <summary>
        /// Gets or Sets Page
        /// </summary>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [DataMember(Name = "pageSize", IsRequired = true, EmitDefaultValue = true)]
        public int PageSize { get; set; }

        /// <summary>
        /// Gets or Sets SortDirection
        /// </summary>
        [DataMember(Name = "sortDirection", IsRequired = true, EmitDefaultValue = true)]
        public int SortDirection { get; set; }

        /// <summary>
        /// Gets or Sets SortColumn
        /// </summary>
        [DataMember(Name = "sortColumn", IsRequired = true, EmitDefaultValue = true)]
        public string SortColumn { get; set; }

        /// <summary>
        /// Gets or Sets Statuses
        /// </summary>
        [DataMember(Name = "statuses", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Statuses { get; set; }

        /// <summary>
        /// Gets or Sets SelectedUsers
        /// </summary>
        [DataMember(Name = "selectedUsers", IsRequired = true, EmitDefaultValue = true)]
        public List<string> SelectedUsers { get; set; }

        /// <summary>
        /// Gets or Sets SelectedSources
        /// </summary>
        [DataMember(Name = "selectedSources", IsRequired = true, EmitDefaultValue = true)]
        public List<string> SelectedSources { get; set; }

        /// <summary>
        /// Gets or Sets SelectedConfidences
        /// </summary>
        [DataMember(Name = "selectedConfidences", IsRequired = true, EmitDefaultValue = true)]
        public List<string> SelectedConfidences { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSlicedDocumentFilter {\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  SortDirection: ").Append(SortDirection).Append("\n");
            sb.Append("  SortColumn: ").Append(SortColumn).Append("\n");
            sb.Append("  Statuses: ").Append(Statuses).Append("\n");
            sb.Append("  SelectedUsers: ").Append(SelectedUsers).Append("\n");
            sb.Append("  SelectedSources: ").Append(SelectedSources).Append("\n");
            sb.Append("  SelectedConfidences: ").Append(SelectedConfidences).Append("\n");
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
            return this.Equals(input as CMSlicedDocumentFilter);
        }

        /// <summary>
        /// Returns true if CMSlicedDocumentFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSlicedDocumentFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSlicedDocumentFilter input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Page == input.Page ||
                    this.Page.Equals(input.Page)
                ) && 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
                ) && 
                (
                    this.SortDirection == input.SortDirection ||
                    this.SortDirection.Equals(input.SortDirection)
                ) && 
                (
                    this.SortColumn == input.SortColumn ||
                    (this.SortColumn != null &&
                    this.SortColumn.Equals(input.SortColumn))
                ) && 
                (
                    this.Statuses == input.Statuses ||
                    this.Statuses != null &&
                    input.Statuses != null &&
                    this.Statuses.SequenceEqual(input.Statuses)
                ) && 
                (
                    this.SelectedUsers == input.SelectedUsers ||
                    this.SelectedUsers != null &&
                    input.SelectedUsers != null &&
                    this.SelectedUsers.SequenceEqual(input.SelectedUsers)
                ) && 
                (
                    this.SelectedSources == input.SelectedSources ||
                    this.SelectedSources != null &&
                    input.SelectedSources != null &&
                    this.SelectedSources.SequenceEqual(input.SelectedSources)
                ) && 
                (
                    this.SelectedConfidences == input.SelectedConfidences ||
                    this.SelectedConfidences != null &&
                    input.SelectedConfidences != null &&
                    this.SelectedConfidences.SequenceEqual(input.SelectedConfidences)
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
                hashCode = (hashCode * 59) + this.Page.GetHashCode();
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
                hashCode = (hashCode * 59) + this.SortDirection.GetHashCode();
                if (this.SortColumn != null)
                {
                    hashCode = (hashCode * 59) + this.SortColumn.GetHashCode();
                }
                if (this.Statuses != null)
                {
                    hashCode = (hashCode * 59) + this.Statuses.GetHashCode();
                }
                if (this.SelectedUsers != null)
                {
                    hashCode = (hashCode * 59) + this.SelectedUsers.GetHashCode();
                }
                if (this.SelectedSources != null)
                {
                    hashCode = (hashCode * 59) + this.SelectedSources.GetHashCode();
                }
                if (this.SelectedConfidences != null)
                {
                    hashCode = (hashCode * 59) + this.SelectedConfidences.GetHashCode();
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
