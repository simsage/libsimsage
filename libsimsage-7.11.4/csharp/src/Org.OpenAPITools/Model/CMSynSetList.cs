/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
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
    /// A list of SynSets for returning from SimSage for viewing.
    /// </summary>
    [DataContract(Name = "CMSynSetList")]
    public partial class CMSynSetList : IEquatable<CMSynSetList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSynSetList" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSynSetList() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSynSetList" /> class.
        /// </summary>
        /// <param name="list">A list of CMSynSet items (required).</param>
        /// <param name="totalSize">the number of total SynSet items in your query (required).</param>
        public CMSynSetList(string list = default(string), int totalSize = default(int))
        {
            // to ensure "list" is required (not null)
            if (list == null)
            {
                throw new ArgumentNullException("list is a required property for CMSynSetList and cannot be null");
            }
            this.List = list;
            this.TotalSize = totalSize;
        }

        /// <summary>
        /// A list of CMSynSet items
        /// </summary>
        /// <value>A list of CMSynSet items</value>
        [DataMember(Name = "list", IsRequired = true, EmitDefaultValue = true)]
        public string List { get; set; }

        /// <summary>
        /// the number of total SynSet items in your query
        /// </summary>
        /// <value>the number of total SynSet items in your query</value>
        [DataMember(Name = "totalSize", IsRequired = true, EmitDefaultValue = true)]
        public int TotalSize { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSynSetList {\n");
            sb.Append("  List: ").Append(List).Append("\n");
            sb.Append("  TotalSize: ").Append(TotalSize).Append("\n");
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
            return this.Equals(input as CMSynSetList);
        }

        /// <summary>
        /// Returns true if CMSynSetList instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSynSetList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSynSetList input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.List == input.List ||
                    (this.List != null &&
                    this.List.Equals(input.List))
                ) && 
                (
                    this.TotalSize == input.TotalSize ||
                    this.TotalSize.Equals(input.TotalSize)
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
                if (this.List != null)
                {
                    hashCode = (hashCode * 59) + this.List.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TotalSize.GetHashCode();
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
