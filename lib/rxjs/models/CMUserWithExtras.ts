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

import type {
    CMGroup,
} from './';

/**
 * An object used for updating a SimSage user.  This object can be used to update the user\'s password too.
 * @export
 * @interface CMUserWithExtras
 */
export interface CMUserWithExtras {
    /**
     * the user\'s id (its guid id).
     * @type {string}
     * @memberof CMUserWithExtras
     */
    id: string;
    /**
     * the email of this user
     * @type {string}
     * @memberof CMUserWithExtras
     */
    email: string;
    /**
     * a password for this user (or blank if not to be changed)
     * @type {string}
     * @memberof CMUserWithExtras
     */
    password: string;
    /**
     * the first-name of this user
     * @type {string}
     * @memberof CMUserWithExtras
     */
    firstName: string;
    /**
     * the last-name (surname) of this user
     * @type {string}
     * @memberof CMUserWithExtras
     */
    surname: string;
    /**
     * the roles to be associated with this user
     * @type {string}
     * @memberof CMUserWithExtras
     */
    roles: string;
    /**
     * the operator-id and knowledge-base id to be associated with this user.  This user is to be an operator if set.
     * @type {string}
     * @memberof CMUserWithExtras
     */
    operatorKBList: string;
    /**
     * a list of groups this user is part of (can be empty)
     * @type {Array<CMGroup>}
     * @memberof CMUserWithExtras
     */
    groupList: Array<CMGroup>;
    /**
     * an optional set of csv separated name1=value1,name2=value2 for JWT matching
     * @type {string}
     * @memberof CMUserWithExtras
     */
    jwtMatchNameValueCSV: string;
}
