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

import type {
    CMProjectDefinition,
    CMTaskInfo,
} from './';

/**
 * @export
 * @interface CMProjectDefinitionTask
 */
export interface CMProjectDefinitionTask {
    /**
     * @type {CMTaskInfo}
     * @memberof CMProjectDefinitionTask
     */
    taskInfo: CMTaskInfo;
    /**
     * @type {CMProjectDefinition}
     * @memberof CMProjectDefinitionTask
     */
    detail: CMProjectDefinition;
}
