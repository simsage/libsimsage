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
 * A notification to a user from a subscription.
 * @export
 * @interface CMUserNotification
 */
export interface CMUserNotification {
    /**
     * The unique URL of a folder.
     * @type {string}
     * @memberof CMUserNotification
     */
    url: string;
    /**
     * the source-id of the owner of this folder
     * @type {number}
     * @memberof CMUserNotification
     */
    sourceId: number;
    /**
     * is this a notification for a folder or a file?
     * @type {boolean}
     * @memberof CMUserNotification
     */
    isFolder: boolean;
    /**
     * the user to be notified, a guid
     * @type {string}
     * @memberof CMUserNotification
     */
    userId: string;
    /**
     * the user that made the change, a guid
     * @type {string}
     * @memberof CMUserNotification
     */
    whoId: string;
    /**
     * the email address of the user that made the change
     * @type {string}
     * @memberof CMUserNotification
     */
    email: string;
    /**
     * the type of the notification
     * @type {string}
     * @memberof CMUserNotification
     */
    notificationType: string;
    /**
     * the contents of the notification
     * @type {string}
     * @memberof CMUserNotification
     */
    description: string;
    /**
     * a unix-timestamp of the creation date-time of this record
     * @type {number}
     * @memberof CMUserNotification
     */
    created: number;
    /**
     * @type {boolean}
     * @memberof CMUserNotification
     */
    folder?: boolean;
}