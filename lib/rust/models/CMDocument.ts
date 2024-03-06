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
    CMDocumentAcl,
    CMDocumentAudit,
    CMDocumentNote,
    CMDocumentVersion,
} from './';

/**
 * A document is the main data carrying entity in SimSage.  A document can literally be a document like a pdf file found on a file-server, or a database-record, or something captured from a remote system like a web-page, or an image on a web-page.
 * @export
 * @interface CMDocument
 */
export interface CMDocument {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMDocument
     */
    organisationId: string;
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMDocument
     */
    kbId: string;
    /**
     * A unique URL for this document.
     * @type {string}
     * @memberof CMDocument
     */
    url: string;
    /**
     * A unique URL-id for this document.
     * @type {number}
     * @memberof CMDocument
     */
    urlId: number;
    /**
     * Where the document was sourced from (for external documents).
     * @type {string}
     * @memberof CMDocument
     */
    origin: string;
    /**
     * The title of this document, can be empty.
     * @type {string}
     * @memberof CMDocument
     */
    title: string;
    /**
     * The author of this document, can be empty.
     * @type {string}
     * @memberof CMDocument
     */
    author: string;
    /**
     * The file extension of this document, its type.
     * @type {string}
     * @memberof CMDocument
     */
    documentType: string;
    /**
     * a unix-timestamp for the creation date-time of this document
     * @type {number}
     * @memberof CMDocument
     */
    created: number;
    /**
     * a unix-timestamp for the upload date-time of this document to SimSage
     * @type {number}
     * @memberof CMDocument
     */
    uploaded: number;
    /**
     * a unix-timestamp for the last-modified date-time of this document
     * @type {number}
     * @memberof CMDocument
     */
    lastModified: number;
    /**
     * a unix-timestamp for when a SimSage crawler last looked at this document
     * @type {number}
     * @memberof CMDocument
     */
    crawled: number;
    /**
     * a unix-timestamp for when a SimSage converter last looked at this document
     * @type {number}
     * @memberof CMDocument
     */
    converted: number;
    /**
     * a unix-timestamp for when a SimSage parser last looked at this document
     * @type {number}
     * @memberof CMDocument
     */
    parsed: number;
    /**
     * a unix-timestamp for when a SimSage indexer last looked at this document
     * @type {number}
     * @memberof CMDocument
     */
    indexed: number;
    /**
     * a unix-timestamp for when a SimSage image-converter last looked at this document
     * @type {number}
     * @memberof CMDocument
     */
    previewed: number;
    /**
     * A unique hash-string identifying SimSage changes to this document.  SimSage uses the value to see if the content has changed since last.
     * @type {string}
     * @memberof CMDocument
     */
    changeHash: string;
    /**
     * A unique hash-string identifying the content of this document.  SimSage uses this value to find exact duplicates.
     * @type {string}
     * @memberof CMDocument
     */
    contentHash: string;
    /**
     * the source-id of this crawler (ie. the crawler\'s id)
     * @type {number}
     * @memberof CMDocument
     */
    sourceId: number;
    /**
     * a related url if there is parentage to be considered for an item
     * @type {string}
     * @memberof CMDocument
     */
    parentUrl: string;
    /**
     * a list of the exact ACLs applying to this document (can be empty)
     * @type {Array<CMDocumentAcl>}
     * @memberof CMDocument
     */
    acls: Array<CMDocumentAcl>;
    /**
     * a series of name values for other metadata values found in the container of this document
     * @type {{ [key: string]: string; }}
     * @memberof CMDocument
     */
    metadata: { [key: string]: string; };
    /**
     * the number of sentences in this document.
     * @type {number}
     * @memberof CMDocument
     */
    numSentences: number;
    /**
     * the total number of words in this document.
     * @type {number}
     * @memberof CMDocument
     */
    numWords: number;
    /**
     * the total number of relationships in this document.
     * @type {number}
     * @memberof CMDocument
     */
    numRelationships: number;
    /**
     * the size of the original document\'s binary in bytes.
     * @type {number}
     * @memberof CMDocument
     */
    binarySize: number;
    /**
     * the size of the converted document\'s text in bytes.
     * @type {number}
     * @memberof CMDocument
     */
    textSize: number;
    /**
     * list of binary versions of this document
     * @type {Array<CMDocumentVersion>}
     * @memberof CMDocument
     */
    versionList: Array<CMDocumentVersion>;
    /**
     * list of checkout notes about this document
     * @type {Array<CMDocumentNote>}
     * @memberof CMDocument
     */
    noteList: Array<CMDocumentNote>;
    /**
     * list of activities for the last two months of this document
     * @type {Array<CMDocumentAudit>}
     * @memberof CMDocument
     */
    activityList: Array<CMDocumentAudit>;
    /**
     * a description of the type of this document
     * @type {string}
     * @memberof CMDocument
     */
    typeDescription: string;
    /**
     * the filename of this document in the DMS system
     * @type {string}
     * @memberof CMDocument
     */
    filename: string;
    /**
     * the folderId of this item in the DMS system
     * @type {string}
     * @memberof CMDocument
     */
    folderId: string;
}
