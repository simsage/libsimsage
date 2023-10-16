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
    /// A SimSage combined session / user and version object.  This is the object returned when you&#39;ve signed-in successfully.
    /// </summary>
    [DataContract(Name = "CMSessionVersion")]
    public partial class CMSessionVersion : IEquatable<CMSessionVersion>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSessionVersion" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMSessionVersion() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMSessionVersion" /> class.
        /// </summary>
        /// <param name="session">session (required).</param>
        /// <param name="user">user (required).</param>
        /// <param name="organisationList">list of organisations for admin users (required).</param>
        /// <param name="varVersion">version of this service (required).</param>
        public CMSessionVersion(CMSession session = default(CMSession), CMUser user = default(CMUser), List<CMOrganisation> organisationList = default(List<CMOrganisation>), string varVersion = default(string))
        {
            // to ensure "session" is required (not null)
            if (session == null)
            {
                throw new ArgumentNullException("session is a required property for CMSessionVersion and cannot be null");
            }
            this.Session = session;
            // to ensure "user" is required (not null)
            if (user == null)
            {
                throw new ArgumentNullException("user is a required property for CMSessionVersion and cannot be null");
            }
            this.User = user;
            // to ensure "organisationList" is required (not null)
            if (organisationList == null)
            {
                throw new ArgumentNullException("organisationList is a required property for CMSessionVersion and cannot be null");
            }
            this.OrganisationList = organisationList;
            // to ensure "varVersion" is required (not null)
            if (varVersion == null)
            {
                throw new ArgumentNullException("varVersion is a required property for CMSessionVersion and cannot be null");
            }
            this.VarVersion = varVersion;
        }

        /// <summary>
        /// Gets or Sets Session
        /// </summary>
        [DataMember(Name = "session", IsRequired = true, EmitDefaultValue = true)]
        public CMSession Session { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name = "user", IsRequired = true, EmitDefaultValue = true)]
        public CMUser User { get; set; }

        /// <summary>
        /// list of organisations for admin users
        /// </summary>
        /// <value>list of organisations for admin users</value>
        [DataMember(Name = "organisationList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMOrganisation> OrganisationList { get; set; }

        /// <summary>
        /// version of this service
        /// </summary>
        /// <value>version of this service</value>
        /// <example>7.5.9</example>
        [DataMember(Name = "version", IsRequired = true, EmitDefaultValue = true)]
        public string VarVersion { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMSessionVersion {\n");
            sb.Append("  Session: ").Append(Session).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  OrganisationList: ").Append(OrganisationList).Append("\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
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
            return this.Equals(input as CMSessionVersion);
        }

        /// <summary>
        /// Returns true if CMSessionVersion instances are equal
        /// </summary>
        /// <param name="input">Instance of CMSessionVersion to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMSessionVersion input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Session == input.Session ||
                    (this.Session != null &&
                    this.Session.Equals(input.Session))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.OrganisationList == input.OrganisationList ||
                    this.OrganisationList != null &&
                    input.OrganisationList != null &&
                    this.OrganisationList.SequenceEqual(input.OrganisationList)
                ) && 
                (
                    this.VarVersion == input.VarVersion ||
                    (this.VarVersion != null &&
                    this.VarVersion.Equals(input.VarVersion))
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
                if (this.Session != null)
                {
                    hashCode = (hashCode * 59) + this.Session.GetHashCode();
                }
                if (this.User != null)
                {
                    hashCode = (hashCode * 59) + this.User.GetHashCode();
                }
                if (this.OrganisationList != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationList.GetHashCode();
                }
                if (this.VarVersion != null)
                {
                    hashCode = (hashCode * 59) + this.VarVersion.GetHashCode();
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
