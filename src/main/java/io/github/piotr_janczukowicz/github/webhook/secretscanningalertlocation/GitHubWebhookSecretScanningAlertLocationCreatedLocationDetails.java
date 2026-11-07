package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning alert location created location details payload.
 *
 * @param blobSha SHA-1 hash ID of the associated blob
 * @param blobUrl The API URL to get the associated blob resource
 * @param commitSha SHA-1 hash ID of the associated commit
 * @param commitUrl The API URL to get the associated commit resource
 * @param discussionBodyUrl The URL to the discussion where the secret was detected.
 * @param discussionCommentUrl The API URL to get the discussion comment where the secret was detected.
 * @param discussionTitleUrl The URL to the discussion where the secret was detected.
 * @param endColumn The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII
 * @param endLine Line number at which the secret ends in the file
 * @param htmlUrl The GitHub URL to get the associated commit resource.
 * @param issueBodyUrl The API URL to get the issue where the secret was detected.
 * @param issueCommentUrl The API URL to get the issue comment where the secret was detected.
 * @param issueTitleUrl The API URL to get the issue where the secret was detected.
 * @param pageUrl The GitHub URL to get the associated wiki page
 * @param path The file path in the repository
 * @param pullRequestBodyUrl The API URL to get the pull request where the secret was detected.
 * @param pullRequestCommentUrl The API URL to get the pull request comment where the secret was detected.
 * @param pullRequestReviewCommentUrl The API URL to get the pull request review comment where the secret was detected.
 * @param pullRequestReviewUrl The API URL to get the pull request review where the secret was detected.
 * @param pullRequestTitleUrl The API URL to get the pull request where the secret was detected.
 * @param startColumn The column at which the secret starts within the start line when the file is interpreted as 8BIT
 *     ASCII
 * @param startLine Line number at which the secret starts in the file
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails(
        @Nullable String blobSha,
        @Nullable String blobUrl,
        @Nullable String commitSha,
        @Nullable String commitUrl,
        @Nullable String discussionBodyUrl,
        @Nullable String discussionCommentUrl,
        @Nullable String discussionTitleUrl,

        @Nullable @SuppressSchemaTypeMismatch("type rule: int (end_column)")
        Integer endColumn,

        @Nullable @SuppressSchemaTypeMismatch("type rule: int (end_line)")
        Integer endLine,

        @Nullable String htmlUrl,
        @Nullable String issueBodyUrl,
        @Nullable String issueCommentUrl,
        @Nullable String issueTitleUrl,
        @Nullable String pageUrl,
        @Nullable String path,
        @Nullable String pullRequestBodyUrl,
        @Nullable String pullRequestCommentUrl,
        @Nullable String pullRequestReviewCommentUrl,
        @Nullable String pullRequestReviewUrl,
        @Nullable String pullRequestTitleUrl,

        @Nullable @SuppressSchemaTypeMismatch("type rule: int (start_column)")
        Integer startColumn,

        @Nullable @SuppressSchemaTypeMismatch("type rule: int (start_line)")
        Integer startLine) {}
