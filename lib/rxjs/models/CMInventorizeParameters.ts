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

/**
 * an inventory creation object.
 * @export
 * @interface CMInventorizeParameters
 */
export interface CMInventorizeParameters {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMInventorizeParameters
     */
    organisationId: string;
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMInventorizeParameters
     */
    kbId: string;
}
