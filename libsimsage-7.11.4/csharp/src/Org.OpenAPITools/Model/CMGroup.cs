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
    /// A security-group object.  Groups can contain security users and are used to group/clump users.
    /// </summary>
    [DataContract(Name = "CMGroup")]
    public partial class CMGroup : IEquatable<CMGroup>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGroup" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMGroup() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMGroup" /> class.
        /// </summary>
        /// <param name="organisationId">the organisation (its guid id) this group is associated with (required).</param>
        /// <param name="name">the name of this group (required).</param>
        /// <param name="userIdList">a list of user-ids (can be empty) part of this group (required).</param>
        public CMGroup(string organisationId = default(string), string name = default(string), List<string> userIdList = default(List<string>))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMGroup and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for CMGroup and cannot be null");
            }
            this.Name = name;
            // to ensure "userIdList" is required (not null)
            if (userIdList == null)
            {
                throw new ArgumentNullException("userIdList is a required property for CMGroup and cannot be null");
            }
            this.UserIdList = userIdList;
        }

        /// <summary>
        /// the organisation (its guid id) this group is associated with
        /// </summary>
        /// <value>the organisation (its guid id) this group is associated with</value>
        /// <example>00000000-0000-0000-0000-000000000001</example>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// the name of this group
        /// </summary>
        /// <value>the name of this group</value>
        /// <example>Domain Users</example>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// a list of user-ids (can be empty) part of this group
        /// </summary>
        /// <value>a list of user-ids (can be empty) part of this group</value>
        [DataMember(Name = "userIdList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> UserIdList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMGroup {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  UserIdList: ").Append(UserIdList).Append("\n");
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
            return this.Equals(input as CMGroup);
        }

        /// <summary>
        /// Returns true if CMGroup instances are equal
        /// </summary>
        /// <param name="input">Instance of CMGroup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMGroup input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.UserIdList == input.UserIdList ||
                    this.UserIdList != null &&
                    input.UserIdList != null &&
                    this.UserIdList.SequenceEqual(input.UserIdList)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.UserIdList != null)
                {
                    hashCode = (hashCode * 59) + this.UserIdList.GetHashCode();
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