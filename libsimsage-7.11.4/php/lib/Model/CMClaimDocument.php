<?php
/**
 * CMClaimDocument
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
 * The version of the OpenAPI document: 7.11.4
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
 * CMClaimDocument Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMClaimDocument implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMClaimDocument';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'organisation_id' => 'string',
        'project_id' => 'string',
        'slice_id' => 'string',
        'document_key' => 'string',
        'lock' => 'bool',
        'force' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'organisation_id' => null,
        'project_id' => null,
        'slice_id' => null,
        'document_key' => null,
        'lock' => null,
        'force' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'organisation_id' => false,
		'project_id' => false,
		'slice_id' => false,
		'document_key' => false,
		'lock' => false,
		'force' => false
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
        'organisation_id' => 'organisationId',
        'project_id' => 'projectId',
        'slice_id' => 'sliceId',
        'document_key' => 'documentKey',
        'lock' => 'lock',
        'force' => 'force'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'organisation_id' => 'setOrganisationId',
        'project_id' => 'setProjectId',
        'slice_id' => 'setSliceId',
        'document_key' => 'setDocumentKey',
        'lock' => 'setLock',
        'force' => 'setForce'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'organisation_id' => 'getOrganisationId',
        'project_id' => 'getProjectId',
        'slice_id' => 'getSliceId',
        'document_key' => 'getDocumentKey',
        'lock' => 'getLock',
        'force' => 'getForce'
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
        $this->setIfExists('organisation_id', $data ?? [], null);
        $this->setIfExists('project_id', $data ?? [], null);
        $this->setIfExists('slice_id', $data ?? [], null);
        $this->setIfExists('document_key', $data ?? [], null);
        $this->setIfExists('lock', $data ?? [], null);
        $this->setIfExists('force', $data ?? [], null);
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

        if ($this->container['organisation_id'] === null) {
            $invalidProperties[] = "'organisation_id' can't be null";
        }
        if ($this->container['project_id'] === null) {
            $invalidProperties[] = "'project_id' can't be null";
        }
        if ($this->container['slice_id'] === null) {
            $invalidProperties[] = "'slice_id' can't be null";
        }
        if ($this->container['document_key'] === null) {
            $invalidProperties[] = "'document_key' can't be null";
        }
        if ($this->container['lock'] === null) {
            $invalidProperties[] = "'lock' can't be null";
        }
        if ($this->container['force'] === null) {
            $invalidProperties[] = "'force' can't be null";
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
     * @param string $organisation_id organisation_id
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
     * Gets project_id
     *
     * @return string
     */
    public function getProjectId()
    {
        return $this->container['project_id'];
    }

    /**
     * Sets project_id
     *
     * @param string $project_id project_id
     *
     * @return self
     */
    public function setProjectId($project_id)
    {
        if (is_null($project_id)) {
            throw new \InvalidArgumentException('non-nullable project_id cannot be null');
        }
        $this->container['project_id'] = $project_id;

        return $this;
    }

    /**
     * Gets slice_id
     *
     * @return string
     */
    public function getSliceId()
    {
        return $this->container['slice_id'];
    }

    /**
     * Sets slice_id
     *
     * @param string $slice_id slice_id
     *
     * @return self
     */
    public function setSliceId($slice_id)
    {
        if (is_null($slice_id)) {
            throw new \InvalidArgumentException('non-nullable slice_id cannot be null');
        }
        $this->container['slice_id'] = $slice_id;

        return $this;
    }

    /**
     * Gets document_key
     *
     * @return string
     */
    public function getDocumentKey()
    {
        return $this->container['document_key'];
    }

    /**
     * Sets document_key
     *
     * @param string $document_key document_key
     *
     * @return self
     */
    public function setDocumentKey($document_key)
    {
        if (is_null($document_key)) {
            throw new \InvalidArgumentException('non-nullable document_key cannot be null');
        }
        $this->container['document_key'] = $document_key;

        return $this;
    }

    /**
     * Gets lock
     *
     * @return bool
     */
    public function getLock()
    {
        return $this->container['lock'];
    }

    /**
     * Sets lock
     *
     * @param bool $lock lock
     *
     * @return self
     */
    public function setLock($lock)
    {
        if (is_null($lock)) {
            throw new \InvalidArgumentException('non-nullable lock cannot be null');
        }
        $this->container['lock'] = $lock;

        return $this;
    }

    /**
     * Gets force
     *
     * @return bool
     */
    public function getForce()
    {
        return $this->container['force'];
    }

    /**
     * Sets force
     *
     * @param bool $force force
     *
     * @return self
     */
    public function setForce($force)
    {
        if (is_null($force)) {
            throw new \InvalidArgumentException('non-nullable force cannot be null');
        }
        $this->container['force'] = $force;

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

