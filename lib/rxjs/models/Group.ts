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
 * @export
 * @interface Group
 */
export interface Group {
    /**
     * @type {string}
     * @memberof Group
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof Group
     */
    name: string;
    /**
     * @type {Array<string>}
     * @memberof Group
     */
    userIdList: Array<string>;
}
