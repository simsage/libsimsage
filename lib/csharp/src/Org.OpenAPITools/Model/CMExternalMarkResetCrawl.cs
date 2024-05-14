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
    /// An external image representation object.
    /// </summary>
    [DataContract(Name = "CMExternalMarkResetCrawl")]
    public partial class CMExternalMarkResetCrawl : IEquatable<CMExternalMarkResetCrawl>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMExternalMarkResetCrawl" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMExternalMarkResetCrawl() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMExternalMarkResetCrawl" /> class.
        /// </summary>
        /// <param name="objectType">the type of this class, just in case this object is encrypted (required).</param>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="sid">the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system. (required).</param>
        /// <param name="sourceId">the source-id of this crawler (ie. the crawler&#39;s id) (required).</param>
        /// <param name="deltaResetRoots">optional for multi root delta crawlers the ids of the roots to reset (required).</param>
        /// <param name="encrypted">Do we need to add transport encryption (required).</param>
        /// <param name="seed">The seed used if encrypted (required).</param>
        public CMExternalMarkResetCrawl(string objectType = default(string), string organisationId = default(string), string kbId = default(string), string sid = default(string), int sourceId = default(int), List<string> deltaResetRoots = default(List<string>), bool encrypted = default(bool), int seed = default(int))
        {
            // to ensure "objectType" is required (not null)
            if (objectType == null)
            {
                throw new ArgumentNullException("objectType is a required property for CMExternalMarkResetCrawl and cannot be null");
            }
            this.ObjectType = objectType;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMExternalMarkResetCrawl and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMExternalMarkResetCrawl and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "sid" is required (not null)
            if (sid == null)
            {
                throw new ArgumentNullException("sid is a required property for CMExternalMarkResetCrawl and cannot be null");
            }
            this.Sid = sid;
            this.SourceId = sourceId;
            // to ensure "deltaResetRoots" is required (not null)
            if (deltaResetRoots == null)
            {
                throw new ArgumentNullException("deltaResetRoots is a required property for CMExternalMarkResetCrawl and cannot be null");
            }
            this.DeltaResetRoots = deltaResetRoots;
            this.Encrypted = encrypted;
            this.Seed = seed;
        }

        /// <summary>
        /// the type of this class, just in case this object is encrypted
        /// </summary>
        /// <value>the type of this class, just in case this object is encrypted</value>
        /// <example>CMExternalMarkResetCrawl</example>
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
        /// optional for multi root delta crawlers the ids of the roots to reset
        /// </summary>
        /// <value>optional for multi root delta crawlers the ids of the roots to reset</value>
        [DataMember(Name = "deltaResetRoots", IsRequired = true, EmitDefaultValue = true)]
        public List<string> DeltaResetRoots { get; set; }

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
            sb.Append("class CMExternalMarkResetCrawl {\n");
            sb.Append("  ObjectType: ").Append(ObjectType).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  DeltaResetRoots: ").Append(DeltaResetRoots).Append("\n");
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
            return this.Equals(input as CMExternalMarkResetCrawl);
        }

        /// <summary>
        /// Returns true if CMExternalMarkResetCrawl instances are equal
        /// </summary>
        /// <param name="input">Instance of CMExternalMarkResetCrawl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMExternalMarkResetCrawl input)
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
                    this.DeltaResetRoots == input.DeltaResetRoots ||
                    this.DeltaResetRoots != null &&
                    input.DeltaResetRoots != null &&
                    this.DeltaResetRoots.SequenceEqual(input.DeltaResetRoots)
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
                if (this.DeltaResetRoots != null)
                {
                    hashCode = (hashCode * 59) + this.DeltaResetRoots.GetHashCode();
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