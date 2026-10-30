package io.github.piotr_janczukowicz.github.webhook.project;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the project if the action was {@code edited}.
 *
 * @param body body
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-edited/requestBody/properties/changes")
public record GitHubWebhookProjectEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody body,
        @Nullable GitHubWebhookIssuesEditedChangesBody name) {}
