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
 * An external image representation object.
 * @export
 * @interface CMExternalMarkResetCrawl
 */
export interface CMExternalMarkResetCrawl {
    /**
     * the type of this class, just in case this object is encrypted
     * @type {string}
     * @memberof CMExternalMarkResetCrawl
     */
    objectType: string;
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMExternalMarkResetCrawl
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMExternalMarkResetCrawl
     */
    kbId: string;
    /**
     * the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
     * @type {string}
     * @memberof CMExternalMarkResetCrawl
     */
    sid: string;
    /**
     * the source-id of this crawler (ie. the crawler\'s id)
     * @type {number}
     * @memberof CMExternalMarkResetCrawl
     */
    sourceId: number;
    /**
     * optional for multi root delta crawlers the ids of the roots to reset
     * @type {Array<string>}
     * @memberof CMExternalMarkResetCrawl
     */
    deltaResetRoots: Array<string>;
    /**
     * Do we need to add transport encryption
     * @type {boolean}
     * @memberof CMExternalMarkResetCrawl
     */
    encrypted: boolean;
    /**
     * The seed used if encrypted
     * @type {number}
     * @memberof CMExternalMarkResetCrawl
     */
    seed: number;
}
