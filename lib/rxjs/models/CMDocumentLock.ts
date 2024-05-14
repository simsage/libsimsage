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
 * the document checkout request
 * @export
 * @interface CMDocumentLock
 */
export interface CMDocumentLock {
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMDocumentLock
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMDocumentLock
     */
    kbId: string;
    /**
     * The unique URL of a document.
     * @type {string}
     * @memberof CMDocumentLock
     */
    url: string;
    /**
     * the internal SimSage id for this url
     * @type {number}
     * @memberof CMDocumentLock
     */
    urlId: number;
    /**
     * the source-id of the owner of the url
     * @type {number}
     * @memberof CMDocumentLock
     */
    sourceId: number;
    /**
     * the user\'s id, a guid
     * @type {string}
     * @memberof CMDocumentLock
     */
    userId: string;
    /**
     * the name of the checkout folder/file object
     * @type {string}
     * @memberof CMDocumentLock
     */
    name: string;
    /**
     * a unix-timestamp for the creation of this checkout object
     * @type {number}
     * @memberof CMDocumentLock
     */
    checkoutDate: number;
}
