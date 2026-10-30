package io.github.piotr_janczukowicz.github.webhook.team;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamNotificationSetting;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The team parent payload.
 *
 * @param description Description of the team
 * @param enterpriseId Unique identifier of the enterprise to which this team belongs
 * @param htmlUrl html_url
 * @param id Unique identifier of the team
 * @param membersUrl members_url
 * @param name Name of the team
 * @param nodeId node_id
 * @param notificationSetting Whether team members will receive notifications when their team is @mentioned
 * @param organizationId Unique identifier of the organization to which this team belongs
 * @param permission Permission that the team will have for its repositories
 * @param privacy privacy
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param type The ownership type of the team
 * @param url URL for the team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/team-added-to-repository/requestBody/properties/team/properties/parent")
public record GitHubWebhookTeamParent(
        @Nullable String description,
        @Nullable Long enterpriseId,
        String htmlUrl,
        long id,
        String membersUrl,
        String name,
        String nodeId,
        GitHubWebhookTeamNotificationSetting notificationSetting,
        @Nullable Long organizationId,
        String permission,
        GitHubWebhookTeamPrivacy privacy,
        String repositoriesUrl,
        String slug,
        GitHubWebhookTeamType type,
        String url) {
    public GitHubWebhookTeamParent {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(membersUrl, "membersUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(notificationSetting, "notificationSetting");
        requireNonNull(permission, "permission");
        requireNonNull(privacy, "privacy");
        requireNonNull(repositoriesUrl, "repositoriesUrl");
        requireNonNull(slug, "slug");
        requireNonNull(type, "type");
        requireNonNull(url, "url");
    }
}
