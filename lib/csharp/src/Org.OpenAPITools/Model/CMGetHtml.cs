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
    /// get an HTML preview of a document by page
    /// </summary>
    [DataContract(Name = "CMGetHtml")]
    public partial class CMGetHtml : IEquatable<CMGetHtml>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGetHtml" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMGetHtml() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGetHtml" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id) (required).</param>
        /// <param name="kbId">the knowledge-base id (its guid id) (required).</param>
        /// <param name="urlId">the url Id of the document (required).</param>
        /// <param name="url">The unique URL of this document. (required).</param>
        /// <param name="page">the page of this document get, starting at 1 (required).</param>
        /// <param name="html">the HTML of the document returned (required).</param>
        /// <param name="width">the display width of the HMTL document (required).</param>
        /// <param name="height">the display height of the HMTL document (required).</param>
        /// <param name="numPages">the total number of pages in this document (required).</param>
        public CMGetHtml(string organisationId = default(string), string kbId = default(string), int urlId = default(int), string url = default(string), int page = default(int), string html = default(string), int width = default(int), int height = default(int), int numPages = default(int))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMGetHtml and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "kbId" is required (not null)
            if (kbId == null)
            {
                throw new ArgumentNullException("kbId is a required property for CMGetHtml and cannot be null");
            }
            this.KbId = kbId;
            this.UrlId = urlId;
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMGetHtml and cannot be null");
            }
            this.Url = url;
            this.Page = page;
            // to ensure "html" is required (not null)
            if (html == null)
            {
                throw new ArgumentNullException("html is a required property for CMGetHtml and cannot be null");
            }
            this.Html = html;
            this.Width = width;
            this.Height = height;
            this.NumPages = numPages;
        }

        /// <summary>
        /// the organisation (its guid id)
        /// </summary>
        /// <value>the organisation (its guid id)</value>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the knowledge-base id (its guid id)
        /// </summary>
        /// <value>the knowledge-base id (its guid id)</value>
        [DataMember(Name = "kbId", IsRequired = true, EmitDefaultValue = true)]
        public string KbId { get; set; }

        /// <summary>
        /// the url Id of the document
        /// </summary>
        /// <value>the url Id of the document</value>
        [DataMember(Name = "urlId", IsRequired = true, EmitDefaultValue = true)]
        public int UrlId { get; set; }

        /// <summary>
        /// The unique URL of this document.
        /// </summary>
        /// <value>The unique URL of this document.</value>
        /// <example>https://server.com/document-1</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// the page of this document get, starting at 1
        /// </summary>
        /// <value>the page of this document get, starting at 1</value>
        [DataMember(Name = "page", IsRequired = true, EmitDefaultValue = true)]
        public int Page { get; set; }

        /// <summary>
        /// the HTML of the document returned
        /// </summary>
        /// <value>the HTML of the document returned</value>
        [DataMember(Name = "html", IsRequired = true, EmitDefaultValue = true)]
        public string Html { get; set; }

        /// <summary>
        /// the display width of the HMTL document
        /// </summary>
        /// <value>the display width of the HMTL document</value>
        [DataMember(Name = "width", IsRequired = true, EmitDefaultValue = true)]
        public int Width { get; set; }

        /// <summary>
        /// the display height of the HMTL document
        /// </summary>
        /// <value>the display height of the HMTL document</value>
        [DataMember(Name = "height", IsRequired = true, EmitDefaultValue = true)]
        public int Height { get; set; }

        /// <summary>
        /// the total number of pages in this document
        /// </summary>
        /// <value>the total number of pages in this document</value>
        [DataMember(Name = "numPages", IsRequired = true, EmitDefaultValue = true)]
        public int NumPages { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMGetHtml {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  KbId: ").Append(KbId).Append("\n");
            sb.Append("  UrlId: ").Append(UrlId).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  Html: ").Append(Html).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  NumPages: ").Append(NumPages).Append("\n");
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
            return this.Equals(input as CMGetHtml);
        }

        /// <summary>
        /// Returns true if CMGetHtml instances are equal
        /// </summary>
        /// <param name="input">Instance of CMGetHtml to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMGetHtml input)
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
                    this.UrlId == input.UrlId ||
                    this.UrlId.Equals(input.UrlId)
                ) && 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.Page == input.Page ||
                    this.Page.Equals(input.Page)
                ) && 
                (
                    this.Html == input.Html ||
                    (this.Html != null &&
                    this.Html.Equals(input.Html))
                ) && 
                (
                    this.Width == input.Width ||
                    this.Width.Equals(input.Width)
                ) && 
                (
                    this.Height == input.Height ||
                    this.Height.Equals(input.Height)
                ) && 
                (
                    this.NumPages == input.NumPages ||
                    this.NumPages.Equals(input.NumPages)
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
                hashCode = (hashCode * 59) + this.UrlId.GetHashCode();
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Page.GetHashCode();
                if (this.Html != null)
                {
                    hashCode = (hashCode * 59) + this.Html.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Width.GetHashCode();
                hashCode = (hashCode * 59) + this.Height.GetHashCode();
                hashCode = (hashCode * 59) + this.NumPages.GetHashCode();
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
