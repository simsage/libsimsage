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
 * An external image representation object.
 * @export
 * @interface CMExternalCrawlerRenameFolder
 */
export interface CMExternalCrawlerRenameFolder {
    /**
     * the type of this class, just in case this object is encrypted
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    objectType: string;
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    kbId: string;
    /**
     * the security id (a guid) for this request.  This is effectively the shared secret between SimSage and the external-crawler system.
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    sid: string;
    /**
     * the source-id of this crawler (ie. the crawler\'s id)
     * @type {number}
     * @memberof CMExternalCrawlerRenameFolder
     */
    sourceId: number;
    /**
     * the current document-folder name
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    oldFolderNameUrl: string;
    /**
     * the new document-folder name
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    newFolderNameUrl: string;
    /**
     * A list of security permission for the new document-folder.  Can be empty (ie. no security applied).
     * @type {string}
     * @memberof CMExternalCrawlerRenameFolder
     */
    acls: string;
    /**
     * Do we need to add transport encryption
     * @type {boolean}
     * @memberof CMExternalCrawlerRenameFolder
     */
    encrypted: boolean;
    /**
     * The seed used if encrypted
     * @type {number}
     * @memberof CMExternalCrawlerRenameFolder
     */
    seed: number;
}
