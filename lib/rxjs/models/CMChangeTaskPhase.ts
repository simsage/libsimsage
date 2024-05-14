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
 * @interface CMChangeTaskPhase
 */
export interface CMChangeTaskPhase {
    /**
     * @type {string}
     * @memberof CMChangeTaskPhase
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMChangeTaskPhase
     */
    taskId: string;
    /**
     * @type {string}
     * @memberof CMChangeTaskPhase
     */
    newPhase: string;
    /**
     * @type {{ [key: string]: object; }}
     * @memberof CMChangeTaskPhase
     */
    result: { [key: string]: object; };
}
