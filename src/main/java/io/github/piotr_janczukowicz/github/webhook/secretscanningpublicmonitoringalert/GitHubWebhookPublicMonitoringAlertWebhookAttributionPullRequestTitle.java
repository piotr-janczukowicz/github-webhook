package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The public monitoring alert webhook attribution pull request title payload.
 *
 * @param blobSha blob_sha
 * @param commitSha commit_sha
 * @param contentId content_id
 * @param contentNumber content_number
 * @param endColumn end_column
 * @param endLine end_line
 * @param htmlUrl The GitHub URL for the pull request where the secret was detected.
 * @param path path
 * @param pullRequestTitleUrl The API URL to get the pull request where the secret was detected.
 * @param startColumn start_column
 * @param startLine start_line
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/attribution/properties/pull_request_title")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestTitle(
        @Nullable String blobSha,
        @Nullable String commitSha,
        @Nullable Long contentId,
        @Nullable Long contentNumber,
        @Nullable Long endColumn,
        @Nullable Long endLine,
        @Nullable String htmlUrl,
        @Nullable String path,
        @Nullable String pullRequestTitleUrl,
        @Nullable Long startColumn,
        @Nullable Long startLine) {}
