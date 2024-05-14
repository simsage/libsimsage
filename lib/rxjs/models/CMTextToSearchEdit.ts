// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.14.12
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * a semantic update/create object
 * @export
 * @interface CMTextToSearchEdit
 */
export interface CMTextToSearchEdit {
    /**
     * the type, either \"and\" or \"sub\"
     * @type {string}
     * @memberof CMTextToSearchEdit
     */
    searchType: string;
    /**
     * the search-part
     * @type {string}
     * @memberof CMTextToSearchEdit
     */
    searchPart: string;
    /**
     * A list of query matches
     * @type {string}
     * @memberof CMTextToSearchEdit
     */
    matchWordCsv: string;
}
