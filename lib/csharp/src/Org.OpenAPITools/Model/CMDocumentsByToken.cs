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
    /// CMDocumentsByToken
    /// </summary>
    [DataContract(Name = "CMDocumentsByToken")]
    public partial class CMDocumentsByToken : IEquatable<CMDocumentsByToken>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentsByToken" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentsByToken() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentsByToken" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="queryTokens">queryTokens (required).</param>
        /// <param name="pageSize">pageSize (required).</param>
        /// <param name="offset">offset (required).</param>
        public CMDocumentsByToken(string organisationId = default(string), string projectId = default(string), List<CMQueryToken> queryTokens = default(List<CMQueryToken>), int pageSize = default(int), long offset = default(long))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentsByToken and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMDocumentsByToken and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "queryTokens" is required (not null)
            if (queryTokens == null)
            {
                throw new ArgumentNullException("queryTokens is a required property for CMDocumentsByToken and cannot be null");
            }
            this.QueryTokens = queryTokens;
            this.PageSize = pageSize;
            this.Offset = offset;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets QueryTokens
        /// </summary>
        [DataMember(Name = "queryTokens", IsRequired = true, EmitDefaultValue = true)]
        public List<CMQueryToken> QueryTokens { get; set; }

        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [DataMember(Name = "pageSize", IsRequired = true, EmitDefaultValue = true)]
        public int PageSize { get; set; }

        /// <summary>
        /// Gets or Sets Offset
        /// </summary>
        [DataMember(Name = "offset", IsRequired = true, EmitDefaultValue = true)]
        public long Offset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentsByToken {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  QueryTokens: ").Append(QueryTokens).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
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
            return this.Equals(input as CMDocumentsByToken);
        }

        /// <summary>
        /// Returns true if CMDocumentsByToken instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentsByToken to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentsByToken input)
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
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.QueryTokens == input.QueryTokens ||
                    this.QueryTokens != null &&
                    input.QueryTokens != null &&
                    this.QueryTokens.SequenceEqual(input.QueryTokens)
                ) && 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
                ) && 
                (
                    this.Offset == input.Offset ||
                    this.Offset.Equals(input.Offset)
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
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.QueryTokens != null)
                {
                    hashCode = (hashCode * 59) + this.QueryTokens.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
                hashCode = (hashCode * 59) + this.Offset.GetHashCode();
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
