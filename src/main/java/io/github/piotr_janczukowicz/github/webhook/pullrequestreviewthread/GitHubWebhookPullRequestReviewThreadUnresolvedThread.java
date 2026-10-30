package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The pull request review thread unresolved thread payload.
 *
 * @param comments comments
 * @param nodeId node_id
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-review-thread-unresolved/requestBody/properties/thread")
public record GitHubWebhookPullRequestReviewThreadUnresolvedThread(
        List<GitHubWebhookPullRequestReviewThreadUnresolvedThreadComment> comments, String nodeId) {
    public GitHubWebhookPullRequestReviewThreadUnresolvedThread {
        requireNonNull(comments, "comments");
        requireNonNull(nodeId, "nodeId");
    }
}
