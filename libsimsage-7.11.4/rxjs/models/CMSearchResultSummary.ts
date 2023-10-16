// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    CMResultsSection,
} from './';

/**
 * @export
 * @interface CMSearchResultSummary
 */
export interface CMSearchResultSummary {
    /**
     * @type {string}
     * @memberof CMSearchResultSummary
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMSearchResultSummary
     */
    kbId: string;
    /**
     * @type {string}
     * @memberof CMSearchResultSummary
     */
    projectType: string;
    /**
     * @type {string}
     * @memberof CMSearchResultSummary
     */
    projectTitle: string;
    /**
     * @type {number}
     * @memberof CMSearchResultSummary
     */
    documentCount: number;
    /**
     * @type {Array<CMResultsSection>}
     * @memberof CMSearchResultSummary
     */
    results: Array<CMResultsSection>;
}