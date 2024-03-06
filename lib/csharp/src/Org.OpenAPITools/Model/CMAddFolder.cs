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
    /// the folder add object
    /// </summary>
    [DataContract(Name = "CMAddFolder")]
    public partial class CMAddFolder : IEquatable<CMAddFolder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMAddFolder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMAddFolder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMAddFolder" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="sourceId">the source-id of the owner of the url (required).</param>
        /// <param name="folderId">the id of the folder. (required).</param>
        /// <param name="folderName">the folder&#39;s new name. (required).</param>
        /// <param name="prevUrl">pagination, the previous last URL for the page-set (null is first page).</param>
        /// <param name="pageSize">page-size for a paginated set (required).</param>
        public CMAddFolder(string organisationId = default(string), string kbId = default(string), int sourceId = default(int), string folderId = default(string), string folderName = default(string), string prevUrl = default(string), int pageSize = default(int))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMAddFolder and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMAddFolder and cannot be null");
            }
            this.KbId = kbId;
            this.SourceId = sourceId;
            // to ensure "folderId" is required (not null)
            if (folderId == null)
            {
                throw new ArgumentNullException("folderId is a required property for CMAddFolder and cannot be null");
            }
            this.FolderId = folderId;
            // to ensure "folderName" is required (not null)
            if (folderName == null)
            {
                throw new ArgumentNullException("folderName is a required property for CMAddFolder and cannot be null");
            }
            this.FolderName = folderName;
            this.PageSize = pageSize;
            this.PrevUrl = prevUrl;
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
        /// the source-id of the owner of the url
        /// </summary>
        /// <value>the source-id of the owner of the url</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// the id of the folder.
        /// </summary>
        /// <value>the id of the folder.</value>
        [DataMember(Name = "folderId", IsRequired = true, EmitDefaultValue = true)]
        public string FolderId { get; set; }

        /// <summary>
        /// the folder&#39;s new name.
        /// </summary>
        /// <value>the folder&#39;s new name.</value>
        /// <example>folder 1</example>
        [DataMember(Name = "folderName", IsRequired = true, EmitDefaultValue = true)]
        public string FolderName { get; set; }

        /// <summary>
        /// pagination, the previous last URL for the page-set (null is first page)
        /// </summary>
        /// <value>pagination, the previous last URL for the page-set (null is first page)</value>
        [DataMember(Name = "prevUrl", EmitDefaultValue = false)]
        public string PrevUrl { get; set; }

        /// <summary>
        /// page-size for a paginated set
        /// </summary>
        /// <value>page-size for a paginated set</value>
        /// <example>25</example>
        [DataMember(Name = "pageSize", IsRequired = true, EmitDefaultValue = true)]
        public int PageSize { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMAddFolder {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  FolderId: ").Append(FolderId).Append("\n");
            sb.Append("  FolderName: ").Append(FolderName).Append("\n");
            sb.Append("  PrevUrl: ").Append(PrevUrl).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
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
            return this.Equals(input as CMAddFolder);
        }

        /// <summary>
        /// Returns true if CMAddFolder instances are equal
        /// </summary>
        /// <param name="input">Instance of CMAddFolder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMAddFolder input)
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
                    this.SourceId == input.SourceId ||
                    this.SourceId.Equals(input.SourceId)
                ) && 
                (
                    this.FolderId == input.FolderId ||
                    (this.FolderId != null &&
                    this.FolderId.Equals(input.FolderId))
                ) && 
                (
                    this.FolderName == input.FolderName ||
                    (this.FolderName != null &&
                    this.FolderName.Equals(input.FolderName))
                ) && 
                (
                    this.PrevUrl == input.PrevUrl ||
                    (this.PrevUrl != null &&
                    this.PrevUrl.Equals(input.PrevUrl))
                ) && 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
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
                hashCode = (hashCode * 59) + this.SourceId.GetHashCode();
                if (this.FolderId != null)
                {
                    hashCode = (hashCode * 59) + this.FolderId.GetHashCode();
                }
                if (this.FolderName != null)
                {
                    hashCode = (hashCode * 59) + this.FolderName.GetHashCode();
                }
                if (this.PrevUrl != null)
                {
                    hashCode = (hashCode * 59) + this.PrevUrl.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PageSize.GetHashCode();
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
