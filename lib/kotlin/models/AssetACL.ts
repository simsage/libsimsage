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

/**
 * @export
 * @interface AssetACL
 */
export interface AssetACL {
    /**
     * @type {string}
     * @memberof AssetACL
     */
    name: string;
    /**
     * @type {string}
     * @memberof AssetACL
     */
    displayName: string;
    /**
     * @type {string}
     * @memberof AssetACL
     */
    access: string;
    /**
     * @type {boolean}
     * @memberof AssetACL
     */
    isUser: boolean;
    /**
     * @type {Array<string>}
     * @memberof AssetACL
     */
    membershipList: Array<string>;
    /**
     * @type {boolean}
     * @memberof AssetACL
     */
    user?: boolean;
}