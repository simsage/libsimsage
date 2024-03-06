<?php
/**
 * ContextItem
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
 * ContextItem Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ContextItem implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'ContextItem';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'kb_id' => 'string',
        'created' => 'int',
        'name_value' => 'array<string,string>',
        'syn_set_lemma' => 'string',
        'syn_set_cloud' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'kb_id' => null,
        'created' => 'int64',
        'name_value' => null,
        'syn_set_lemma' => null,
        'syn_set_cloud' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'kb_id' => false,
		'created' => false,
		'name_value' => false,
		'syn_set_lemma' => false,
		'syn_set_cloud' => false
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
        'kb_id' => 'kbId',
        'created' => 'created',
        'name_value' => 'nameValue',
        'syn_set_lemma' => 'synSetLemma',
        'syn_set_cloud' => 'synSetCloud'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'kb_id' => 'setKbId',
        'created' => 'setCreated',
        'name_value' => 'setNameValue',
        'syn_set_lemma' => 'setSynSetLemma',
        'syn_set_cloud' => 'setSynSetCloud'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'kb_id' => 'getKbId',
        'created' => 'getCreated',
        'name_value' => 'getNameValue',
        'syn_set_lemma' => 'getSynSetLemma',
        'syn_set_cloud' => 'getSynSetCloud'
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
        $this->setIfExists('kb_id', $data ?? [], null);
        $this->setIfExists('created', $data ?? [], null);
        $this->setIfExists('name_value', $data ?? [], null);
        $this->setIfExists('syn_set_lemma', $data ?? [], null);
        $this->setIfExists('syn_set_cloud', $data ?? [], null);
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

        if ($this->container['kb_id'] === null) {
            $invalidProperties[] = "'kb_id' can't be null";
        }
        if ($this->container['created'] === null) {
            $invalidProperties[] = "'created' can't be null";
        }
        if ($this->container['name_value'] === null) {
            $invalidProperties[] = "'name_value' can't be null";
        }
        if ($this->container['syn_set_lemma'] === null) {
            $invalidProperties[] = "'syn_set_lemma' can't be null";
        }
        if ($this->container['syn_set_cloud'] === null) {
            $invalidProperties[] = "'syn_set_cloud' can't be null";
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
     * @param string $kb_id kb_id
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
     * Gets created
     *
     * @return int
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     *
     * @param int $created created
     *
     * @return self
     */
    public function setCreated($created)
    {
        if (is_null($created)) {
            throw new \InvalidArgumentException('non-nullable created cannot be null');
        }
        $this->container['created'] = $created;

        return $this;
    }

    /**
     * Gets name_value
     *
     * @return array<string,string>
     */
    public function getNameValue()
    {
        return $this->container['name_value'];
    }

    /**
     * Sets name_value
     *
     * @param array<string,string> $name_value name_value
     *
     * @return self
     */
    public function setNameValue($name_value)
    {
        if (is_null($name_value)) {
            throw new \InvalidArgumentException('non-nullable name_value cannot be null');
        }
        $this->container['name_value'] = $name_value;

        return $this;
    }

    /**
     * Gets syn_set_lemma
     *
     * @return string
     */
    public function getSynSetLemma()
    {
        return $this->container['syn_set_lemma'];
    }

    /**
     * Sets syn_set_lemma
     *
     * @param string $syn_set_lemma syn_set_lemma
     *
     * @return self
     */
    public function setSynSetLemma($syn_set_lemma)
    {
        if (is_null($syn_set_lemma)) {
            throw new \InvalidArgumentException('non-nullable syn_set_lemma cannot be null');
        }
        $this->container['syn_set_lemma'] = $syn_set_lemma;

        return $this;
    }

    /**
     * Gets syn_set_cloud
     *
     * @return string[]
     */
    public function getSynSetCloud()
    {
        return $this->container['syn_set_cloud'];
    }

    /**
     * Sets syn_set_cloud
     *
     * @param string[] $syn_set_cloud syn_set_cloud
     *
     * @return self
     */
    public function setSynSetCloud($syn_set_cloud)
    {
        if (is_null($syn_set_cloud)) {
            throw new \InvalidArgumentException('non-nullable syn_set_cloud cannot be null');
        }
        $this->container['syn_set_cloud'] = $syn_set_cloud;

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


