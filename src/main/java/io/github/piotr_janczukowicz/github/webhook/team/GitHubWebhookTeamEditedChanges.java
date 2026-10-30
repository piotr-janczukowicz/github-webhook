package io.github.piotr_janczukowicz.github.webhook.team;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the team if the action was {@code edited}.
 *
 * @param description description
 * @param name name
 * @param notificationSetting notification_setting
 * @param privacy privacy
 * @param repository repository
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/team-edited/requestBody/properties/changes")
public record GitHubWebhookTeamEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody description,
        @Nullable GitHubWebhookIssuesEditedChangesBody name,
        @Nullable GitHubWebhookIssuesEditedChangesBody notificationSetting,
        @Nullable GitHubWebhookIssuesEditedChangesBody privacy,
        @Nullable GitHubWebhookTeamEditedChangesRepository repository) {}
