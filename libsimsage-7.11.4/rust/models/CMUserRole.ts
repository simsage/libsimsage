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
 * A user\'s SimSage-role inside an organisation.  SimSage roles determine what a user can do/access inside SimSage and are specific to SimSage.  Roles include admin (a SimSage administrator, super-user), manager (a SimSage manager, a user that has super-user access to one and one organisation only), operator (a SimSage operator, a user that can access the SimSage operator interface for a specific organisation), dms (a SimSage user that can sign-in to our Document Management System interface, specific to an organisation).
 * @export
 * @interface CMUserRole
 */
export interface CMUserRole {
    /**
     * the organisation (its guid id) this role applies to
     * @type {string}
     * @memberof CMUserRole
     */
    organisationId: string;
    /**
     * the SimSage role inside this organisation
     * @type {string}
     * @memberof CMUserRole
     */
    role: string;
}
