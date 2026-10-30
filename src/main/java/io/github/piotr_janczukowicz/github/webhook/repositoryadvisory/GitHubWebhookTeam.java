package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 *
 * @param accessSource How the team's access to the repository was granted. This property is only present when the team
 *     is returned in a repository context, such as GET /repos/{owner}/{repo}/teams.
 * @param description description
 * @param enterpriseId Unique identifier of the enterprise to which this team belongs
 * @param htmlUrl html_url
 * @param id id
 * @param membersUrl members_url
 * @param name name
 * @param nodeId node_id
 * @param notificationSetting notification_setting
 * @param organizationId Unique identifier of the organization to which this team belongs
 * @param parent parent
 * @param permission permission
 * @param permissions permissions
 * @param privacy privacy
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param type The ownership type of the team
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/collaborating_teams/items")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookTeam(
        @Nullable GitHubWebhookTeamAccessSource accessSource,
        @Nullable String description,
        @Nullable Long enterpriseId,
        String htmlUrl,
        long id,
        String membersUrl,
        String name,
        String nodeId,
        @Nullable String notificationSetting,
        @Nullable Long organizationId,
        @Nullable GitHubWebhookTeamSimple parent,
        String permission,
        @Nullable GitHubWebhookTeamPermissions permissions,
        @Nullable String privacy,
        String repositoriesUrl,
        String slug,
        GitHubWebhookTeamType type,
        String url) {
    public GitHubWebhookTeam {
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
