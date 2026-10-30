package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the comment if the action was {@code edited}.
 *
 * @param base base
 * @param body body
 * @param title title
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-edited/requestBody/properties/changes")
public record GitHubWebhookPullRequestEditedChanges(
        @Nullable GitHubWebhookPullRequestEditedChangesBase base,
        @Nullable GitHubWebhookIssuesEditedChangesBody body,
        @Nullable GitHubWebhookIssuesEditedChangesBody title) {}
