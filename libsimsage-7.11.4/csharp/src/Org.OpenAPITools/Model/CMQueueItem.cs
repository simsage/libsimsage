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
    /// CMQueueItem
    /// </summary>
    [DataContract(Name = "CMQueueItem")]
    public partial class CMQueueItem : IEquatable<CMQueueItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueueItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMQueueItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMQueueItem" /> class.
        /// </summary>
        /// <param name="organisationId">organisationId (required).</param>
        /// <param name="processId">processId (required).</param>
        /// <param name="projectId">projectId (required).</param>
        /// <param name="taskId">taskId (required).</param>
        /// <param name="projectType">projectType (required).</param>
        /// <param name="taskType">taskType (required).</param>
        /// <param name="taskScreen">taskScreen (required).</param>
        /// <param name="projectCreated">projectCreated (required).</param>
        /// <param name="dateTaskCreated">dateTaskCreated (required).</param>
        /// <param name="projectTitle">projectTitle (required).</param>
        /// <param name="taskName">taskName (required).</param>
        /// <param name="assignedUser">assignedUser (required).</param>
        /// <param name="potentialUsers">potentialUsers (required).</param>
        /// <param name="excludedUsers">excludedUsers (required).</param>
        /// <param name="potentialGroups">potentialGroups (required).</param>
        /// <param name="ownsItem">ownsItem (required).</param>
        /// <param name="canClaim">canClaim (required).</param>
        /// <param name="canRelease">canRelease (required).</param>
        /// <param name="lockType">lockType (required).</param>
        public CMQueueItem(string organisationId = default(string), string processId = default(string), string projectId = default(string), string taskId = default(string), string projectType = default(string), string taskType = default(string), string taskScreen = default(string), DateTime projectCreated = default(DateTime), DateTime dateTaskCreated = default(DateTime), string projectTitle = default(string), string taskName = default(string), string assignedUser = default(string), List<string> potentialUsers = default(List<string>), List<string> excludedUsers = default(List<string>), List<string> potentialGroups = default(List<string>), bool ownsItem = default(bool), bool canClaim = default(bool), bool canRelease = default(bool), string lockType = default(string))
        {
            // to ensure "organisationId" is required (not null)
            if (organisationId == null)
            {
                throw new ArgumentNullException("organisationId is a required property for CMQueueItem and cannot be null");
            }
            this.OrganisationId = organisationId;
            // to ensure "processId" is required (not null)
            if (processId == null)
            {
                throw new ArgumentNullException("processId is a required property for CMQueueItem and cannot be null");
            }
            this.ProcessId = processId;
            // to ensure "projectId" is required (not null)
            if (projectId == null)
            {
                throw new ArgumentNullException("projectId is a required property for CMQueueItem and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "taskId" is required (not null)
            if (taskId == null)
            {
                throw new ArgumentNullException("taskId is a required property for CMQueueItem and cannot be null");
            }
            this.TaskId = taskId;
            // to ensure "projectType" is required (not null)
            if (projectType == null)
            {
                throw new ArgumentNullException("projectType is a required property for CMQueueItem and cannot be null");
            }
            this.ProjectType = projectType;
            // to ensure "taskType" is required (not null)
            if (taskType == null)
            {
                throw new ArgumentNullException("taskType is a required property for CMQueueItem and cannot be null");
            }
            this.TaskType = taskType;
            // to ensure "taskScreen" is required (not null)
            if (taskScreen == null)
            {
                throw new ArgumentNullException("taskScreen is a required property for CMQueueItem and cannot be null");
            }
            this.TaskScreen = taskScreen;
            this.ProjectCreated = projectCreated;
            this.DateTaskCreated = dateTaskCreated;
            // to ensure "projectTitle" is required (not null)
            if (projectTitle == null)
            {
                throw new ArgumentNullException("projectTitle is a required property for CMQueueItem and cannot be null");
            }
            this.ProjectTitle = projectTitle;
            // to ensure "taskName" is required (not null)
            if (taskName == null)
            {
                throw new ArgumentNullException("taskName is a required property for CMQueueItem and cannot be null");
            }
            this.TaskName = taskName;
            // to ensure "assignedUser" is required (not null)
            if (assignedUser == null)
            {
                throw new ArgumentNullException("assignedUser is a required property for CMQueueItem and cannot be null");
            }
            this.AssignedUser = assignedUser;
            // to ensure "potentialUsers" is required (not null)
            if (potentialUsers == null)
            {
                throw new ArgumentNullException("potentialUsers is a required property for CMQueueItem and cannot be null");
            }
            this.PotentialUsers = potentialUsers;
            // to ensure "excludedUsers" is required (not null)
            if (excludedUsers == null)
            {
                throw new ArgumentNullException("excludedUsers is a required property for CMQueueItem and cannot be null");
            }
            this.ExcludedUsers = excludedUsers;
            // to ensure "potentialGroups" is required (not null)
            if (potentialGroups == null)
            {
                throw new ArgumentNullException("potentialGroups is a required property for CMQueueItem and cannot be null");
            }
            this.PotentialGroups = potentialGroups;
            this.OwnsItem = ownsItem;
            this.CanClaim = canClaim;
            this.CanRelease = canRelease;
            // to ensure "lockType" is required (not null)
            if (lockType == null)
            {
                throw new ArgumentNullException("lockType is a required property for CMQueueItem and cannot be null");
            }
            this.LockType = lockType;
        }

        /// <summary>
        /// Gets or Sets OrganisationId
        /// </summary>
        [DataMember(Name = "organisationId", IsRequired = true, EmitDefaultValue = true)]
        public string OrganisationId { get; set; }

        /// <summary>
        /// Gets or Sets ProcessId
        /// </summary>
        [DataMember(Name = "processId", IsRequired = true, EmitDefaultValue = true)]
        public string ProcessId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "projectId", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets TaskId
        /// </summary>
        [DataMember(Name = "taskId", IsRequired = true, EmitDefaultValue = true)]
        public string TaskId { get; set; }

        /// <summary>
        /// Gets or Sets ProjectType
        /// </summary>
        [DataMember(Name = "projectType", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectType { get; set; }

        /// <summary>
        /// Gets or Sets TaskType
        /// </summary>
        [DataMember(Name = "taskType", IsRequired = true, EmitDefaultValue = true)]
        public string TaskType { get; set; }

        /// <summary>
        /// Gets or Sets TaskScreen
        /// </summary>
        [DataMember(Name = "taskScreen", IsRequired = true, EmitDefaultValue = true)]
        public string TaskScreen { get; set; }

        /// <summary>
        /// Gets or Sets ProjectCreated
        /// </summary>
        [DataMember(Name = "projectCreated", IsRequired = true, EmitDefaultValue = true)]
        public DateTime ProjectCreated { get; set; }

        /// <summary>
        /// Gets or Sets DateTaskCreated
        /// </summary>
        [DataMember(Name = "dateTaskCreated", IsRequired = true, EmitDefaultValue = true)]
        public DateTime DateTaskCreated { get; set; }

        /// <summary>
        /// Gets or Sets ProjectTitle
        /// </summary>
        [DataMember(Name = "projectTitle", IsRequired = true, EmitDefaultValue = true)]
        public string ProjectTitle { get; set; }

        /// <summary>
        /// Gets or Sets TaskName
        /// </summary>
        [DataMember(Name = "taskName", IsRequired = true, EmitDefaultValue = true)]
        public string TaskName { get; set; }

        /// <summary>
        /// Gets or Sets AssignedUser
        /// </summary>
        [DataMember(Name = "assignedUser", IsRequired = true, EmitDefaultValue = true)]
        public string AssignedUser { get; set; }

        /// <summary>
        /// Gets or Sets PotentialUsers
        /// </summary>
        [DataMember(Name = "potentialUsers", IsRequired = true, EmitDefaultValue = true)]
        public List<string> PotentialUsers { get; set; }

        /// <summary>
        /// Gets or Sets ExcludedUsers
        /// </summary>
        [DataMember(Name = "excludedUsers", IsRequired = true, EmitDefaultValue = true)]
        public List<string> ExcludedUsers { get; set; }

        /// <summary>
        /// Gets or Sets PotentialGroups
        /// </summary>
        [DataMember(Name = "potentialGroups", IsRequired = true, EmitDefaultValue = true)]
        public List<string> PotentialGroups { get; set; }

        /// <summary>
        /// Gets or Sets OwnsItem
        /// </summary>
        [DataMember(Name = "ownsItem", IsRequired = true, EmitDefaultValue = true)]
        public bool OwnsItem { get; set; }

        /// <summary>
        /// Gets or Sets CanClaim
        /// </summary>
        [DataMember(Name = "canClaim", IsRequired = true, EmitDefaultValue = true)]
        public bool CanClaim { get; set; }

        /// <summary>
        /// Gets or Sets CanRelease
        /// </summary>
        [DataMember(Name = "canRelease", IsRequired = true, EmitDefaultValue = true)]
        public bool CanRelease { get; set; }

        /// <summary>
        /// Gets or Sets LockType
        /// </summary>
        [DataMember(Name = "lockType", IsRequired = true, EmitDefaultValue = true)]
        public string LockType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMQueueItem {\n");
            sb.Append("  OrganisationId: ").Append(OrganisationId).Append("\n");
            sb.Append("  ProcessId: ").Append(ProcessId).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  TaskId: ").Append(TaskId).Append("\n");
            sb.Append("  ProjectType: ").Append(ProjectType).Append("\n");
            sb.Append("  TaskType: ").Append(TaskType).Append("\n");
            sb.Append("  TaskScreen: ").Append(TaskScreen).Append("\n");
            sb.Append("  ProjectCreated: ").Append(ProjectCreated).Append("\n");
            sb.Append("  DateTaskCreated: ").Append(DateTaskCreated).Append("\n");
            sb.Append("  ProjectTitle: ").Append(ProjectTitle).Append("\n");
            sb.Append("  TaskName: ").Append(TaskName).Append("\n");
            sb.Append("  AssignedUser: ").Append(AssignedUser).Append("\n");
            sb.Append("  PotentialUsers: ").Append(PotentialUsers).Append("\n");
            sb.Append("  ExcludedUsers: ").Append(ExcludedUsers).Append("\n");
            sb.Append("  PotentialGroups: ").Append(PotentialGroups).Append("\n");
            sb.Append("  OwnsItem: ").Append(OwnsItem).Append("\n");
            sb.Append("  CanClaim: ").Append(CanClaim).Append("\n");
            sb.Append("  CanRelease: ").Append(CanRelease).Append("\n");
            sb.Append("  LockType: ").Append(LockType).Append("\n");
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
            return this.Equals(input as CMQueueItem);
        }

        /// <summary>
        /// Returns true if CMQueueItem instances are equal
        /// </summary>
        /// <param name="input">Instance of CMQueueItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMQueueItem input)
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
                    this.ProcessId == input.ProcessId ||
                    (this.ProcessId != null &&
                    this.ProcessId.Equals(input.ProcessId))
                ) && 
                (
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.TaskId == input.TaskId ||
                    (this.TaskId != null &&
                    this.TaskId.Equals(input.TaskId))
                ) && 
                (
                    this.ProjectType == input.ProjectType ||
                    (this.ProjectType != null &&
                    this.ProjectType.Equals(input.ProjectType))
                ) && 
                (
                    this.TaskType == input.TaskType ||
                    (this.TaskType != null &&
                    this.TaskType.Equals(input.TaskType))
                ) && 
                (
                    this.TaskScreen == input.TaskScreen ||
                    (this.TaskScreen != null &&
                    this.TaskScreen.Equals(input.TaskScreen))
                ) && 
                (
                    this.ProjectCreated == input.ProjectCreated ||
                    (this.ProjectCreated != null &&
                    this.ProjectCreated.Equals(input.ProjectCreated))
                ) && 
                (
                    this.DateTaskCreated == input.DateTaskCreated ||
                    (this.DateTaskCreated != null &&
                    this.DateTaskCreated.Equals(input.DateTaskCreated))
                ) && 
                (
                    this.ProjectTitle == input.ProjectTitle ||
                    (this.ProjectTitle != null &&
                    this.ProjectTitle.Equals(input.ProjectTitle))
                ) && 
                (
                    this.TaskName == input.TaskName ||
                    (this.TaskName != null &&
                    this.TaskName.Equals(input.TaskName))
                ) && 
                (
                    this.AssignedUser == input.AssignedUser ||
                    (this.AssignedUser != null &&
                    this.AssignedUser.Equals(input.AssignedUser))
                ) && 
                (
                    this.PotentialUsers == input.PotentialUsers ||
                    this.PotentialUsers != null &&
                    input.PotentialUsers != null &&
                    this.PotentialUsers.SequenceEqual(input.PotentialUsers)
                ) && 
                (
                    this.ExcludedUsers == input.ExcludedUsers ||
                    this.ExcludedUsers != null &&
                    input.ExcludedUsers != null &&
                    this.ExcludedUsers.SequenceEqual(input.ExcludedUsers)
                ) && 
                (
                    this.PotentialGroups == input.PotentialGroups ||
                    this.PotentialGroups != null &&
                    input.PotentialGroups != null &&
                    this.PotentialGroups.SequenceEqual(input.PotentialGroups)
                ) && 
                (
                    this.OwnsItem == input.OwnsItem ||
                    this.OwnsItem.Equals(input.OwnsItem)
                ) && 
                (
                    this.CanClaim == input.CanClaim ||
                    this.CanClaim.Equals(input.CanClaim)
                ) && 
                (
                    this.CanRelease == input.CanRelease ||
                    this.CanRelease.Equals(input.CanRelease)
                ) && 
                (
                    this.LockType == input.LockType ||
                    (this.LockType != null &&
                    this.LockType.Equals(input.LockType))
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
                if (this.ProcessId != null)
                {
                    hashCode = (hashCode * 59) + this.ProcessId.GetHashCode();
                }
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.TaskId != null)
                {
                    hashCode = (hashCode * 59) + this.TaskId.GetHashCode();
                }
                if (this.ProjectType != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectType.GetHashCode();
                }
                if (this.TaskType != null)
                {
                    hashCode = (hashCode * 59) + this.TaskType.GetHashCode();
                }
                if (this.TaskScreen != null)
                {
                    hashCode = (hashCode * 59) + this.TaskScreen.GetHashCode();
                }
                if (this.ProjectCreated != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectCreated.GetHashCode();
                }
                if (this.DateTaskCreated != null)
                {
                    hashCode = (hashCode * 59) + this.DateTaskCreated.GetHashCode();
                }
                if (this.ProjectTitle != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectTitle.GetHashCode();
                }
                if (this.TaskName != null)
                {
                    hashCode = (hashCode * 59) + this.TaskName.GetHashCode();
                }
                if (this.AssignedUser != null)
                {
                    hashCode = (hashCode * 59) + this.AssignedUser.GetHashCode();
                }
                if (this.PotentialUsers != null)
                {
                    hashCode = (hashCode * 59) + this.PotentialUsers.GetHashCode();
                }
                if (this.ExcludedUsers != null)
                {
                    hashCode = (hashCode * 59) + this.ExcludedUsers.GetHashCode();
                }
                if (this.PotentialGroups != null)
                {
                    hashCode = (hashCode * 59) + this.PotentialGroups.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OwnsItem.GetHashCode();
                hashCode = (hashCode * 59) + this.CanClaim.GetHashCode();
                hashCode = (hashCode * 59) + this.CanRelease.GetHashCode();
                if (this.LockType != null)
                {
                    hashCode = (hashCode * 59) + this.LockType.GetHashCode();
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