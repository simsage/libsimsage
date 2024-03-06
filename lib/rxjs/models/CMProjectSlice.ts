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
    CMSliceReassignment,
} from './';

/**
 * @export
 * @interface CMProjectSlice
 */
export interface CMProjectSlice {
    /**
     * @type {string}
     * @memberof CMProjectSlice
     */
    id: string;
    /**
     * @type {string}
     * @memberof CMProjectSlice
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMProjectSlice
     */
    name: string;
    /**
     * @type {string}
     * @memberof CMProjectSlice
     */
    description: string;
    /**
     * @type {string}
     * @memberof CMProjectSlice
     */
    action: string;
    /**
     * @type {Array<CMSliceReassignment>}
     * @memberof CMProjectSlice
     */
    reassignmentOptions: Array<CMSliceReassignment>;
}
