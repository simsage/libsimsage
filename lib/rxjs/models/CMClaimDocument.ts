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
 * @interface CMClaimDocument
 */
export interface CMClaimDocument {
    /**
     * @type {string}
     * @memberof CMClaimDocument
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMClaimDocument
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMClaimDocument
     */
    sliceId: string;
    /**
     * @type {string}
     * @memberof CMClaimDocument
     */
    documentKey: string;
    /**
     * @type {boolean}
     * @memberof CMClaimDocument
     */
    lock: boolean;
    /**
     * @type {boolean}
     * @memberof CMClaimDocument
     */
    force: boolean;
}
