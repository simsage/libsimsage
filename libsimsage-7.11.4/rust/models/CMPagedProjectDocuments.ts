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
    CMProjectDocument,
} from './';

/**
 * @export
 * @interface CMPagedProjectDocuments
 */
export interface CMPagedProjectDocuments {
    /**
     * @type {number}
     * @memberof CMPagedProjectDocuments
     */
    total: number;
    /**
     * @type {Array<CMProjectDocument>}
     * @memberof CMPagedProjectDocuments
     */
    results: Array<CMProjectDocument>;
}
