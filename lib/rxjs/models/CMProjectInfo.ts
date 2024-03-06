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

import type {
    CMSearchDefinition,
    CMStepConfig,
} from './';

/**
 * @export
 * @interface CMProjectInfo
 */
export interface CMProjectInfo {
    /**
     * @type {string}
     * @memberof CMProjectInfo
     */
    key: string;
    /**
     * @type {string}
     * @memberof CMProjectInfo
     */
    caption: string;
    /**
     * @type {string}
     * @memberof CMProjectInfo
     */
    description: string;
    /**
     * @type {CMSearchDefinition}
     * @memberof CMProjectInfo
     */
    search: CMSearchDefinition;
    /**
     * @type {Array<CMStepConfig>}
     * @memberof CMProjectInfo
     */
    steps: Array<CMStepConfig>;
    /**
     * @type {{ [key: string]: string; }}
     * @memberof CMProjectInfo
     */
    sliceActions: { [key: string]: string; };
    /**
     * @type {{ [key: string]: { [key: string]: object; }; }}
     * @memberof CMProjectInfo
     */
    screenConfigs: { [key: string]: { [key: string]: object; }; };
}
