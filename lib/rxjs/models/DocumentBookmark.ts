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
 * @interface DocumentBookmark
 */
export interface DocumentBookmark {
    /**
     * @type {string}
     * @memberof DocumentBookmark
     */
    userId: string;
    /**
     * @type {number}
     * @memberof DocumentBookmark
     */
    sourceId: number;
    /**
     * @type {string}
     * @memberof DocumentBookmark
     */
    url: string;
    /**
     * @type {number}
     * @memberof DocumentBookmark
     */
    urlId: number;
    /**
     * @type {boolean}
     * @memberof DocumentBookmark
     */
    isFolder: boolean;
    /**
     * @type {boolean}
     * @memberof DocumentBookmark
     */
    folder?: boolean;
}
