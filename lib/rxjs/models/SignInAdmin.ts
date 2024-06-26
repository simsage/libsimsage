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
    Organisation,
    Session,
    User,
} from './';

/**
 * @export
 * @interface SignInAdmin
 */
export interface SignInAdmin {
    /**
     * @type {Array<Organisation>}
     * @memberof SignInAdmin
     */
    organisationList: Array<Organisation>;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    sharedSecretSalt: string;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    jobId: string;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    returnAddress: string;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    errorStr: string;
    /**
     * @type {number}
     * @memberof SignInAdmin
     */
    timeOut: number;
    /**
     * @type {boolean}
     * @memberof SignInAdmin
     */
    async: boolean;
    /**
     * @type {boolean}
     * @memberof SignInAdmin
     */
    isReturnResult: boolean;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    email: string;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    password: string;
    /**
     * @type {Array<string>}
     * @memberof SignInAdmin
     */
    roles: Array<string>;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    remoteAddress: string;
    /**
     * @type {Session}
     * @memberof SignInAdmin
     */
    session: Session;
    /**
     * @type {User}
     * @memberof SignInAdmin
     */
    user: User;
    /**
     * @type {string}
     * @memberof SignInAdmin
     */
    organisationId: string;
    /**
     * @type {boolean}
     * @memberof SignInAdmin
     */
    returnResult?: boolean;
}
