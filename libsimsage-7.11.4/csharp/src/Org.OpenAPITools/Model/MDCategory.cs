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
    /// A SimSage category is a metadata description in SimSage.  This object represents a single piece of categorical data that is uploaded to SimSage from external sources as part of a CMDocumentUpload request.
    /// </summary>
    [DataContract(Name = "MDCategory")]
    public partial class MDCategory : IEquatable<MDCategory>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MDCategory" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MDCategory() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MDCategory" /> class.
        /// </summary>
        /// <param name="key">The SimSage type of category (required).</param>
        /// <param name="display">A friendly display name for any UI component rendering this component (required).</param>
        /// <param name="metadata">The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string. (required).</param>
        /// <param name="stringValueList">A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; (required).</param>
        /// <param name="numberValueList">Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot; (required).</param>
        /// <param name="sort">Is this category to be sort-able in the UI? (required).</param>
        /// <param name="order">What order does this item have in the UI display? (required).</param>
        /// <param name="sortDefault">Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty. (required).</param>
        /// <param name="sortAscText">If sortable, what label should the UI display for ascending sort? (required).</param>
        /// <param name="sortDescText">If sortable, what label should the UI display for descending sort? (required).</param>
        public MDCategory(string key = default(string), string display = default(string), string metadata = default(string), string stringValueList = default(string), string numberValueList = default(string), bool sort = default(bool), int order = default(int), string sortDefault = default(string), string sortAscText = default(string), string sortDescText = default(string))
        {
            // to ensure "key" is required (not null)
            if (key == null)
            {
                throw new ArgumentNullException("key is a required property for MDCategory and cannot be null");
            }
            this.Key = key;
            // to ensure "display" is required (not null)
            if (display == null)
            {
                throw new ArgumentNullException("display is a required property for MDCategory and cannot be null");
            }
            this.Display = display;
            // to ensure "metadata" is required (not null)
            if (metadata == null)
            {
                throw new ArgumentNullException("metadata is a required property for MDCategory and cannot be null");
            }
            this.Metadata = metadata;
            // to ensure "stringValueList" is required (not null)
            if (stringValueList == null)
            {
                throw new ArgumentNullException("stringValueList is a required property for MDCategory and cannot be null");
            }
            this.StringValueList = stringValueList;
            // to ensure "numberValueList" is required (not null)
            if (numberValueList == null)
            {
                throw new ArgumentNullException("numberValueList is a required property for MDCategory and cannot be null");
            }
            this.NumberValueList = numberValueList;
            this.Sort = sort;
            this.Order = order;
            // to ensure "sortDefault" is required (not null)
            if (sortDefault == null)
            {
                throw new ArgumentNullException("sortDefault is a required property for MDCategory and cannot be null");
            }
            this.SortDefault = sortDefault;
            // to ensure "sortAscText" is required (not null)
            if (sortAscText == null)
            {
                throw new ArgumentNullException("sortAscText is a required property for MDCategory and cannot be null");
            }
            this.SortAscText = sortAscText;
            // to ensure "sortDescText" is required (not null)
            if (sortDescText == null)
            {
                throw new ArgumentNullException("sortDescText is a required property for MDCategory and cannot be null");
            }
            this.SortDescText = sortDescText;
        }

        /// <summary>
        /// The SimSage type of category
        /// </summary>
        /// <value>The SimSage type of category</value>
        /// <example>one of: select if true,star rating,number range,monetary x 100 range,monetary range,csv string,category,url-image,base64-image,binary-blob-image</example>
        [DataMember(Name = "key", IsRequired = true, EmitDefaultValue = true)]
        public string Key { get; set; }

        /// <summary>
        /// A friendly display name for any UI component rendering this component
        /// </summary>
        /// <value>A friendly display name for any UI component rendering this component</value>
        /// <example>The price of the item</example>
        [DataMember(Name = "display", IsRequired = true, EmitDefaultValue = true)]
        public string Display { get; set; }

        /// <summary>
        /// The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string.
        /// </summary>
        /// <value>The metadata-name inside SimSage for this item.  Only a..z A..Z 0..9 and - are allowed as characters in this string.</value>
        /// <example>price</example>
        [DataMember(Name = "metadata", IsRequired = true, EmitDefaultValue = true)]
        public string Metadata { get; set; }

        /// <summary>
        /// A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot;
        /// </summary>
        /// <value>A list of string values (if string based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot;</value>
        /// <example>pants,shorts</example>
        [DataMember(Name = "stringValueList", IsRequired = true, EmitDefaultValue = true)]
        public string StringValueList { get; set; }

        /// <summary>
        /// Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot;
        /// </summary>
        /// <value>Alternatively, a list of numeric values (if number based) for this metadata category item.  These are the values this document \&quot;belongs to\&quot;</value>
        /// <example>1.0</example>
        [DataMember(Name = "numberValueList", IsRequired = true, EmitDefaultValue = true)]
        public string NumberValueList { get; set; }

        /// <summary>
        /// Is this category to be sort-able in the UI?
        /// </summary>
        /// <value>Is this category to be sort-able in the UI?</value>
        /// <example>false</example>
        [DataMember(Name = "sort", IsRequired = true, EmitDefaultValue = true)]
        public bool Sort { get; set; }

        /// <summary>
        /// What order does this item have in the UI display?
        /// </summary>
        /// <value>What order does this item have in the UI display?</value>
        /// <example>0</example>
        [DataMember(Name = "order", IsRequired = true, EmitDefaultValue = true)]
        public int Order { get; set; }

        /// <summary>
        /// Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty.
        /// </summary>
        /// <value>Is this item THE default sort item in the UI, and if so, is it ascending (asc) or descending (desc).  Not the default sort if empty.</value>
        /// <example>one of: asc, desc</example>
        [DataMember(Name = "sortDefault", IsRequired = true, EmitDefaultValue = true)]
        public string SortDefault { get; set; }

        /// <summary>
        /// If sortable, what label should the UI display for ascending sort?
        /// </summary>
        /// <value>If sortable, what label should the UI display for ascending sort?</value>
        /// <example>Lowest to highest price</example>
        [DataMember(Name = "sortAscText", IsRequired = true, EmitDefaultValue = true)]
        public string SortAscText { get; set; }

        /// <summary>
        /// If sortable, what label should the UI display for descending sort?
        /// </summary>
        /// <value>If sortable, what label should the UI display for descending sort?</value>
        /// <example>Highest to lowest price</example>
        [DataMember(Name = "sortDescText", IsRequired = true, EmitDefaultValue = true)]
        public string SortDescText { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MDCategory {\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Display: ").Append(Display).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  StringValueList: ").Append(StringValueList).Append("\n");
            sb.Append("  NumberValueList: ").Append(NumberValueList).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("  SortDefault: ").Append(SortDefault).Append("\n");
            sb.Append("  SortAscText: ").Append(SortAscText).Append("\n");
            sb.Append("  SortDescText: ").Append(SortDescText).Append("\n");
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
            return this.Equals(input as MDCategory);
        }

        /// <summary>
        /// Returns true if MDCategory instances are equal
        /// </summary>
        /// <param name="input">Instance of MDCategory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MDCategory input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Key == input.Key ||
                    (this.Key != null &&
                    this.Key.Equals(input.Key))
                ) && 
                (
                    this.Display == input.Display ||
                    (this.Display != null &&
                    this.Display.Equals(input.Display))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    (this.Metadata != null &&
                    this.Metadata.Equals(input.Metadata))
                ) && 
                (
                    this.StringValueList == input.StringValueList ||
                    (this.StringValueList != null &&
                    this.StringValueList.Equals(input.StringValueList))
                ) && 
                (
                    this.NumberValueList == input.NumberValueList ||
                    (this.NumberValueList != null &&
                    this.NumberValueList.Equals(input.NumberValueList))
                ) && 
                (
                    this.Sort == input.Sort ||
                    this.Sort.Equals(input.Sort)
                ) && 
                (
                    this.Order == input.Order ||
                    this.Order.Equals(input.Order)
                ) && 
                (
                    this.SortDefault == input.SortDefault ||
                    (this.SortDefault != null &&
                    this.SortDefault.Equals(input.SortDefault))
                ) && 
                (
                    this.SortAscText == input.SortAscText ||
                    (this.SortAscText != null &&
                    this.SortAscText.Equals(input.SortAscText))
                ) && 
                (
                    this.SortDescText == input.SortDescText ||
                    (this.SortDescText != null &&
                    this.SortDescText.Equals(input.SortDescText))
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
                if (this.Key != null)
                {
                    hashCode = (hashCode * 59) + this.Key.GetHashCode();
                }
                if (this.Display != null)
                {
                    hashCode = (hashCode * 59) + this.Display.GetHashCode();
                }
                if (this.Metadata != null)
                {
                    hashCode = (hashCode * 59) + this.Metadata.GetHashCode();
                }
                if (this.StringValueList != null)
                {
                    hashCode = (hashCode * 59) + this.StringValueList.GetHashCode();
                }
                if (this.NumberValueList != null)
                {
                    hashCode = (hashCode * 59) + this.NumberValueList.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sort.GetHashCode();
                hashCode = (hashCode * 59) + this.Order.GetHashCode();
                if (this.SortDefault != null)
                {
                    hashCode = (hashCode * 59) + this.SortDefault.GetHashCode();
                }
                if (this.SortAscText != null)
                {
                    hashCode = (hashCode * 59) + this.SortAscText.GetHashCode();
                }
                if (this.SortDescText != null)
                {
                    hashCode = (hashCode * 59) + this.SortDescText.GetHashCode();
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
