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
    /// An external document representation object.
    /// </summary>
    [DataContract(Name = "CMDocumentUnChanged")]
    public partial class CMDocumentUnChanged : IEquatable<CMDocumentUnChanged>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentUnChanged" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentUnChanged() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentUnChanged" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id) this document should go into. (required).</param>
        /// <param name="kbId">the knowledge-base (its guid id) this document should go into. (required).</param>
        /// <param name="sid">the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. (required).</param>
        /// <param name="sourceId">the source-id of this crawler (ie. the crawler&#39;s id) this document came from. (required).</param>
        /// <param name="url">A unique URL for this document. (required).</param>
        /// <param name="runId">the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier. (required).</param>
        public CMDocumentUnChanged(string organisationId = default(string), string kbId = default(string), string sid = default(string), int sourceId = default(int), string url = default(string), string runId = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentUnChanged and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentUnChanged and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "sid" is required (not null)
            if (sid == null)
            {
                throw new ArgumentNullException("sid is a required property for CMDocumentUnChanged and cannot be null");
            }
            this.Sid = sid;
            this.SourceId = sourceId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentUnChanged and cannot be null");
            }
            this.Url = url;
            // to ensure "runId" is required (not null)
            if (runId == null)
            {
                throw new ArgumentNullException("runId is a required property for CMDocumentUnChanged and cannot be null");
            }
            this.RunId = runId;
        }

        /// <summary>
        /// the organisation (its guid id) this document should go into.
        /// </summary>
        /// <value>the organisation (its guid id) this document should go into.</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base (its guid id) this document should go into.
        /// </summary>
        /// <value>the knowledge-base (its guid id) this document should go into.</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
        /// </summary>
        /// <value>the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.</value>
        [DataMember(Name = "sid", IsRequired = true, EmitDefaultValue = true)]
        public string Sid { get; set; }

        /// <summary>
        /// the source-id of this crawler (ie. the crawler&#39;s id) this document came from.
        /// </summary>
        /// <value>the source-id of this crawler (ie. the crawler&#39;s id) this document came from.</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// A unique URL for this document.
        /// </summary>
        /// <value>A unique URL for this document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier.
        /// </summary>
        /// <value>the id (a guid) of the current &#39;go through the source once&#39;.  This is a unique per-run identifier.</value>
        [DataMember(Name = "runId", IsRequired = true, EmitDefaultValue = true)]
        public string RunId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentUnChanged {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
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
            return this.Equals(input as CMDocumentUnChanged);
        }

        /// <summary>
        /// Returns true if CMDocumentUnChanged instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentUnChanged to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentUnChanged input)
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
                    this.Sid == input.Sid ||
                    (this.Sid != null &&
                    this.Sid.Equals(input.Sid))
                ) && 
                (
                    this.SourceId == input.SourceId ||
                    this.SourceId.Equals(input.SourceId)
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.RunId == input.RunId ||
                    (this.RunId != null &&
                    this.RunId.Equals(input.RunId))
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
                if (this.Sid != null)
                {
                    hashCode = (hashCode * 59) + this.Sid.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SourceId.GetHashCode();
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.RunId != null)
                {
                    hashCode = (hashCode * 59) + this.RunId.GetHashCode();
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