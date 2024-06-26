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
 * A single parquet item, a name with a timestamp.
 * @export
 * @interface CMParquetItem
 */
export interface CMParquetItem {
    /**
     * the name / type of item
     * @type {string}
     * @memberof CMParquetItem
     */
    name: string;
    /**
     * a unix-time for this parquet item
     * @type {number}
     * @memberof CMParquetItem
     */
    time: number;
}
