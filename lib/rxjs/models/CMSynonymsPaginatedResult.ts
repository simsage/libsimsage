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

import type {
    CMSynonym,
} from './';

/**
 * A paginated synonym return list matching a request for the same.
 * @export
 * @interface CMSynonymsPaginatedResult
 */
export interface CMSynonymsPaginatedResult {
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMSynonymsPaginatedResult
     */
    organisationId: string;
    /**
     * the knowledge-base (its guid id).
     * @type {string}
     * @memberof CMSynonymsPaginatedResult
     */
    kbId: string;
    /**
     * The filter that was used to find these items.
     * @type {string}
     * @memberof CMSynonymsPaginatedResult
     */
    filter: string;
    /**
     * the resulting list of synonyms (return)
     * @type {Array<CMSynonym>}
     * @memberof CMSynonymsPaginatedResult
     */
    synonymList: Array<CMSynonym>;
    /**
     * the total number of synonyms that matched.
     * @type {number}
     * @memberof CMSynonymsPaginatedResult
     */
    numSynonyms: number;
}
