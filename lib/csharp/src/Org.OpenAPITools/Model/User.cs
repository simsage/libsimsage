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
    /// User
    /// </summary>
    [DataContract(Name = "User")]
    public partial class User : IEquatable<User>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected User() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="User" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="email">email (required).</param>
        /// <param name="firstName">firstName (required).</param>
        /// <param name="surname">surname (required).</param>
        /// <param name="passwordHash">passwordHash (required).</param>
        /// <param name="confirmed">confirmed (required).</param>
        /// <param name="roles">roles (required).</param>
        /// <param name="operatorKBList">operatorKBList (required).</param>
        /// <param name="groupList">groupList (required).</param>
        /// <param name="jwtMatchNameValueCSV">jwtMatchNameValueCSV (required).</param>
        public User(string id = default(string), string email = default(string), string firstName = default(string), string surname = default(string), string passwordHash = default(string), bool confirmed = default(bool), List<UserRole> roles = default(List<UserRole>), List<OperatorKnowledgeBase> operatorKBList = default(List<OperatorKnowledgeBase>), List<Group> groupList = default(List<Group>), string jwtMatchNameValueCSV = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for User and cannot be null");
            }
            this.Id = id;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for User and cannot be null");
            }
            this.Email = email;
            // to ensure "firstName" is required (not null)
            if (firstName == null)
            {
                throw new ArgumentNullException("firstName is a required property for User and cannot be null");
            }
            this.FirstName = firstName;
            // to ensure "surname" is required (not null)
            if (surname == null)
            {
                throw new ArgumentNullException("surname is a required property for User and cannot be null");
            }
            this.Surname = surname;
            // to ensure "passwordHash" is required (not null)
            if (passwordHash == null)
            {
                throw new ArgumentNullException("passwordHash is a required property for User and cannot be null");
            }
            this.PasswordHash = passwordHash;
            this.Confirmed = confirmed;
            // to ensure "roles" is required (not null)
            if (roles == null)
            {
                throw new ArgumentNullException("roles is a required property for User and cannot be null");
            }
            this.Roles = roles;
            // to ensure "operatorKBList" is required (not null)
            if (operatorKBList == null)
            {
                throw new ArgumentNullException("operatorKBList is a required property for User and cannot be null");
            }
            this.OperatorKBList = operatorKBList;
            // to ensure "groupList" is required (not null)
            if (groupList == null)
            {
                throw new ArgumentNullException("groupList is a required property for User and cannot be null");
            }
            this.GroupList = groupList;
            // to ensure "jwtMatchNameValueCSV" is required (not null)
            if (jwtMatchNameValueCSV == null)
            {
                throw new ArgumentNullException("jwtMatchNameValueCSV is a required property for User and cannot be null");
            }
            this.JwtMatchNameValueCSV = jwtMatchNameValueCSV;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "firstName", IsRequired = true, EmitDefaultValue = true)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets Surname
        /// </summary>
        [DataMember(Name = "surname", IsRequired = true, EmitDefaultValue = true)]
        public string Surname { get; set; }

        /// <summary>
        /// Gets or Sets PasswordHash
        /// </summary>
        [DataMember(Name = "passwordHash", IsRequired = true, EmitDefaultValue = true)]
        public string PasswordHash { get; set; }

        /// <summary>
        /// Gets or Sets Confirmed
        /// </summary>
        [DataMember(Name = "confirmed", IsRequired = true, EmitDefaultValue = true)]
        public bool Confirmed { get; set; }

        /// <summary>
        /// Gets or Sets Roles
        /// </summary>
        [DataMember(Name = "roles", IsRequired = true, EmitDefaultValue = true)]
        public List<UserRole> Roles { get; set; }

        /// <summary>
        /// Gets or Sets OperatorKBList
        /// </summary>
        [DataMember(Name = "operatorKBList", IsRequired = true, EmitDefaultValue = true)]
        public List<OperatorKnowledgeBase> OperatorKBList { get; set; }

        /// <summary>
        /// Gets or Sets GroupList
        /// </summary>
        [DataMember(Name = "groupList", IsRequired = true, EmitDefaultValue = true)]
        public List<Group> GroupList { get; set; }

        /// <summary>
        /// Gets or Sets JwtMatchNameValueCSV
        /// </summary>
        [DataMember(Name = "jwtMatchNameValueCSV", IsRequired = true, EmitDefaultValue = true)]
        public string JwtMatchNameValueCSV { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class User {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Surname: ").Append(Surname).Append("\n");
            sb.Append("  PasswordHash: ").Append(PasswordHash).Append("\n");
            sb.Append("  Confirmed: ").Append(Confirmed).Append("\n");
            sb.Append("  Roles: ").Append(Roles).Append("\n");
            sb.Append("  OperatorKBList: ").Append(OperatorKBList).Append("\n");
            sb.Append("  GroupList: ").Append(GroupList).Append("\n");
            sb.Append("  JwtMatchNameValueCSV: ").Append(JwtMatchNameValueCSV).Append("\n");
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
            return this.Equals(input as User);
        }

        /// <summary>
        /// Returns true if User instances are equal
        /// </summary>
        /// <param name="input">Instance of User to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(User input)
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
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.Surname == input.Surname ||
                    (this.Surname != null &&
                    this.Surname.Equals(input.Surname))
                ) && 
                (
                    this.PasswordHash == input.PasswordHash ||
                    (this.PasswordHash != null &&
                    this.PasswordHash.Equals(input.PasswordHash))
                ) && 
                (
                    this.Confirmed == input.Confirmed ||
                    this.Confirmed.Equals(input.Confirmed)
                ) && 
                (
                    this.Roles == input.Roles ||
                    this.Roles != null &&
                    input.Roles != null &&
                    this.Roles.SequenceEqual(input.Roles)
                ) && 
                (
                    this.OperatorKBList == input.OperatorKBList ||
                    this.OperatorKBList != null &&
                    input.OperatorKBList != null &&
                    this.OperatorKBList.SequenceEqual(input.OperatorKBList)
                ) && 
                (
                    this.GroupList == input.GroupList ||
                    this.GroupList != null &&
                    input.GroupList != null &&
                    this.GroupList.SequenceEqual(input.GroupList)
                ) && 
                (
                    this.JwtMatchNameValueCSV == input.JwtMatchNameValueCSV ||
                    (this.JwtMatchNameValueCSV != null &&
                    this.JwtMatchNameValueCSV.Equals(input.JwtMatchNameValueCSV))
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
                if (this.Email != null)
                {
                    hashCode = (hashCode * 59) + this.Email.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.Surname != null)
                {
                    hashCode = (hashCode * 59) + this.Surname.GetHashCode();
                }
                if (this.PasswordHash != null)
                {
                    hashCode = (hashCode * 59) + this.PasswordHash.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Confirmed.GetHashCode();
                if (this.Roles != null)
                {
                    hashCode = (hashCode * 59) + this.Roles.GetHashCode();
                }
                if (this.OperatorKBList != null)
                {
                    hashCode = (hashCode * 59) + this.OperatorKBList.GetHashCode();
                }
                if (this.GroupList != null)
                {
                    hashCode = (hashCode * 59) + this.GroupList.GetHashCode();
                }
                if (this.JwtMatchNameValueCSV != null)
                {
                    hashCode = (hashCode * 59) + this.JwtMatchNameValueCSV.GetHashCode();
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
