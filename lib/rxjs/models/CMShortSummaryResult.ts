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
 * The result of a short summary for a given url
 * @export
 * @interface CMShortSummaryResult
 */
export interface CMShortSummaryResult {
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMShortSummaryResult
     */
    organisationId: string;
    /**
     * the knowledge-base id (guid) to use
     * @type {string}
     * @memberof CMShortSummaryResult
     */
    kbId: string;
    /**
     * The unique URL of a document.
     * @type {string}
     * @memberof CMShortSummaryResult
     */
    url: string;
    /**
     * The summary for this document.
     * @type {string}
     * @memberof CMShortSummaryResult
     */
    summary: string;
}
