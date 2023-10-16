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
 * This object is used to requests a set of specific and general statistics.  The general statistics have no time associated with them (eg. file-type frequencies).  The other statistics are month based and include system-query-access by day of the month, and query-word frequencies.
 * @export
 * @interface CMReturnStatistics
 */
export interface CMReturnStatistics {
    /**
     * the organisation (its guid id)
     * @type {string}
     * @memberof CMReturnStatistics
     */
    organisationId: string;
    /**
     * the knowledge-base id (its guid id)
     * @type {string}
     * @memberof CMReturnStatistics
     */
    kbId: string;
    /**
     * the year of the request
     * @type {number}
     * @memberof CMReturnStatistics
     */
    year: number;
    /**
     * the month of the request
     * @type {number}
     * @memberof CMReturnStatistics
     */
    month: number;
    /**
     * A list of 31 values, one for each day of the month indicating the number of unique access for each day of the month.
     * @type {number}
     * @memberof CMReturnStatistics
     */
    accessFrequency: number;
    /**
     * The top list of queries (the strings) and their frequencies
     * @type {{ [key: string]: number; }}
     * @memberof CMReturnStatistics
     */
    queryWordFrequency: { [key: string]: number; };
    /**
     * Some more general statistics (eg. number of documents) and their frequencies
     * @type {{ [key: string]: number; }}
     * @memberof CMReturnStatistics
     */
    generalStatistics: { [key: string]: number; };
    /**
     * The breakdown of file-types (by file extension) and their frequencies
     * @type {{ [key: string]: number; }}
     * @memberof CMReturnStatistics
     */
    fileTypeStatistics: { [key: string]: number; };
}