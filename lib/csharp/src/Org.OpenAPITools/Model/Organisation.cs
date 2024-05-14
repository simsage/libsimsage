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
    /// Organisation
    /// </summary>
    [DataContract(Name = "Organisation")]
    public partial class Organisation : IEquatable<Organisation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Organisation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Organisation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Organisation" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="enabled">enabled (required).</param>
        /// <param name="autoCreateSSOUsers">autoCreateSSOUsers (required).</param>
        /// <param name="autoCreateSSODomainList">autoCreateSSODomainList (required).</param>
        /// <param name="autoCreateSSOACLList">autoCreateSSOACLList (required).</param>
        /// <param name="autoCreateSSORoleList">autoCreateSSORoleList (required).</param>
        public Organisation(string id = default(string), string name = default(string), bool enabled = default(bool), bool autoCreateSSOUsers = default(bool), List<string> autoCreateSSODomainList = default(List<string>), List<string> autoCreateSSOACLList = default(List<string>), List<string> autoCreateSSORoleList = default(List<string>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for Organisation and cannot be null");
            }
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for Organisation and cannot be null");
            }
            this.Name = name;
            this.Enabled = enabled;
            this.AutoCreateSSOUsers = autoCreateSSOUsers;
            // to ensure "autoCreateSSODomainList" is required (not null)
            if (autoCreateSSODomainList == null)
            {
                throw new ArgumentNullException("autoCreateSSODomainList is a required property for Organisation and cannot be null");
            }
            this.AutoCreateSSODomainList = autoCreateSSODomainList;
            // to ensure "autoCreateSSOACLList" is required (not null)
            if (autoCreateSSOACLList == null)
            {
                throw new ArgumentNullException("autoCreateSSOACLList is a required property for Organisation and cannot be null");
            }
            this.AutoCreateSSOACLList = autoCreateSSOACLList;
            // to ensure "autoCreateSSORoleList" is required (not null)
            if (autoCreateSSORoleList == null)
            {
                throw new ArgumentNullException("autoCreateSSORoleList is a required property for Organisation and cannot be null");
            }
            this.AutoCreateSSORoleList = autoCreateSSORoleList;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Enabled
        /// </summary>
        [DataMember(Name = "enabled", IsRequired = true, EmitDefaultValue = true)]
        public bool Enabled { get; set; }

        /// <summary>
        /// Gets or Sets AutoCreateSSOUsers
        /// </summary>
        [DataMember(Name = "autoCreateSSOUsers", IsRequired = true, EmitDefaultValue = true)]
        public bool AutoCreateSSOUsers { get; set; }

        /// <summary>
        /// Gets or Sets AutoCreateSSODomainList
        /// </summary>
        [DataMember(Name = "autoCreateSSODomainList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> AutoCreateSSODomainList { get; set; }

        /// <summary>
        /// Gets or Sets AutoCreateSSOACLList
        /// </summary>
        [DataMember(Name = "autoCreateSSOACLList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> AutoCreateSSOACLList { get; set; }

        /// <summary>
        /// Gets or Sets AutoCreateSSORoleList
        /// </summary>
        [DataMember(Name = "autoCreateSSORoleList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> AutoCreateSSORoleList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Organisation {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  AutoCreateSSOUsers: ").Append(AutoCreateSSOUsers).Append("\n");
            sb.Append("  AutoCreateSSODomainList: ").Append(AutoCreateSSODomainList).Append("\n");
            sb.Append("  AutoCreateSSOACLList: ").Append(AutoCreateSSOACLList).Append("\n");
            sb.Append("  AutoCreateSSORoleList: ").Append(AutoCreateSSORoleList).Append("\n");
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
            return this.Equals(input as Organisation);
        }

        /// <summary>
        /// Returns true if Organisation instances are equal
        /// </summary>
        /// <param name="input">Instance of Organisation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Organisation input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Enabled == input.Enabled ||
                    this.Enabled.Equals(input.Enabled)
                ) && 
                (
                    this.AutoCreateSSOUsers == input.AutoCreateSSOUsers ||
                    this.AutoCreateSSOUsers.Equals(input.AutoCreateSSOUsers)
                ) && 
                (
                    this.AutoCreateSSODomainList == input.AutoCreateSSODomainList ||
                    this.AutoCreateSSODomainList != null &&
                    input.AutoCreateSSODomainList != null &&
                    this.AutoCreateSSODomainList.SequenceEqual(input.AutoCreateSSODomainList)
                ) && 
                (
                    this.AutoCreateSSOACLList == input.AutoCreateSSOACLList ||
                    this.AutoCreateSSOACLList != null &&
                    input.AutoCreateSSOACLList != null &&
                    this.AutoCreateSSOACLList.SequenceEqual(input.AutoCreateSSOACLList)
                ) && 
                (
                    this.AutoCreateSSORoleList == input.AutoCreateSSORoleList ||
                    this.AutoCreateSSORoleList != null &&
                    input.AutoCreateSSORoleList != null &&
                    this.AutoCreateSSORoleList.SequenceEqual(input.AutoCreateSSORoleList)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Enabled.GetHashCode();
                hashCode = (hashCode * 59) + this.AutoCreateSSOUsers.GetHashCode();
                if (this.AutoCreateSSODomainList != null)
                {
                    hashCode = (hashCode * 59) + this.AutoCreateSSODomainList.GetHashCode();
                }
                if (this.AutoCreateSSOACLList != null)
                {
                    hashCode = (hashCode * 59) + this.AutoCreateSSOACLList.GetHashCode();
                }
                if (this.AutoCreateSSORoleList != null)
                {
                    hashCode = (hashCode * 59) + this.AutoCreateSSORoleList.GetHashCode();
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
