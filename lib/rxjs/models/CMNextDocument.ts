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
 * @export
 * @interface CMNextDocument
 */
export interface CMNextDocument {
    /**
     * @type {string}
     * @memberof CMNextDocument
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMNextDocument
     */
    taskId: string;
    /**
     * @type {string}
     * @memberof CMNextDocument
     */
    sliceId: string;
    /**
     * @type {Array<string>}
     * @memberof CMNextDocument
     */
    includedStatuses: Array<string>;
}
