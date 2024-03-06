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
 * a progress/status item from the async command queue
 * @export
 * @interface CMCommandQueueItem
 */
export interface CMCommandQueueItem {
    /**
     * the job-id, primary key
     * @type {string}
     * @memberof CMCommandQueueItem
     */
    jobId: string;
    /**
     * the name of the lock
     * @type {string}
     * @memberof CMCommandQueueItem
     */
    key: string;
    /**
     * when this lock will expire as a Unix date-time
     * @type {number}
     * @memberof CMCommandQueueItem
     */
    expiry: number;
}
