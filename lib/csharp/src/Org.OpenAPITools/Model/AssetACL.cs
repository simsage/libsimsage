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
    /// AssetACL
    /// </summary>
    [DataContract(Name = "AssetACL")]
    public partial class AssetACL : IEquatable<AssetACL>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AssetACL" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AssetACL() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AssetACL" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="displayName">displayName (required).</param>
        /// <param name="access">access (required).</param>
        /// <param name="isUser">isUser (required).</param>
        /// <param name="membershipList">membershipList (required).</param>
        /// <param name="user">user.</param>
        public AssetACL(string name = default(string), string displayName = default(string), string access = default(string), bool isUser = default(bool), List<string> membershipList = default(List<string>), bool user = default(bool))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for AssetACL and cannot be null");
            }
            this.Name = name;
            // to ensure "displayName" is required (not null)
            if (displayName == null)
            {
                throw new ArgumentNullException("displayName is a required property for AssetACL and cannot be null");
            }
            this.DisplayName = displayName;
            // to ensure "access" is required (not null)
            if (access == null)
            {
                throw new ArgumentNullException("access is a required property for AssetACL and cannot be null");
            }
            this.Access = access;
            this.IsUser = isUser;
            // to ensure "membershipList" is required (not null)
            if (membershipList == null)
            {
                throw new ArgumentNullException("membershipList is a required property for AssetACL and cannot be null");
            }
            this.MembershipList = membershipList;
            this.User = user;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets DisplayName
        /// </summary>
        [DataMember(Name = "displayName", IsRequired = true, EmitDefaultValue = true)]
        public string DisplayName { get; set; }

        /// <summary>
        /// Gets or Sets Access
        /// </summary>
        [DataMember(Name = "access", IsRequired = true, EmitDefaultValue = true)]
        public string Access { get; set; }

        /// <summary>
        /// Gets or Sets IsUser
        /// </summary>
        [DataMember(Name = "isUser", IsRequired = true, EmitDefaultValue = true)]
        public bool IsUser { get; set; }

        /// <summary>
        /// Gets or Sets MembershipList
        /// </summary>
        [DataMember(Name = "membershipList", IsRequired = true, EmitDefaultValue = true)]
        public List<string> MembershipList { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", EmitDefaultValue = true)]
        public bool User { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AssetACL {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  Access: ").Append(Access).Append("\n");
            sb.Append("  IsUser: ").Append(IsUser).Append("\n");
            sb.Append("  MembershipList: ").Append(MembershipList).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
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
            return this.Equals(input as AssetACL);
        }

        /// <summary>
        /// Returns true if AssetACL instances are equal
        /// </summary>
        /// <param name="input">Instance of AssetACL to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AssetACL input)
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
                    this.DisplayName == input.DisplayName ||
                    (this.DisplayName != null &&
                    this.DisplayName.Equals(input.DisplayName))
                ) && 
                (
                    this.Access == input.Access ||
                    (this.Access != null &&
                    this.Access.Equals(input.Access))
                ) && 
                (
                    this.IsUser == input.IsUser ||
                    this.IsUser.Equals(input.IsUser)
                ) && 
                (
                    this.MembershipList == input.MembershipList ||
                    this.MembershipList != null &&
                    input.MembershipList != null &&
                    this.MembershipList.SequenceEqual(input.MembershipList)
                ) && 
                (
                    this.User == input.User ||
                    this.User.Equals(input.User)
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
                if (this.DisplayName != null)
                {
                    hashCode = (hashCode * 59) + this.DisplayName.GetHashCode();
                }
                if (this.Access != null)
                {
                    hashCode = (hashCode * 59) + this.Access.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsUser.GetHashCode();
                if (this.MembershipList != null)
                {
                    hashCode = (hashCode * 59) + this.MembershipList.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.User.GetHashCode();
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
