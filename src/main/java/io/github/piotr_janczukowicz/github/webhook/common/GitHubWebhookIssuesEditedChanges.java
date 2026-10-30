package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the issue.
 *
 * @param body body
 * @param title title
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-edited/requestBody/properties/changes")
public record GitHubWebhookIssuesEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody body,
        @Nullable GitHubWebhookIssuesEditedChangesBody title) {}
