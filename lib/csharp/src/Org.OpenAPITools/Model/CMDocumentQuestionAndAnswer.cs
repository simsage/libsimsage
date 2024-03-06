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
    /// A basic document question/answer pair for AI
    /// </summary>
    [DataContract(Name = "CMDocumentQuestionAndAnswer")]
    public partial class CMDocumentQuestionAndAnswer : IEquatable<CMDocumentQuestionAndAnswer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentQuestionAndAnswer" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentQuestionAndAnswer() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentQuestionAndAnswer" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id). (required).</param>
        /// <param name="kbId">the knowledge-base id (guid) to use (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="urlId">The unique URL-ID of a document. (required).</param>
        /// <param name="conversationList">the context of the conversation thusfar (required).</param>
        /// <param name="answer">The answer for the given question (required).</param>
        public CMDocumentQuestionAndAnswer(string organisationId = default(string), string kbId = default(string), string url = default(string), int urlId = default(int), string conversationList = default(string), string answer = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentQuestionAndAnswer and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentQuestionAndAnswer and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentQuestionAndAnswer and cannot be null");
            }
            this.Url = url;
            this.UrlId = urlId;
            // to ensure "conversationList" is required (not null)
            if (conversationList == null)
            {
                throw new ArgumentNullException("conversationList is a required property for CMDocumentQuestionAndAnswer and cannot be null");
            }
            this.ConversationList = conversationList;
            // to ensure "answer" is required (not null)
            if (answer == null)
            {
                throw new ArgumentNullException("answer is a required property for CMDocumentQuestionAndAnswer and cannot be null");
            }
            this.Answer = answer;
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
        /// The unique URL of a document.
        /// </summary>
        /// <value>The unique URL of a document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// The unique URL-ID of a document.
        /// </summary>
        /// <value>The unique URL-ID of a document.</value>
        /// <example>1</example>
        [DataMember(Name = "urlId", IsRequired = true, EmitDefaultValue = true)]
        public int UrlId { get; set; }

        /// <summary>
        /// the context of the conversation thusfar
        /// </summary>
        /// <value>the context of the conversation thusfar</value>
        /// <example>[]</example>
        [DataMember(Name = "conversationList", IsRequired = true, EmitDefaultValue = true)]
        public string ConversationList { get; set; }

        /// <summary>
        /// The answer for the given question
        /// </summary>
        /// <value>The answer for the given question</value>
        /// <example>some answer</example>
        [DataMember(Name = "answer", IsRequired = true, EmitDefaultValue = true)]
        public string Answer { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentQuestionAndAnswer {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UrlId: ").Append(UrlId).Append("\n");
            sb.Append("  ConversationList: ").Append(ConversationList).Append("\n");
            sb.Append("  Answer: ").Append(Answer).Append("\n");
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
            return this.Equals(input as CMDocumentQuestionAndAnswer);
        }

        /// <summary>
        /// Returns true if CMDocumentQuestionAndAnswer instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentQuestionAndAnswer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentQuestionAndAnswer input)
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
                    this.UrlId == input.UrlId ||
                    this.UrlId.Equals(input.UrlId)
                ) && 
                (
                    this.ConversationList == input.ConversationList ||
                    (this.ConversationList != null &&
                    this.ConversationList.Equals(input.ConversationList))
                ) && 
                (
                    this.Answer == input.Answer ||
                    (this.Answer != null &&
                    this.Answer.Equals(input.Answer))
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
                hashCode = (hashCode * 59) + this.UrlId.GetHashCode();
                if (this.ConversationList != null)
                {
                    hashCode = (hashCode * 59) + this.ConversationList.GetHashCode();
                }
                if (this.Answer != null)
                {
                    hashCode = (hashCode * 59) + this.Answer.GetHashCode();
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
