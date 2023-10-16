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
 * @export
 * @interface CMDeleteProjectCmd
 */
export interface CMDeleteProjectCmd {
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    kbId: string;
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    jobId: string;
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    returnAddress: string;
    /**
     * @type {string}
     * @memberof CMDeleteProjectCmd
     */
    errorStr: string;
    /**
     * @type {number}
     * @memberof CMDeleteProjectCmd
     */
    timeOut: number;
    /**
     * @type {boolean}
     * @memberof CMDeleteProjectCmd
     */
    async: boolean;
    /**
     * @type {boolean}
     * @memberof CMDeleteProjectCmd
     */
    isReturnResult: boolean;
    /**
     * @type {boolean}
     * @memberof CMDeleteProjectCmd
     */
    returnResult?: boolean;
}