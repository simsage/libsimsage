<?php
/**
 * CMDUserDashboard
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * SimSage REST API
 *
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 7.0.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * CMDUserDashboard Class Doc Comment
 *
 * @category Class
 * @description A user&#39;s dashboard contents.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMDUserDashboard implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMDUserDashboard';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'user_id' => 'string',
        'lock_list' => '\OpenAPI\Client\Model\CMDocument[]',
        'bookmark_list' => '\OpenAPI\Client\Model\CMDocumentBookmark[]',
        'subscriptions' => '\OpenAPI\Client\Model\CMSubscriptions',
        'notification_list' => '\OpenAPI\Client\Model\CMUserNotification[]',
        'folder_root' => '\OpenAPI\Client\Model\CMDocumentFolder',
        'saved_search_list' => '\OpenAPI\Client\Model\CMSavedSearch[]',
        'category_list' => '\OpenAPI\Client\Model\SearchCategory[]',
        'user_list' => '\OpenAPI\Client\Model\CMUser[]',
        'group_list' => '\OpenAPI\Client\Model\CMGroup[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'user_id' => null,
        'lock_list' => null,
        'bookmark_list' => null,
        'subscriptions' => null,
        'notification_list' => null,
        'folder_root' => null,
        'saved_search_list' => null,
        'category_list' => null,
        'user_list' => null,
        'group_list' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'user_id' => false,
		'lock_list' => false,
		'bookmark_list' => false,
		'subscriptions' => false,
		'notification_list' => false,
		'folder_root' => false,
		'saved_search_list' => false,
		'category_list' => false,
		'user_list' => false,
		'group_list' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'user_id' => 'userId',
        'lock_list' => 'lockList',
        'bookmark_list' => 'bookmarkList',
        'subscriptions' => 'subscriptions',
        'notification_list' => 'notificationList',
        'folder_root' => 'folderRoot',
        'saved_search_list' => 'savedSearchList',
        'category_list' => 'categoryList',
        'user_list' => 'userList',
        'group_list' => 'groupList'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'user_id' => 'setUserId',
        'lock_list' => 'setLockList',
        'bookmark_list' => 'setBookmarkList',
        'subscriptions' => 'setSubscriptions',
        'notification_list' => 'setNotificationList',
        'folder_root' => 'setFolderRoot',
        'saved_search_list' => 'setSavedSearchList',
        'category_list' => 'setCategoryList',
        'user_list' => 'setUserList',
        'group_list' => 'setGroupList'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'user_id' => 'getUserId',
        'lock_list' => 'getLockList',
        'bookmark_list' => 'getBookmarkList',
        'subscriptions' => 'getSubscriptions',
        'notification_list' => 'getNotificationList',
        'folder_root' => 'getFolderRoot',
        'saved_search_list' => 'getSavedSearchList',
        'category_list' => 'getCategoryList',
        'user_list' => 'getUserList',
        'group_list' => 'getGroupList'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('user_id', $data ?? [], null);
        $this->setIfExists('lock_list', $data ?? [], null);
        $this->setIfExists('bookmark_list', $data ?? [], null);
        $this->setIfExists('subscriptions', $data ?? [], null);
        $this->setIfExists('notification_list', $data ?? [], null);
        $this->setIfExists('folder_root', $data ?? [], null);
        $this->setIfExists('saved_search_list', $data ?? [], null);
        $this->setIfExists('category_list', $data ?? [], null);
        $this->setIfExists('user_list', $data ?? [], null);
        $this->setIfExists('group_list', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['user_id'] === null) {
            $invalidProperties[] = "'user_id' can't be null";
        }
        if ($this->container['lock_list'] === null) {
            $invalidProperties[] = "'lock_list' can't be null";
        }
        if ($this->container['bookmark_list'] === null) {
            $invalidProperties[] = "'bookmark_list' can't be null";
        }
        if ($this->container['subscriptions'] === null) {
            $invalidProperties[] = "'subscriptions' can't be null";
        }
        if ($this->container['notification_list'] === null) {
            $invalidProperties[] = "'notification_list' can't be null";
        }
        if ($this->container['folder_root'] === null) {
            $invalidProperties[] = "'folder_root' can't be null";
        }
        if ($this->container['saved_search_list'] === null) {
            $invalidProperties[] = "'saved_search_list' can't be null";
        }
        if ($this->container['category_list'] === null) {
            $invalidProperties[] = "'category_list' can't be null";
        }
        if ($this->container['user_list'] === null) {
            $invalidProperties[] = "'user_list' can't be null";
        }
        if ($this->container['group_list'] === null) {
            $invalidProperties[] = "'group_list' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets user_id
     *
     * @return string
     */
    public function getUserId()
    {
        return $this->container['user_id'];
    }

    /**
     * Sets user_id
     *
     * @param string $user_id the user's id, a guid
     *
     * @return self
     */
    public function setUserId($user_id)
    {
        if (is_null($user_id)) {
            throw new \InvalidArgumentException('non-nullable user_id cannot be null');
        }
        $this->container['user_id'] = $user_id;

        return $this;
    }

    /**
     * Gets lock_list
     *
     * @return \OpenAPI\Client\Model\CMDocument[]
     */
    public function getLockList()
    {
        return $this->container['lock_list'];
    }

    /**
     * Sets lock_list
     *
     * @param \OpenAPI\Client\Model\CMDocument[] $lock_list list of locked documents for this user
     *
     * @return self
     */
    public function setLockList($lock_list)
    {
        if (is_null($lock_list)) {
            throw new \InvalidArgumentException('non-nullable lock_list cannot be null');
        }
        $this->container['lock_list'] = $lock_list;

        return $this;
    }

    /**
     * Gets bookmark_list
     *
     * @return \OpenAPI\Client\Model\CMDocumentBookmark[]
     */
    public function getBookmarkList()
    {
        return $this->container['bookmark_list'];
    }

    /**
     * Sets bookmark_list
     *
     * @param \OpenAPI\Client\Model\CMDocumentBookmark[] $bookmark_list list of bookmarks for this user
     *
     * @return self
     */
    public function setBookmarkList($bookmark_list)
    {
        if (is_null($bookmark_list)) {
            throw new \InvalidArgumentException('non-nullable bookmark_list cannot be null');
        }
        $this->container['bookmark_list'] = $bookmark_list;

        return $this;
    }

    /**
     * Gets subscriptions
     *
     * @return \OpenAPI\Client\Model\CMSubscriptions
     */
    public function getSubscriptions()
    {
        return $this->container['subscriptions'];
    }

    /**
     * Sets subscriptions
     *
     * @param \OpenAPI\Client\Model\CMSubscriptions $subscriptions subscriptions
     *
     * @return self
     */
    public function setSubscriptions($subscriptions)
    {
        if (is_null($subscriptions)) {
            throw new \InvalidArgumentException('non-nullable subscriptions cannot be null');
        }
        $this->container['subscriptions'] = $subscriptions;

        return $this;
    }

    /**
     * Gets notification_list
     *
     * @return \OpenAPI\Client\Model\CMUserNotification[]
     */
    public function getNotificationList()
    {
        return $this->container['notification_list'];
    }

    /**
     * Sets notification_list
     *
     * @param \OpenAPI\Client\Model\CMUserNotification[] $notification_list list of DMS notifications for this user
     *
     * @return self
     */
    public function setNotificationList($notification_list)
    {
        if (is_null($notification_list)) {
            throw new \InvalidArgumentException('non-nullable notification_list cannot be null');
        }
        $this->container['notification_list'] = $notification_list;

        return $this;
    }

    /**
     * Gets folder_root
     *
     * @return \OpenAPI\Client\Model\CMDocumentFolder
     */
    public function getFolderRoot()
    {
        return $this->container['folder_root'];
    }

    /**
     * Sets folder_root
     *
     * @param \OpenAPI\Client\Model\CMDocumentFolder $folder_root folder_root
     *
     * @return self
     */
    public function setFolderRoot($folder_root)
    {
        if (is_null($folder_root)) {
            throw new \InvalidArgumentException('non-nullable folder_root cannot be null');
        }
        $this->container['folder_root'] = $folder_root;

        return $this;
    }

    /**
     * Gets saved_search_list
     *
     * @return \OpenAPI\Client\Model\CMSavedSearch[]
     */
    public function getSavedSearchList()
    {
        return $this->container['saved_search_list'];
    }

    /**
     * Sets saved_search_list
     *
     * @param \OpenAPI\Client\Model\CMSavedSearch[] $saved_search_list list of saved searches for this user
     *
     * @return self
     */
    public function setSavedSearchList($saved_search_list)
    {
        if (is_null($saved_search_list)) {
            throw new \InvalidArgumentException('non-nullable saved_search_list cannot be null');
        }
        $this->container['saved_search_list'] = $saved_search_list;

        return $this;
    }

    /**
     * Gets category_list
     *
     * @return \OpenAPI\Client\Model\SearchCategory[]
     */
    public function getCategoryList()
    {
        return $this->container['category_list'];
    }

    /**
     * Sets category_list
     *
     * @param \OpenAPI\Client\Model\SearchCategory[] $category_list Search categories / metadata searching
     *
     * @return self
     */
    public function setCategoryList($category_list)
    {
        if (is_null($category_list)) {
            throw new \InvalidArgumentException('non-nullable category_list cannot be null');
        }
        $this->container['category_list'] = $category_list;

        return $this;
    }

    /**
     * Gets user_list
     *
     * @return \OpenAPI\Client\Model\CMUser[]
     */
    public function getUserList()
    {
        return $this->container['user_list'];
    }

    /**
     * Sets user_list
     *
     * @param \OpenAPI\Client\Model\CMUser[] $user_list list of users for ACLs
     *
     * @return self
     */
    public function setUserList($user_list)
    {
        if (is_null($user_list)) {
            throw new \InvalidArgumentException('non-nullable user_list cannot be null');
        }
        $this->container['user_list'] = $user_list;

        return $this;
    }

    /**
     * Gets group_list
     *
     * @return \OpenAPI\Client\Model\CMGroup[]
     */
    public function getGroupList()
    {
        return $this->container['group_list'];
    }

    /**
     * Sets group_list
     *
     * @param \OpenAPI\Client\Model\CMGroup[] $group_list list of groups for ACLs
     *
     * @return self
     */
    public function setGroupList($group_list)
    {
        if (is_null($group_list)) {
            throw new \InvalidArgumentException('non-nullable group_list cannot be null');
        }
        $this->container['group_list'] = $group_list;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


