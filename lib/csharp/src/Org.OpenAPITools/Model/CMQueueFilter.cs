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
    /// CMQueueFilter
    /// </summary>
    [DataContract(Name = "CMQueueFilter")]
    public partial class CMQueueFilter : IEquatable<CMQueueFilter>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueueFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMQueueFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueueFilter" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="page">page (required).</param>
        /// <param name="pageSize">pageSize (required).</param>
        /// <param name="sortDirection">sortDirection (required).</param>
        /// <param name="sortColumn">sortColumn (required).</param>
        /// <param name="showAll">showAll (required).</param>
        public CMQueueFilter(string organisationId = default(string), int page = default(int), int pageSize = default(int), int sortDirection = default(int), string sortColumn = default(string), bool showAll = default(bool))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMQueueFilter and cannot be null");
            }
            this.OrganisationId = organisationId;
            this.Page = page;
            this.PageSize = pageSize;
            this.SortDirection = sortDirection;
            // to ensure "sortColumn" is required (not null)
            if (sortColumn == null)
            {
                throw new ArgumentNullException("sortColumn is a required property for CMQueueFilter and cannot be null");
            }
            this.SortColumn = sortColumn;
            this.ShowAll = showAll;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

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
        /// Gets or Sets ShowAll
        /// </summary>
        [DataMember(Name = "showAll", IsRequired = true, EmitDefaultValue = true)]
        public bool ShowAll { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMQueueFilter {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  SortDirection: ").Append(SortDirection).Append("\n");
            sb.Append("  SortColumn: ").Append(SortColumn).Append("\n");
            sb.Append("  ShowAll: ").Append(ShowAll).Append("\n");
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
            return this.Equals(input as CMQueueFilter);
        }

        /// <summary>
        /// Returns true if CMQueueFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of CMQueueFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMQueueFilter input)
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
                    this.ShowAll == input.ShowAll ||
                    this.ShowAll.Equals(input.ShowAll)
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
                hashCode = (hashCode * 59) + this.Page.GetHashCode();
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
                hashCode = (hashCode * 59) + this.SortDirection.GetHashCode();
                if (this.SortColumn != null)
                {
                    hashCode = (hashCode * 59) + this.SortColumn.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ShowAll.GetHashCode();
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
