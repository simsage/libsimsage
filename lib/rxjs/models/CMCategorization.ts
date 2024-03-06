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
 * A categorization object.
 * @export
 * @interface CMCategorization
 */
export interface CMCategorization {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMCategorization
     */
    organisationId: string;
    /**
     * the knowledge-base (its guid id)
     * @type {string}
     * @memberof CMCategorization
     */
    kbId: string;
    /**
     * the categorization label (the value field) for a categorization
     * @type {string}
     * @memberof CMCategorization
     */
    categorizationLabel: string;
    /**
     * the SimSage SuperSearch rule to match for adding this categorization label to a document
     * @type {string}
     * @memberof CMCategorization
     */
    rule: string;
}
