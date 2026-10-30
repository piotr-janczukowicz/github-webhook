package io.github.piotr_janczukowicz.github.webhook.discussion;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The discussion transferred changes payload.
 *
 * @param newDiscussion A Discussion in a repository.
 * @param newRepository The repository on GitHub where the event occurred. Webhook payloads contain the
 *     {@code repository} property when the event occurs from activity in a repository.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-transferred/requestBody/properties/changes")
public record GitHubWebhookDiscussionTransferredChanges(
        GitHubWebhookDiscussion newDiscussion, GitHubWebhookForkRepository newRepository) {
    public GitHubWebhookDiscussionTransferredChanges {
        requireNonNull(newDiscussion, "newDiscussion");
        requireNonNull(newRepository, "newRepository");
    }
}
