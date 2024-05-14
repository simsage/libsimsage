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
    /// A document that is similar to another document.
    /// </summary>
    [DataContract(Name = "CMSimilarDocument")]
    public partial class CMSimilarDocument : IEquatable<CMSimilarDocument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSimilarDocument" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSimilarDocument() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSimilarDocument" /> class.
        /// </summary>
        /// <param name="url">the url of the document that is similar (required).</param>
        /// <param name="urlId">the url-id of the document that is similar (required).</param>
        /// <param name="similarity">how similar that document is (e.g. 1.0 &#x3D; 100%) (required).</param>
        public CMSimilarDocument(string url = default(string), int urlId = default(int), float similarity = default(float))
        {
            // to ensure "url" is required (not null)
            if (url == null)
            {
                throw new ArgumentNullException("url is a required property for CMSimilarDocument and cannot be null");
            }
            this.Url = url;
            this.UrlId = urlId;
            this.Similarity = similarity;
        }

        /// <summary>
        /// the url of the document that is similar
        /// </summary>
        /// <value>the url of the document that is similar</value>
        /// <example>some-document.txt</example>
        [DataMember(Name = "url", IsRequired = true, EmitDefaultValue = true)]
        public string Url { get; set; }

        /// <summary>
        /// the url-id of the document that is similar
        /// </summary>
        /// <value>the url-id of the document that is similar</value>
        /// <example>1</example>
        [DataMember(Name = "urlId", IsRequired = true, EmitDefaultValue = true)]
        public int UrlId { get; set; }

        /// <summary>
        /// how similar that document is (e.g. 1.0 &#x3D; 100%)
        /// </summary>
        /// <value>how similar that document is (e.g. 1.0 &#x3D; 100%)</value>
        [DataMember(Name = "similarity", IsRequired = true, EmitDefaultValue = true)]
        public float Similarity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSimilarDocument {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  UrlId: ").Append(UrlId).Append("\n");
            sb.Append("  Similarity: ").Append(Similarity).Append("\n");
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
            return this.Equals(input as CMSimilarDocument);
        }

        /// <summary>
        /// Returns true if CMSimilarDocument instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSimilarDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSimilarDocument input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                    this.Similarity == input.Similarity ||
                    this.Similarity.Equals(input.Similarity)
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UrlId.GetHashCode();
                hashCode = (hashCode * 59) + this.Similarity.GetHashCode();
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
