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
    /// CMFilter
    /// </summary>
    [DataContract(Name = "CMFilter")]
    public partial class CMFilter : IEquatable<CMFilter>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMFilter" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMFilter() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMFilter" /> class.
        /// </summary>
        /// <param name="knowledgeBase">knowledgeBase (required).</param>
        /// <param name="filetypes">filetypes.</param>
        /// <param name="sources">sources.</param>
        public CMFilter(string knowledgeBase = default(string), List<string> filetypes = default(List<string>), List<string> sources = default(List<string>))
        {
            // to ensure "knowledgeBase" is required (not null)
            if (knowledgeBase == null)
            {
                throw new ArgumentNullException("knowledgeBase is a required property for CMFilter and cannot be null");
            }
            this.KnowledgeBase = knowledgeBase;
            this.Filetypes = filetypes;
            this.Sources = sources;
        }

        /// <summary>
        /// Gets or Sets KnowledgeBase
        /// </summary>
        [DataMember(Name = "knowledgeBase", IsRequired = true, EmitDefaultValue = true)]
        public string KnowledgeBase { get; set; }

        /// <summary>
        /// Gets or Sets Filetypes
        /// </summary>
        [DataMember(Name = "filetypes", EmitDefaultValue = false)]
        public List<string> Filetypes { get; set; }

        /// <summary>
        /// Gets or Sets Sources
        /// </summary>
        [DataMember(Name = "sources", EmitDefaultValue = false)]
        public List<string> Sources { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMFilter {\n");
            sb.Append("  KnowledgeBase: ").Append(KnowledgeBase).Append("\n");
            sb.Append("  Filetypes: ").Append(Filetypes).Append("\n");
            sb.Append("  Sources: ").Append(Sources).Append("\n");
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
            return this.Equals(input as CMFilter);
        }

        /// <summary>
        /// Returns true if CMFilter instances are equal
        /// </summary>
        /// <param name="input">Instance of CMFilter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMFilter input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.KnowledgeBase == input.KnowledgeBase ||
                    (this.KnowledgeBase != null &&
                    this.KnowledgeBase.Equals(input.KnowledgeBase))
                ) && 
                (
                    this.Filetypes == input.Filetypes ||
                    this.Filetypes != null &&
                    input.Filetypes != null &&
                    this.Filetypes.SequenceEqual(input.Filetypes)
                ) && 
                (
                    this.Sources == input.Sources ||
                    this.Sources != null &&
                    input.Sources != null &&
                    this.Sources.SequenceEqual(input.Sources)
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
                if (this.KnowledgeBase != null)
                {
                    hashCode = (hashCode * 59) + this.KnowledgeBase.GetHashCode();
                }
                if (this.Filetypes != null)
                {
                    hashCode = (hashCode * 59) + this.Filetypes.GetHashCode();
                }
                if (this.Sources != null)
                {
                    hashCode = (hashCode * 59) + this.Sources.GetHashCode();
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
