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

/**
 * a document summarization object.
 * @export
 * @interface CMSingleDocumentSummaryRequest
 */
export interface CMSingleDocumentSummaryRequest {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMSingleDocumentSummaryRequest
     */
    organisationId: string;
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMSingleDocumentSummaryRequest
     */
    kbId: string;
    /**
     * the url of the document to summarize
     * @type {string}
     * @memberof CMSingleDocumentSummaryRequest
     */
    url: string;
    /**
     * the top-n sentences to return for the summary of the documents
     * @type {number}
     * @memberof CMSingleDocumentSummaryRequest
     */
    top: number;
}