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
 * A note attached to a document.
 * @export
 * @interface CMDocumentNote
 */
export interface CMDocumentNote {
    /**
     * the main organisation (its guid id) for this source/crawler
     * @type {string}
     * @memberof CMDocumentNote
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMDocumentNote
     */
    kbId: string;
    /**
     * The unique URL of a document.
     * @type {string}
     * @memberof CMDocumentNote
     */
    url: string;
    /**
     * The id of the note, starting at 1 note of 0 means create a new note
     * @type {number}
     * @memberof CMDocumentNote
     */
    noteId: number;
    /**
     * The text of the note
     * @type {string}
     * @memberof CMDocumentNote
     */
    noteText: string;
    /**
     * The user\'s id
     * @type {string}
     * @memberof CMDocumentNote
     */
    userId: string;
    /**
     * the email address of the user that made the change
     * @type {string}
     * @memberof CMDocumentNote
     */
    email: string;
    /**
     * a unix-timestamp of the creation date-time of this record
     * @type {number}
     * @memberof CMDocumentNote
     */
    created: number;
}
