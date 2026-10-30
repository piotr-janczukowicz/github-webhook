package io.github.piotr_janczukowicz.github.webhook.discussion;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The discussion unanswered event payload.
 *
 * @param discussion A Discussion in a repository.
 * @param oldAnswer old_answer
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param sender A GitHub user.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-unanswered/requestBody")
public record GitHubWebhookDiscussionUnansweredEvent(
        GitHubWebhookDiscussion discussion,
        GitHubWebhookDiscussionAnsweredAnswer oldAnswer,
        @Nullable GitHubWebhookOrganizationSimple organization,
        GitHubWebhookForkRepository repository,
        @Nullable GitHubWebhookSimpleUser sender)
        implements GitHubWebhookDiscussionEvent {
    public GitHubWebhookDiscussionUnansweredEvent {
        requireNonNull(discussion, "discussion");
        requireNonNull(oldAnswer, "oldAnswer");
        requireNonNull(repository, "repository");
    }
}
