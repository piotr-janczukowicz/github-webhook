package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the issue. {@code state} and {@code state_reason} are only included when the status change also closed
 * or reopened the issue, or changed the reason it was closed.
 *
 * @param state state
 * @param stateReason state_reason
 * @param status status
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-status-changed/requestBody/properties/changes")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesStatusChangedChanges(
        @Nullable GitHubWebhookIssuesStatusChangedChangesState state,
        @Nullable GitHubWebhookProjectCardEditedChangesNote stateReason,
        GitHubWebhookIssuesStatusChangedChangesStatus status) {
    public GitHubWebhookIssuesStatusChangedChanges {
        requireNonNull(status, "status");
    }
}
