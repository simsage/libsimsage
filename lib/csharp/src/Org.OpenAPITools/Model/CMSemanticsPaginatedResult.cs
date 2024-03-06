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
    /// A paginated semantics return list matching a request for the same.
    /// </summary>
    [DataContract(Name = "CMSemanticsPaginatedResult")]
    public partial class CMSemanticsPaginatedResult : IEquatable<CMSemanticsPaginatedResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticsPaginatedResult" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSemanticsPaginatedResult() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSemanticsPaginatedResult" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id). (required).</param>
        /// <param name="kbId">the knowledge-base (its guid id). (required).</param>
        /// <param name="filter">The filter that was used to find these items. (required).</param>
        /// <param name="semanticList">the resulting list of semantics (return) (required).</param>
        /// <param name="numSemantics">the total number of semantics that matched. (required).</param>
        public CMSemanticsPaginatedResult(string organisationId = default(string), string kbId = default(string), string filter = default(string), List<CMSemantic> semanticList = default(List<CMSemantic>), int numSemantics = default(int))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMSemanticsPaginatedResult and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMSemanticsPaginatedResult and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "filter" is required (not null)
            if (filter == null)
            {
                throw new ArgumentNullException("filter is a required property for CMSemanticsPaginatedResult and cannot be null");
            }
            this.Filter = filter;
            // to ensure "semanticList" is required (not null)
            if (semanticList == null)
            {
                throw new ArgumentNullException("semanticList is a required property for CMSemanticsPaginatedResult and cannot be null");
            }
            this.SemanticList = semanticList;
            this.NumSemantics = numSemantics;
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
        /// The filter that was used to find these items.
        /// </summary>
        /// <value>The filter that was used to find these items.</value>
        /// <example>dog</example>
        [DataMember(Name = "filter", IsRequired = true, EmitDefaultValue = true)]
        public string Filter { get; set; }

        /// <summary>
        /// the resulting list of semantics (return)
        /// </summary>
        /// <value>the resulting list of semantics (return)</value>
        [DataMember(Name = "semanticList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSemantic> SemanticList { get; set; }

        /// <summary>
        /// the total number of semantics that matched.
        /// </summary>
        /// <value>the total number of semantics that matched.</value>
        /// <example>4121</example>
        [DataMember(Name = "numSemantics", IsRequired = true, EmitDefaultValue = true)]
        public int NumSemantics { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSemanticsPaginatedResult {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
            sb.Append("  SemanticList: ").Append(SemanticList).Append("\n");
            sb.Append("  NumSemantics: ").Append(NumSemantics).Append("\n");
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
            return this.Equals(input as CMSemanticsPaginatedResult);
        }

        /// <summary>
        /// Returns true if CMSemanticsPaginatedResult instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSemanticsPaginatedResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSemanticsPaginatedResult input)
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
                    this.Filter == input.Filter ||
                    (this.Filter != null &&
                    this.Filter.Equals(input.Filter))
                ) && 
                (
                    this.SemanticList == input.SemanticList ||
                    this.SemanticList != null &&
                    input.SemanticList != null &&
                    this.SemanticList.SequenceEqual(input.SemanticList)
                ) && 
                (
                    this.NumSemantics == input.NumSemantics ||
                    this.NumSemantics.Equals(input.NumSemantics)
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
                if (this.Filter != null)
                {
                    hashCode = (hashCode * 59) + this.Filter.GetHashCode();
                }
                if (this.SemanticList != null)
                {
                    hashCode = (hashCode * 59) + this.SemanticList.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.NumSemantics.GetHashCode();
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
