package io.github.piotr_janczukowicz.github.webhook.milestone;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the milestone if the action was {@code edited}.
 *
 * @param description description
 * @param dueOn due_on
 * @param title title
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/milestone-edited/requestBody/properties/changes")
public record GitHubWebhookMilestoneEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody description,
        @Nullable GitHubWebhookIssuesEditedChangesBody dueOn,
        @Nullable GitHubWebhookIssuesEditedChangesBody title) {}
