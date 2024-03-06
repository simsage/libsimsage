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
    /// A note attached to a document.
    /// </summary>
    [DataContract(Name = "CMDocumentNote")]
    public partial class CMDocumentNote : IEquatable<CMDocumentNote>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentNote" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentNote() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentNote" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="noteId">The id of the note, starting at 1 note of 0 means create a new note (required).</param>
        /// <param name="noteText">The text of the note (required).</param>
        /// <param name="userId">The user&#39;s id (required).</param>
        /// <param name="email">the email address of the user that made the change (required).</param>
        /// <param name="created">a unix-timestamp of the creation date-time of this record (required).</param>
        public CMDocumentNote(string organisationId = default(string), string kbId = default(string), string url = default(string), int noteId = default(int), string noteText = default(string), string userId = default(string), string email = default(string), long created = default(long))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentNote and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentNote and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentNote and cannot be null");
            }
            this.Url = url;
            this.NoteId = noteId;
            // to ensure "noteText" is required (not null)
            if (noteText == null)
            {
                throw new ArgumentNullException("noteText is a required property for CMDocumentNote and cannot be null");
            }
            this.NoteText = noteText;
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for CMDocumentNote and cannot be null");
            }
            this.UserId = userId;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for CMDocumentNote and cannot be null");
            }
            this.Email = email;
            this.Created = created;
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
        /// The id of the note, starting at 1 note of 0 means create a new note
        /// </summary>
        /// <value>The id of the note, starting at 1 note of 0 means create a new note</value>
        /// <example>1</example>
        [DataMember(Name = "noteId", IsRequired = true, EmitDefaultValue = true)]
        public int NoteId { get; set; }

        /// <summary>
        /// The text of the note
        /// </summary>
        /// <value>The text of the note</value>
        /// <example>example text</example>
        [DataMember(Name = "noteText", IsRequired = true, EmitDefaultValue = true)]
        public string NoteText { get; set; }

        /// <summary>
        /// The user&#39;s id
        /// </summary>
        /// <value>The user&#39;s id</value>
        /// <example>1234</example>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// the email address of the user that made the change
        /// </summary>
        /// <value>the email address of the user that made the change</value>
        /// <example>joe@bloggs.com</example>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// a unix-timestamp of the creation date-time of this record
        /// </summary>
        /// <value>a unix-timestamp of the creation date-time of this record</value>
        [DataMember(Name = "created", IsRequired = true, EmitDefaultValue = true)]
        public long Created { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentNote {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  NoteId: ").Append(NoteId).Append("\n");
            sb.Append("  NoteText: ").Append(NoteText).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
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
            return this.Equals(input as CMDocumentNote);
        }

        /// <summary>
        /// Returns true if CMDocumentNote instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentNote to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentNote input)
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
                    this.NoteId == input.NoteId ||
                    this.NoteId.Equals(input.NoteId)
                ) && 
                (
                    this.NoteText == input.NoteText ||
                    (this.NoteText != null &&
                    this.NoteText.Equals(input.NoteText))
                ) && 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Created == input.Created ||
                    this.Created.Equals(input.Created)
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
                hashCode = (hashCode * 59) + this.NoteId.GetHashCode();
                if (this.NoteText != null)
                {
                    hashCode = (hashCode * 59) + this.NoteText.GetHashCode();
                }
                if (this.UserId != null)
                {
                    hashCode = (hashCode * 59) + this.UserId.GetHashCode();
                }
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Created.GetHashCode();
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
