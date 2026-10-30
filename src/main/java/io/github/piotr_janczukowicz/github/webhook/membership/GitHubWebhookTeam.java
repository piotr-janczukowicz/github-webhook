package io.github.piotr_janczukowicz.github.webhook.membership;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamNotificationSetting;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamPrivacy;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookTeamType;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Groups of organization members that gives permissions on specified repositories.
 *
 * @param deleted deleted
 * @param description Description of the team
 * @param enterpriseId Unique identifier of the enterprise to which this team belongs
 * @param htmlUrl html_url
 * @param id Unique identifier of the team
 * @param membersUrl members_url
 * @param name Name of the team
 * @param nodeId node_id
 * @param notificationSetting notification_setting
 * @param organizationId Unique identifier of the organization to which this team belongs
 * @param parent parent
 * @param permission Permission that the team will have for its repositories
 * @param privacy privacy
 * @param repositoriesUrl repositories_url
 * @param slug slug
 * @param type The ownership type of the team
 * @param url URL for the team
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/membership-added/requestBody/properties/team")
public record GitHubWebhookTeam(
        @Nullable Boolean deleted,
        @Nullable String description,
        @Nullable Long enterpriseId,
        @Nullable String htmlUrl,
        long id,
        @Nullable String membersUrl,
        String name,
        @Nullable String nodeId,
        @Nullable GitHubWebhookTeamNotificationSetting notificationSetting,
        @Nullable Long organizationId,
        @Nullable GitHubWebhookTeamParent parent,
        @Nullable String permission,
        @Nullable GitHubWebhookTeamPrivacy privacy,
        @Nullable String repositoriesUrl,
        @Nullable String slug,
        @Nullable GitHubWebhookTeamType type,
        @Nullable String url) {
    public GitHubWebhookTeam {
        requireNonNull(name, "name");
    }
}
