<?php
/**
 * Organisation
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
 * The version of the OpenAPI document: 7.14.12
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
 * Organisation Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Organisation implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Organisation';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'string',
        'name' => 'string',
        'enabled' => 'bool',
        'auto_create_sso_users' => 'bool',
        'auto_create_sso_domain_list' => 'string[]',
        'auto_create_ssoacl_list' => 'string[]',
        'auto_create_sso_role_list' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => null,
        'name' => null,
        'enabled' => null,
        'auto_create_sso_users' => null,
        'auto_create_sso_domain_list' => null,
        'auto_create_ssoacl_list' => null,
        'auto_create_sso_role_list' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'id' => false,
		'name' => false,
		'enabled' => false,
		'auto_create_sso_users' => false,
		'auto_create_sso_domain_list' => false,
		'auto_create_ssoacl_list' => false,
		'auto_create_sso_role_list' => false
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
        'id' => 'id',
        'name' => 'name',
        'enabled' => 'enabled',
        'auto_create_sso_users' => 'autoCreateSSOUsers',
        'auto_create_sso_domain_list' => 'autoCreateSSODomainList',
        'auto_create_ssoacl_list' => 'autoCreateSSOACLList',
        'auto_create_sso_role_list' => 'autoCreateSSORoleList'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'name' => 'setName',
        'enabled' => 'setEnabled',
        'auto_create_sso_users' => 'setAutoCreateSsoUsers',
        'auto_create_sso_domain_list' => 'setAutoCreateSsoDomainList',
        'auto_create_ssoacl_list' => 'setAutoCreateSsoaclList',
        'auto_create_sso_role_list' => 'setAutoCreateSsoRoleList'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'name' => 'getName',
        'enabled' => 'getEnabled',
        'auto_create_sso_users' => 'getAutoCreateSsoUsers',
        'auto_create_sso_domain_list' => 'getAutoCreateSsoDomainList',
        'auto_create_ssoacl_list' => 'getAutoCreateSsoaclList',
        'auto_create_sso_role_list' => 'getAutoCreateSsoRoleList'
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
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('enabled', $data ?? [], null);
        $this->setIfExists('auto_create_sso_users', $data ?? [], null);
        $this->setIfExists('auto_create_sso_domain_list', $data ?? [], null);
        $this->setIfExists('auto_create_ssoacl_list', $data ?? [], null);
        $this->setIfExists('auto_create_sso_role_list', $data ?? [], null);
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

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['enabled'] === null) {
            $invalidProperties[] = "'enabled' can't be null";
        }
        if ($this->container['auto_create_sso_users'] === null) {
            $invalidProperties[] = "'auto_create_sso_users' can't be null";
        }
        if ($this->container['auto_create_sso_domain_list'] === null) {
            $invalidProperties[] = "'auto_create_sso_domain_list' can't be null";
        }
        if ($this->container['auto_create_ssoacl_list'] === null) {
            $invalidProperties[] = "'auto_create_ssoacl_list' can't be null";
        }
        if ($this->container['auto_create_sso_role_list'] === null) {
            $invalidProperties[] = "'auto_create_sso_role_list' can't be null";
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
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id id
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name name
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets enabled
     *
     * @return bool
     */
    public function getEnabled()
    {
        return $this->container['enabled'];
    }

    /**
     * Sets enabled
     *
     * @param bool $enabled enabled
     *
     * @return self
     */
    public function setEnabled($enabled)
    {
        if (is_null($enabled)) {
            throw new \InvalidArgumentException('non-nullable enabled cannot be null');
        }
        $this->container['enabled'] = $enabled;

        return $this;
    }

    /**
     * Gets auto_create_sso_users
     *
     * @return bool
     */
    public function getAutoCreateSsoUsers()
    {
        return $this->container['auto_create_sso_users'];
    }

    /**
     * Sets auto_create_sso_users
     *
     * @param bool $auto_create_sso_users auto_create_sso_users
     *
     * @return self
     */
    public function setAutoCreateSsoUsers($auto_create_sso_users)
    {
        if (is_null($auto_create_sso_users)) {
            throw new \InvalidArgumentException('non-nullable auto_create_sso_users cannot be null');
        }
        $this->container['auto_create_sso_users'] = $auto_create_sso_users;

        return $this;
    }

    /**
     * Gets auto_create_sso_domain_list
     *
     * @return string[]
     */
    public function getAutoCreateSsoDomainList()
    {
        return $this->container['auto_create_sso_domain_list'];
    }

    /**
     * Sets auto_create_sso_domain_list
     *
     * @param string[] $auto_create_sso_domain_list auto_create_sso_domain_list
     *
     * @return self
     */
    public function setAutoCreateSsoDomainList($auto_create_sso_domain_list)
    {
        if (is_null($auto_create_sso_domain_list)) {
            throw new \InvalidArgumentException('non-nullable auto_create_sso_domain_list cannot be null');
        }
        $this->container['auto_create_sso_domain_list'] = $auto_create_sso_domain_list;

        return $this;
    }

    /**
     * Gets auto_create_ssoacl_list
     *
     * @return string[]
     */
    public function getAutoCreateSsoaclList()
    {
        return $this->container['auto_create_ssoacl_list'];
    }

    /**
     * Sets auto_create_ssoacl_list
     *
     * @param string[] $auto_create_ssoacl_list auto_create_ssoacl_list
     *
     * @return self
     */
    public function setAutoCreateSsoaclList($auto_create_ssoacl_list)
    {
        if (is_null($auto_create_ssoacl_list)) {
            throw new \InvalidArgumentException('non-nullable auto_create_ssoacl_list cannot be null');
        }
        $this->container['auto_create_ssoacl_list'] = $auto_create_ssoacl_list;

        return $this;
    }

    /**
     * Gets auto_create_sso_role_list
     *
     * @return string[]
     */
    public function getAutoCreateSsoRoleList()
    {
        return $this->container['auto_create_sso_role_list'];
    }

    /**
     * Sets auto_create_sso_role_list
     *
     * @param string[] $auto_create_sso_role_list auto_create_sso_role_list
     *
     * @return self
     */
    public function setAutoCreateSsoRoleList($auto_create_sso_role_list)
    {
        if (is_null($auto_create_sso_role_list)) {
            throw new \InvalidArgumentException('non-nullable auto_create_sso_role_list cannot be null');
        }
        $this->container['auto_create_sso_role_list'] = $auto_create_sso_role_list;

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


