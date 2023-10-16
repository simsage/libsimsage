<?php
/**
 * SearchCategory
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
 * SearchCategory Class Doc Comment
 *
 * @category Class
 * @description Search categories / metadata searching
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class SearchCategory implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'SearchCategory';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'sc_type' => 'string',
        'category_type' => 'string',
        'order' => 'int',
        'sort_default' => 'string',
        'sort_asc_text' => 'string',
        'sort_desc_text' => 'string',
        'metadata' => 'string',
        'display_name' => 'string',
        'sort' => 'bool',
        'min_value' => 'int',
        'max_value' => 'int',
        'items' => '\OpenAPI\Client\Model\NameCounterLevel[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'sc_type' => null,
        'category_type' => null,
        'order' => 'int32',
        'sort_default' => null,
        'sort_asc_text' => null,
        'sort_desc_text' => null,
        'metadata' => null,
        'display_name' => null,
        'sort' => null,
        'min_value' => 'int64',
        'max_value' => 'int64',
        'items' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'sc_type' => false,
		'category_type' => false,
		'order' => false,
		'sort_default' => false,
		'sort_asc_text' => false,
		'sort_desc_text' => false,
		'metadata' => false,
		'display_name' => false,
		'sort' => false,
		'min_value' => false,
		'max_value' => false,
		'items' => false
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
        'sc_type' => 'scType',
        'category_type' => 'categoryType',
        'order' => 'order',
        'sort_default' => 'sortDefault',
        'sort_asc_text' => 'sortAscText',
        'sort_desc_text' => 'sortDescText',
        'metadata' => 'metadata',
        'display_name' => 'displayName',
        'sort' => 'sort',
        'min_value' => 'minValue',
        'max_value' => 'maxValue',
        'items' => 'items'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'sc_type' => 'setScType',
        'category_type' => 'setCategoryType',
        'order' => 'setOrder',
        'sort_default' => 'setSortDefault',
        'sort_asc_text' => 'setSortAscText',
        'sort_desc_text' => 'setSortDescText',
        'metadata' => 'setMetadata',
        'display_name' => 'setDisplayName',
        'sort' => 'setSort',
        'min_value' => 'setMinValue',
        'max_value' => 'setMaxValue',
        'items' => 'setItems'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'sc_type' => 'getScType',
        'category_type' => 'getCategoryType',
        'order' => 'getOrder',
        'sort_default' => 'getSortDefault',
        'sort_asc_text' => 'getSortAscText',
        'sort_desc_text' => 'getSortDescText',
        'metadata' => 'getMetadata',
        'display_name' => 'getDisplayName',
        'sort' => 'getSort',
        'min_value' => 'getMinValue',
        'max_value' => 'getMaxValue',
        'items' => 'getItems'
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

    public const SC_TYPE_PLAIN = 'SCT_PLAIN';
    public const SC_TYPE_TWO_LEVEL = 'SCT_TWO_LEVEL';
    public const SC_TYPE_NUMBER = 'SCT_NUMBER';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getScTypeAllowableValues()
    {
        return [
            self::SC_TYPE_PLAIN,
            self::SC_TYPE_TWO_LEVEL,
            self::SC_TYPE_NUMBER,
        ];
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
        $this->setIfExists('sc_type', $data ?? [], null);
        $this->setIfExists('category_type', $data ?? [], null);
        $this->setIfExists('order', $data ?? [], null);
        $this->setIfExists('sort_default', $data ?? [], null);
        $this->setIfExists('sort_asc_text', $data ?? [], null);
        $this->setIfExists('sort_desc_text', $data ?? [], null);
        $this->setIfExists('metadata', $data ?? [], null);
        $this->setIfExists('display_name', $data ?? [], null);
        $this->setIfExists('sort', $data ?? [], null);
        $this->setIfExists('min_value', $data ?? [], null);
        $this->setIfExists('max_value', $data ?? [], null);
        $this->setIfExists('items', $data ?? [], null);
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

        if ($this->container['sc_type'] === null) {
            $invalidProperties[] = "'sc_type' can't be null";
        }
        $allowedValues = $this->getScTypeAllowableValues();
        if (!is_null($this->container['sc_type']) && !in_array($this->container['sc_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'sc_type', must be one of '%s'",
                $this->container['sc_type'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['category_type'] === null) {
            $invalidProperties[] = "'category_type' can't be null";
        }
        if ($this->container['order'] === null) {
            $invalidProperties[] = "'order' can't be null";
        }
        if ($this->container['sort_default'] === null) {
            $invalidProperties[] = "'sort_default' can't be null";
        }
        if ($this->container['sort_asc_text'] === null) {
            $invalidProperties[] = "'sort_asc_text' can't be null";
        }
        if ($this->container['sort_desc_text'] === null) {
            $invalidProperties[] = "'sort_desc_text' can't be null";
        }
        if ($this->container['metadata'] === null) {
            $invalidProperties[] = "'metadata' can't be null";
        }
        if ($this->container['display_name'] === null) {
            $invalidProperties[] = "'display_name' can't be null";
        }
        if ($this->container['sort'] === null) {
            $invalidProperties[] = "'sort' can't be null";
        }
        if ($this->container['min_value'] === null) {
            $invalidProperties[] = "'min_value' can't be null";
        }
        if ($this->container['max_value'] === null) {
            $invalidProperties[] = "'max_value' can't be null";
        }
        if ($this->container['items'] === null) {
            $invalidProperties[] = "'items' can't be null";
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
     * Gets sc_type
     *
     * @return string
     */
    public function getScType()
    {
        return $this->container['sc_type'];
    }

    /**
     * Sets sc_type
     *
     * @param string $sc_type sc_type
     *
     * @return self
     */
    public function setScType($sc_type)
    {
        if (is_null($sc_type)) {
            throw new \InvalidArgumentException('non-nullable sc_type cannot be null');
        }
        $allowedValues = $this->getScTypeAllowableValues();
        if (!in_array($sc_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'sc_type', must be one of '%s'",
                    $sc_type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['sc_type'] = $sc_type;

        return $this;
    }

    /**
     * Gets category_type
     *
     * @return string
     */
    public function getCategoryType()
    {
        return $this->container['category_type'];
    }

    /**
     * Sets category_type
     *
     * @param string $category_type category_type
     *
     * @return self
     */
    public function setCategoryType($category_type)
    {
        if (is_null($category_type)) {
            throw new \InvalidArgumentException('non-nullable category_type cannot be null');
        }
        $this->container['category_type'] = $category_type;

        return $this;
    }

    /**
     * Gets order
     *
     * @return int
     */
    public function getOrder()
    {
        return $this->container['order'];
    }

    /**
     * Sets order
     *
     * @param int $order order
     *
     * @return self
     */
    public function setOrder($order)
    {
        if (is_null($order)) {
            throw new \InvalidArgumentException('non-nullable order cannot be null');
        }
        $this->container['order'] = $order;

        return $this;
    }

    /**
     * Gets sort_default
     *
     * @return string
     */
    public function getSortDefault()
    {
        return $this->container['sort_default'];
    }

    /**
     * Sets sort_default
     *
     * @param string $sort_default sort_default
     *
     * @return self
     */
    public function setSortDefault($sort_default)
    {
        if (is_null($sort_default)) {
            throw new \InvalidArgumentException('non-nullable sort_default cannot be null');
        }
        $this->container['sort_default'] = $sort_default;

        return $this;
    }

    /**
     * Gets sort_asc_text
     *
     * @return string
     */
    public function getSortAscText()
    {
        return $this->container['sort_asc_text'];
    }

    /**
     * Sets sort_asc_text
     *
     * @param string $sort_asc_text sort_asc_text
     *
     * @return self
     */
    public function setSortAscText($sort_asc_text)
    {
        if (is_null($sort_asc_text)) {
            throw new \InvalidArgumentException('non-nullable sort_asc_text cannot be null');
        }
        $this->container['sort_asc_text'] = $sort_asc_text;

        return $this;
    }

    /**
     * Gets sort_desc_text
     *
     * @return string
     */
    public function getSortDescText()
    {
        return $this->container['sort_desc_text'];
    }

    /**
     * Sets sort_desc_text
     *
     * @param string $sort_desc_text sort_desc_text
     *
     * @return self
     */
    public function setSortDescText($sort_desc_text)
    {
        if (is_null($sort_desc_text)) {
            throw new \InvalidArgumentException('non-nullable sort_desc_text cannot be null');
        }
        $this->container['sort_desc_text'] = $sort_desc_text;

        return $this;
    }

    /**
     * Gets metadata
     *
     * @return string
     */
    public function getMetadata()
    {
        return $this->container['metadata'];
    }

    /**
     * Sets metadata
     *
     * @param string $metadata metadata
     *
     * @return self
     */
    public function setMetadata($metadata)
    {
        if (is_null($metadata)) {
            throw new \InvalidArgumentException('non-nullable metadata cannot be null');
        }
        $this->container['metadata'] = $metadata;

        return $this;
    }

    /**
     * Gets display_name
     *
     * @return string
     */
    public function getDisplayName()
    {
        return $this->container['display_name'];
    }

    /**
     * Sets display_name
     *
     * @param string $display_name display_name
     *
     * @return self
     */
    public function setDisplayName($display_name)
    {
        if (is_null($display_name)) {
            throw new \InvalidArgumentException('non-nullable display_name cannot be null');
        }
        $this->container['display_name'] = $display_name;

        return $this;
    }

    /**
     * Gets sort
     *
     * @return bool
     */
    public function getSort()
    {
        return $this->container['sort'];
    }

    /**
     * Sets sort
     *
     * @param bool $sort sort
     *
     * @return self
     */
    public function setSort($sort)
    {
        if (is_null($sort)) {
            throw new \InvalidArgumentException('non-nullable sort cannot be null');
        }
        $this->container['sort'] = $sort;

        return $this;
    }

    /**
     * Gets min_value
     *
     * @return int
     */
    public function getMinValue()
    {
        return $this->container['min_value'];
    }

    /**
     * Sets min_value
     *
     * @param int $min_value min_value
     *
     * @return self
     */
    public function setMinValue($min_value)
    {
        if (is_null($min_value)) {
            throw new \InvalidArgumentException('non-nullable min_value cannot be null');
        }
        $this->container['min_value'] = $min_value;

        return $this;
    }

    /**
     * Gets max_value
     *
     * @return int
     */
    public function getMaxValue()
    {
        return $this->container['max_value'];
    }

    /**
     * Sets max_value
     *
     * @param int $max_value max_value
     *
     * @return self
     */
    public function setMaxValue($max_value)
    {
        if (is_null($max_value)) {
            throw new \InvalidArgumentException('non-nullable max_value cannot be null');
        }
        $this->container['max_value'] = $max_value;

        return $this;
    }

    /**
     * Gets items
     *
     * @return \OpenAPI\Client\Model\NameCounterLevel[]
     */
    public function getItems()
    {
        return $this->container['items'];
    }

    /**
     * Sets items
     *
     * @param \OpenAPI\Client\Model\NameCounterLevel[] $items items
     *
     * @return self
     */
    public function setItems($items)
    {
        if (is_null($items)) {
            throw new \InvalidArgumentException('non-nullable items cannot be null');
        }
        $this->container['items'] = $items;

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

