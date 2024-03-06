// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.12.19
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    CMDocumentRelationship,
    CMSimilarDocument,
} from './';

/**
 * A single search result from the Semantic Search engine.  This presents a hit inside a SimSage document.
 * @export
 * @interface CMSearchResult
 */
export interface CMSearchResult {
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMSearchResult
     */
    kbId: string;
    /**
     * the url of the document that matched
     * @type {string}
     * @memberof CMSearchResult
     */
    url: string;
    /**
     * the internal SimSage id for this url (unique only within a knowledge-base)
     * @type {number}
     * @memberof CMSearchResult
     */
    urlId: number;
    /**
     * the source-id of this result (ie. the source\'s id)
     * @type {number}
     * @memberof CMSearchResult
     */
    sourceId: number;
    /**
     * the title of this document/record (can be empty)
     * @type {string}
     * @memberof CMSearchResult
     */
    title: string;
    /**
     * the author of this document/record (can be empty)
     * @type {string}
     * @memberof CMSearchResult
     */
    author: string;
    /**
     * A list of matching fragments in this document, with highlight markers.
     * @type {Array<string>}
     * @memberof CMSearchResult
     */
    textList: Array<string>;
    /**
     * in case of multiple matches in textList, the best match index of these items starting at zero (0)
     * @type {number}
     * @memberof CMSearchResult
     */
    textIndex: number;
    /**
     * the relative score of this match, the bigger, the better
     * @type {number}
     * @memberof CMSearchResult
     */
    score: number;
    /**
     * was this document along with any others sorted ascending or descending?
     * @type {boolean}
     * @memberof CMSearchResult
     */
    sortDesc: boolean;
    /**
     * is this item a Q&A result or a search result?
     * @type {boolean}
     * @memberof CMSearchResult
     */
    qnaResult: boolean;
    /**
     * the id of the first sentence in this result
     * @type {number}
     * @memberof CMSearchResult
     */
    firstSentence: number;
    /**
     * document creation date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    created: number;
    /**
     * document uploaded to SimSage date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    uploaded: number;
    /**
     * document last-modified date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    lastModified: number;
    /**
     * the type of this document/record as a three or four letter file extension
     * @type {string}
     * @memberof CMSearchResult
     */
    documentType: string;
    /**
     * the total number of sentences in the body of this document
     * @type {number}
     * @memberof CMSearchResult
     */
    numSentences: number;
    /**
     * the total number of words and tokens (eg. \'.\') in the body of this document
     * @type {number}
     * @memberof CMSearchResult
     */
    numWords: number;
    /**
     * the total number of relationships expanded from the words in this document
     * @type {number}
     * @memberof CMSearchResult
     */
    numRelationships: number;
    /**
     * the binary-size of the original document in bytes
     * @type {number}
     * @memberof CMSearchResult
     */
    binarySize: number;
    /**
     * the text-size of the original document in number of characters
     * @type {number}
     * @memberof CMSearchResult
     */
    textSize: number;
    /**
     * the DROID file-type of this document/record (can be empty)
     * @type {string}
     * @memberof CMSearchResult
     */
    fileType: string;
    /**
     * document crawled (ie. picked up by SimSage) date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    crawled: number;
    /**
     * document conversion (ie. turned into text by SimSage) date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    converted: number;
    /**
     * document parsed (ie. language analyzed by SimSage) date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    parsed: number;
    /**
     * document indexed (ie. creation of inverted indices by SimSage) date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    indexed: number;
    /**
     * document preview generated (ie. creation of thumb-nail images for this document by SimSage) date-time as a unix date-time
     * @type {number}
     * @memberof CMSearchResult
     */
    previewed: number;
    /**
     * A list of similar documents matched by this query.
     * @type {Array<CMSimilarDocument>}
     * @memberof CMSearchResult
     */
    similarDocumentList: Array<CMSimilarDocument>;
    /**
     * A list of similar documents matched by this query.
     * @type {Array<CMDocumentRelationship>}
     * @memberof CMSearchResult
     */
    relatedList: Array<CMDocumentRelationship>;
    /**
     * A set of name-values of metadata associated with this document
     * @type {{ [key: string]: string; }}
     * @memberof CMSearchResult
     */
    metadata: { [key: string]: string; };
    /**
     * the filename of this document in the DMS system
     * @type {string}
     * @memberof CMSearchResult
     */
    filename: string;
    /**
     * the folderId of this item in the DMS system
     * @type {string}
     * @memberof CMSearchResult
     */
    folderId: string;
    /**
     * how should this item be rendered? (default \"rt search\")
     * @type {string}
     * @memberof CMSearchResult
     */
    renderType: string;
}
