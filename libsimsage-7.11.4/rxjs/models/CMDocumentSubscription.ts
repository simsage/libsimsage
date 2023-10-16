// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.11.4
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * the document subscription
 * @export
 * @interface CMDocumentSubscription
 */
export interface CMDocumentSubscription {
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    kbId: string;
    /**
     * the user\'s id, a guid
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    userId: string;
    /**
     * the source-id of the owner of the url
     * @type {number}
     * @memberof CMDocumentSubscription
     */
    sourceId: number;
    /**
     * The parent of a folder or a file (a guid or an empty string for a top-level folder)
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    parentId: string;
    /**
     * Either a file or a folder ID
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    objectId: string;
    /**
     * The unique URL of a document.
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    url: string;
    /**
     * the internal SimSage id for this url
     * @type {number}
     * @memberof CMDocumentSubscription
     */
    urlId: number;
    /**
     * The name of the folder or file
     * @type {string}
     * @memberof CMDocumentSubscription
     */
    name: string;
    /**
     * is this a subscription to a folder or a file?
     * @type {boolean}
     * @memberof CMDocumentSubscription
     */
    isFolder: boolean;
    /**
     * @type {boolean}
     * @memberof CMDocumentSubscription
     */
    folder?: boolean;
}
