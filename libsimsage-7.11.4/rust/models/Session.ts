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
    ContextItem,
} from './';

/**
 * @export
 * @interface Session
 */
export interface Session {
    /**
     * @type {string}
     * @memberof Session
     */
    id: string;
    /**
     * @type {string}
     * @memberof Session
     */
    userId: string;
    /**
     * @type {string}
     * @memberof Session
     */
    organisationId: string;
    /**
     * @type {string}
     * @memberof Session
     */
    email: string;
    /**
     * @type {string}
     * @memberof Session
     */
    ipAddress: string;
    /**
     * @type {number}
     * @memberof Session
     */
    lastAccess: number;
    /**
     * @type {string}
     * @memberof Session
     */
    role: string;
    /**
     * @type {string}
     * @memberof Session
     */
    sessionType: string;
    /**
     * @type {Array<ContextItem>}
     * @memberof Session
     */
    contextStack: Array<ContextItem>;
}
