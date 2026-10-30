package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The alert instance location payload.
 *
 * @param endColumn end_column
 * @param endLine end_line
 * @param path path
 * @param startColumn start_column
 * @param startLine start_line
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/most_recent_instance/properties/location")
public record GitHubWebhookAlertInstanceLocation(
        @Nullable Long endColumn,
        @Nullable Long endLine,
        @Nullable String path,
        @Nullable Long startColumn,
        @Nullable Long startLine) {}
