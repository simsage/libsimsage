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
    CMGroup,
    CMUser,
} from './';

/**
 * A security-group list.  A list of groups for security purposes.
 * @export
 * @interface CMGroupList
 */
export interface CMGroupList {
    /**
     * the list of filtered/paginated groups
     * @type {Array<CMGroup>}
     * @memberof CMGroupList
     */
    groupList: Array<CMGroup>;
    /**
     * the list of users for all groups
     * @type {Array<CMUser>}
     * @memberof CMGroupList
     */
    userList: Array<CMUser>;
}
