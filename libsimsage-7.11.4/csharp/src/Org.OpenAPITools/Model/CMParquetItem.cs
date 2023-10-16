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
    /// A single parquet item, a name with a timestamp.
    /// </summary>
    [DataContract(Name = "CMParquetItem")]
    public partial class CMParquetItem : IEquatable<CMParquetItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMParquetItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMParquetItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMParquetItem" /> class.
        /// </summary>
        /// <param name="name">the name / type of item (required).</param>
        /// <param name="time">a unix-time for this parquet item (required).</param>
        public CMParquetItem(string name = default(string), long time = default(long))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CMParquetItem and cannot be null");
            }
            this.Name = name;
            this.Time = time;
        }

        /// <summary>
        /// the name / type of item
        /// </summary>
        /// <value>the name / type of item</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// a unix-time for this parquet item
        /// </summary>
        /// <value>a unix-time for this parquet item</value>
        [DataMember(Name = "time", IsRequired = true, EmitDefaultValue = true)]
        public long Time { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMParquetItem {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
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
            return this.Equals(input as CMParquetItem);
        }

        /// <summary>
        /// Returns true if CMParquetItem instances are equal
        /// </summary>
        /// <param name="input">Instance of CMParquetItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMParquetItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Time == input.Time ||
                    this.Time.Equals(input.Time)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Time.GetHashCode();
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