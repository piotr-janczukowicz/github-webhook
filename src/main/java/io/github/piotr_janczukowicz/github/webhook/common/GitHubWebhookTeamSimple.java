package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 *
 * @param description Description of the team
 * @param enterpriseId Unique identifier of the enterprise to which this team belongs
 * @param htmlUrl html_url
 * @param id Unique identifier of the team
 * @param ldapDn Distinguished Name (DN) that team maps to within LDAP environment
 * @param membersUrl members_url
 * @param name Name of the team
 * @param nodeId node_id
 * @param notificationSetting The notification setting the team has set
 * @param organizationId Unique identifier of the organization to which this team belongs
 * @param permission Permission that the team will have for its repositories
 * @param privacy The level of privacy this team should have
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param type The ownership type of the team
 * @param url URL for the team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/requested_teams/items")
public record GitHubWebhookTeamSimple(
        @Nullable String description,
        @Nullable Long enterpriseId,
        String htmlUrl,
        long id,
        @Nullable String ldapDn,
        String membersUrl,
        String name,
        String nodeId,
        @Nullable String notificationSetting,
        @Nullable Long organizationId,
        String permission,
        @Nullable String privacy,
        String repositoriesUrl,
        String slug,
        GitHubWebhookTeamType type,
        String url) {
    public GitHubWebhookTeamSimple {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(membersUrl, "membersUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(permission, "permission");
        requireNonNull(repositoriesUrl, "repositoriesUrl");
        requireNonNull(slug, "slug");
        requireNonNull(type, "type");
        requireNonNull(url, "url");
    }
}
