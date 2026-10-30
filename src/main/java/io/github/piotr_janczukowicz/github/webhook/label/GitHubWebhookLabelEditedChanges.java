package io.github.piotr_janczukowicz.github.webhook.label;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the label if the action was {@code edited}.
 *
 * @param color color
 * @param description description
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/label-edited/requestBody/properties/changes")
public record GitHubWebhookLabelEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody color,
        @Nullable GitHubWebhookIssuesEditedChangesBody description,
        @Nullable GitHubWebhookIssuesEditedChangesBody name) {}
