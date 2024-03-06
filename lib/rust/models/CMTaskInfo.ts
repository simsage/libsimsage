// tslint:disable
/**
 * SimSage REST API
 * SimSage REST API
 *
 * The version of the OpenAPI document: 7.13.31
 * Contact: info@simsage.co.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * @export
 * @interface CMTaskInfo
 */
export interface CMTaskInfo {
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    taskId: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    sourceKbId: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    crawlerKbId?: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    projectType: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    projectTitle: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    projectNarrative: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    sliceId?: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    processId: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    processName: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    taskType: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    taskName: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    dateCreated: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    dateCompleted?: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    potentialUsers: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    excludedUsers: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    potentialGroups: string;
    /**
     * @type {string}
     * @memberof CMTaskInfo
     */
    assignedUser?: string;
}
