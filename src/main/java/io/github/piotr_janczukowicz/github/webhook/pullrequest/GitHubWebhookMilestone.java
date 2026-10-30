package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * A collection of related issues and pull requests.
 *
 * @param closedAt closed_at
 * @param closedIssues closed_issues
 * @param createdAt created_at
 * @param creator creator
 * @param description description
 * @param dueOn due_on
 * @param htmlUrl html_url
 * @param id id
 * @param labelsUrl labels_url
 * @param nodeId node_id
 * @param number The number of the milestone.
 * @param openIssues open_issues
 * @param state The state of the milestone.
 * @param title The title of the milestone.
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/pull-request-assigned/requestBody/properties/pull_request/properties/milestone")
public record GitHubWebhookMilestone(
        @Nullable Instant closedAt,
        long closedIssues,
        Instant createdAt,
        @Nullable GitHubWebhookMilestoneCreator creator,
        @Nullable String description,
        @Nullable Instant dueOn,
        String htmlUrl,
        long id,
        String labelsUrl,
        String nodeId,
        long number,
        long openIssues,
        GitHubWebhookMilestoneState state,
        String title,
        Instant updatedAt,
        String url) {
    public GitHubWebhookMilestone {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(labelsUrl, "labelsUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(state, "state");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
