/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CMChangeTaskPhase;
import org.openapitools.client.model.CMClaimDocument;
import org.openapitools.client.model.CMCommentFilter;
import org.openapitools.client.model.CMCrawlerStatusTask;
import org.openapitools.client.model.CMCreatedProject;
import org.openapitools.client.model.CMDocumentsByToken;
import org.openapitools.client.model.CMNewComment;
import org.openapitools.client.model.CMNextDocument;
import org.openapitools.client.model.CMPagedProjectDocuments;
import org.openapitools.client.model.CMPagedQueueItems;
import org.openapitools.client.model.CMProjectDefinition;
import org.openapitools.client.model.CMProjectDefinitionTask;
import org.openapitools.client.model.CMProjectInfo;
import org.openapitools.client.model.CMProjectReview;
import org.openapitools.client.model.CMProjectSliceTask;
import org.openapitools.client.model.CMQueueFilter;
import org.openapitools.client.model.CMReassignSliceDocument;
import org.openapitools.client.model.CMRecordedComment;
import org.openapitools.client.model.CMRedactionDetails;
import org.openapitools.client.model.CMRemoveSliceDocument;
import org.openapitools.client.model.CMSearchResultSummary;
import org.openapitools.client.model.CMSearchResultSummaryTask;
import org.openapitools.client.model.CMSetSliceDefinitions;
import org.openapitools.client.model.CMSlicedDocumentListAndTotals;
import org.openapitools.client.model.CMSlicedDocumentRequest;
import org.openapitools.client.model.CMStartProject;
import org.openapitools.client.model.CMUpdateDocumentStatus;
import org.openapitools.client.model.CMUpdateRedactions;
import org.openapitools.client.model.JsonMessage;
import org.openapitools.client.model.LocatedRedaction;
import org.openapitools.client.model.ReturnedDocument;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataprojectApi
 */
@Disabled
public class DataprojectApiTest {

    private final DataprojectApi api = new DataprojectApi();

