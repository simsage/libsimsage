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
 * an object with the text to restore from
 * @export
 * @interface CMRestoreFromText
 */
export interface CMRestoreFromText {
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMRestoreFromText
     */
    organisationId: string;
    /**
     * the base64 text to restore from.
     * @type {string}
     * @memberof CMRestoreFromText
     */
    base64Text: string;
    /**
     * the file-type of the base64 text (must be text/plain)
     * @type {string}
     * @memberof CMRestoreFromText
     */
    fileType: string;
}
