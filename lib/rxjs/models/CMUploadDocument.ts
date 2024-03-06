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
    MDMetadataMapping,
} from './';

/**
 * An external document representation object.
 * @export
 * @interface CMUploadDocument
 */
export interface CMUploadDocument {
    /**
     * the type of this class, just in case this object is encrypted
     * @type {string}
     * @memberof CMUploadDocument
     */
    objectType: string;
    /**
     * the organisation (its guid id) this document should go into.
     * @type {string}
     * @memberof CMUploadDocument
     */
    organisationId: string;
    /**
     * the knowledge-base (its guid id) this document should go into.
     * @type {string}
     * @memberof CMUploadDocument
     */
    kbId: string;
    /**
     * the security-id (a guid) of the knowledge-base.  This is effectively the shared secret between SimSage and the external-crawler system.
     * @type {string}
     * @memberof CMUploadDocument
     */
    sid: string;
    /**
     * the source-id of this crawler (ie. the crawler\'s id) this document came from.
     * @type {number}
     * @memberof CMUploadDocument
     */
    sourceId: number;
    /**
     * A unique URL for this document.
     * @type {string}
     * @memberof CMUploadDocument
     */
    url: string;
    /**
     * The mime-type of this document, must be a known-datatype to SimSage.
     * @type {string}
     * @memberof CMUploadDocument
     */
    mimeType: string;
    /**
     * The Pronom Unique ID for this document.
     * @type {string}
     * @memberof CMUploadDocument
     */
    puid: string;
    /**
     * A list of security permission for this document.  Can be empty (ie. no security applied).
     * @type {string}
     * @memberof CMUploadDocument
     */
    acls: string;
    /**
     * The title of this document, can be empty.
     * @type {string}
     * @memberof CMUploadDocument
     */
    title: string;
    /**
     * The author of this document, can be empty.
     * @type {string}
     * @memberof CMUploadDocument
     */
    author: string;
    /**
     * A unique hash-string identifying the change state of this document.  This can be any hash-function you choose.  SimSage uses the value to see if the content has changed since last.
     * @type {string}
     * @memberof CMUploadDocument
     */
    changeHash: string;
    /**
     * A unique hash-string identifying the contents this document.  This can be any hash-function you choose.  SimSage uses this value for exact duplicate detection.
     * @type {string}
     * @memberof CMUploadDocument
     */
    contentHash: string;
    /**
     * the base64 encoded content of this document.  Must be prefixed with \';base64,\', can be empty indicating the content wasn\'t valid.
     * @type {string}
     * @memberof CMUploadDocument
     */
    data: string;
    /**
     * the binary-size of the document in bytes if data is not set.
     * @type {number}
     * @memberof CMUploadDocument
     */
    binarySize: number;
    /**
     * the text content of the asset (if set).
     * @type {string}
     * @memberof CMUploadDocument
     */
    text: string;
    /**
     * a unix-timestamp of the creation date-time of this document
     * @type {number}
     * @memberof CMUploadDocument
     */
    created: number;
    /**
     * a unix-timestamp of the last-modified date-time of this document
     * @type {number}
     * @memberof CMUploadDocument
     */
    lastModified: number;
    /**
     * a series of name values for other metadata values found in the container of this document
     * @type {{ [key: string]: string; }}
     * @memberof CMUploadDocument
     */
    metadata: { [key: string]: string; };
    /**
     * A list of special SimSage metadata categories for matching this document with.  Can be empty.
     * @type {Array<MDMetadataMapping>}
     * @memberof CMUploadDocument
     */
    categories: Array<MDMetadataMapping>;
    /**
     * The size of this document (the original) in bytes
     * @type {number}
     * @memberof CMUploadDocument
     */
    size: number;
    /**
     * A render template for this document.  This is only appropriate for Database and RESTful type sources.
     * @type {string}
     * @memberof CMUploadDocument
     */
    template: string;
    /**
     * Do we need to add transport encryption
     * @type {boolean}
     * @memberof CMUploadDocument
     */
    encrypted: boolean;
    /**
     * The seed used if encrypted
     * @type {number}
     * @memberof CMUploadDocument
     */
    seed: number;
    /**
     * the id (a unix timestamp) of the current \'go through the source once\'.  This is a unique per-run identifier.
     * @type {number}
     * @memberof CMUploadDocument
     */
    runId: number;
}
