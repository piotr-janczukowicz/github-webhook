package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The team parent payload.
 *
 * @param description Description of the team
 * @param htmlUrl html_url
 * @param id Unique identifier of the team
 * @param membersUrl members_url
 * @param name Name of the team
 * @param nodeId node_id
 * @param permission Permission that the team will have for its repositories
 * @param privacy privacy
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param url URL for the team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/pull-request-assigned/requestBody/properties/pull_request/properties/requested_reviewers/items/oneOf/1/properties/parent")
public record GitHubWebhookTeamParent(
        @Nullable String description,
        String htmlUrl,
        long id,
        String membersUrl,
        String name,
        String nodeId,
        String permission,
        GitHubWebhookTeamPrivacy privacy,
        String repositoriesUrl,
        String slug,
        String url) {
    public GitHubWebhookTeamParent {
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
