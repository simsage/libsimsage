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
 * a zip source model
 * @export
 * @interface CMZipSource
 */
export interface CMZipSource {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMZipSource
     */
    organisationId: string;
    /**
     * the knowledge-base (its guid id)
     * @type {string}
     * @memberof CMZipSource
     */
    kbId: string;
    /**
     * the source-id of this crawler (ie. the crawler\'s id)
     * @type {number}
     * @memberof CMZipSource
     */
    sourceId: number;
}
