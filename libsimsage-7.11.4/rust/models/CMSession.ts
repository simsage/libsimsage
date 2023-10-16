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

/**
 * A session object, A session\'s id is the \"session-id\" used throughout the SimSage API.
 * @export
 * @interface CMSession
 */
export interface CMSession {
    /**
     * the session-id, a guid
     * @type {string}
     * @memberof CMSession
     */
    id: string;
    /**
     * the user associated with this session, their id, a guid
     * @type {string}
     * @memberof CMSession
     */
    userId: string;
    /**
     * the main organisation (its guid id) this session is associated with if applicable (administrators do not have such an association)
     * @type {string}
     * @memberof CMSession
     */
    organisationId: string;
    /**
     * email address of this user
     * @type {string}
     * @memberof CMSession
     */
    email: string;
    /**
     * the ip-address of the user logging in if captured
     * @type {string}
     * @memberof CMSession
     */
    ipAddress: string;
    /**
     * a unix-timestamp of the last time this session was accessed/refreshed
     * @type {number}
     * @memberof CMSession
     */
    lastAccess: number;
    /**
     * the main/highest role of the user signed-in
     * @type {string}
     * @memberof CMSession
     */
    role: string;
    /**
     * the type of sign-in (Anonymous (i.e. valid but search only) or SimSage)
     * @type {string}
     * @memberof CMSession
     */
    sessionType: string;
}
