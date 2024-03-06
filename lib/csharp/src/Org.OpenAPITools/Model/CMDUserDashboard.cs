/*
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
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
    /// A user&#39;s dashboard contents.
    /// </summary>
    [DataContract(Name = "CMDUserDashboard")]
    public partial class CMDUserDashboard : IEquatable<CMDUserDashboard>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDUserDashboard" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CMDUserDashboard() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CMDUserDashboard" /> class.
        /// </summary>
        /// <param name="userId">the user&#39;s id, a guid (required).</param>
        /// <param name="lockList">list of locked documents for this user (required).</param>
        /// <param name="bookmarkList">list of bookmarks for this user (required).</param>
        /// <param name="subscriptions">subscriptions (required).</param>
        /// <param name="notificationList">list of DMS notifications for this user (required).</param>
        /// <param name="folderRoot">folderRoot (required).</param>
        /// <param name="savedSearchList">list of saved searches for this user (required).</param>
        /// <param name="categoryList">Search categories / metadata searching (required).</param>
        /// <param name="userList">list of users for ACLs (required).</param>
        /// <param name="groupList">list of groups for ACLs (required).</param>
        public CMDUserDashboard(string userId = default(string), List<CMDocument> lockList = default(List<CMDocument>), List<CMDocumentBookmark> bookmarkList = default(List<CMDocumentBookmark>), CMSubscriptions subscriptions = default(CMSubscriptions), List<CMUserNotification> notificationList = default(List<CMUserNotification>), CMDocumentFolder folderRoot = default(CMDocumentFolder), List<CMSavedSearch> savedSearchList = default(List<CMSavedSearch>), List<SearchCategory> categoryList = default(List<SearchCategory>), List<CMUser> userList = default(List<CMUser>), List<CMGroup> groupList = default(List<CMGroup>))
        {
            // to ensure "userId" is required (not null)
            if (userId == null)
            {
                throw new ArgumentNullException("userId is a required property for CMDUserDashboard and cannot be null");
            }
            this.UserId = userId;
            // to ensure "lockList" is required (not null)
            if (lockList == null)
            {
                throw new ArgumentNullException("lockList is a required property for CMDUserDashboard and cannot be null");
            }
            this.LockList = lockList;
            // to ensure "bookmarkList" is required (not null)
            if (bookmarkList == null)
            {
                throw new ArgumentNullException("bookmarkList is a required property for CMDUserDashboard and cannot be null");
            }
            this.BookmarkList = bookmarkList;
            // to ensure "subscriptions" is required (not null)
            if (subscriptions == null)
            {
                throw new ArgumentNullException("subscriptions is a required property for CMDUserDashboard and cannot be null");
            }
            this.Subscriptions = subscriptions;
            // to ensure "notificationList" is required (not null)
            if (notificationList == null)
            {
                throw new ArgumentNullException("notificationList is a required property for CMDUserDashboard and cannot be null");
            }
            this.NotificationList = notificationList;
            // to ensure "folderRoot" is required (not null)
            if (folderRoot == null)
            {
                throw new ArgumentNullException("folderRoot is a required property for CMDUserDashboard and cannot be null");
            }
            this.FolderRoot = folderRoot;
            // to ensure "savedSearchList" is required (not null)
            if (savedSearchList == null)
            {
                throw new ArgumentNullException("savedSearchList is a required property for CMDUserDashboard and cannot be null");
            }
            this.SavedSearchList = savedSearchList;
            // to ensure "categoryList" is required (not null)
            if (categoryList == null)
            {
                throw new ArgumentNullException("categoryList is a required property for CMDUserDashboard and cannot be null");
            }
            this.CategoryList = categoryList;
            // to ensure "userList" is required (not null)
            if (userList == null)
            {
                throw new ArgumentNullException("userList is a required property for CMDUserDashboard and cannot be null");
            }
            this.UserList = userList;
            // to ensure "groupList" is required (not null)
            if (groupList == null)
            {
                throw new ArgumentNullException("groupList is a required property for CMDUserDashboard and cannot be null");
            }
            this.GroupList = groupList;
        }

        /// <summary>
        /// the user&#39;s id, a guid
        /// </summary>
        /// <value>the user&#39;s id, a guid</value>
        [DataMember(Name = "userId", IsRequired = true, EmitDefaultValue = true)]
        public string UserId { get; set; }

        /// <summary>
        /// list of locked documents for this user
        /// </summary>
        /// <value>list of locked documents for this user</value>
        [DataMember(Name = "lockList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMDocument> LockList { get; set; }

        /// <summary>
        /// list of bookmarks for this user
        /// </summary>
        /// <value>list of bookmarks for this user</value>
        [DataMember(Name = "bookmarkList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMDocumentBookmark> BookmarkList { get; set; }

        /// <summary>
        /// Gets or Sets Subscriptions
        /// </summary>
        [DataMember(Name = "subscriptions", IsRequired = true, EmitDefaultValue = true)]
        public CMSubscriptions Subscriptions { get; set; }

        /// <summary>
        /// list of DMS notifications for this user
        /// </summary>
        /// <value>list of DMS notifications for this user</value>
        [DataMember(Name = "notificationList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMUserNotification> NotificationList { get; set; }

        /// <summary>
        /// Gets or Sets FolderRoot
        /// </summary>
        [DataMember(Name = "folderRoot", IsRequired = true, EmitDefaultValue = true)]
        public CMDocumentFolder FolderRoot { get; set; }

        /// <summary>
        /// list of saved searches for this user
        /// </summary>
        /// <value>list of saved searches for this user</value>
        [DataMember(Name = "savedSearchList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMSavedSearch> SavedSearchList { get; set; }

        /// <summary>
        /// Search categories / metadata searching
        /// </summary>
        /// <value>Search categories / metadata searching</value>
        [DataMember(Name = "categoryList", IsRequired = true, EmitDefaultValue = true)]
        public List<SearchCategory> CategoryList { get; set; }

        /// <summary>
        /// list of users for ACLs
        /// </summary>
        /// <value>list of users for ACLs</value>
        [DataMember(Name = "userList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMUser> UserList { get; set; }

        /// <summary>
        /// list of groups for ACLs
        /// </summary>
        /// <value>list of groups for ACLs</value>
        [DataMember(Name = "groupList", IsRequired = true, EmitDefaultValue = true)]
        public List<CMGroup> GroupList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CMDUserDashboard {\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  LockList: ").Append(LockList).Append("\n");
            sb.Append("  BookmarkList: ").Append(BookmarkList).Append("\n");
            sb.Append("  Subscriptions: ").Append(Subscriptions).Append("\n");
            sb.Append("  NotificationList: ").Append(NotificationList).Append("\n");
            sb.Append("  FolderRoot: ").Append(FolderRoot).Append("\n");
            sb.Append("  SavedSearchList: ").Append(SavedSearchList).Append("\n");
            sb.Append("  CategoryList: ").Append(CategoryList).Append("\n");
            sb.Append("  UserList: ").Append(UserList).Append("\n");
            sb.Append("  GroupList: ").Append(GroupList).Append("\n");
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
            return this.Equals(input as CMDUserDashboard);
        }

        /// <summary>
        /// Returns true if CMDUserDashboard instances are equal
        /// </summary>
        /// <param name="input">Instance of CMDUserDashboard to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CMDUserDashboard input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UserId == input.UserId ||
                    (this.UserId != null &&
                    this.UserId.Equals(input.UserId))
                ) && 
                (
                    this.LockList == input.LockList ||
                    this.LockList != null &&
                    input.LockList != null &&
                    this.LockList.SequenceEqual(input.LockList)
                ) && 
                (
                    this.BookmarkList == input.BookmarkList ||
                    this.BookmarkList != null &&
                    input.BookmarkList != null &&
                    this.BookmarkList.SequenceEqual(input.BookmarkList)
                ) && 
                (
                    this.Subscriptions == input.Subscriptions ||
                    (this.Subscriptions != null &&
                    this.Subscriptions.Equals(input.Subscriptions))
                ) && 
                (
                    this.NotificationList == input.NotificationList ||
                    this.NotificationList != null &&
                    input.NotificationList != null &&
                    this.NotificationList.SequenceEqual(input.NotificationList)
                ) && 
                (
                    this.FolderRoot == input.FolderRoot ||
                    (this.FolderRoot != null &&
                    this.FolderRoot.Equals(input.FolderRoot))
                ) && 
                (
                    this.SavedSearchList == input.SavedSearchList ||
                    this.SavedSearchList != null &&
                    input.SavedSearchList != null &&
                    this.SavedSearchList.SequenceEqual(input.SavedSearchList)
                ) && 
                (
                    this.CategoryList == input.CategoryList ||
                    this.CategoryList != null &&
                    input.CategoryList != null &&
                    this.CategoryList.SequenceEqual(input.CategoryList)
                ) && 
                (
                    this.UserList == input.UserList ||
                    this.UserList != null &&
                    input.UserList != null &&
                    this.UserList.SequenceEqual(input.UserList)
                ) && 
                (
                    this.GroupList == input.GroupList ||
                    this.GroupList != null &&
                    input.GroupList != null &&
                    this.GroupList.SequenceEqual(input.GroupList)
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
                if (this.UserId != null)
                {
                    hashCode = (hashCode * 59) + this.UserId.GetHashCode();
                }
                if (this.LockList != null)
                {
                    hashCode = (hashCode * 59) + this.LockList.GetHashCode();
                }
                if (this.BookmarkList != null)
                {
                    hashCode = (hashCode * 59) + this.BookmarkList.GetHashCode();
                }
                if (this.Subscriptions != null)
                {
                    hashCode = (hashCode * 59) + this.Subscriptions.GetHashCode();
                }
                if (this.NotificationList != null)
                {
                    hashCode = (hashCode * 59) + this.NotificationList.GetHashCode();
                }
                if (this.FolderRoot != null)
                {
                    hashCode = (hashCode * 59) + this.FolderRoot.GetHashCode();
                }
                if (this.SavedSearchList != null)
                {
                    hashCode = (hashCode * 59) + this.SavedSearchList.GetHashCode();
                }
                if (this.CategoryList != null)
                {
                    hashCode = (hashCode * 59) + this.CategoryList.GetHashCode();
                }
                if (this.UserList != null)
                {
                    hashCode = (hashCode * 59) + this.UserList.GetHashCode();
                }
                if (this.GroupList != null)
                {
                    hashCode = (hashCode * 59) + this.GroupList.GetHashCode();
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
