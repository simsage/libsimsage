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
    CMUser,
} from './';

/**
 * A paginated/filtered list of users with a total user count.
 * @export
 * @interface CMUserList
 */
export interface CMUserList {
    /**
     * the list of user objects.
     * @type {Array<CMUser>}
     * @memberof CMUserList
     */
    userList: Array<CMUser>;
    /**
     * the total user count.
     * @type {number}
     * @memberof CMUserList
     */
    userCount: number;
}
