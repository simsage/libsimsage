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

import type {
    CMDocumentAcl,
} from './';

/**
 * the ACLs for the object
 * @export
 * @interface CMUpdateACLs
 */
export interface CMUpdateACLs {
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMUpdateACLs
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMUpdateACLs
     */
    kbId: string;
    /**
     * the source-id of the owner of the url
     * @type {number}
     * @memberof CMUpdateACLs
     */
    sourceId: number;
    /**
     * the parent id of the update to update
     * @type {string}
     * @memberof CMUpdateACLs
     */
    parentId: string;
    /**
     * the id of the update to update
     * @type {string}
     * @memberof CMUpdateACLs
     */
    objectId: string;
    /**
     * the type of item to update, one of source, file or folder
     * @type {string}
     * @memberof CMUpdateACLs
     */
    itemType: string;
    /**
     * the initial ACLs for this source-folder.
     * @type {Array<CMDocumentAcl>}
     * @memberof CMUpdateACLs
     */
    acls: Array<CMDocumentAcl>;
    /**
     * apply these ACLs to any children of this object?
     * @type {boolean}
     * @memberof CMUpdateACLs
     */
    applyToChildren: boolean;
}
