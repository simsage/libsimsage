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

/**
 * A list of SynSets for returning from SimSage for viewing.
 * @export
 * @interface CMSynSetList
 */
export interface CMSynSetList {
    /**
     * A list of CMSynSet items
     * @type {string}
     * @memberof CMSynSetList
     */
    list: string;
    /**
     * the number of total SynSet items in your query
     * @type {number}
     * @memberof CMSynSetList
     */
    totalSize: number;
}
