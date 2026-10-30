package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamParent;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 *
 * @param deleted deleted
 * @param description Description of the team
 * @param htmlUrl html_url
 * @param id Unique identifier of the team
 * @param membersUrl members_url
 * @param name Name of the team
 * @param nodeId node_id
 * @param parent parent
 * @param permission Permission that the team will have for its repositories
 * @param privacy privacy
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param url URL for the team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/pull-request-review-thread-resolved/requestBody/properties/pull_request/properties/requested_reviewers/items/oneOf/1")
public record GitHubWebhookSimplePullRequestRequestedReviewersTeam(
        @Nullable Boolean deleted,
        @Nullable String description,
        String htmlUrl,
        long id,
        String membersUrl,
        String name,
        String nodeId,
        @Nullable GitHubWebhookTeamParent parent,
        String permission,
        GitHubWebhookTeamPrivacy privacy,
        String repositoriesUrl,
        String slug,
        String url)
        implements GitHubWebhookSimplePullRequestRequestedReviewer {
    public GitHubWebhookSimplePullRequestRequestedReviewersTeam {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(membersUrl, "membersUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(permission, "permission");
        requireNonNull(privacy, "privacy");
        requireNonNull(repositoriesUrl, "repositoriesUrl");
        requireNonNull(slug, "slug");
        requireNonNull(url, "url");
    }
}
