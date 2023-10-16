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
 * A semantic pagination object.
 * @export
 * @interface CMSemanticsPaginated
 */
export interface CMSemanticsPaginated {
    /**
     * the organisation (its guid id).
     * @type {string}
     * @memberof CMSemanticsPaginated
     */
    organisationId: string;
    /**
     * the knowledge-base (its guid id).
     * @type {string}
     * @memberof CMSemanticsPaginated
     */
    kbId: string;
    /**
     * pagination control, the last semantic word we looked for previously
     * @type {string}
     * @memberof CMSemanticsPaginated
     */
    prevWord: string;
    /**
     * the number of semantics to return at a time.
     * @type {number}
     * @memberof CMSemanticsPaginated
     */
    pageSize: number;
    /**
     * An optional string filter to apply to all semantics in the search.  Can be empty in which case SimSage will return all semantics paginated.
     * @type {string}
     * @memberof CMSemanticsPaginated
     */
    filter: string;
}
