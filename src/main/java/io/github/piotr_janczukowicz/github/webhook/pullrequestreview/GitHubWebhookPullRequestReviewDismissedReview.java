package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssueAuthorAssociation;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The review that was affected.
 *
 * @param links _links
 * @param authorAssociation How the author is associated with the repository.
 * @param body The text of the review.
 * @param commitId A commit SHA for the review.
 * @param htmlUrl html_url
 * @param id Unique identifier of the review
 * @param nodeId node_id
 * @param pullRequestUrl pull_request_url
 * @param state state
 * @param submittedAt submitted_at
 * @param updatedAt updated_at
 * @param user user
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-dismissed/requestBody/properties/review")
public record GitHubWebhookPullRequestReviewDismissedReview(
        @JsonProperty("_links") GitHubWebhookPullRequestReviewEditedReviewLinks links,
        GitHubWebhookIssueAuthorAssociation authorAssociation,
        @Nullable String body,
        String commitId,
        String htmlUrl,
        long id,
        String nodeId,
        String pullRequestUrl,
        GitHubWebhookPullRequestReviewDismissedReviewState state,
        Instant submittedAt,
        @Nullable Instant updatedAt,
        @Nullable GitHubWebhookUser user) {
    public GitHubWebhookPullRequestReviewDismissedReview {
        requireNonNull(links, "links");
        requireNonNull(authorAssociation, "authorAssociation");
        requireNonNull(commitId, "commitId");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(pullRequestUrl, "pullRequestUrl");
        requireNonNull(state, "state");
        requireNonNull(submittedAt, "submittedAt");
    }
}
