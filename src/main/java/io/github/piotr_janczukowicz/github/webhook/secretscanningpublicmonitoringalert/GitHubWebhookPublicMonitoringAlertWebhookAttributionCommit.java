package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The public monitoring alert webhook attribution commit payload.
 *
 * @param blobSha SHA-1 hash ID of the associated blob
 * @param blobUrl The API URL to get the associated blob resource
 * @param commitSha SHA-1 hash ID of the associated commit
 * @param commitUrl The API URL to get the associated commit resource
 * @param contentId content_id
 * @param contentNumber content_number
 * @param endColumn end_column
 * @param endLine end_line
 * @param htmlUrl The GitHub URL to get the associated commit resource.
 * @param path The file path in the repository
 * @param startColumn start_column
 * @param startLine start_line
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/attribution/properties/commit")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhookAttributionCommit(
        @Nullable String blobSha,
        @Nullable String blobUrl,
        @Nullable String commitSha,
        @Nullable String commitUrl,
        @Nullable Long contentId,
        @Nullable Long contentNumber,
        @Nullable Long endColumn,
        @Nullable Long endLine,
        @Nullable String htmlUrl,
        @Nullable String path,
        @Nullable Long startColumn,
        @Nullable Long startLine) {}
