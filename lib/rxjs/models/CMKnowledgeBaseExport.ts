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
 * the knowledge-base export config
 * @export
 * @interface CMKnowledgeBaseExport
 */
export interface CMKnowledgeBaseExport {
    /**
     * @type {string}
     * @memberof CMKnowledgeBaseExport
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMKnowledgeBaseExport
     */
    kbId: string;
    /**
     * @type {string}
     * @memberof CMKnowledgeBaseExport
     */
    exporter: string;
    /**
     * @type {{ [key: string]: object; }}
     * @memberof CMKnowledgeBaseExport
     */
    exportConfig: { [key: string]: object; };
}
