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
 * A multiple document summarization result.  Multi Document Summarization (MSD) uses SimSage\'s graph to create relevant extracts of series of documents matching a specific query.
 * @export
 * @interface CMDParagraphSummary
 */
export interface CMDParagraphSummary {
    /**
     * the url this text came from
     * @type {string}
     * @memberof CMDParagraphSummary
     */
    url: string;
    /**
     * a paragraph of text
     * @type {string}
     * @memberof CMDParagraphSummary
     */
    text: string;
    /**
     * the score relative to the others of this sentence
     * @type {number}
     * @memberof CMDParagraphSummary
     */
    score: number;
}
