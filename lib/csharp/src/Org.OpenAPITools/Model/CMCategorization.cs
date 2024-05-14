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
    /// A categorization object.
    /// </summary>
    [DataContract(Name = "CMCategorization")]
    public partial class CMCategorization : IEquatable<CMCategorization>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMCategorization" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMCategorization() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMCategorization" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id) (required).</param>
        /// <param name="kbId">the knowledge-base (its guid id) (required).</param>
        /// <param name="categorizationLabel">the categorization label (the value field) for a categorization (required).</param>
        /// <param name="rule">the SimSage SuperSearch rule to match for adding this categorization label to a document (required).</param>
        public CMCategorization(string organisationId = default(string), string kbId = default(string), string categorizationLabel = default(string), string rule = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMCategorization and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMCategorization and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "categorizationLabel" is required (not null)
            if (categorizationLabel == null)
            {
                throw new ArgumentNullException("categorizationLabel is a required property for CMCategorization and cannot be null");
            }
            this.CategorizationLabel = categorizationLabel;
            // to ensure "rule" is required (not null)
            if (rule == null)
            {
                throw new ArgumentNullException("rule is a required property for CMCategorization and cannot be null");
            }
            this.Rule = rule;
        }

        /// <summary>
        /// the organisation (its guid id)
        /// </summary>
        /// <value>the organisation (its guid id)</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base (its guid id)
        /// </summary>
        /// <value>the knowledge-base (its guid id)</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the categorization label (the value field) for a categorization
        /// </summary>
        /// <value>the categorization label (the value field) for a categorization</value>
        /// <example>top security</example>
        [DataMember(Name = "categorizationLabel", IsRequired = true, EmitDefaultValue = true)]
        public string CategorizationLabel { get; set; }

        /// <summary>
        /// the SimSage SuperSearch rule to match for adding this categorization label to a document
        /// </summary>
        /// <value>the SimSage SuperSearch rule to match for adding this categorization label to a document</value>
        /// <example>(body: test))</example>
        [DataMember(Name = "rule", IsRequired = true, EmitDefaultValue = true)]
        public string Rule { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMCategorization {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  CategorizationLabel: ").Append(CategorizationLabel).Append("\n");
            sb.Append("  Rule: ").Append(Rule).Append("\n");
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
            return this.Equals(input as CMCategorization);
        }

        /// <summary>
        /// Returns true if CMCategorization instances are equal
        /// </summary>
        /// <param name="input">Instance of CMCategorization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMCategorization input)
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
                    this.CategorizationLabel == input.CategorizationLabel ||
                    (this.CategorizationLabel != null &&
                    this.CategorizationLabel.Equals(input.CategorizationLabel))
                ) && 
                (
                    this.Rule == input.Rule ||
                    (this.Rule != null &&
                    this.Rule.Equals(input.Rule))
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
                if (this.CategorizationLabel != null)
                {
                    hashCode = (hashCode * 59) + this.CategorizationLabel.GetHashCode();
                }
                if (this.Rule != null)
                {
                    hashCode = (hashCode * 59) + this.Rule.GetHashCode();
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
