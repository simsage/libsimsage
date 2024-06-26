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
    /// the document hash-tag object.  A list of hash-tags.  Each hash-tag must start with a &#39;#&#39; and only contain a..z,A..Z.  Minimum size 3 characters, maximum size 50 characters.
    /// </summary>
    [DataContract(Name = "CMDocumentHashTag")]
    public partial class CMDocumentHashTag : IEquatable<CMDocumentHashTag>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentHashTag" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentHashTag() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentHashTag" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="hashTagList">a list of hash-tags for this document (required).</param>
        public CMDocumentHashTag(string organisationId = default(string), string kbId = default(string), string url = default(string), List<string> hashTagList = default(List<string>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentHashTag and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentHashTag and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentHashTag and cannot be null");
            }
            this.Url = url;
            // to ensure "hashTagList" is required (not null)
            if (hashTagList == null)
            {
                throw new ArgumentNullException("hashTagList is a required property for CMDocumentHashTag and cannot be null");
            }
            this.HashTagList = hashTagList;
        }

        /// <summary>
        /// the main organisation (its guid id) for this source/crawler
        /// </summary>
        /// <value>the main organisation (its guid id) for this source/crawler</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id of this context item, a guid-string
        /// </summary>
        /// <value>the knowledge-base id of this context item, a guid-string</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// The unique URL of a document.
        /// </summary>
        /// <value>The unique URL of a document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// a list of hash-tags for this document
        /// </summary>
        /// <value>a list of hash-tags for this document</value>
        [DataMember(Name = "hashTagList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> HashTagList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentHashTag {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  HashTagList: ").Append(HashTagList).Append("\n");
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
            return this.Equals(input as CMDocumentHashTag);
        }

        /// <summary>
        /// Returns true if CMDocumentHashTag instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentHashTag to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentHashTag input)
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
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.HashTagList == input.HashTagList ||
                    this.HashTagList != null &&
                    input.HashTagList != null &&
                    this.HashTagList.SequenceEqual(input.HashTagList)
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.HashTagList != null)
                {
                    hashCode = (hashCode * 59) + this.HashTagList.GetHashCode();
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
