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

import type {
    CMFilter,
    CMKeyedSearchTerm,
    CMProjectFrame,
    CMSemanticTerm,
} from './';

/**
 * @export
 * @interface CMProjectDefinition
 */
export interface CMProjectDefinition {
    /**
     * @type {string}
     * @memberof CMProjectDefinition
     */
    projectId?: string;
    /**
     * @type {string}
     * @memberof CMProjectDefinition
     */
    taskId?: string;
    /**
     * @type {string}
     * @memberof CMProjectDefinition
     */
    organisationId: string;
    /**
     * @type {CMProjectFrame}
     * @memberof CMProjectDefinition
     */
    projectFrame: CMProjectFrame;
    /**
     * @type {Array<CMKeyedSearchTerm>}
     * @memberof CMProjectDefinition
     */
    keyedSearchTerms?: Array<CMKeyedSearchTerm>;
    /**
     * @type {Array<CMSemanticTerm>}
     * @memberof CMProjectDefinition
     */
    semanticTerms?: Array<CMSemanticTerm>;
    /**
     * @type {CMFilter}
     * @memberof CMProjectDefinition
     */
    filters: CMFilter;
    /**
     * @type {{ [key: string]: boolean; }}
     * @memberof CMProjectDefinition
     */
    validationResult?: { [key: string]: boolean; };
}