    /**
     * Create Comment
     *
     * Adds a comment with the given level and ids
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        String sessionId = null;
        CMNewComment cmNewComment = null;
        String response = api.addComment(sessionId, cmNewComment);
        // TODO: test validations
    }

    /**
     * get Running Projects
     *
     * Get the list of running projects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void allTasksTest() throws ApiException {
        String sessionId = null;
        CMQueueFilter cmQueueFilter = null;
        CMPagedQueueItems response = api.allTasks(sessionId, cmQueueFilter);
        // TODO: test validations
    }

    /**
     * Change Task Phase
     *
     * Notifies Workflow engine that a task changed it&#39;s status and passes results in
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeTaskPhaseTest() throws ApiException {
        String sessionId = null;
        CMChangeTaskPhase cmChangeTaskPhase = null;
        String response = api.changeTaskPhase(sessionId, cmChangeTaskPhase);
        // TODO: test validations
    }

    /**
     * Claim sliced document
     *
     * Claim sliced document for signed in user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void claimDocumentTest() throws ApiException {
        String sessionId = null;
        CMClaimDocument cmClaimDocument = null;
        ReturnedDocument response = api.claimDocument(sessionId, cmClaimDocument);
        // TODO: test validations
    }

    /**
     * get Crawler Status
     *
     * Get the crawler status for the given task id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void crawlerStatusTest() throws ApiException {
        String organisationId = null;
        String taskId = null;
        String sessionId = null;
        CMCrawlerStatusTask response = api.crawlerStatus(organisationId, taskId, sessionId);
        // TODO: test validations
    }

    /**
     * Returns document list for tokens
     *
     * Returns paged list of documents for the given set of query tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void documentsByTokensTest() throws ApiException {
        String sessionId = null;
        CMDocumentsByToken cmDocumentsByToken = null;
        CMPagedProjectDocuments response = api.documentsByTokens(sessionId, cmDocumentsByToken);
        // TODO: test validations
    }

    /**
     * Retrieve Comments
     *
     * Retrieves the list of comments for the passed in Filter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filteredCommentsTest() throws ApiException {
        String sessionId = null;
        CMCommentFilter cmCommentFilter = null;
        List<CMRecordedComment> response = api.filteredComments(sessionId, cmCommentFilter);
        // TODO: test validations
    }

    /**
     * Get Document Redaction info
     *
     * Get list of all identified potential Redaction locations for the document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentRedactionInfoTest() throws ApiException {
        String organisationId = null;
        String sliceId = null;
        String documentKey = null;
        String sessionId = null;
        List<LocatedRedaction> response = api.getDocumentRedactionInfo(organisationId, sliceId, documentKey, sessionId);
        // TODO: test validations
    }

    /**
     * get Project Definition
     *
     * Get the project definition of the project for the given task id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectDefinitionTest() throws ApiException {
        String organisationId = null;
        String taskId = null;
        String sessionId = null;
        CMProjectDefinitionTask response = api.getProjectDefinition(organisationId, taskId, sessionId);
        // TODO: test validations
    }

    /**
     * get Project Definition
     *
     * Get the project review data of the project for the given project id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectReviewTest() throws ApiException {
        String organisationId = null;
        String projectId = null;
        String sessionId = null;
        CMProjectReview response = api.getProjectReview(organisationId, projectId, sessionId);
        // TODO: test validations
    }

    /**
     * get project slice
     *
     * Get the project project slice for the given task id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectSliceTest() throws ApiException {
        String organisationId = null;
        String taskId = null;
        String sessionId = null;
        List<CMProjectSliceTask> response = api.getProjectSlice(organisationId, taskId, sessionId);
        // TODO: test validations
    }

    /**
     * get Search Result Summary
     *
     * Get the summary information for the search results of a given project by task id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSearchResultSummaryTest() throws ApiException {
        String organisationId = null;
        String taskId = null;
        String sessionId = null;
        CMSearchResultSummaryTask response = api.getSearchResultSummary(organisationId, taskId, sessionId);
        // TODO: test validations
    }

    /**
     * get Search Result Summary
     *
     * Get the summary information for the search results of a given project by task id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSearchResultSummaryForReviewTest() throws ApiException {
        String organisationId = null;
        String projectId = null;
        String sessionId = null;
        CMSearchResultSummary response = api.getSearchResultSummaryForReview(organisationId, projectId, sessionId);
        // TODO: test validations
    }

    /**
     * Document list for given slice and filters
     *
     * Returns paged list of documents for the passed in slice and filters as well as totals
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void nextDocumentTest() throws ApiException {
        String sessionId = null;
        CMNextDocument cmNextDocument = null;
        CMSlicedDocumentListAndTotals response = api.nextDocument(sessionId, cmNextDocument);
        // TODO: test validations
    }

    /**
     * Binary
     *
     * Get the original for a document if available by url (latest version)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pdfBinaryTest() throws ApiException {
        String organisationId = null;
        String kbId = null;
        String url = null;
        String sessionId = null;
        Object response = api.pdfBinary(organisationId, kbId, url, sessionId);
        // TODO: test validations
    }

    /**
     * get Project Types
     *
     * Get the list of available project types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void projectTypesTest() throws ApiException {
        String organisationId = null;
        String sessionId = null;
        List<CMProjectInfo> response = api.projectTypes(organisationId, sessionId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reassignSliceDocumentTest() throws ApiException {
        String sessionId = null;
        CMReassignSliceDocument cmReassignSliceDocument = null;
        Object response = api.reassignSliceDocument(sessionId, cmReassignSliceDocument);
        // TODO: test validations
    }

    /**
     * Get Redacted Document
     *
     * Retrieves the redacted document binary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void redactedDocumentTest() throws ApiException {
        String sessionId = null;
        CMRedactionDetails cmRedactionDetails = null;
        ReturnedDocument response = api.redactedDocument(sessionId, cmRedactionDetails);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSliceDocumentTest() throws ApiException {
        String sessionId = null;
        CMRemoveSliceDocument cmRemoveSliceDocument = null;
        Object response = api.removeSliceDocument(sessionId, cmRemoveSliceDocument);
        // TODO: test validations
    }

    /**
     * Reset Evolve Application
     *
     * Fully resets Evolve to an empty system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetEvolveTest() throws ApiException {
        String organisationId = null;
        String sessionId = null;
        String response = api.resetEvolve(organisationId, sessionId);
        // TODO: test validations
    }

    /**
     * Inserts/Updates a project definition
     *
     * Inserts/Updates the details for a project definition
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void saveProjectDefinitionTest() throws ApiException {
        String sessionId = null;
        CMProjectDefinition cmProjectDefinition = null;
        CMCreatedProject response = api.saveProjectDefinition(sessionId, cmProjectDefinition);
        // TODO: test validations
    }

    /**
     * Set Slice configuration
     *
     * Saves/updates the slices configured for a running project
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setSliceConfigTest() throws ApiException {
        String sessionId = null;
        CMSetSliceDefinitions cmSetSliceDefinitions = null;
        String response = api.setSliceConfig(sessionId, cmSetSliceDefinitions);
        // TODO: test validations
    }

    /**
     * Document list for given slice and filters
     *
     * Returns paged list of documents for the passed in slice and filters as well as totals
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void slicedDocumentsTest() throws ApiException {
        String sessionId = null;
        CMSlicedDocumentRequest cmSlicedDocumentRequest = null;
        CMSlicedDocumentListAndTotals response = api.slicedDocuments(sessionId, cmSlicedDocumentRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startProjectTest() throws ApiException {
        String sessionId = null;
        CMStartProject cmStartProject = null;
        Object response = api.startProject(sessionId, cmStartProject);
        // TODO: test validations
    }

    /**
     * Update document status
     *
     * Updates the status applied to a slice document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDocumentStatusTest() throws ApiException {
        String sessionId = null;
        CMUpdateDocumentStatus cmUpdateDocumentStatus = null;
        String response = api.updateDocumentStatus(sessionId, cmUpdateDocumentStatus);
        // TODO: test validations
    }

    /**
     * Update document redactions
     *
     * Updates the redactions applied to a document
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRedactionsTest() throws ApiException {
        String sessionId = null;
        CMUpdateRedactions cmUpdateRedactions = null;
        String response = api.updateRedactions(sessionId, cmUpdateRedactions);
        // TODO: test validations
    }

}
