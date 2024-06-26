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
 * the synonym object to update or create.  If it has no id, it will be created, otherwise SimSage will use it\'s id to find it and update it.
 * @export
 * @interface CMSynonym
 */
export interface CMSynonym {
    /**
     * A unique id for this synonym, an integer
     * @type {string}
     * @memberof CMSynonym
     */
    id: string;
    /**
     * A csv list of words (per word with spaces and hyphens allowed) forming the synonyms
     * @type {string}
     * @memberof CMSynonym
     */
    words: string;
}
