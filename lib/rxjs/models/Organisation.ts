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
 * @interface Organisation
 */
export interface Organisation {
    /**
     * @type {string}
     * @memberof Organisation
     */
    id: string;
    /**
     * @type {string}
     * @memberof Organisation
     */
    name: string;
    /**
     * @type {boolean}
     * @memberof Organisation
     */
    enabled: boolean;
    /**
     * @type {boolean}
     * @memberof Organisation
     */
    autoCreateSSOUsers: boolean;
    /**
     * @type {Array<string>}
     * @memberof Organisation
     */
    autoCreateSSODomainList: Array<string>;
    /**
     * @type {Array<string>}
     * @memberof Organisation
     */
    autoCreateSSOACLList: Array<string>;
    /**
     * @type {Array<string>}
     * @memberof Organisation
     */
    autoCreateSSORoleList: Array<string>;
}
