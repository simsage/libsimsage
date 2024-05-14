// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * a client query object
 * @export
 * @interface CMClientQuery
 */
export interface CMClientQuery {
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMClientQuery
     */
    organisationId: string;
    /**
     * a list of knowledge-base id\'s (guids) to use
     * @type {Array<string>}
     * @memberof CMClientQuery
     */
    kbList: Array<string>;
    /**
     * the client\'s id (a unique guid for keeping state against clients)
     * @type {string}
     * @memberof CMClientQuery
     */
    clientId: string;
    /**
     * should we perform a semantic-search?
     * @type {boolean}
     * @memberof CMClientQuery
     */
    semanticSearch: boolean;
    /**
     * should we perform a Q&A search?
     * @type {boolean}
     * @memberof CMClientQuery
     */
    qnaQuery: boolean;
    /**
     * the user\'s search query
     * @type {string}
     * @memberof CMClientQuery
     */
    query: string;
    /**
     * a filter expression generated by the UX
     * @type {string}
     * @memberof CMClientQuery
     */
    filter: string;
    /**
     * the number of results to return for the Q&A system (recommend 1, which returns the \'best match\' only)
     * @type {number}
     * @memberof CMClientQuery
     */
    numResults: number;
    /**
     * A threshold for answer rejection, recommend a value of around 81.25% (0.8125).  This value is between 0.0 and 1.0.  If this value is too low, you\'ll get bad answers, and if this value is too high you will only get exact matches.
     * @type {number}
     * @memberof CMClientQuery
     */
    scoreThreshold: number;
    /**
     * search engine pagination, the offset page starting at 0
     * @type {number}
     * @memberof CMClientQuery
     */
    page: number;
    /**
     * search engine pagination, the number of results per page
     * @type {number}
     * @memberof CMClientQuery
     */
    pageSize: number;
    /**
     * search engine pagination, the number of sentences matching per document (aka. document-sentence fragments)
     * @type {number}
     * @memberof CMClientQuery
     */
    fragmentCount: number;
    /**
     * how far apart words are allowed to be before they stop matching.  A value of zero (0) allows any distance within the document and is akin to a document level keyword search.
     * @type {number}
     * @memberof CMClientQuery
     */
    maxWordDistance: number;
    /**
     * The id of source (an integer) to filter results for.  You can only filter on one source per knowledge-base.  Leaving this value zero (0) indicates all sources should be searched.
     * @type {string}
     * @memberof CMClientQuery
     */
    sourceId: string;
    /**
     * Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you\'re paginating the same query.
     * @type {Array<number>}
     * @memberof CMClientQuery
     */
    shardSizeList: Array<number>;
    /**
     * should the search-engine return spelling-suggestions for items not understood?
     * @type {boolean}
     * @memberof CMClientQuery
     */
    spellingSuggest: boolean;
    /**
     * should the search-engine group similar documents together
     * @type {boolean}
     * @memberof CMClientQuery
     */
    groupSimilarDocuments: boolean;
    /**
     * should the search-engine sort results by age
     * @type {boolean}
     * @memberof CMClientQuery
     */
    sortByAge: boolean;
    /**
     * use ChatGPT or equivalent to answer queries
     * @type {boolean}
     * @memberof CMClientQuery
     */
    useQuestionAnsweringAi: boolean;
    /**
     * selected syn-sets for words
     * @type {{ [key: string]: number; }}
     * @memberof CMClientQuery
     */
    wordSynSet: { [key: string]: number; };
}
