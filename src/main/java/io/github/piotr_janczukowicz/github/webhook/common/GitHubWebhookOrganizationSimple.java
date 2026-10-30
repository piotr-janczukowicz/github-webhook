package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * A GitHub organization. Webhook payloads contain the {@code organization} property when the webhook is configured for
 * an organization, or when the event occurs from activity in a repository owned by an organization.
 *
 * @param avatarUrl avatar_url
 * @param description description
 * @param eventsUrl events_url
 * @param hooksUrl hooks_url
 * @param id id
 * @param issuesUrl issues_url
 * @param login login
 * @param membersUrl members_url
 * @param nodeId node_id
 * @param publicMembersUrl public_members_url
 * @param reposUrl repos_url
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-configuration-disabled/requestBody/properties/organization")
public record GitHubWebhookOrganizationSimple(
        String avatarUrl,
        @Nullable String description,
        String eventsUrl,
        String hooksUrl,
        long id,
        String issuesUrl,
        String login,
        String membersUrl,
        String nodeId,
        String publicMembersUrl,
        String reposUrl,
        String url) {
    public GitHubWebhookOrganizationSimple {
        requireNonNull(avatarUrl, "avatarUrl");
        requireNonNull(eventsUrl, "eventsUrl");
        requireNonNull(hooksUrl, "hooksUrl");
        requireNonNull(issuesUrl, "issuesUrl");
        requireNonNull(login, "login");
        requireNonNull(membersUrl, "membersUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(publicMembersUrl, "publicMembersUrl");
        requireNonNull(reposUrl, "reposUrl");
        requireNonNull(url, "url");
    }
}
