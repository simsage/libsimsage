/*
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CMDocument;
import org.openapitools.client.model.CMDocumentBookmark;
import org.openapitools.client.model.CMDocumentFolder;
import org.openapitools.client.model.CMGroup;
import org.openapitools.client.model.CMSavedSearch;
import org.openapitools.client.model.CMSubscriptions;
import org.openapitools.client.model.CMUser;
import org.openapitools.client.model.CMUserNotification;
import org.openapitools.client.model.SearchCategory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * A user&#39;s dashboard contents.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T16:03:21.377776023Z[Europe/London]")
public class CMDUserDashboard {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_LOCK_LIST = "lockList";
  @SerializedName(SERIALIZED_NAME_LOCK_LIST)
  private List<CMDocument> lockList = new ArrayList<>();

  public static final String SERIALIZED_NAME_BOOKMARK_LIST = "bookmarkList";
  @SerializedName(SERIALIZED_NAME_BOOKMARK_LIST)
  private List<CMDocumentBookmark> bookmarkList = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private CMSubscriptions subscriptions;

  public static final String SERIALIZED_NAME_NOTIFICATION_LIST = "notificationList";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_LIST)
  private List<CMUserNotification> notificationList = new ArrayList<>();

  public static final String SERIALIZED_NAME_FOLDER_ROOT = "folderRoot";
  @SerializedName(SERIALIZED_NAME_FOLDER_ROOT)
  private CMDocumentFolder folderRoot;

  public static final String SERIALIZED_NAME_SAVED_SEARCH_LIST = "savedSearchList";
  @SerializedName(SERIALIZED_NAME_SAVED_SEARCH_LIST)
  private List<CMSavedSearch> savedSearchList = new ArrayList<>();

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "categoryList";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<SearchCategory> categoryList = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER_LIST = "userList";
  @SerializedName(SERIALIZED_NAME_USER_LIST)
  private List<CMUser> userList = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP_LIST = "groupList";
  @SerializedName(SERIALIZED_NAME_GROUP_LIST)
  private List<CMGroup> groupList = new ArrayList<>();

  public CMDUserDashboard() {
  }

  public CMDUserDashboard userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * the user&#39;s id, a guid
   * @return userId
  **/
  @javax.annotation.Nonnull
  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public CMDUserDashboard lockList(List<CMDocument> lockList) {
    
    this.lockList = lockList;
    return this;
  }

  public CMDUserDashboard addLockListItem(CMDocument lockListItem) {
    if (this.lockList == null) {
      this.lockList = new ArrayList<>();
    }
    this.lockList.add(lockListItem);
    return this;
  }

   /**
   * list of locked documents for this user
   * @return lockList
  **/
  @javax.annotation.Nonnull
  public List<CMDocument> getLockList() {
    return lockList;
  }


  public void setLockList(List<CMDocument> lockList) {
    this.lockList = lockList;
  }


  public CMDUserDashboard bookmarkList(List<CMDocumentBookmark> bookmarkList) {
    
    this.bookmarkList = bookmarkList;
    return this;
  }

  public CMDUserDashboard addBookmarkListItem(CMDocumentBookmark bookmarkListItem) {
    if (this.bookmarkList == null) {
      this.bookmarkList = new ArrayList<>();
    }
    this.bookmarkList.add(bookmarkListItem);
    return this;
  }

   /**
   * list of bookmarks for this user
   * @return bookmarkList
  **/
  @javax.annotation.Nonnull
  public List<CMDocumentBookmark> getBookmarkList() {
    return bookmarkList;
  }


  public void setBookmarkList(List<CMDocumentBookmark> bookmarkList) {
    this.bookmarkList = bookmarkList;
  }


  public CMDUserDashboard subscriptions(CMSubscriptions subscriptions) {
    
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @javax.annotation.Nonnull
  public CMSubscriptions getSubscriptions() {
    return subscriptions;
  }


  public void setSubscriptions(CMSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }


  public CMDUserDashboard notificationList(List<CMUserNotification> notificationList) {
    
    this.notificationList = notificationList;
    return this;
  }

  public CMDUserDashboard addNotificationListItem(CMUserNotification notificationListItem) {
    if (this.notificationList == null) {
      this.notificationList = new ArrayList<>();
    }
    this.notificationList.add(notificationListItem);
    return this;
  }

   /**
   * list of DMS notifications for this user
   * @return notificationList
  **/
  @javax.annotation.Nonnull
  public List<CMUserNotification> getNotificationList() {
    return notificationList;
  }


  public void setNotificationList(List<CMUserNotification> notificationList) {
    this.notificationList = notificationList;
  }


  public CMDUserDashboard folderRoot(CMDocumentFolder folderRoot) {
    
    this.folderRoot = folderRoot;
    return this;
  }

   /**
   * Get folderRoot
   * @return folderRoot
  **/
  @javax.annotation.Nonnull
  public CMDocumentFolder getFolderRoot() {
    return folderRoot;
  }


  public void setFolderRoot(CMDocumentFolder folderRoot) {
    this.folderRoot = folderRoot;
  }


  public CMDUserDashboard savedSearchList(List<CMSavedSearch> savedSearchList) {
    
    this.savedSearchList = savedSearchList;
    return this;
  }

  public CMDUserDashboard addSavedSearchListItem(CMSavedSearch savedSearchListItem) {
    if (this.savedSearchList == null) {
      this.savedSearchList = new ArrayList<>();
    }
    this.savedSearchList.add(savedSearchListItem);
    return this;
  }

   /**
   * list of saved searches for this user
   * @return savedSearchList
  **/
  @javax.annotation.Nonnull
  public List<CMSavedSearch> getSavedSearchList() {
    return savedSearchList;
  }


  public void setSavedSearchList(List<CMSavedSearch> savedSearchList) {
    this.savedSearchList = savedSearchList;
  }


  public CMDUserDashboard categoryList(List<SearchCategory> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public CMDUserDashboard addCategoryListItem(SearchCategory categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * Search categories / metadata searching
   * @return categoryList
  **/
  @javax.annotation.Nonnull
  public List<SearchCategory> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<SearchCategory> categoryList) {
    this.categoryList = categoryList;
  }


  public CMDUserDashboard userList(List<CMUser> userList) {
    
    this.userList = userList;
    return this;
  }

  public CMDUserDashboard addUserListItem(CMUser userListItem) {
    if (this.userList == null) {
      this.userList = new ArrayList<>();
    }
    this.userList.add(userListItem);
    return this;
  }

   /**
   * list of users for ACLs
   * @return userList
  **/
  @javax.annotation.Nonnull
  public List<CMUser> getUserList() {
    return userList;
  }


  public void setUserList(List<CMUser> userList) {
    this.userList = userList;
  }


  public CMDUserDashboard groupList(List<CMGroup> groupList) {
    
    this.groupList = groupList;
    return this;
  }

  public CMDUserDashboard addGroupListItem(CMGroup groupListItem) {
    if (this.groupList == null) {
      this.groupList = new ArrayList<>();
    }
    this.groupList.add(groupListItem);
    return this;
  }

   /**
   * list of groups for ACLs
   * @return groupList
  **/
  @javax.annotation.Nonnull
  public List<CMGroup> getGroupList() {
    return groupList;
  }


  public void setGroupList(List<CMGroup> groupList) {
    this.groupList = groupList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMDUserDashboard cmDUserDashboard = (CMDUserDashboard) o;
    return Objects.equals(this.userId, cmDUserDashboard.userId) &&
        Objects.equals(this.lockList, cmDUserDashboard.lockList) &&
        Objects.equals(this.bookmarkList, cmDUserDashboard.bookmarkList) &&
        Objects.equals(this.subscriptions, cmDUserDashboard.subscriptions) &&
        Objects.equals(this.notificationList, cmDUserDashboard.notificationList) &&
        Objects.equals(this.folderRoot, cmDUserDashboard.folderRoot) &&
        Objects.equals(this.savedSearchList, cmDUserDashboard.savedSearchList) &&
        Objects.equals(this.categoryList, cmDUserDashboard.categoryList) &&
        Objects.equals(this.userList, cmDUserDashboard.userList) &&
        Objects.equals(this.groupList, cmDUserDashboard.groupList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, lockList, bookmarkList, subscriptions, notificationList, folderRoot, savedSearchList, categoryList, userList, groupList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMDUserDashboard {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lockList: ").append(toIndentedString(lockList)).append("\n");
    sb.append("    bookmarkList: ").append(toIndentedString(bookmarkList)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    notificationList: ").append(toIndentedString(notificationList)).append("\n");
    sb.append("    folderRoot: ").append(toIndentedString(folderRoot)).append("\n");
    sb.append("    savedSearchList: ").append(toIndentedString(savedSearchList)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
    sb.append("    groupList: ").append(toIndentedString(groupList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("userId");
    openapiFields.add("lockList");
    openapiFields.add("bookmarkList");
    openapiFields.add("subscriptions");
    openapiFields.add("notificationList");
    openapiFields.add("folderRoot");
    openapiFields.add("savedSearchList");
    openapiFields.add("categoryList");
    openapiFields.add("userList");
    openapiFields.add("groupList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userId");
    openapiRequiredFields.add("lockList");
    openapiRequiredFields.add("bookmarkList");
    openapiRequiredFields.add("subscriptions");
    openapiRequiredFields.add("notificationList");
    openapiRequiredFields.add("folderRoot");
    openapiRequiredFields.add("savedSearchList");
    openapiRequiredFields.add("categoryList");
    openapiRequiredFields.add("userList");
    openapiRequiredFields.add("groupList");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMDUserDashboard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMDUserDashboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMDUserDashboard is not found in the empty JSON string", CMDUserDashboard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMDUserDashboard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMDUserDashboard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CMDUserDashboard.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("lockList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lockList` to be an array in the JSON string but got `%s`", jsonObj.get("lockList").toString()));
      }

      JsonArray jsonArraylockList = jsonObj.getAsJsonArray("lockList");
      // validate the required field `lockList` (array)
      for (int i = 0; i < jsonArraylockList.size(); i++) {
        CMDocument.validateJsonElement(jsonArraylockList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("bookmarkList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookmarkList` to be an array in the JSON string but got `%s`", jsonObj.get("bookmarkList").toString()));
      }

      JsonArray jsonArraybookmarkList = jsonObj.getAsJsonArray("bookmarkList");
      // validate the required field `bookmarkList` (array)
      for (int i = 0; i < jsonArraybookmarkList.size(); i++) {
        CMDocumentBookmark.validateJsonElement(jsonArraybookmarkList.get(i));
      };
      // validate the required field `subscriptions`
      CMSubscriptions.validateJsonElement(jsonObj.get("subscriptions"));
      // ensure the json data is an array
      if (!jsonObj.get("notificationList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationList` to be an array in the JSON string but got `%s`", jsonObj.get("notificationList").toString()));
      }

      JsonArray jsonArraynotificationList = jsonObj.getAsJsonArray("notificationList");
      // validate the required field `notificationList` (array)
      for (int i = 0; i < jsonArraynotificationList.size(); i++) {
        CMUserNotification.validateJsonElement(jsonArraynotificationList.get(i));
      };
      // validate the required field `folderRoot`
      CMDocumentFolder.validateJsonElement(jsonObj.get("folderRoot"));
      // ensure the json data is an array
      if (!jsonObj.get("savedSearchList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `savedSearchList` to be an array in the JSON string but got `%s`", jsonObj.get("savedSearchList").toString()));
      }

      JsonArray jsonArraysavedSearchList = jsonObj.getAsJsonArray("savedSearchList");
      // validate the required field `savedSearchList` (array)
      for (int i = 0; i < jsonArraysavedSearchList.size(); i++) {
        CMSavedSearch.validateJsonElement(jsonArraysavedSearchList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("categoryList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categoryList` to be an array in the JSON string but got `%s`", jsonObj.get("categoryList").toString()));
      }

      JsonArray jsonArraycategoryList = jsonObj.getAsJsonArray("categoryList");
      // validate the required field `categoryList` (array)
      for (int i = 0; i < jsonArraycategoryList.size(); i++) {
        SearchCategory.validateJsonElement(jsonArraycategoryList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("userList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `userList` to be an array in the JSON string but got `%s`", jsonObj.get("userList").toString()));
      }

      JsonArray jsonArrayuserList = jsonObj.getAsJsonArray("userList");
      // validate the required field `userList` (array)
      for (int i = 0; i < jsonArrayuserList.size(); i++) {
        CMUser.validateJsonElement(jsonArrayuserList.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("groupList").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupList` to be an array in the JSON string but got `%s`", jsonObj.get("groupList").toString()));
      }

      JsonArray jsonArraygroupList = jsonObj.getAsJsonArray("groupList");
      // validate the required field `groupList` (array)
      for (int i = 0; i < jsonArraygroupList.size(); i++) {
        CMGroup.validateJsonElement(jsonArraygroupList.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMDUserDashboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMDUserDashboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMDUserDashboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMDUserDashboard.class));

       return (TypeAdapter<T>) new TypeAdapter<CMDUserDashboard>() {
           @Override
           public void write(JsonWriter out, CMDUserDashboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMDUserDashboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMDUserDashboard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMDUserDashboard
  * @throws IOException if the JSON string is invalid with respect to CMDUserDashboard
  */
  public static CMDUserDashboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMDUserDashboard.class);
  }

 /**
  * Convert an instance of CMDUserDashboard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

