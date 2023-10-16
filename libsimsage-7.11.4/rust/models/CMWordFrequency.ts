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
 * A word or piece of text with a frequency counter.
 * @export
 * @interface CMWordFrequency
 */
export interface CMWordFrequency {
    /**
     * the word
     * @type {string}
     * @memberof CMWordFrequency
     */
    word: string;
    /**
     * its frequency
     * @type {number}
     * @memberof CMWordFrequency
     */
    frequency: number;
}
