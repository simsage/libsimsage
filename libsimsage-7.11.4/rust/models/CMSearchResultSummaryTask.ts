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
    CMSearchResultSummary,
    CMTaskInfo,
} from './';

/**
 * @export
 * @interface CMSearchResultSummaryTask
 */
export interface CMSearchResultSummaryTask {
    /**
     * @type {CMTaskInfo}
     * @memberof CMSearchResultSummaryTask
     */
    taskInfo: CMTaskInfo;
    /**
     * @type {CMSearchResultSummary}
     * @memberof CMSearchResultSummaryTask
     */
    detail: CMSearchResultSummary;
}
