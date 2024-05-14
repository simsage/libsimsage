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
    /// A document Access Control List (ACL) item.  This item represents a user&#39;s/group&#39;s access to a document (hasAccess or not).
    /// </summary>
    [DataContract(Name = "CMDocumentAcl")]
    public partial class CMDocumentAcl : IEquatable<CMDocumentAcl>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentAcl" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDocumentAcl() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDocumentAcl" /> class.
        /// </summary>
        /// <param name="acl">Some acl value, can represent a user&#39;s email address or the name of a remote security-group. (required).</param>
        /// <param name="access">is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty) (required).</param>
        /// <param name="isUser">\&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name) (required).</param>
        /// <param name="user">user.</param>
        public CMDocumentAcl(string acl = default(string), string access = default(string), bool isUser = default(bool), bool user = default(bool))
        {
            // to ensure "acl" is required (not null)
            if (acl == null)
            {
                throw new ArgumentNullException("acl is a required property for CMDocumentAcl and cannot be null");
            }
            this.Acl = acl;
            // to ensure "access" is required (not null)
            if (access == null)
            {
                throw new ArgumentNullException("access is a required property for CMDocumentAcl and cannot be null");
            }
            this.Access = access;
            this.IsUser = isUser;
            this.User = user;
        }

        /// <summary>
        /// Some acl value, can represent a user&#39;s email address or the name of a remote security-group.
        /// </summary>
        /// <value>Some acl value, can represent a user&#39;s email address or the name of a remote security-group.</value>
        /// <example>e.g. &quot;example@simsage.co.uk&quot; or &quot;domain users&quot;</example>
        [DataMember(Name = "acl", IsRequired = true, EmitDefaultValue = true)]
        public string Acl { get; set; }

        /// <summary>
        /// is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty)
        /// </summary>
        /// <value>is this ACL allowing access (Read/Write/Delete/Modify (RWDM)) or denying access (empty)</value>
        /// <example>RW</example>
        [DataMember(Name = "access", IsRequired = true, EmitDefaultValue = true)]
        public string Access { get; set; }

        /// <summary>
        /// \&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name)
        /// </summary>
        /// <value>\&quot;true\&quot; if this a security-user (email address), \&quot;false\&quot; if this ACL pertains to a security-group (group name)</value>
        /// <example>true</example>
        [DataMember(Name = "isUser", IsRequired = true, EmitDefaultValue = true)]
        public bool IsUser { get; set; }

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
            sb.Append("class CMDocumentAcl {\n");
            sb.Append("  Acl: ").Append(Acl).Append("\n");
            sb.Append("  Access: ").Append(Access).Append("\n");
            sb.Append("  IsUser: ").Append(IsUser).Append("\n");
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
            return this.Equals(input as CMDocumentAcl);
        }

        /// <summary>
        /// Returns true if CMDocumentAcl instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDocumentAcl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDocumentAcl input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Acl == input.Acl ||
                    (this.Acl != null &&
                    this.Acl.Equals(input.Acl))
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
                if (this.Acl != null)
                {
                    hashCode = (hashCode * 59) + this.Acl.GetHashCode();
                }
                if (this.Access != null)
                {
                    hashCode = (hashCode * 59) + this.Access.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsUser.GetHashCode();
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
