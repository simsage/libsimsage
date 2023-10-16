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
    /// Backup
    /// </summary>
    [DataContract(Name = "Backup")]
    public partial class Backup : IEquatable<Backup>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Backup" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Backup() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Backup" /> class.
        /// </summary>
        /// <param name="backupId">backupId (required).</param>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="data">data (required).</param>
        public Backup(long backupId = default(long), string organisationId = default(string), string name = default(string), string data = default(string))
        {
            this.BackupId = backupId;
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for Backup and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for Backup and cannot be null");
            }
            this.Name = name;
            // to ensure "data" is required (not null)
            if (data == null)
            {
                throw new ArgumentNullException("data is a required property for Backup and cannot be null");
            }
            this.Data = data;
        }

        /// <summary>
        /// Gets or Sets BackupId
        /// </summary>
        [DataMember(Name = "backupId", IsRequired = true, EmitDefaultValue = true)]
        public long BackupId { get; set; }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", IsRequired = true, EmitDefaultValue = true)]
        public string Data { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Backup {\n");
            sb.Append("  BackupId: ").Append(BackupId).Append("\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
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
            return this.Equals(input as Backup);
        }

        /// <summary>
        /// Returns true if Backup instances are equal
        /// </summary>
        /// <param name="input">Instance of Backup to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Backup input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BackupId == input.BackupId ||
                    this.BackupId.Equals(input.BackupId)
                ) && 
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
                    this.Data == input.Data ||
                    (this.Data != null &&
                    this.Data.Equals(input.Data))
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
                hashCode = (hashCode * 59) + this.BackupId.GetHashCode();
                if (this.OrganisationId != null)
                {
                    hashCode = (hashCode * 59) + this.OrganisationId.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Data != null)
                {
                    hashCode = (hashCode * 59) + this.Data.GetHashCode();
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
