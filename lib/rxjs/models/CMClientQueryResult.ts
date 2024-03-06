// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    CMSavedSearch,
    CMSearchResult,
    CMSynSet,
    CMWordFrequency,
    SearchCategory,
} from './';

/**
 * A SimSage return search-result message for Q&A and semantic-search queries.
 * @export
 * @interface CMClientQueryResult
 */
export interface CMClientQueryResult {
    /**
     * @type {string}
     * @memberof CMClientQueryResult
     */
    messageType: string;
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMClientQueryResult
     */
    organisationId: string;
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMClientQueryResult
     */
    kbId: string;
    /**
     * the text sent.
     * @type {string}
     * @memberof CMClientQueryResult
     */
    text: string;
    /**
     * is there a result/reply or not?
     * @type {boolean}
     * @memberof CMClientQueryResult
     */
    hasResult: boolean;
    /**
     * a list of reference urls associated with this answer
     * @type {Array<string>}
     * @memberof CMClientQueryResult
     */
    urlList: Array<string>;
    /**
     * metadata associated with the Question/Answer pair, user defined.
     * @type {string}
     * @memberof CMClientQueryResult
     */
    metadata: string;
    /**
     * how well the Q&A matcher performed a value between 0.0 and 1.0
     * @type {number}
     * @memberof CMClientQueryResult
     */
    qnaScore: number;
    /**
     * A list of image urls associated with the Q&A pair
     * @type {Array<string>}
     * @memberof CMClientQueryResult
     */
    imageList: Array<string>;
    /**
     * the total number of documents found (but not included necessarily)
     * @type {number}
     * @memberof CMClientQueryResult
     */
    totalDocumentCount: number;
    /**
     * Index sharding values.  These are used by the internal engine to determine the status of results across different shards in SimSage.  Leave this value alone.  It is set by SimSage.  Pass it back to SimSage as you got it if you\'re paginating the same query.
     * @type {Array<number>}
     * @memberof CMClientQueryResult
     */
    shardSizeList: Array<number>;
    /**
     * the actual search results, one for each item found
     * @type {Array<CMSearchResult>}
     * @memberof CMClientQueryResult
     */
    resultList: Array<CMSearchResult>;
    /**
     * a spelling correction suggestion if appropriate and enabled.
     * @type {string}
     * @memberof CMClientQueryResult
     */
    spellingCorrection: string;
    /**
     * A descriptor of semantic categories and words with frequencies in each category
     * @type {{ [key: string]: Array<CMWordFrequency>; }}
     * @memberof CMClientQueryResult
     */
    semanticSet: { [key: string]: Array<CMWordFrequency>; };
    /**
     * do we know the email address of this person?  if they\'ve supplied it in the past this will be set to true.
     * @type {boolean}
     * @memberof CMClientQueryResult
     */
    knowEmail: boolean;
    /**
     * updated categories (if applicable) with updated counts
     * @type {Array<SearchCategory>}
     * @memberof CMClientQueryResult
     */
    categoryList: Array<SearchCategory>;
    /**
     * A list of syn-sets used in the query
     * @type {Array<CMSynSet>}
     * @memberof CMClientQueryResult
     */
    synSetList: Array<CMSynSet>;
    /**
     * Does this source require custom render templates or use ordinary search-results?
     * @type {boolean}
     * @memberof CMClientQueryResult
     */
    customRender: boolean;
    /**
     * a map of sourceId -> number of documents found inside this source
     * @type {{ [key: string]: number; }}
     * @memberof CMClientQueryResult
     */
    sourceIdToCounts: { [key: string]: number; };
    /**
     * a map of document-type -> number of documents found of this type
     * @type {{ [key: string]: number; }}
     * @memberof CMClientQueryResult
     */
    documentTypeToCounts: { [key: string]: number; };
    /**
     * a list of previous searches if applicable
     * @type {Array<CMSavedSearch>}
     * @memberof CMClientQueryResult
     */
    savedSearchList: Array<CMSavedSearch>;
    /**
     * an optional summarization of the search results
     * @type {string}
     * @memberof CMClientQueryResult
     */
    querySummarization: string;
}
