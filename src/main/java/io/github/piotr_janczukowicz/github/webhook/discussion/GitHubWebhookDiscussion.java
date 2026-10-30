package io.github.piotr_janczukowicz.github.webhook.discussion;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDiscussionCategory;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDiscussionState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookDiscussionStateReason;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedLabel;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookReactions;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A Discussion in a repository.
 *
 * @param activeLockReason active_lock_reason
 * @param answerChosenAt answer_chosen_at
 * @param answerChosenBy answer_chosen_by
 * @param answerHtmlUrl answer_html_url
 * @param authorAssociation How the author is associated with the repository.
 * @param body body
 * @param category category
 * @param comments comments
 * @param createdAt created_at
 * @param htmlUrl html_url
 * @param id id
 * @param labels labels
 * @param locked locked
 * @param nodeId node_id
 * @param number number
 * @param reactions reactions
 * @param repositoryUrl repository_url
 * @param state The current state of the discussion. {@code converting} means that the discussion is being converted
 *     from an issue. {@code transferring} means that the discussion is being transferred from another repository.
 * @param stateReason The reason for the current state
 * @param timelineUrl timeline_url
 * @param title title
 * @param updatedAt updated_at
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-answered/requestBody/properties/discussion")
public record GitHubWebhookDiscussion(
        @Nullable String activeLockReason,
        @Nullable String answerChosenAt,
        @Nullable GitHubWebhookUser answerChosenBy,
        @Nullable String answerHtmlUrl,
        @Nullable GitHubWebhookIssueAuthorAssociation authorAssociation,
        String body,
        GitHubWebhookDiscussionCategory category,
        long comments,
        Instant createdAt,
        String htmlUrl,
        long id,
        @Nullable List<GitHubWebhookIssuesEditedLabel> labels,
        boolean locked,
        String nodeId,
        long number,
        @Nullable GitHubWebhookReactions reactions,
        String repositoryUrl,
        GitHubWebhookDiscussionState state,
        @Nullable GitHubWebhookDiscussionStateReason stateReason,
        @Nullable String timelineUrl,
        String title,
        Instant updatedAt,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookDiscussion {
        requireNonNull(body, "body");
        requireNonNull(category, "category");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(state, "state");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
    }
}
