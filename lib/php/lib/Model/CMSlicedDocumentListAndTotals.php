<?php
/**
 * CMSlicedDocumentListAndTotals
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
 * The version of the OpenAPI document: 7.12.19
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
 * CMSlicedDocumentListAndTotals Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMSlicedDocumentListAndTotals implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMSlicedDocumentListAndTotals';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'paged_results' => '\OpenAPI\Client\Model\CMPagedResultsCMSlicedDocument',
        'all_docs' => 'int',
        'completed' => 'int',
        'source_map' => 'array<string,string>',
        'user_map' => 'array<string,string>'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'paged_results' => null,
        'all_docs' => 'int64',
        'completed' => 'int64',
        'source_map' => null,
        'user_map' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'paged_results' => false,
		'all_docs' => false,
		'completed' => false,
		'source_map' => false,
		'user_map' => false
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
        'paged_results' => 'pagedResults',
        'all_docs' => 'allDocs',
        'completed' => 'completed',
        'source_map' => 'sourceMap',
        'user_map' => 'userMap'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'paged_results' => 'setPagedResults',
        'all_docs' => 'setAllDocs',
        'completed' => 'setCompleted',
        'source_map' => 'setSourceMap',
        'user_map' => 'setUserMap'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'paged_results' => 'getPagedResults',
        'all_docs' => 'getAllDocs',
        'completed' => 'getCompleted',
        'source_map' => 'getSourceMap',
        'user_map' => 'getUserMap'
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
        $this->setIfExists('paged_results', $data ?? [], null);
        $this->setIfExists('all_docs', $data ?? [], null);
        $this->setIfExists('completed', $data ?? [], null);
        $this->setIfExists('source_map', $data ?? [], null);
        $this->setIfExists('user_map', $data ?? [], null);
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

        if ($this->container['paged_results'] === null) {
            $invalidProperties[] = "'paged_results' can't be null";
        }
        if ($this->container['all_docs'] === null) {
            $invalidProperties[] = "'all_docs' can't be null";
        }
        if ($this->container['completed'] === null) {
            $invalidProperties[] = "'completed' can't be null";
        }
        if ($this->container['source_map'] === null) {
            $invalidProperties[] = "'source_map' can't be null";
        }
        if ($this->container['user_map'] === null) {
            $invalidProperties[] = "'user_map' can't be null";
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
     * Gets paged_results
     *
     * @return \OpenAPI\Client\Model\CMPagedResultsCMSlicedDocument
     */
    public function getPagedResults()
    {
        return $this->container['paged_results'];
    }

    /**
     * Sets paged_results
     *
     * @param \OpenAPI\Client\Model\CMPagedResultsCMSlicedDocument $paged_results paged_results
     *
     * @return self
     */
    public function setPagedResults($paged_results)
    {
        if (is_null($paged_results)) {
            throw new \InvalidArgumentException('non-nullable paged_results cannot be null');
        }
        $this->container['paged_results'] = $paged_results;

        return $this;
    }

    /**
     * Gets all_docs
     *
     * @return int
     */
    public function getAllDocs()
    {
        return $this->container['all_docs'];
    }

    /**
     * Sets all_docs
     *
     * @param int $all_docs all_docs
     *
     * @return self
     */
    public function setAllDocs($all_docs)
    {
        if (is_null($all_docs)) {
            throw new \InvalidArgumentException('non-nullable all_docs cannot be null');
        }
        $this->container['all_docs'] = $all_docs;

        return $this;
    }

    /**
     * Gets completed
     *
     * @return int
     */
    public function getCompleted()
    {
        return $this->container['completed'];
    }

    /**
     * Sets completed
     *
     * @param int $completed completed
     *
     * @return self
     */
    public function setCompleted($completed)
    {
        if (is_null($completed)) {
            throw new \InvalidArgumentException('non-nullable completed cannot be null');
        }
        $this->container['completed'] = $completed;

        return $this;
    }

    /**
     * Gets source_map
     *
     * @return array<string,string>
     */
    public function getSourceMap()
    {
        return $this->container['source_map'];
    }

    /**
     * Sets source_map
     *
     * @param array<string,string> $source_map source_map
     *
     * @return self
     */
    public function setSourceMap($source_map)
    {
        if (is_null($source_map)) {
            throw new \InvalidArgumentException('non-nullable source_map cannot be null');
        }
        $this->container['source_map'] = $source_map;

        return $this;
    }

    /**
     * Gets user_map
     *
     * @return array<string,string>
     */
    public function getUserMap()
    {
        return $this->container['user_map'];
    }

    /**
     * Sets user_map
     *
     * @param array<string,string> $user_map user_map
     *
     * @return self
     */
    public function setUserMap($user_map)
    {
        if (is_null($user_map)) {
            throw new \InvalidArgumentException('non-nullable user_map cannot be null');
        }
        $this->container['user_map'] = $user_map;

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


