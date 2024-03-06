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
    [DataContract(Name = "CMUploadImage")]
    public partial class CMUploadImage : IEquatable<CMUploadImage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMUploadImage" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMUploadImage() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMUploadImage" /> class.
        /// </summary>
        /// <param name="objectType">the type of this class, just in case this object is encrypted (required).</param>
        /// <param name="organisationId">the organisation (its guid id) this image should go into. (required).</param>
        /// <param name="kbId">the knowledge-base (its guid id) this image should go into. (required).</param>
        /// <param name="sid">the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system. (required).</param>
        /// <param name="sourceId">the source-id of this crawler (ie. the crawler&#39;s id) this image came from. (required).</param>
        /// <param name="url">A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to. (required).</param>
        /// <param name="mimeType">The mime-type of this image, must be either image/jpeg or image/png. (required).</param>
        /// <param name="puid">The Pronom Unique ID for this image. (required).</param>
        /// <param name="data">the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;. (required).</param>
        /// <param name="encrypted">Do we need to add transport encryption (required).</param>
        /// <param name="seed">The seed used if encrypted (required).</param>
        public CMUploadImage(string objectType = default(string), string organisationId = default(string), string kbId = default(string), string sid = default(string), int sourceId = default(int), string url = default(string), string mimeType = default(string), string puid = default(string), string data = default(string), bool encrypted = default(bool), int seed = default(int))
        {
            // to ensure "objectType" is required (not null)
            if (objectType == null)
            {
                throw new ArgumentNullException("objectType is a required property for CMUploadImage and cannot be null");
            }
            this.ObjectType = objectType;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMUploadImage and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMUploadImage and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "sid" is required (not null)
            if (sid == null)
            {
                throw new ArgumentNullException("sid is a required property for CMUploadImage and cannot be null");
            }
            this.Sid = sid;
            this.SourceId = sourceId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMUploadImage and cannot be null");
            }
            this.Url = url;
            // to ensure "mimeType" is required (not null)
            if (mimeType == null)
            {
                throw new ArgumentNullException("mimeType is a required property for CMUploadImage and cannot be null");
            }
            this.MimeType = mimeType;
            // to ensure "puid" is required (not null)
            if (puid == null)
            {
                throw new ArgumentNullException("puid is a required property for CMUploadImage and cannot be null");
            }
            this.Puid = puid;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for CMUploadImage and cannot be null");
            }
            this.Data = data;
            this.Encrypted = encrypted;
            this.Seed = seed;
        }

        /// <summary>
        /// the type of this class, just in case this object is encrypted
        /// </summary>
        /// <value>the type of this class, just in case this object is encrypted</value>
        /// <example>CMUploadImage</example>
        [DataMember(Name = "objectType", IsRequired = true, EmitDefaultValue = true)]
        public string ObjectType { get; set; }

        /// <summary>
        /// the organisation (its guid id) this image should go into.
        /// </summary>
        /// <value>the organisation (its guid id) this image should go into.</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base (its guid id) this image should go into.
        /// </summary>
        /// <value>the knowledge-base (its guid id) this image should go into.</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
        /// </summary>
        /// <value>the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.</value>
        [DataMember(Name = "sid", IsRequired = true, EmitDefaultValue = true)]
        public string Sid { get; set; }

        /// <summary>
        /// the source-id of this crawler (ie. the crawler&#39;s id) this image came from.
        /// </summary>
        /// <value>the source-id of this crawler (ie. the crawler&#39;s id) this image came from.</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to.
        /// </summary>
        /// <value>A unique URL for this image, this should be the same as the document&#39;s URL this image belongs to.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// The mime-type of this image, must be either image/jpeg or image/png.
        /// </summary>
        /// <value>The mime-type of this image, must be either image/jpeg or image/png.</value>
        /// <example>image/jpeg</example>
        [DataMember(Name = "mimeType", IsRequired = true, EmitDefaultValue = true)]
        public string MimeType { get; set; }

        /// <summary>
        /// The Pronom Unique ID for this image.
        /// </summary>
        /// <value>The Pronom Unique ID for this image.</value>
        /// <example>fmt/123</example>
        [DataMember(Name = "puid", IsRequired = true, EmitDefaultValue = true)]
        public string Puid { get; set; }

        /// <summary>
        /// the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;.
        /// </summary>
        /// <value>the base64 encoded content of this image.  Must be prefixed with &#39;;base64,&#39;.</value>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public string Data { get; set; }

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
            sb.Append("class CMUploadImage {\n");
            sb.Append("  ObjectType: ").Append(ObjectType).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
            sb.Append("  Puid: ").Append(Puid).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as CMUploadImage);
        }

        /// <summary>
        /// Returns true if CMUploadImage instances are equal
        /// </summary>
        /// <param name="input">Instance of CMUploadImage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMUploadImage input)
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
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
                ) && 
                (
                    this.Puid == input.Puid ||
                    (this.Puid != null &&
                    this.Puid.Equals(input.Puid))
                ) && 
                (
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.MimeType != null)
                {
                    hashCode = (hashCode * 59) + this.MimeType.GetHashCode();
                }
                if (this.Puid != null)
                {
                    hashCode = (hashCode * 59) + this.Puid.GetHashCode();
                }
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
