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
    /// A semantic pagination object.
    /// </summary>
    [DataContract(Name = "CMSemanticsPaginated")]
    public partial class CMSemanticsPaginated : IEquatable<CMSemanticsPaginated>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticsPaginated" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSemanticsPaginated() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticsPaginated" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id). (required).</param>
        /// <param name="kbId">the knowledge-base (its guid id). (required).</param>
        /// <param name="prevWord">pagination control, the last semantic word we looked for previously (required).</param>
        /// <param name="pageSize">the number of semantics to return at a time. (required).</param>
        /// <param name="filter">An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated. (required).</param>
        public CMSemanticsPaginated(string organisationId = default(string), string kbId = default(string), string prevWord = default(string), int pageSize = default(int), string filter = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMSemanticsPaginated and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMSemanticsPaginated and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "prevWord" is required (not null)
            if (prevWord == null)
            {
                throw new ArgumentNullException("prevWord is a required property for CMSemanticsPaginated and cannot be null");
            }
            this.PrevWord = prevWord;
            this.PageSize = pageSize;
            // to ensure "filter" is required (not null)
            if (filter == null)
            {
                throw new ArgumentNullException("filter is a required property for CMSemanticsPaginated and cannot be null");
            }
            this.Filter = filter;
        }

        /// <summary>
        /// the organisation (its guid id).
        /// </summary>
        /// <value>the organisation (its guid id).</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base (its guid id).
        /// </summary>
        /// <value>the knowledge-base (its guid id).</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// pagination control, the last semantic word we looked for previously
        /// </summary>
        /// <value>pagination control, the last semantic word we looked for previously</value>
        /// <example>0</example>
        [DataMember(Name = "prevWord", IsRequired = true, EmitDefaultValue = true)]
        public string PrevWord { get; set; }

        /// <summary>
        /// the number of semantics to return at a time.
        /// </summary>
        /// <value>the number of semantics to return at a time.</value>
        /// <example>10</example>
        [DataMember(Name = "pageSize", IsRequired = true, EmitDefaultValue = true)]
        public int PageSize { get; set; }

        /// <summary>
        /// An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.
        /// </summary>
        /// <value>An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.</value>
        [DataMember(Name = "filter", IsRequired = true, EmitDefaultValue = true)]
        public string Filter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSemanticsPaginated {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  PrevWord: ").Append(PrevWord).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
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
            return this.Equals(input as CMSemanticsPaginated);
        }

        /// <summary>
        /// Returns true if CMSemanticsPaginated instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSemanticsPaginated to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSemanticsPaginated input)
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
                    this.PrevWord == input.PrevWord ||
                    (this.PrevWord != null &&
                    this.PrevWord.Equals(input.PrevWord))
                ) && 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
                ) && 
                (
                    this.Filter == input.Filter ||
                    (this.Filter != null &&
                    this.Filter.Equals(input.Filter))
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
                if (this.PrevWord != null)
                {
                    hashCode = (hashCode * 59) + this.PrevWord.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
                if (this.Filter != null)
                {
                    hashCode = (hashCode * 59) + this.Filter.GetHashCode();
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
