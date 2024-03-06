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

import type {
    AssetACL,
} from './';

/**
 * the asset that was seen
 * @export
 * @interface Asset
 */
export interface Asset {
    /**
     * @type {string}
     * @memberof Asset
     */
    url: string;
    /**
     * @type {string}
     * @memberof Asset
     */
    parentUrl: string;
    /**
     * @type {string}
     * @memberof Asset
     */
    mimeType: string;
    /**
     * @type {Array<AssetACL>}
     * @memberof Asset
     */
    acls: Array<AssetACL>;
    /**
     * @type {string}
     * @memberof Asset
     */
    title: string;
    /**
     * @type {string}
     * @memberof Asset
     */
    author: string;
    /**
     * @type {number}
     * @memberof Asset
     */
    binarySize: number;
    /**
     * @type {string}
     * @memberof Asset
     */
    template: string;
    /**
     * @type {number}
     * @memberof Asset
     */
    created: number;
    /**
     * @type {number}
     * @memberof Asset
     */
    lastModified: number;
    /**
     * @type {{ [key: string]: string; }}
     * @memberof Asset
     */
    metadata: { [key: string]: string; };
    /**
     * @type {string}
     * @memberof Asset
     */
    data?: string;
    /**
     * @type {string}
     * @memberof Asset
     */
    previewImage?: string;
}
