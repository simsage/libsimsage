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
    /// the document subscription
    /// </summary>
    [DataContract(Name = "CMDocumentSubscription")]
    public partial class CMDocumentSubscription : IEquatable<CMDocumentSubscription>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentSubscription" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentSubscription() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentSubscription" /> class.
        /// </summary>
        /// <param name="organisationId">the main organisation (its guid id) for this source/crawler (required).</param>
        /// <param name="kbId">the knowledge-base id of this context item, a guid-string (required).</param>
        /// <param name="userId">the user&#39;s id, a guid (required).</param>
        /// <param name="sourceId">the source-id of the owner of the url (required).</param>
        /// <param name="parentId">The parent of a folder or a file (a guid or an empty string for a top-level folder) (required).</param>
        /// <param name="objectId">Either a file or a folder ID (required).</param>
        /// <param name="url">The unique URL of a document. (required).</param>
        /// <param name="urlId">the internal SimSage id for this url (required).</param>
        /// <param name="name">The name of the folder or file (required).</param>
        /// <param name="isFolder">is this a subscription to a folder or a file? (required).</param>
        /// <param name="folder">folder.</param>
        public CMDocumentSubscription(string organisationId = default(string), string kbId = default(string), string userId = default(string), int sourceId = default(int), string parentId = default(string), string objectId = default(string), string url = default(string), int urlId = default(int), string name = default(string), bool isFolder = default(bool), bool folder = default(bool))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMDocumentSubscription and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMDocumentSubscription and cannot be null");
            }
            this.KbId = kbId;
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for CMDocumentSubscription and cannot be null");
            }
            this.UserId = userId;
            this.SourceId = sourceId;
            // to ensure "parentId" is required (not null)
            if (parentId == null)
            {
                throw new ArgumentNullException("parentId is a required property for CMDocumentSubscription and cannot be null");
            }
            this.ParentId = parentId;
            // to ensure "objectId" is required (not null)
            if (objectId == null)
            {
                throw new ArgumentNullException("objectId is a required property for CMDocumentSubscription and cannot be null");
            }
            this.ObjectId = objectId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMDocumentSubscription and cannot be null");
            }
            this.Url = url;
            this.UrlId = urlId;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CMDocumentSubscription and cannot be null");
            }
            this.Name = name;
            this.IsFolder = isFolder;
            this.Folder = folder;
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
        /// the user&#39;s id, a guid
        /// </summary>
        /// <value>the user&#39;s id, a guid</value>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// the source-id of the owner of the url
        /// </summary>
        /// <value>the source-id of the owner of the url</value>
        /// <example>1</example>
        [DataMember(Name = "sourceId", IsRequired = true, EmitDefaultValue = true)]
        public int SourceId { get; set; }

        /// <summary>
        /// The parent of a folder or a file (a guid or an empty string for a top-level folder)
        /// </summary>
        /// <value>The parent of a folder or a file (a guid or an empty string for a top-level folder)</value>
        [DataMember(Name = "parentId", IsRequired = true, EmitDefaultValue = true)]
        public string ParentId { get; set; }

        /// <summary>
        /// Either a file or a folder ID
        /// </summary>
        /// <value>Either a file or a folder ID</value>
        [DataMember(Name = "objectId", IsRequired = true, EmitDefaultValue = true)]
        public string ObjectId { get; set; }

        /// <summary>
        /// The unique URL of a document.
        /// </summary>
        /// <value>The unique URL of a document.</value>
        /// <example>document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// the internal SimSage id for this url
        /// </summary>
        /// <value>the internal SimSage id for this url</value>
        /// <example>22</example>
        [DataMember(Name = "urlId", IsRequired = true, EmitDefaultValue = true)]
        public int UrlId { get; set; }

        /// <summary>
        /// The name of the folder or file
        /// </summary>
        /// <value>The name of the folder or file</value>
        /// <example>document-1</example>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// is this a subscription to a folder or a file?
        /// </summary>
        /// <value>is this a subscription to a folder or a file?</value>
        /// <example>false</example>
        [DataMember(Name = "isFolder", IsRequired = true, EmitDefaultValue = true)]
        public bool IsFolder { get; set; }

        /// <summary>
        /// Gets or Sets Folder
        /// </summary>
        [DataMember(Name = "folder", EmitDefaultValue = true)]
        public bool Folder { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDocumentSubscription {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  SourceId: ").Append(SourceId).Append("\n");
            sb.Append("  ParentId: ").Append(ParentId).Append("\n");
            sb.Append("  ObjectId: ").Append(ObjectId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UrlId: ").Append(UrlId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  IsFolder: ").Append(IsFolder).Append("\n");
            sb.Append("  Folder: ").Append(Folder).Append("\n");
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
            return this.Equals(input as CMDocumentSubscription);
        }

        /// <summary>
        /// Returns true if CMDocumentSubscription instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentSubscription to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentSubscription input)
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
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.SourceId == input.SourceId ||
                    this.SourceId.Equals(input.SourceId)
                ) && 
                (
                    this.ParentId == input.ParentId ||
                    (this.ParentId != null &&
                    this.ParentId.Equals(input.ParentId))
                ) && 
                (
                    this.ObjectId == input.ObjectId ||
                    (this.ObjectId != null &&
                    this.ObjectId.Equals(input.ObjectId))
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.IsFolder == input.IsFolder ||
                    this.IsFolder.Equals(input.IsFolder)
                ) && 
                (
                    this.Folder == input.Folder ||
                    this.Folder.Equals(input.Folder)
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
                if (this.UserId != null)
                {
                    hashCode = (hashCode * 59) + this.UserId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SourceId.GetHashCode();
                if (this.ParentId != null)
                {
                    hashCode = (hashCode * 59) + this.ParentId.GetHashCode();
                }
                if (this.ObjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectId.GetHashCode();
                }
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UrlId.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsFolder.GetHashCode();
                hashCode = (hashCode * 59) + this.Folder.GetHashCode();
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
