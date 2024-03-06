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

import type {
    CMDocument,
    CMDocumentAcl,
} from './';

/**
 * A document folder content item.
 * @export
 * @interface CMDocumentFolder
 */
export interface CMDocumentFolder {
    /**
     * the source-id of the owner of this folder
     * @type {number}
     * @memberof CMDocumentFolder
     */
    sourceId: number;
    /**
     * The unique URL of a document or folder.
     * @type {string}
     * @memberof CMDocumentFolder
     */
    url: string;
    /**
     * The id of the parent folder of this folder.
     * @type {string}
     * @memberof CMDocumentFolder
     */
    parentFolderId: string;
    /**
     * The id of this folder.
     * @type {string}
     * @memberof CMDocumentFolder
     */
    folderId: string;
    /**
     * the internal SimSage id for this url
     * @type {number}
     * @memberof CMDocumentFolder
     */
    urlId: number;
    /**
     * the display name of the folder
     * @type {string}
     * @memberof CMDocumentFolder
     */
    folderName: string;
    /**
     * the type of folder (crawlerType for sources)
     * @type {string}
     * @memberof CMDocumentFolder
     */
    itemType: string;
    /**
     * the folder items in this folder
     * @type {Array<CMDocumentFolder>}
     * @memberof CMDocumentFolder
     */
    folderList: Array<CMDocumentFolder>;
    /**
     * the files in this folder
     * @type {Array<CMDocument>}
     * @memberof CMDocumentFolder
     */
    fileList: Array<CMDocument>;
    /**
     * the security permissions for this item
     * @type {Array<CMDocumentAcl>}
     * @memberof CMDocumentFolder
     */
    acls: Array<CMDocumentAcl>;
}
