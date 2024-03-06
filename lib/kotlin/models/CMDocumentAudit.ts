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
 * An audit record for a document.
 * @export
 * @interface CMDocumentAudit
 */
export interface CMDocumentAudit {
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMDocumentAudit
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMDocumentAudit
     */
    kbId: string;
    /**
     * The unique URL of a document.
     * @type {string}
     * @memberof CMDocumentAudit
     */
    url: string;
    /**
     * The user\'s id
     * @type {string}
     * @memberof CMDocumentAudit
     */
    userId: string;
    /**
     * the email address of the user for this audit record
     * @type {string}
     * @memberof CMDocumentAudit
     */
    email: string;
    /**
     * The description of the audit event
     * @type {string}
     * @memberof CMDocumentAudit
     */
    description: string;
    /**
     * a unix-timestamp of the creation date-time of this record
     * @type {number}
     * @memberof CMDocumentAudit
     */
    created: number;
}
