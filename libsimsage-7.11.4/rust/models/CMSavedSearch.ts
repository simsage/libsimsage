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
 * A saved search item for a user.
 * @export
 * @interface CMSavedSearch
 */
export interface CMSavedSearch {
    /**
     * the main organisation (its guid id) for this history item
     * @type {string}
     * @memberof CMSavedSearch
     */
    organisationId: string;
    /**
     * the knowledge-base id of this context item, a guid-string
     * @type {string}
     * @memberof CMSavedSearch
     */
    kbId: string;
    /**
     * The user\'s id
     * @type {string}
     * @memberof CMSavedSearch
     */
    userId: string;
    /**
     * the search text
     * @type {string}
     * @memberof CMSavedSearch
     */
    text: string;
    /**
     * a unix-timestamp of the creation date-time of this record
     * @type {number}
     * @memberof CMSavedSearch
     */
    created: number;
    /**
     * if set, the number of records to return for viewing
     * @type {number}
     * @memberof CMSavedSearch
     */
    top: number;
}