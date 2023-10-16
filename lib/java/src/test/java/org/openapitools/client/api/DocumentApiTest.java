/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CMDocument;
import org.openapitools.client.model.CMDocumentTypeFrequency;
import org.openapitools.client.model.CMGetHtml;
import org.openapitools.client.model.CMInventorizeParameters;
import org.openapitools.client.model.CMParquetTimeList;
import org.openapitools.client.model.CMQueryFocussedSummarization;
import org.openapitools.client.model.CMQueryFocussedSummarizationRequest;
import org.openapitools.client.model.CMSingleDocumentSummary;
import org.openapitools.client.model.CMSingleDocumentSummaryRequest;
import org.openapitools.client.model.CMVersion;
import org.openapitools.client.model.CMZipSource;
import org.openapitools.client.model.JsonMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
@Disabled
public class DocumentApiTest {

    private final DocumentApi api = new DocumentApi();

    /**
     * get Document
     *
     * return a document&#39;s details given a base64 encoded url
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentTest() throws ApiException {
        String sessionId = null;
        String organisationId = null;
        String kbId = null;
        String url = null;
        CMDocument response = api.document(sessionId, organisationId, kbId, url);
        // TODO: test validations
    }

    /**
     * Download Parquet File
     *
     * Download an inventory parquet file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParquetFileTest() throws ApiException {
        String ott = null;
        String organisationId = null;
        String kbId = null;
        Long dateTime = null;
        byte[] response = api.getParquetFile(ott, organisationId, kbId, dateTime);
        // TODO: test validations
    }

    /**
     * Parquet available time list
     *
     * Return a list of inventory times available for download.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParquetListTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        Integer page = null;
        Integer pageSize = null;
        String sessionId = null;
        String apIVersion = null;
        CMParquetTimeList response = api.getParquetList(organisationId, kbId, page, pageSize, sessionId, apIVersion);
        // TODO: test validations
    }

    /**
     * Inventory breakdown Spreadsheet
     *
     * Download an inventory breakdown spreadsheet for a given date-time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpreadsheetTest() throws ApiException {
        String ott = null;
        String organisationId = null;
        String kbId = null;
        Long dateTime = null;
        byte[] response = api.getSpreadsheet(ott, organisationId, kbId, dateTime);
        // TODO: test validations
    }

    /**
     * Document Frequency Statistics
     *
     * Return a document frequency statistics report - frequencies of different document types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStats1Test() throws ApiException {
        String ott = null;
        String organisationId = null;
        String kbId = null;
        Long dateTime = null;
        List<CMDocumentTypeFrequency> response = api.getStats1(ott, organisationId, kbId, dateTime);
        // TODO: test validations
    }

    /**
     * Document Inventory
     *
     * Start the async inventorize process for documents of a given organisation/kb.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inventorizeDocumentsTest() throws ApiException {
        String sessionId = null;
        CMInventorizeParameters cmInventorizeParameters = null;
        String apIVersion = null;
        JsonMessage response = api.inventorizeDocuments(sessionId, cmInventorizeParameters, apIVersion);
        // TODO: test validations
    }

    /**
     * Index Inventory
     *
     * Start the async inventorize process for the optimized-indexes of a given organisation/kb.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void inventorizeIndexesTest() throws ApiException {
        String sessionId = null;
        CMInventorizeParameters cmInventorizeParameters = null;
        String apIVersion = null;
        JsonMessage response = api.inventorizeIndexes(sessionId, cmInventorizeParameters, apIVersion);
        // TODO: test validations
    }

    /**
     * get Preview
     *
     * get a preview for a document if available by url
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void previewTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        String clientId = null;
        String sessionId = null;
        Integer urlId = null;
        Integer page = null;
        byte[] response = api.preview(organisationId, kbId, clientId, sessionId, urlId, page);
        // TODO: test validations
    }

    /**
     * Preview HTML
     *
     * get a preview HTML page for a document if available by url
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void previewHtmlTest() throws ApiException {
        String sessionId = null;
        CMGetHtml cmGetHtml = null;
        CMGetHtml response = api.previewHtml(sessionId, cmGetHtml);
        // TODO: test validations
    }

    /**
     * Summarize Documents for Query
     *
     * Summarize a set of documents given a list of urls and a query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryFocussedSummarizationTest() throws ApiException {
        String sessionId = null;
        CMQueryFocussedSummarizationRequest cmQueryFocussedSummarizationRequest = null;
        String apIVersion = null;
        CMQueryFocussedSummarization response = api.queryFocussedSummarization(sessionId, cmQueryFocussedSummarizationRequest, apIVersion);
        // TODO: test validations
    }

    /**
     * Remove Document
     *
     * Remove/delete a document by its url.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeDocumentTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        String url = null;
        Integer sourceId = null;
        String sessionId = null;
        String apIVersion = null;
        JsonMessage response = api.removeDocument(organisationId, kbId, url, sourceId, sessionId, apIVersion);
        // TODO: test validations
    }

    /**
     * Delete Parquet File
     *
     * Remove an inventory breakdown spreadsheet/parquet file from the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeParquetFileTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        Long dateTime = null;
        String sessionId = null;
        String apIVersion = null;
        List<JsonMessage> response = api.removeParquetFile(organisationId, kbId, dateTime, sessionId, apIVersion);
        // TODO: test validations
    }

    /**
     * Summarize a document
     *
     * Summarize a single document using an extractive summarization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void summarizeDocumentTest() throws ApiException {
        String sessionId = null;
        CMSingleDocumentSummaryRequest cmSingleDocumentSummaryRequest = null;
        String apIVersion = null;
        CMSingleDocumentSummary response = api.summarizeDocument(sessionId, cmSingleDocumentSummaryRequest, apIVersion);
        // TODO: test validations
    }

    /**
     * Version
     *
     * Get the version of SimSage Document Services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void version4Test() throws ApiException {
        CMVersion response = api.version4();
        // TODO: test validations
    }

    /**
     * Zip source documents
     *
     * Zip all documents in a source on the local server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void zipSourceTest() throws ApiException {
        String sessionId = null;
        CMZipSource cmZipSource = null;
        String apIVersion = null;
        JsonMessage response = api.zipSource(sessionId, cmZipSource, apIVersion);
        // TODO: test validations
    }

}