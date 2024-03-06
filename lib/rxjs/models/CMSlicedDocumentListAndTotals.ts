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
    CMPagedResultsCMSlicedDocument,
} from './';

/**
 * @export
 * @interface CMSlicedDocumentListAndTotals
 */
export interface CMSlicedDocumentListAndTotals {
    /**
     * @type {CMPagedResultsCMSlicedDocument}
     * @memberof CMSlicedDocumentListAndTotals
     */
    pagedResults: CMPagedResultsCMSlicedDocument;
    /**
     * @type {number}
     * @memberof CMSlicedDocumentListAndTotals
     */
    allDocs: number;
    /**
     * @type {number}
     * @memberof CMSlicedDocumentListAndTotals
     */
    completed: number;
    /**
     * @type {{ [key: string]: string; }}
     * @memberof CMSlicedDocumentListAndTotals
     */
    sourceMap: { [key: string]: string; };
    /**
     * @type {{ [key: string]: string; }}
     * @memberof CMSlicedDocumentListAndTotals
     */
    userMap: { [key: string]: string; };
}
