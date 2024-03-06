/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
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
    /// a client query object
    /// </summary>
    [DataContract(Name = "CMShortSummary")]
    public partial class CMShortSummary : IEquatable<CMShortSummary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMShortSummary" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMShortSummary() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMShortSummary" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id). (required).</param>
        /// <param name="kbId">the knowledge-base id (guid) to use (required).</param>
        /// <param name="clientId">the client&#39;s id (a unique guid for keeping state against clients) (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="sentenceId">The sentence id to start from in the document. (required).</param>
        /// <param name="span">The surrounding span / offset size for around the sentence (required).</param>
        public CMShortSummary(string organisationId = default(string), string kbId = default(string), string clientId = default(string), string url = default(string), int sentenceId = default(int), int span = default(int))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMShortSummary and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMShortSummary and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "clientId" is required (not null)
            if (clientId == null)
            {
                throw new ArgumentNullException("clientId is a required property for CMShortSummary and cannot be null");
            }
            this.ClientId = clientId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMShortSummary and cannot be null");
            }
            this.Url = url;
            this.SentenceId = sentenceId;
            this.Span = span;
        }

        /// <summary>
        /// the organisation (its guid id).
        /// </summary>
        /// <value>the organisation (its guid id).</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id (guid) to use
        /// </summary>
        /// <value>the knowledge-base id (guid) to use</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the client&#39;s id (a unique guid for keeping state against clients)
        /// </summary>
        /// <value>the client&#39;s id (a unique guid for keeping state against clients)</value>
        [DataMember(Name = "clientId", IsRequired = true, EmitDefaultValue = true)]
        public string ClientId { get; set; }

        /// <summary>
        /// The unique URL of a document.
        /// </summary>
        /// <value>The unique URL of a document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// The sentence id to start from in the document.
        /// </summary>
        /// <value>The sentence id to start from in the document.</value>
        /// <example>0</example>
        [DataMember(Name = "sentenceId", IsRequired = true, EmitDefaultValue = true)]
        public int SentenceId { get; set; }

        /// <summary>
        /// The surrounding span / offset size for around the sentence
        /// </summary>
        /// <value>The surrounding span / offset size for around the sentence</value>
        /// <example>3</example>
        [DataMember(Name = "span", IsRequired = true, EmitDefaultValue = true)]
        public int Span { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMShortSummary {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  SentenceId: ").Append(SentenceId).Append("\n");
            sb.Append("  Span: ").Append(Span).Append("\n");
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
            return this.Equals(input as CMShortSummary);
        }

        /// <summary>
        /// Returns true if CMShortSummary instances are equal
        /// </summary>
        /// <param name="input">Instance of CMShortSummary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMShortSummary input)
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
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.SentenceId == input.SentenceId ||
                    this.SentenceId.Equals(input.SentenceId)
                ) && 
                (
                    this.Span == input.Span ||
                    this.Span.Equals(input.Span)
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
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SentenceId.GetHashCode();
                hashCode = (hashCode * 59) + this.Span.GetHashCode();
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
