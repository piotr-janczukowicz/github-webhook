package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The public monitoring alert webhook attribution discussion body payload.
 *
 * @param blobSha blob_sha
 * @param commitSha commit_sha
 * @param contentId content_id
 * @param contentNumber content_number
 * @param discussionBodyUrl The URL to the discussion where the secret was detected.
 * @param endColumn end_column
 * @param endLine end_line
 * @param htmlUrl html_url
 * @param path path
 * @param startColumn start_column
 * @param startLine start_line
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/attribution/properties/discussion_body")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhookAttributionDiscussionBody(
        @Nullable String blobSha,
        @Nullable String commitSha,
        @Nullable Long contentId,
        @Nullable Long contentNumber,
        @Nullable String discussionBodyUrl,
        @Nullable Long endColumn,
        @Nullable Long endLine,
        @Nullable String htmlUrl,
        @Nullable String path,
        @Nullable Long startColumn,
        @Nullable Long startLine) {}
