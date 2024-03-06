<?php
/**
 * CMClientQueryResult
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
 * CMClientQueryResult Class Doc Comment
 *
 * @category Class
 * @description A SimSage return search-result message for Q&amp;A and semantic-search queries.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CMClientQueryResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'CMClientQueryResult';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'message_type' => 'string',
        'organisation_id' => 'string',
        'kb_id' => 'string',
        'text' => 'string',
        'has_result' => 'bool',
        'url_list' => 'string[]',
        'metadata' => 'string',
        'qna_score' => 'float',
        'image_list' => 'string[]',
        'total_document_count' => 'int',
        'shard_size_list' => 'int[]',
        'result_list' => '\OpenAPI\Client\Model\CMSearchResult[]',
        'spelling_correction' => 'string',
        'semantic_set' => 'array<string,\OpenAPI\Client\Model\CMWordFrequency[]>',
        'know_email' => 'bool',
        'category_list' => '\OpenAPI\Client\Model\SearchCategory[]',
        'syn_set_list' => '\OpenAPI\Client\Model\CMSynSet[]',
        'custom_render' => 'bool',
        'source_id_to_counts' => 'array<string,int>',
        'document_type_to_counts' => 'array<string,int>',
        'saved_search_list' => '\OpenAPI\Client\Model\CMSavedSearch[]',
        'query_summarization' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'message_type' => null,
        'organisation_id' => null,
        'kb_id' => null,
        'text' => null,
        'has_result' => null,
        'url_list' => null,
        'metadata' => null,
        'qna_score' => 'float',
        'image_list' => null,
        'total_document_count' => 'int32',
        'shard_size_list' => 'int32',
        'result_list' => null,
        'spelling_correction' => null,
        'semantic_set' => null,
        'know_email' => null,
        'category_list' => null,
        'syn_set_list' => null,
        'custom_render' => null,
        'source_id_to_counts' => 'int32',
        'document_type_to_counts' => 'int32',
        'saved_search_list' => null,
        'query_summarization' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'message_type' => false,
		'organisation_id' => false,
		'kb_id' => false,
		'text' => false,
		'has_result' => false,
		'url_list' => false,
		'metadata' => false,
		'qna_score' => false,
		'image_list' => false,
		'total_document_count' => false,
		'shard_size_list' => false,
		'result_list' => false,
		'spelling_correction' => false,
		'semantic_set' => false,
		'know_email' => false,
		'category_list' => false,
		'syn_set_list' => false,
		'custom_render' => false,
		'source_id_to_counts' => false,
		'document_type_to_counts' => false,
		'saved_search_list' => false,
		'query_summarization' => false
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
        'message_type' => 'messageType',
        'organisation_id' => 'organisationId',
        'kb_id' => 'kbId',
        'text' => 'text',
        'has_result' => 'hasResult',
        'url_list' => 'urlList',
        'metadata' => 'metadata',
        'qna_score' => 'qnaScore',
        'image_list' => 'imageList',
        'total_document_count' => 'totalDocumentCount',
        'shard_size_list' => 'shardSizeList',
        'result_list' => 'resultList',
        'spelling_correction' => 'spellingCorrection',
        'semantic_set' => 'semanticSet',
        'know_email' => 'knowEmail',
        'category_list' => 'categoryList',
        'syn_set_list' => 'synSetList',
        'custom_render' => 'customRender',
        'source_id_to_counts' => 'sourceIdToCounts',
        'document_type_to_counts' => 'documentTypeToCounts',
        'saved_search_list' => 'savedSearchList',
        'query_summarization' => 'querySummarization'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'message_type' => 'setMessageType',
        'organisation_id' => 'setOrganisationId',
        'kb_id' => 'setKbId',
        'text' => 'setText',
        'has_result' => 'setHasResult',
        'url_list' => 'setUrlList',
        'metadata' => 'setMetadata',
        'qna_score' => 'setQnaScore',
        'image_list' => 'setImageList',
        'total_document_count' => 'setTotalDocumentCount',
        'shard_size_list' => 'setShardSizeList',
        'result_list' => 'setResultList',
        'spelling_correction' => 'setSpellingCorrection',
        'semantic_set' => 'setSemanticSet',
        'know_email' => 'setKnowEmail',
        'category_list' => 'setCategoryList',
        'syn_set_list' => 'setSynSetList',
        'custom_render' => 'setCustomRender',
        'source_id_to_counts' => 'setSourceIdToCounts',
        'document_type_to_counts' => 'setDocumentTypeToCounts',
        'saved_search_list' => 'setSavedSearchList',
        'query_summarization' => 'setQuerySummarization'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'message_type' => 'getMessageType',
        'organisation_id' => 'getOrganisationId',
        'kb_id' => 'getKbId',
        'text' => 'getText',
        'has_result' => 'getHasResult',
        'url_list' => 'getUrlList',
        'metadata' => 'getMetadata',
        'qna_score' => 'getQnaScore',
        'image_list' => 'getImageList',
        'total_document_count' => 'getTotalDocumentCount',
        'shard_size_list' => 'getShardSizeList',
        'result_list' => 'getResultList',
        'spelling_correction' => 'getSpellingCorrection',
        'semantic_set' => 'getSemanticSet',
        'know_email' => 'getKnowEmail',
        'category_list' => 'getCategoryList',
        'syn_set_list' => 'getSynSetList',
        'custom_render' => 'getCustomRender',
        'source_id_to_counts' => 'getSourceIdToCounts',
        'document_type_to_counts' => 'getDocumentTypeToCounts',
        'saved_search_list' => 'getSavedSearchList',
        'query_summarization' => 'getQuerySummarization'
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
        $this->setIfExists('message_type', $data ?? [], null);
        $this->setIfExists('organisation_id', $data ?? [], null);
        $this->setIfExists('kb_id', $data ?? [], null);
        $this->setIfExists('text', $data ?? [], null);
        $this->setIfExists('has_result', $data ?? [], null);
        $this->setIfExists('url_list', $data ?? [], null);
        $this->setIfExists('metadata', $data ?? [], null);
        $this->setIfExists('qna_score', $data ?? [], null);
        $this->setIfExists('image_list', $data ?? [], null);
        $this->setIfExists('total_document_count', $data ?? [], null);
        $this->setIfExists('shard_size_list', $data ?? [], null);
        $this->setIfExists('result_list', $data ?? [], null);
        $this->setIfExists('spelling_correction', $data ?? [], null);
        $this->setIfExists('semantic_set', $data ?? [], null);
        $this->setIfExists('know_email', $data ?? [], null);
        $this->setIfExists('category_list', $data ?? [], null);
        $this->setIfExists('syn_set_list', $data ?? [], null);
        $this->setIfExists('custom_render', $data ?? [], null);
        $this->setIfExists('source_id_to_counts', $data ?? [], null);
        $this->setIfExists('document_type_to_counts', $data ?? [], null);
        $this->setIfExists('saved_search_list', $data ?? [], null);
        $this->setIfExists('query_summarization', $data ?? [], null);
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

        if ($this->container['message_type'] === null) {
            $invalidProperties[] = "'message_type' can't be null";
        }
        if ($this->container['organisation_id'] === null) {
            $invalidProperties[] = "'organisation_id' can't be null";
        }
        if ($this->container['kb_id'] === null) {
            $invalidProperties[] = "'kb_id' can't be null";
        }
        if ($this->container['text'] === null) {
            $invalidProperties[] = "'text' can't be null";
        }
        if ($this->container['has_result'] === null) {
            $invalidProperties[] = "'has_result' can't be null";
        }
        if ($this->container['url_list'] === null) {
            $invalidProperties[] = "'url_list' can't be null";
        }
        if ($this->container['metadata'] === null) {
            $invalidProperties[] = "'metadata' can't be null";
        }
        if ($this->container['qna_score'] === null) {
            $invalidProperties[] = "'qna_score' can't be null";
        }
        if ($this->container['image_list'] === null) {
            $invalidProperties[] = "'image_list' can't be null";
        }
        if ($this->container['total_document_count'] === null) {
            $invalidProperties[] = "'total_document_count' can't be null";
        }
        if ($this->container['shard_size_list'] === null) {
            $invalidProperties[] = "'shard_size_list' can't be null";
        }
        if ($this->container['result_list'] === null) {
            $invalidProperties[] = "'result_list' can't be null";
        }
        if ($this->container['spelling_correction'] === null) {
            $invalidProperties[] = "'spelling_correction' can't be null";
        }
        if ($this->container['semantic_set'] === null) {
            $invalidProperties[] = "'semantic_set' can't be null";
        }
        if ($this->container['know_email'] === null) {
            $invalidProperties[] = "'know_email' can't be null";
        }
        if ($this->container['category_list'] === null) {
            $invalidProperties[] = "'category_list' can't be null";
        }
        if ($this->container['syn_set_list'] === null) {
            $invalidProperties[] = "'syn_set_list' can't be null";
        }
        if ($this->container['custom_render'] === null) {
            $invalidProperties[] = "'custom_render' can't be null";
        }
        if ($this->container['source_id_to_counts'] === null) {
            $invalidProperties[] = "'source_id_to_counts' can't be null";
        }
        if ($this->container['document_type_to_counts'] === null) {
            $invalidProperties[] = "'document_type_to_counts' can't be null";
        }
        if ($this->container['saved_search_list'] === null) {
            $invalidProperties[] = "'saved_search_list' can't be null";
        }
        if ($this->container['query_summarization'] === null) {
            $invalidProperties[] = "'query_summarization' can't be null";
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
     * Gets message_type
     *
     * @return string
     */
    public function getMessageType()
    {
        return $this->container['message_type'];
    }

    /**
     * Sets message_type
     *
     * @param string $message_type message_type
     *
     * @return self
     */
    public function setMessageType($message_type)
    {
        if (is_null($message_type)) {
            throw new \InvalidArgumentException('non-nullable message_type cannot be null');
        }
        $this->container['message_type'] = $message_type;

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
     * @param string $organisation_id the organisation (its guid id).
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
     * Gets text
     *
     * @return string
     */
    public function getText()
    {
        return $this->container['text'];
    }

    /**
     * Sets text
     *
     * @param string $text the text sent.
     *
     * @return self
     */
    public function setText($text)
    {
        if (is_null($text)) {
            throw new \InvalidArgumentException('non-nullable text cannot be null');
        }
        $this->container['text'] = $text;

        return $this;
    }

    /**
     * Gets has_result
     *
     * @return bool
     */
    public function getHasResult()
    {
        return $this->container['has_result'];
    }

    /**
     * Sets has_result
     *
     * @param bool $has_result is there a result/reply or not?
     *
     * @return self
     */
    public function setHasResult($has_result)
    {
        if (is_null($has_result)) {
            throw new \InvalidArgumentException('non-nullable has_result cannot be null');
        }
        $this->container['has_result'] = $has_result;

        return $this;
    }

    /**
     * Gets url_list
     *
     * @return string[]
     */
    public function getUrlList()
    {
        return $this->container['url_list'];
    }

    /**
     * Sets url_list
     *
     * @param string[] $url_list a list of reference urls associated with this answer
     *
     * @return self
     */
    public function setUrlList($url_list)
    {
        if (is_null($url_list)) {
            throw new \InvalidArgumentException('non-nullable url_list cannot be null');
        }
        $this->container['url_list'] = $url_list;

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
     * @param string $metadata metadata associated with the Question/Answer pair, user defined.
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
     * Gets qna_score
     *
     * @return float
     */
    public function getQnaScore()
    {
        return $this->container['qna_score'];
    }

    /**
     * Sets qna_score
     *
     * @param float $qna_score how well the Q&A matcher performed a value between 0.0 and 1.0
     *
     * @return self
     */
    public function setQnaScore($qna_score)
    {
        if (is_null($qna_score)) {
            throw new \InvalidArgumentException('non-nullable qna_score cannot be null');
        }
        $this->container['qna_score'] = $qna_score;

        return $this;
    }

    /**
     * Gets image_list
     *
     * @return string[]
     */
    public function getImageList()
    {
        return $this->container['image_list'];
    }

    /**
     * Sets image_list
     *
     * @param string[] $image_list A list of image urls associated with the Q&A pair
     *
     * @return self
     */
    public function setImageList($image_list)
    {
        if (is_null($image_list)) {
            throw new \InvalidArgumentException('non-nullable image_list cannot be null');
        }
        $this->container['image_list'] = $image_list;

        return $this;
    }

    /**
     * Gets total_document_count
     *
     * @return int
     */
    public function getTotalDocumentCount()
    {
        return $this->container['total_document_count'];
    }

    /**
     * Sets total_document_count
     *
     * @param int $total_document_count the total number of documents found (but not included necessarily)
     *
     * @return self
     */
    public function setTotalDocumentCount($total_document_count)
    {
        if (is_null($total_document_count)) {
            throw new \InvalidArgumentException('non-nullable total_document_count cannot be null');
        }
        $this->container['total_document_count'] = $total_document_count;

        return $this;
    }

    /**
     * Gets shard_size_list
     *
     * @return int[]
     */
    public function getShardSizeList()
    {
        return $this->container['shard_size_list'];
    }

    /**
     * Sets shard_size_list
     *
     * @param int[] $shard_size_list Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you're paginating the same query.
     *
     * @return self
     */
    public function setShardSizeList($shard_size_list)
    {
        if (is_null($shard_size_list)) {
            throw new \InvalidArgumentException('non-nullable shard_size_list cannot be null');
        }
        $this->container['shard_size_list'] = $shard_size_list;

        return $this;
    }

    /**
     * Gets result_list
     *
     * @return \OpenAPI\Client\Model\CMSearchResult[]
     */
    public function getResultList()
    {
        return $this->container['result_list'];
    }

    /**
     * Sets result_list
     *
     * @param \OpenAPI\Client\Model\CMSearchResult[] $result_list the actual search results, one for each item found
     *
     * @return self
     */
    public function setResultList($result_list)
    {
        if (is_null($result_list)) {
            throw new \InvalidArgumentException('non-nullable result_list cannot be null');
        }
        $this->container['result_list'] = $result_list;

        return $this;
    }

    /**
     * Gets spelling_correction
     *
     * @return string
     */
    public function getSpellingCorrection()
    {
        return $this->container['spelling_correction'];
    }

    /**
     * Sets spelling_correction
     *
     * @param string $spelling_correction a spelling correction suggestion if appropriate and enabled.
     *
     * @return self
     */
    public function setSpellingCorrection($spelling_correction)
    {
        if (is_null($spelling_correction)) {
            throw new \InvalidArgumentException('non-nullable spelling_correction cannot be null');
        }
        $this->container['spelling_correction'] = $spelling_correction;

        return $this;
    }

    /**
     * Gets semantic_set
     *
     * @return array<string,\OpenAPI\Client\Model\CMWordFrequency[]>
     */
    public function getSemanticSet()
    {
        return $this->container['semantic_set'];
    }

    /**
     * Sets semantic_set
     *
     * @param array<string,\OpenAPI\Client\Model\CMWordFrequency[]> $semantic_set A descriptor of semantic categories and words with frequencies in each category
     *
     * @return self
     */
    public function setSemanticSet($semantic_set)
    {
        if (is_null($semantic_set)) {
            throw new \InvalidArgumentException('non-nullable semantic_set cannot be null');
        }
        $this->container['semantic_set'] = $semantic_set;

        return $this;
    }

    /**
     * Gets know_email
     *
     * @return bool
     */
    public function getKnowEmail()
    {
        return $this->container['know_email'];
    }

    /**
     * Sets know_email
     *
     * @param bool $know_email do we know the email address of this person?  if they've supplied it in the past this will be set to true.
     *
     * @return self
     */
    public function setKnowEmail($know_email)
    {
        if (is_null($know_email)) {
            throw new \InvalidArgumentException('non-nullable know_email cannot be null');
        }
        $this->container['know_email'] = $know_email;

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
     * @param \OpenAPI\Client\Model\SearchCategory[] $category_list updated categories (if applicable) with updated counts
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
     * Gets syn_set_list
     *
     * @return \OpenAPI\Client\Model\CMSynSet[]
     */
    public function getSynSetList()
    {
        return $this->container['syn_set_list'];
    }

    /**
     * Sets syn_set_list
     *
     * @param \OpenAPI\Client\Model\CMSynSet[] $syn_set_list A list of syn-sets used in the query
     *
     * @return self
     */
    public function setSynSetList($syn_set_list)
    {
        if (is_null($syn_set_list)) {
            throw new \InvalidArgumentException('non-nullable syn_set_list cannot be null');
        }
        $this->container['syn_set_list'] = $syn_set_list;

        return $this;
    }

    /**
     * Gets custom_render
     *
     * @return bool
     */
    public function getCustomRender()
    {
        return $this->container['custom_render'];
    }

    /**
     * Sets custom_render
     *
     * @param bool $custom_render Does this source require custom render templates or use ordinary search-results?
     *
     * @return self
     */
    public function setCustomRender($custom_render)
    {
        if (is_null($custom_render)) {
            throw new \InvalidArgumentException('non-nullable custom_render cannot be null');
        }
        $this->container['custom_render'] = $custom_render;

        return $this;
    }

    /**
     * Gets source_id_to_counts
     *
     * @return array<string,int>
     */
    public function getSourceIdToCounts()
    {
        return $this->container['source_id_to_counts'];
    }

    /**
     * Sets source_id_to_counts
     *
     * @param array<string,int> $source_id_to_counts a map of sourceId -> number of documents found inside this source
     *
     * @return self
     */
    public function setSourceIdToCounts($source_id_to_counts)
    {
        if (is_null($source_id_to_counts)) {
            throw new \InvalidArgumentException('non-nullable source_id_to_counts cannot be null');
        }
        $this->container['source_id_to_counts'] = $source_id_to_counts;

        return $this;
    }

    /**
     * Gets document_type_to_counts
     *
     * @return array<string,int>
     */
    public function getDocumentTypeToCounts()
    {
        return $this->container['document_type_to_counts'];
    }

    /**
     * Sets document_type_to_counts
     *
     * @param array<string,int> $document_type_to_counts a map of document-type -> number of documents found of this type
     *
     * @return self
     */
    public function setDocumentTypeToCounts($document_type_to_counts)
    {
        if (is_null($document_type_to_counts)) {
            throw new \InvalidArgumentException('non-nullable document_type_to_counts cannot be null');
        }
        $this->container['document_type_to_counts'] = $document_type_to_counts;

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
     * @param \OpenAPI\Client\Model\CMSavedSearch[] $saved_search_list a list of previous searches if applicable
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
     * Gets query_summarization
     *
     * @return string
     */
    public function getQuerySummarization()
    {
        return $this->container['query_summarization'];
    }

    /**
     * Sets query_summarization
     *
     * @param string $query_summarization an optional summarization of the search results
     *
     * @return self
     */
    public function setQuerySummarization($query_summarization)
    {
        if (is_null($query_summarization)) {
            throw new \InvalidArgumentException('non-nullable query_summarization cannot be null');
        }
        $this->container['query_summarization'] = $query_summarization;

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


