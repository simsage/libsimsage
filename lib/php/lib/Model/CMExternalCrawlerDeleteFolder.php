<?php
/**
 * CMExternalCrawlerDeleteFolder
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
 * CMExternalCrawlerDeleteFolder Class Doc Comment
 *
 * @category Class
 * @description An external image representation object.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMExternalCrawlerDeleteFolder implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMExternalCrawlerDeleteFolder';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'object_type' => 'string',
        'organisation_id' => 'string',
        'kb_id' => 'string',
        'sid' => 'string',
        'source_id' => 'int',
        'folder_url' => 'string',
        'encrypted' => 'bool',
        'seed' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'object_type' => null,
        'organisation_id' => null,
        'kb_id' => null,
        'sid' => null,
        'source_id' => 'int32',
        'folder_url' => null,
        'encrypted' => null,
        'seed' => 'int32'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'object_type' => false,
		'organisation_id' => false,
		'kb_id' => false,
		'sid' => false,
		'source_id' => false,
		'folder_url' => false,
		'encrypted' => false,
		'seed' => false
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
        'object_type' => 'objectType',
        'organisation_id' => 'organisationId',
        'kb_id' => 'kbId',
        'sid' => 'sid',
        'source_id' => 'sourceId',
        'folder_url' => 'folderUrl',
        'encrypted' => 'encrypted',
        'seed' => 'seed'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'object_type' => 'setObjectType',
        'organisation_id' => 'setOrganisationId',
        'kb_id' => 'setKbId',
        'sid' => 'setSid',
        'source_id' => 'setSourceId',
        'folder_url' => 'setFolderUrl',
        'encrypted' => 'setEncrypted',
        'seed' => 'setSeed'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'object_type' => 'getObjectType',
        'organisation_id' => 'getOrganisationId',
        'kb_id' => 'getKbId',
        'sid' => 'getSid',
        'source_id' => 'getSourceId',
        'folder_url' => 'getFolderUrl',
        'encrypted' => 'getEncrypted',
        'seed' => 'getSeed'
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
        $this->setIfExists('object_type', $data ?? [], null);
        $this->setIfExists('organisation_id', $data ?? [], null);
        $this->setIfExists('kb_id', $data ?? [], null);
        $this->setIfExists('sid', $data ?? [], null);
        $this->setIfExists('source_id', $data ?? [], null);
        $this->setIfExists('folder_url', $data ?? [], null);
        $this->setIfExists('encrypted', $data ?? [], null);
        $this->setIfExists('seed', $data ?? [], null);
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

        if ($this->container['object_type'] === null) {
            $invalidProperties[] = "'object_type' can't be null";
        }
        if ($this->container['organisation_id'] === null) {
            $invalidProperties[] = "'organisation_id' can't be null";
        }
        if ($this->container['kb_id'] === null) {
            $invalidProperties[] = "'kb_id' can't be null";
        }
        if ($this->container['sid'] === null) {
            $invalidProperties[] = "'sid' can't be null";
        }
        if ($this->container['source_id'] === null) {
            $invalidProperties[] = "'source_id' can't be null";
        }
        if ($this->container['folder_url'] === null) {
            $invalidProperties[] = "'folder_url' can't be null";
        }
        if ($this->container['encrypted'] === null) {
            $invalidProperties[] = "'encrypted' can't be null";
        }
        if ($this->container['seed'] === null) {
            $invalidProperties[] = "'seed' can't be null";
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
     * Gets object_type
     *
     * @return string
     */
    public function getObjectType()
    {
        return $this->container['object_type'];
    }

    /**
     * Sets object_type
     *
     * @param string $object_type the type of this class, just in case this object is encrypted
     *
     * @return self
     */
    public function setObjectType($object_type)
    {
        if (is_null($object_type)) {
            throw new \InvalidArgumentException('non-nullable object_type cannot be null');
        }
        $this->container['object_type'] = $object_type;

        return $this;
    }

    /**
     * Gets organisation_id
     *
     * @return string
     */
    public function getOrganisationId()
    {
        return $this->container['organisation_id'];
    }

    /**
     * Sets organisation_id
     *
     * @param string $organisation_id the main organisation (its guid id) for this source/crawler
     *
     * @return self
     */
    public function setOrganisationId($organisation_id)
    {
        if (is_null($organisation_id)) {
            throw new \InvalidArgumentException('non-nullable organisation_id cannot be null');
        }
        $this->container['organisation_id'] = $organisation_id;

        return $this;
    }

    /**
     * Gets kb_id
     *
     * @return string
     */
    public function getKbId()
    {
        return $this->container['kb_id'];
    }

    /**
     * Sets kb_id
     *
     * @param string $kb_id the knowledge-base id of this context item, a guid-string
     *
     * @return self
     */
    public function setKbId($kb_id)
    {
        if (is_null($kb_id)) {
            throw new \InvalidArgumentException('non-nullable kb_id cannot be null');
        }
        $this->container['kb_id'] = $kb_id;

        return $this;
    }

    /**
     * Gets sid
     *
     * @return string
     */
    public function getSid()
    {
        return $this->container['sid'];
    }

    /**
     * Sets sid
     *
     * @param string $sid the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
     *
     * @return self
     */
    public function setSid($sid)
    {
        if (is_null($sid)) {
            throw new \InvalidArgumentException('non-nullable sid cannot be null');
        }
        $this->container['sid'] = $sid;

        return $this;
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
     * @param int $source_id the source-id of this crawler (ie. the crawler's id)
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
     * Gets folder_url
     *
     * @return string
     */
    public function getFolderUrl()
    {
        return $this->container['folder_url'];
    }

    /**
     * Sets folder_url
     *
     * @param string $folder_url the document-folder to delete
     *
     * @return self
     */
    public function setFolderUrl($folder_url)
    {
        if (is_null($folder_url)) {
            throw new \InvalidArgumentException('non-nullable folder_url cannot be null');
        }
        $this->container['folder_url'] = $folder_url;

        return $this;
    }

    /**
     * Gets encrypted
     *
     * @return bool
     */
    public function getEncrypted()
    {
        return $this->container['encrypted'];
    }

    /**
     * Sets encrypted
     *
     * @param bool $encrypted Do we need to add transport encryption
     *
     * @return self
     */
    public function setEncrypted($encrypted)
    {
        if (is_null($encrypted)) {
            throw new \InvalidArgumentException('non-nullable encrypted cannot be null');
        }
        $this->container['encrypted'] = $encrypted;

        return $this;
    }

    /**
     * Gets seed
     *
     * @return int
     */
    public function getSeed()
    {
        return $this->container['seed'];
    }

    /**
     * Sets seed
     *
     * @param int $seed The seed used if encrypted
     *
     * @return self
     */
    public function setSeed($seed)
    {
        if (is_null($seed)) {
            throw new \InvalidArgumentException('non-nullable seed cannot be null');
        }
        $this->container['seed'] = $seed;

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


