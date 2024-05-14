<?php
/**
 * CMKnowledgeBase
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
 * CMKnowledgeBase Class Doc Comment
 *
 * @category Class
 * @description A knowledge-base is SimSage&#39;s representation of a list of information silos belonging to an organisation.  A knowledge-base represents a second level of isolation between data in SimSage.  The first level is an Organisation.  Each organisation in SimSage has a list of knowledge-bases, strictly isolated from each other.  Each knowledge-base in turn can have many sources (information collectors that add items to a knowledge-base like a file-crawler, or a web-crawler)
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMKnowledgeBase implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMKnowledgeBase';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'organisation_id' => 'string',
        'kb_id' => 'string',
        'name' => 'string',
        'email' => 'string',
        'security_id' => 'string',
        'created' => 'int',
        'max_queries_per_day' => 'int',
        'analytics_window_in_months' => 'int',
        'enabled' => 'bool',
        'operator_enabled' => 'bool',
        'capacity_warnings' => 'bool',
        'index_schedule' => 'string',
        'last_index_optimization_time' => 'int',
        'is_optimizing' => 'bool',
        'optimization_progress' => 'int',
        'optimizing' => 'bool'
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
        'kb_id' => null,
        'name' => null,
        'email' => null,
        'security_id' => null,
        'created' => 'int64',
        'max_queries_per_day' => 'int64',
        'analytics_window_in_months' => 'int32',
        'enabled' => null,
        'operator_enabled' => null,
        'capacity_warnings' => null,
        'index_schedule' => null,
        'last_index_optimization_time' => 'int64',
        'is_optimizing' => null,
        'optimization_progress' => 'int32',
        'optimizing' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'organisation_id' => false,
		'kb_id' => false,
		'name' => false,
		'email' => false,
		'security_id' => false,
		'created' => false,
		'max_queries_per_day' => false,
		'analytics_window_in_months' => false,
		'enabled' => false,
		'operator_enabled' => false,
		'capacity_warnings' => false,
		'index_schedule' => false,
		'last_index_optimization_time' => false,
		'is_optimizing' => false,
		'optimization_progress' => false,
		'optimizing' => false
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
        'kb_id' => 'kbId',
        'name' => 'name',
        'email' => 'email',
        'security_id' => 'securityId',
        'created' => 'created',
        'max_queries_per_day' => 'maxQueriesPerDay',
        'analytics_window_in_months' => 'analyticsWindowInMonths',
        'enabled' => 'enabled',
        'operator_enabled' => 'operatorEnabled',
        'capacity_warnings' => 'capacityWarnings',
        'index_schedule' => 'indexSchedule',
        'last_index_optimization_time' => 'lastIndexOptimizationTime',
        'is_optimizing' => 'isOptimizing',
        'optimization_progress' => 'optimizationProgress',
        'optimizing' => 'optimizing'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'organisation_id' => 'setOrganisationId',
        'kb_id' => 'setKbId',
        'name' => 'setName',
        'email' => 'setEmail',
        'security_id' => 'setSecurityId',
        'created' => 'setCreated',
        'max_queries_per_day' => 'setMaxQueriesPerDay',
        'analytics_window_in_months' => 'setAnalyticsWindowInMonths',
        'enabled' => 'setEnabled',
        'operator_enabled' => 'setOperatorEnabled',
        'capacity_warnings' => 'setCapacityWarnings',
        'index_schedule' => 'setIndexSchedule',
        'last_index_optimization_time' => 'setLastIndexOptimizationTime',
        'is_optimizing' => 'setIsOptimizing',
        'optimization_progress' => 'setOptimizationProgress',
        'optimizing' => 'setOptimizing'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'organisation_id' => 'getOrganisationId',
        'kb_id' => 'getKbId',
        'name' => 'getName',
        'email' => 'getEmail',
        'security_id' => 'getSecurityId',
        'created' => 'getCreated',
        'max_queries_per_day' => 'getMaxQueriesPerDay',
        'analytics_window_in_months' => 'getAnalyticsWindowInMonths',
        'enabled' => 'getEnabled',
        'operator_enabled' => 'getOperatorEnabled',
        'capacity_warnings' => 'getCapacityWarnings',
        'index_schedule' => 'getIndexSchedule',
        'last_index_optimization_time' => 'getLastIndexOptimizationTime',
        'is_optimizing' => 'getIsOptimizing',
        'optimization_progress' => 'getOptimizationProgress',
        'optimizing' => 'getOptimizing'
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
        $this->setIfExists('kb_id', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('email', $data ?? [], null);
        $this->setIfExists('security_id', $data ?? [], null);
        $this->setIfExists('created', $data ?? [], null);
        $this->setIfExists('max_queries_per_day', $data ?? [], null);
        $this->setIfExists('analytics_window_in_months', $data ?? [], null);
        $this->setIfExists('enabled', $data ?? [], null);
        $this->setIfExists('operator_enabled', $data ?? [], null);
        $this->setIfExists('capacity_warnings', $data ?? [], null);
        $this->setIfExists('index_schedule', $data ?? [], null);
        $this->setIfExists('last_index_optimization_time', $data ?? [], null);
        $this->setIfExists('is_optimizing', $data ?? [], null);
        $this->setIfExists('optimization_progress', $data ?? [], null);
        $this->setIfExists('optimizing', $data ?? [], null);
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
        if ($this->container['kb_id'] === null) {
            $invalidProperties[] = "'kb_id' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['email'] === null) {
            $invalidProperties[] = "'email' can't be null";
        }
        if ($this->container['security_id'] === null) {
            $invalidProperties[] = "'security_id' can't be null";
        }
        if ($this->container['created'] === null) {
            $invalidProperties[] = "'created' can't be null";
        }
        if ($this->container['max_queries_per_day'] === null) {
            $invalidProperties[] = "'max_queries_per_day' can't be null";
        }
        if ($this->container['analytics_window_in_months'] === null) {
            $invalidProperties[] = "'analytics_window_in_months' can't be null";
        }
        if ($this->container['enabled'] === null) {
            $invalidProperties[] = "'enabled' can't be null";
        }
        if ($this->container['operator_enabled'] === null) {
            $invalidProperties[] = "'operator_enabled' can't be null";
        }
        if ($this->container['capacity_warnings'] === null) {
            $invalidProperties[] = "'capacity_warnings' can't be null";
        }
        if ($this->container['index_schedule'] === null) {
            $invalidProperties[] = "'index_schedule' can't be null";
        }
        if ($this->container['last_index_optimization_time'] === null) {
            $invalidProperties[] = "'last_index_optimization_time' can't be null";
        }
        if ($this->container['is_optimizing'] === null) {
            $invalidProperties[] = "'is_optimizing' can't be null";
        }
        if ($this->container['optimization_progress'] === null) {
            $invalidProperties[] = "'optimization_progress' can't be null";
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
     * @param string $organisation_id the main organisation (its guid id)
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
     * @param string $kb_id the knowledge-base id (its guid id)
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
     * @param string $name the name of this knowledge-base (must be unique within an organisation)
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
     * Gets email
     *
     * @return string
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string $email the support email of the person to email with any UI generated questions
     *
     * @return self
     */
    public function setEmail($email)
    {
        if (is_null($email)) {
            throw new \InvalidArgumentException('non-nullable email cannot be null');
        }
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets security_id
     *
     * @return string
     */
    public function getSecurityId()
    {
        return $this->container['security_id'];
    }

    /**
     * Sets security_id
     *
     * @param string $security_id the security id (a guid) of this knowledge-base.  This is a shared secret between SimSage and external systems.
     *
     * @return self
     */
    public function setSecurityId($security_id)
    {
        if (is_null($security_id)) {
            throw new \InvalidArgumentException('non-nullable security_id cannot be null');
        }
        $this->container['security_id'] = $security_id;

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
     * @param int $created when this knowledge-base was created, a unix date-time long
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
     * Gets max_queries_per_day
     *
     * @return int
     */
    public function getMaxQueriesPerDay()
    {
        return $this->container['max_queries_per_day'];
    }

    /**
     * Sets max_queries_per_day
     *
     * @param int $max_queries_per_day limit the number of queries per day (if greater than 0).  A value of zero (0) indicates no limits.
     *
     * @return self
     */
    public function setMaxQueriesPerDay($max_queries_per_day)
    {
        if (is_null($max_queries_per_day)) {
            throw new \InvalidArgumentException('non-nullable max_queries_per_day cannot be null');
        }
        $this->container['max_queries_per_day'] = $max_queries_per_day;

        return $this;
    }

    /**
     * Gets analytics_window_in_months
     *
     * @return int
     */
    public function getAnalyticsWindowInMonths()
    {
        return $this->container['analytics_window_in_months'];
    }

    /**
     * Sets analytics_window_in_months
     *
     * @param int $analytics_window_in_months How long to keep analytics for in months.  A value of zero (0) indicates forever
     *
     * @return self
     */
    public function setAnalyticsWindowInMonths($analytics_window_in_months)
    {
        if (is_null($analytics_window_in_months)) {
            throw new \InvalidArgumentException('non-nullable analytics_window_in_months cannot be null');
        }
        $this->container['analytics_window_in_months'] = $analytics_window_in_months;

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
     * @param bool $enabled a flag signalling this knowledge-base is active (can be used).  An inactive knowledge-base cannot be queried.
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
     * Gets operator_enabled
     *
     * @return bool
     */
    public function getOperatorEnabled()
    {
        return $this->container['operator_enabled'];
    }

    /**
     * Sets operator_enabled
     *
     * @param bool $operator_enabled a flag signalling this knowledge-base has operator support.  A value of false prevents this knowledge-base's operator from interacting with end-users.
     *
     * @return self
     */
    public function setOperatorEnabled($operator_enabled)
    {
        if (is_null($operator_enabled)) {
            throw new \InvalidArgumentException('non-nullable operator_enabled cannot be null');
        }
        $this->container['operator_enabled'] = $operator_enabled;

        return $this;
    }

    /**
     * Gets capacity_warnings
     *
     * @return bool
     */
    public function getCapacityWarnings()
    {
        return $this->container['capacity_warnings'];
    }

    /**
     * Sets capacity_warnings
     *
     * @param bool $capacity_warnings All queries are given a 10% grace when daily-limits (maxQueriesPerDay) are enforced.  If this flag is true, the owner of this knowledge-base (email) is sent a warning at 100% daily utiliziation.
     *
     * @return self
     */
    public function setCapacityWarnings($capacity_warnings)
    {
        if (is_null($capacity_warnings)) {
            throw new \InvalidArgumentException('non-nullable capacity_warnings cannot be null');
        }
        $this->container['capacity_warnings'] = $capacity_warnings;

        return $this;
    }

    /**
     * Gets index_schedule
     *
     * @return string
     */
    public function getIndexSchedule()
    {
        return $this->container['index_schedule'];
    }

    /**
     * Sets index_schedule
     *
     * @param string $index_schedule the time-schedule for index-optimization, when active.
     *
     * @return self
     */
    public function setIndexSchedule($index_schedule)
    {
        if (is_null($index_schedule)) {
            throw new \InvalidArgumentException('non-nullable index_schedule cannot be null');
        }
        $this->container['index_schedule'] = $index_schedule;

        return $this;
    }

    /**
     * Gets last_index_optimization_time
     *
     * @return int
     */
    public function getLastIndexOptimizationTime()
    {
        return $this->container['last_index_optimization_time'];
    }

    /**
     * Sets last_index_optimization_time
     *
     * @param int $last_index_optimization_time the last time this triggered and ran as a unix date-time (read only)
     *
     * @return self
     */
    public function setLastIndexOptimizationTime($last_index_optimization_time)
    {
        if (is_null($last_index_optimization_time)) {
            throw new \InvalidArgumentException('non-nullable last_index_optimization_time cannot be null');
        }
        $this->container['last_index_optimization_time'] = $last_index_optimization_time;

        return $this;
    }

    /**
     * Gets is_optimizing
     *
     * @return bool
     */
    public function getIsOptimizing()
    {
        return $this->container['is_optimizing'];
    }

    /**
     * Sets is_optimizing
     *
     * @param bool $is_optimizing is the index optimizer active?
     *
     * @return self
     */
    public function setIsOptimizing($is_optimizing)
    {
        if (is_null($is_optimizing)) {
            throw new \InvalidArgumentException('non-nullable is_optimizing cannot be null');
        }
        $this->container['is_optimizing'] = $is_optimizing;

        return $this;
    }

    /**
     * Gets optimization_progress
     *
     * @return int
     */
    public function getOptimizationProgress()
    {
        return $this->container['optimization_progress'];
    }

    /**
     * Sets optimization_progress
     *
     * @param int $optimization_progress how far along is the optimizer if it is active (0% to 100%)
     *
     * @return self
     */
    public function setOptimizationProgress($optimization_progress)
    {
        if (is_null($optimization_progress)) {
            throw new \InvalidArgumentException('non-nullable optimization_progress cannot be null');
        }
        $this->container['optimization_progress'] = $optimization_progress;

        return $this;
    }

    /**
     * Gets optimizing
     *
     * @return bool|null
     */
    public function getOptimizing()
    {
        return $this->container['optimizing'];
    }

    /**
     * Sets optimizing
     *
     * @param bool|null $optimizing optimizing
     *
     * @return self
     */
    public function setOptimizing($optimizing)
    {
        if (is_null($optimizing)) {
            throw new \InvalidArgumentException('non-nullable optimizing cannot be null');
        }
        $this->container['optimizing'] = $optimizing;

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


