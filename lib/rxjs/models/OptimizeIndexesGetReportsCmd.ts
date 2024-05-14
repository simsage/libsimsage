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
 * @interface OptimizeIndexesGetReportsCmd
 */
export interface OptimizeIndexesGetReportsCmd {
    /**
     * @type {string}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    jobId: string;
    /**
     * @type {string}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    returnAddress: string;
    /**
     * @type {string}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    errorStr: string;
    /**
     * @type {number}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    timeOut: number;
    /**
     * @type {boolean}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    async: boolean;
    /**
     * @type {boolean}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    isReturnResult: boolean;
    /**
     * @type {string}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    kbId: string;
    /**
     * @type {Array<number>}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    reportList: Array<number>;
    /**
     * @type {boolean}
     * @memberof OptimizeIndexesGetReportsCmd
     */
    returnResult?: boolean;
}
