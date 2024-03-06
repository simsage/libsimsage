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
    CMLocatedRedaction,
} from './';

/**
 * @export
 * @interface CMRedactionDetails
 */
export interface CMRedactionDetails {
    /**
     * @type {string}
     * @memberof CMRedactionDetails
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMRedactionDetails
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMRedactionDetails
     */
    documentKey: string;
    /**
     * @type {Array<CMLocatedRedaction>}
     * @memberof CMRedactionDetails
     */
    redactions: Array<CMLocatedRedaction>;
    /**
     * @type {string}
     * @memberof CMRedactionDetails
     */
    mode: string;
}
