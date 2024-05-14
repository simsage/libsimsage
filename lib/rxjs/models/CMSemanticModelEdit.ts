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
 * @interface CMSemanticModelEdit
 */
export interface CMSemanticModelEdit {
    /**
     * The word of a semantic is the more specific concept (eg. in \'John is a person\', then \'John\' is the more specific concept, and \'person\' is the semantic).
     * @type {string}
     * @memberof CMSemanticModelEdit
     */
    word: string;
    /**
     * The previous value for \'word\' if this is a semantic changing its word value (update)
     * @type {string}
     * @memberof CMSemanticModelEdit
     */
    prevWord: string;
    /**
     * The semantic is the more general concept (eg. in \'John is a person\', \'person\' is the more general concept, and \'John\' is more specific).
     * @type {string}
     * @memberof CMSemanticModelEdit
     */
    semantic: string;
}
