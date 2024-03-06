<?php
/**
 * CMDocumentFolder
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
 * CMDocumentFolder Class Doc Comment
 *
 * @category Class
 * @description A document folder content item.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMDocumentFolder implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMDocumentFolder';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'source_id' => 'int',
        'url' => 'string',
        'parent_folder_id' => 'string',
        'folder_id' => 'string',
        'url_id' => 'int',
        'folder_name' => 'string',
        'item_type' => 'string',
        'folder_list' => '\OpenAPI\Client\Model\CMDocumentFolder[]',
        'file_list' => '\OpenAPI\Client\Model\CMDocument[]',
        'acls' => '\OpenAPI\Client\Model\CMDocumentAcl[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'source_id' => 'int32',
        'url' => null,
        'parent_folder_id' => null,
        'folder_id' => null,
        'url_id' => 'int32',
        'folder_name' => null,
        'item_type' => null,
        'folder_list' => null,
        'file_list' => null,
        'acls' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'source_id' => false,
		'url' => false,
		'parent_folder_id' => false,
		'folder_id' => false,
		'url_id' => false,
		'folder_name' => false,
		'item_type' => false,
		'folder_list' => false,
		'file_list' => false,
		'acls' => false
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
        'source_id' => 'sourceId',
        'url' => 'url',
        'parent_folder_id' => 'parentFolderId',
        'folder_id' => 'folderId',
        'url_id' => 'urlId',
        'folder_name' => 'folderName',
        'item_type' => 'itemType',
        'folder_list' => 'folderList',
        'file_list' => 'fileList',
        'acls' => 'acls'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'source_id' => 'setSourceId',
        'url' => 'setUrl',
        'parent_folder_id' => 'setParentFolderId',
        'folder_id' => 'setFolderId',
        'url_id' => 'setUrlId',
        'folder_name' => 'setFolderName',
        'item_type' => 'setItemType',
        'folder_list' => 'setFolderList',
        'file_list' => 'setFileList',
        'acls' => 'setAcls'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'source_id' => 'getSourceId',
        'url' => 'getUrl',
        'parent_folder_id' => 'getParentFolderId',
        'folder_id' => 'getFolderId',
        'url_id' => 'getUrlId',
        'folder_name' => 'getFolderName',
        'item_type' => 'getItemType',
        'folder_list' => 'getFolderList',
        'file_list' => 'getFileList',
        'acls' => 'getAcls'
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
        $this->setIfExists('source_id', $data ?? [], null);
        $this->setIfExists('url', $data ?? [], null);
        $this->setIfExists('parent_folder_id', $data ?? [], null);
        $this->setIfExists('folder_id', $data ?? [], null);
        $this->setIfExists('url_id', $data ?? [], null);
        $this->setIfExists('folder_name', $data ?? [], null);
        $this->setIfExists('item_type', $data ?? [], null);
        $this->setIfExists('folder_list', $data ?? [], null);
        $this->setIfExists('file_list', $data ?? [], null);
        $this->setIfExists('acls', $data ?? [], null);
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

        if ($this->container['source_id'] === null) {
            $invalidProperties[] = "'source_id' can't be null";
        }
        if ($this->container['url'] === null) {
            $invalidProperties[] = "'url' can't be null";
        }
        if ($this->container['parent_folder_id'] === null) {
            $invalidProperties[] = "'parent_folder_id' can't be null";
        }
        if ($this->container['folder_id'] === null) {
            $invalidProperties[] = "'folder_id' can't be null";
        }
        if ($this->container['url_id'] === null) {
            $invalidProperties[] = "'url_id' can't be null";
        }
        if ($this->container['folder_name'] === null) {
            $invalidProperties[] = "'folder_name' can't be null";
        }
        if ($this->container['item_type'] === null) {
            $invalidProperties[] = "'item_type' can't be null";
        }
        if ($this->container['folder_list'] === null) {
            $invalidProperties[] = "'folder_list' can't be null";
        }
        if ($this->container['file_list'] === null) {
            $invalidProperties[] = "'file_list' can't be null";
        }
        if ($this->container['acls'] === null) {
            $invalidProperties[] = "'acls' can't be null";
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
     * Gets source_id
     *
     * @return int
     */
    public function getSourceId()
    {
        return $this->container['source_id'];
    }

    /**
     * Sets source_id
     *
     * @param int $source_id the source-id of the owner of this folder
     *
     * @return self
     */
    public function setSourceId($source_id)
    {
        if (is_null($source_id)) {
            throw new \InvalidArgumentException('non-nullable source_id cannot be null');
        }
        $this->container['source_id'] = $source_id;

        return $this;
    }

    /**
     * Gets url
     *
     * @return string
     */
    public function getUrl()
    {
        return $this->container['url'];
    }

    /**
     * Sets url
     *
     * @param string $url The unique URL of a document or folder.
     *
     * @return self
     */
    public function setUrl($url)
    {
        if (is_null($url)) {
            throw new \InvalidArgumentException('non-nullable url cannot be null');
        }
        $this->container['url'] = $url;

        return $this;
    }

    /**
     * Gets parent_folder_id
     *
     * @return string
     */
    public function getParentFolderId()
    {
        return $this->container['parent_folder_id'];
    }

    /**
     * Sets parent_folder_id
     *
     * @param string $parent_folder_id The id of the parent folder of this folder.
     *
     * @return self
     */
    public function setParentFolderId($parent_folder_id)
    {
        if (is_null($parent_folder_id)) {
            throw new \InvalidArgumentException('non-nullable parent_folder_id cannot be null');
        }
        $this->container['parent_folder_id'] = $parent_folder_id;

        return $this;
    }

    /**
     * Gets folder_id
     *
     * @return string
     */
    public function getFolderId()
    {
        return $this->container['folder_id'];
    }

    /**
     * Sets folder_id
     *
     * @param string $folder_id The id of this folder.
     *
     * @return self
     */
    public function setFolderId($folder_id)
    {
        if (is_null($folder_id)) {
            throw new \InvalidArgumentException('non-nullable folder_id cannot be null');
        }
        $this->container['folder_id'] = $folder_id;

        return $this;
    }

    /**
     * Gets url_id
     *
     * @return int
     */
    public function getUrlId()
    {
        return $this->container['url_id'];
    }

    /**
     * Sets url_id
     *
     * @param int $url_id the internal SimSage id for this url
     *
     * @return self
     */
    public function setUrlId($url_id)
    {
        if (is_null($url_id)) {
            throw new \InvalidArgumentException('non-nullable url_id cannot be null');
        }
        $this->container['url_id'] = $url_id;

        return $this;
    }

    /**
     * Gets folder_name
     *
     * @return string
     */
    public function getFolderName()
    {
        return $this->container['folder_name'];
    }

    /**
     * Sets folder_name
     *
     * @param string $folder_name the display name of the folder
     *
     * @return self
     */
    public function setFolderName($folder_name)
    {
        if (is_null($folder_name)) {
            throw new \InvalidArgumentException('non-nullable folder_name cannot be null');
        }
        $this->container['folder_name'] = $folder_name;

        return $this;
    }

    /**
     * Gets item_type
     *
     * @return string
     */
    public function getItemType()
    {
        return $this->container['item_type'];
    }

    /**
     * Sets item_type
     *
     * @param string $item_type the type of folder (crawlerType for sources)
     *
     * @return self
     */
    public function setItemType($item_type)
    {
        if (is_null($item_type)) {
            throw new \InvalidArgumentException('non-nullable item_type cannot be null');
        }
        $this->container['item_type'] = $item_type;

        return $this;
    }

    /**
     * Gets folder_list
     *
     * @return \OpenAPI\Client\Model\CMDocumentFolder[]
     */
    public function getFolderList()
    {
        return $this->container['folder_list'];
    }

    /**
     * Sets folder_list
     *
     * @param \OpenAPI\Client\Model\CMDocumentFolder[] $folder_list the folder items in this folder
     *
     * @return self
     */
    public function setFolderList($folder_list)
    {
        if (is_null($folder_list)) {
            throw new \InvalidArgumentException('non-nullable folder_list cannot be null');
        }
        $this->container['folder_list'] = $folder_list;

        return $this;
    }

    /**
     * Gets file_list
     *
     * @return \OpenAPI\Client\Model\CMDocument[]
     */
    public function getFileList()
    {
        return $this->container['file_list'];
    }

    /**
     * Sets file_list
     *
     * @param \OpenAPI\Client\Model\CMDocument[] $file_list the files in this folder
     *
     * @return self
     */
    public function setFileList($file_list)
    {
        if (is_null($file_list)) {
            throw new \InvalidArgumentException('non-nullable file_list cannot be null');
        }
        $this->container['file_list'] = $file_list;

        return $this;
    }

    /**
     * Gets acls
     *
     * @return \OpenAPI\Client\Model\CMDocumentAcl[]
     */
    public function getAcls()
    {
        return $this->container['acls'];
    }

    /**
     * Sets acls
     *
     * @param \OpenAPI\Client\Model\CMDocumentAcl[] $acls the security permissions for this item
     *
     * @return self
     */
    public function setAcls($acls)
    {
        if (is_null($acls)) {
            throw new \InvalidArgumentException('non-nullable acls cannot be null');
        }
        $this->container['acls'] = $acls;

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


