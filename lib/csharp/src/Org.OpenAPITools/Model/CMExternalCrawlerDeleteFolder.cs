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
    /// An external image representation object.
    /// </summary>
    [DataContract(Name = "CMExternalCrawlerDeleteFolder")]
    public partial class CMExternalCrawlerDeleteFolder : IEquatable<CMExternalCrawlerDeleteFolder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMExternalCrawlerDeleteFolder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMExternalCrawlerDeleteFolder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMExternalCrawlerDeleteFolder" /> class.
        /// </summary>
        /// <param name="objectType">the type of this class, just in case this object is encrypted (required).</param>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="sid">the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. (required).</param>
        /// <param name="sourceId">the source-id of this crawler (ie. the crawler&#39;s id) (required).</param>
        /// <param name="folderUrl">the document-folder to delete (required).</param>
        /// <param name="encrypted">Do we need to add transport encryption (required).</param>
        /// <param name="seed">The seed used if encrypted (required).</param>
        public CMExternalCrawlerDeleteFolder(string objectType = default(string), string organisationId = default(string), string kbId = default(string), string sid = default(string), int sourceId = default(int), string folderUrl = default(string), bool encrypted = default(bool), int seed = default(int))
        {
            // to ensure "objectType" is required (not null)
            if (objectType == null)
            {
                throw new ArgumentNullException("objectType is a required property for CMExternalCrawlerDeleteFolder and cannot be null");
            }
            this.ObjectType = objectType;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMExternalCrawlerDeleteFolder and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMExternalCrawlerDeleteFolder and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "sid" is required (not null)
            if (sid == null)
            {
                throw new ArgumentNullException("sid is a required property for CMExternalCrawlerDeleteFolder and cannot be null");
            }
            this.Sid = sid;
            this.SourceId = sourceId;
            // to ensure "folderUrl" is required (not null)
            if (folderUrl == null)
            {
                throw new ArgumentNullException("folderUrl is a required property for CMExternalCrawlerDeleteFolder and cannot be null");
            }
            this.FolderUrl = folderUrl;
            this.Encrypted = encrypted;
            this.Seed = seed;
        }

        /// <summary>
        /// the type of this class, just in case this object is encrypted
        /// </summary>
        /// <value>the type of this class, just in case this object is encrypted</value>
        /// <example>CMExternalCrawlerDeleteFolder</example>
        [DataMember(Name = "objectType", IsRequired = true, EmitDefaultValue = true)]
        public string ObjectType { get; set; }

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
        /// the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
        /// </summary>
        /// <value>the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.</value>
        [DataMember(Name = "sid", IsRequired = true, EmitDefaultValue = true)]
        public string Sid { get; set; }

        /// <summary>
        /// the source-id of this crawler (ie. the crawler&#39;s id)
        /// </summary>
        /// <value>the source-id of this crawler (ie. the crawler&#39;s id)</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// the document-folder to delete
        /// </summary>
        /// <value>the document-folder to delete</value>
        [DataMember(Name = "folderUrl", IsRequired = true, EmitDefaultValue = true)]
        public string FolderUrl { get; set; }

        /// <summary>
        /// Do we need to add transport encryption
        /// </summary>
        /// <value>Do we need to add transport encryption</value>
        /// <example>true</example>
        [DataMember(Name = "encrypted", IsRequired = true, EmitDefaultValue = true)]
        public bool Encrypted { get; set; }

        /// <summary>
        /// The seed used if encrypted
        /// </summary>
        /// <value>The seed used if encrypted</value>
        /// <example>0</example>
        [DataMember(Name = "seed", IsRequired = true, EmitDefaultValue = true)]
        public int Seed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMExternalCrawlerDeleteFolder {\n");
            sb.Append("  ObjectType: ").Append(ObjectType).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  FolderUrl: ").Append(FolderUrl).Append("\n");
            sb.Append("  Encrypted: ").Append(Encrypted).Append("\n");
            sb.Append("  Seed: ").Append(Seed).Append("\n");
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
            return this.Equals(input as CMExternalCrawlerDeleteFolder);
        }

        /// <summary>
        /// Returns true if CMExternalCrawlerDeleteFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of CMExternalCrawlerDeleteFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMExternalCrawlerDeleteFolder input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ObjectType == input.ObjectType ||
                    (this.ObjectType != null &&
                    this.ObjectType.Equals(input.ObjectType))
                ) && 
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
                    this.FolderUrl == input.FolderUrl ||
                    (this.FolderUrl != null &&
                    this.FolderUrl.Equals(input.FolderUrl))
                ) && 
                (
                    this.Encrypted == input.Encrypted ||
                    this.Encrypted.Equals(input.Encrypted)
                ) && 
                (
                    this.Seed == input.Seed ||
                    this.Seed.Equals(input.Seed)
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
                if (this.ObjectType != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectType.GetHashCode();
                }
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
                if (this.FolderUrl != null)
                {
                    hashCode = (hashCode * 59) + this.FolderUrl.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Encrypted.GetHashCode();
                hashCode = (hashCode * 59) + this.Seed.GetHashCode();
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