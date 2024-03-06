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
 * sign-in parameter object
 * @export
 * @interface CMSignInParameters
 */
export interface CMSignInParameters {
    /**
     * email address of the user logging in
     * @type {string}
     * @memberof CMSignInParameters
     */
    email: string;
    /**
     * this user\'s password
     * @type {string}
     * @memberof CMSignInParameters
     */
    password: string;
}
