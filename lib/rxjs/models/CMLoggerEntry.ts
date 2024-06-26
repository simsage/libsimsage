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
 * This object represents a single system-log entry.  A list of these is returned by the CMSystemLogs structure.
 * @export
 * @interface CMLoggerEntry
 */
export interface CMLoggerEntry {
    /**
     * the main message of the log entry
     * @type {string}
     * @memberof CMLoggerEntry
     */
    message: string;
    /**
     * the type of log entry (eg. Debug, Info, Warn, Error)
     * @type {string}
     * @memberof CMLoggerEntry
     */
    type: string;
    /**
     * the name of the service that generated this log
     * @type {string}
     * @memberof CMLoggerEntry
     */
    service: string;
    /**
     * the stack traces if applicable
     * @type {string}
     * @memberof CMLoggerEntry
     */
    stackTrace: string;
    /**
     * unit date-time of this log
     * @type {number}
     * @memberof CMLoggerEntry
     */
    created: number;
}
