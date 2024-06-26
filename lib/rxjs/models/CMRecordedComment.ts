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
 * @export
 * @interface CMRecordedComment
 */
export interface CMRecordedComment {
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    created: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    projectId: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    sliceId: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    documentKey: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    commentLevel: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    comment: string;
    /**
     * @type {string}
     * @memberof CMRecordedComment
     */
    user: string;
    /**
     * @type {boolean}
     * @memberof CMRecordedComment
     */
    isAuditEvent: boolean;
}
