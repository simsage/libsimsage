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
import org.openapitools.client.model.CMDeleteDocument;
import org.openapitools.client.model.CMDocumentUnChanged;
import org.openapitools.client.model.CMExternalCrawler;
import org.openapitools.client.model.CMExternalCrawlerStart;
import org.openapitools.client.model.CMExternalCrawlerStop;
import org.openapitools.client.model.CMSource;
import org.openapitools.client.model.CMStartCrawler;
import org.openapitools.client.model.CMUploadDocument;
import org.openapitools.client.model.CMUploadImage;
import org.openapitools.client.model.CMVersion;
import org.openapitools.client.model.JsonMessage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrawlerApi
 */
@Disabled
public class CrawlerApiTest {

    private final CrawlerApi api = new CrawlerApi();

    /**
     * Remove an External Document
     *
     * Remove an external crawler document from SimSage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void crawlerExternalDocumentDeleteTest() throws ApiException {
        CMDeleteDocument cmDeleteDocument = null;
        String apIVersion = null;
        JsonMessage response = api.crawlerExternalDocumentDelete(cmDeleteDocument, apIVersion);
        // TODO: test validations
    }

    /**
     * Mark External Document Unchanged
     *
     * An external crawler document marks a document as not having changed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void crawlerExternalDocumentUnChangedTest() throws ApiException {
        CMDocumentUnChanged cmDocumentUnChanged = null;
        String apIVersion = null;
        JsonMessage response = api.crawlerExternalDocumentUnChanged(cmDocumentUnChanged, apIVersion);
        // TODO: test validations
    }

    /**
     * Upload External Document
     *
     * An external crawler document wants to upload a document to SimSage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void crawlerExternalDocumentUploadTest() throws ApiException {
        CMUploadDocument cmUploadDocument = null;
        String apIVersion = null;
        JsonMessage response = api.crawlerExternalDocumentUpload(cmUploadDocument, apIVersion);
        // TODO: test validations
    }

    /**
     * Upload External Image
     *
     * An external crawler uploads an image for a document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void crawlerExternalImageUploadTest() throws ApiException {
        CMUploadImage cmUploadImage = null;
        String apIVersion = null;
        JsonMessage response = api.crawlerExternalImageUpload(cmUploadImage, apIVersion);
        // TODO: test validations
    }

    /**
     * Delete source
     *
     * Remove a source and all its content by its source-id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        String sessionId = null;
        Integer sourceId = null;
        String apIVersion = null;
        JsonMessage response = api.delete(organisationId, kbId, sessionId, sourceId, apIVersion);
        // TODO: test validations
    }

    /**
     * Delete source&#39;s documents
     *
     * Remove a source&#39;s documents and stop the crawler if it&#39;s running.  Return an updated sources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDocumentsTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        String sessionId = null;
        Integer sourceId = null;
        String apIVersion = null;
        CMSource response = api.deleteDocuments(organisationId, kbId, sessionId, sourceId, apIVersion);
        // TODO: test validations
    }

    /**
     * Secure Communication
     *
     * Secure Communications end-point.  Send encrypted messages from external crawlers and edge devices to this end-point.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void encryptedCommunicationsTest() throws ApiException {
        Integer seed = null;
        String body = null;
        String apIVersion = null;
        JsonMessage response = api.encryptedCommunications(seed, body, apIVersion);
        // TODO: test validations
    }

    /**
     * External Crawler
     *
     * Retrieve a crawler data-structure by orgId/kbId/sid and sourceId.  Used by External Crawlers to do their job.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void externalCrawlerTest() throws ApiException {
        CMExternalCrawler cmExternalCrawler = null;
        String apIVersion = null;
        CMSource response = api.externalCrawler(cmExternalCrawler, apIVersion);
        // TODO: test validations
    }

    /**
     * Stop External Crawler
     *
     * An external crawler notifies SimSage it has finished its job, its run through the data once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void externalCrawlerFinishedTest() throws ApiException {
        CMExternalCrawlerStop cmExternalCrawlerStop = null;
        String apIVersion = null;
        JsonMessage response = api.externalCrawlerFinished(cmExternalCrawlerStop, apIVersion);
        // TODO: test validations
    }

    /**
     * Start External Crawler
     *
     * An external crawler notifies SimSage is it starting a new run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void externalCrawlerStartTest() throws ApiException {
        CMExternalCrawlerStart cmExternalCrawlerStart = null;
        String apIVersion = null;
        JsonMessage response = api.externalCrawlerStart(cmExternalCrawlerStart, apIVersion);
        // TODO: test validations
    }

    /**
     * Get source
     *
     * Return the data-structure for a source by id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCrawlerTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        Integer sourceId = null;
        String sessionId = null;
        String apIVersion = null;
        CMSource response = api.getCrawler(organisationId, kbId, sourceId, sessionId, apIVersion);
        // TODO: test validations
    }

    /**
     * Get source List
     *
     * Get a list of sources for a given organisation / knowledge base.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSourceListTest() throws ApiException {
        String sessionId = null;
        String organisationId = null;
        String kbId = null;
        String apIVersion = null;
        List<CMSource> response = api.getSourceList(sessionId, organisationId, kbId, apIVersion);
        // TODO: test validations
    }

    /**
     * OIDC code receiver
     *
     * used for OIDC systems to receive codes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oidcCodeTest() throws ApiException {
        String oidcKey = null;
        Map<String, String> allRequestParams = null;
        api.oidcCode(oidcKey, allRequestParams);
        // TODO: test validations
    }

    /**
     * Process all files of crawler/source
     *
     * Start and force processing all files for a crawler/source
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processAllFilesTest() throws ApiException {
        String sessionId = null;
        CMStartCrawler cmStartCrawler = null;
        String apIVersion = null;
        JsonMessage response = api.processAllFiles(sessionId, cmStartCrawler, apIVersion);
        // TODO: test validations
    }

    /**
     * Reset Source delta-token
     *
     * reset a SimSage source&#39;s delta token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetSourceDeltaTest() throws ApiException {
        String sessionId = null;
        String organisationId = null;
        String kbId = null;
        Integer sourceId = null;
        String apIVersion = null;
        CMSource response = api.resetSourceDelta(sessionId, organisationId, kbId, sourceId, apIVersion);
        // TODO: test validations
    }

    /**
     * Start crawler
     *
     * Start a crawler by source-id if after it has stopped.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startCrawlerTest() throws ApiException {
        String sessionId = null;
        CMStartCrawler cmStartCrawler = null;
        String apIVersion = null;
        JsonMessage response = api.startCrawler(sessionId, cmStartCrawler, apIVersion);
        // TODO: test validations
    }

    /**
     * Test Crawler
     *
     * Some crawlers (platform crawlers, not external crawlers) can check if the given information is enough for it to operator.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testCrawlerTest() throws ApiException {
        String sessionId = null;
        String organisationId = null;
        String kbId = null;
        Integer sourceId = null;
        String apIVersion = null;
        JsonMessage response = api.testCrawler(sessionId, organisationId, kbId, sourceId, apIVersion);
        // TODO: test validations
    }

    /**
     * Update Source
     *
     * Save (create or update) a SimSage source.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCrawlerTest() throws ApiException {
        String sessionId = null;
        CMSource cmSource = null;
        String apIVersion = null;
        CMSource response = api.updateCrawler(sessionId, cmSource, apIVersion);
        // TODO: test validations
    }

    /**
     * Version
     *
     * Get the version of SimSage crawler-services.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void version6Test() throws ApiException {
        CMVersion response = api.version6();
        // TODO: test validations
    }

}
