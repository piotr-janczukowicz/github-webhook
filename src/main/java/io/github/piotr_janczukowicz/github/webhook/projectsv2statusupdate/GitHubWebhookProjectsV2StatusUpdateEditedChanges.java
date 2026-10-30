package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 status update edited changes payload.
 *
 * @param body body
 * @param startDate start_date
 * @param status status
 * @param targetDate target_date
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-status-update-edited/requestBody/properties/changes")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookProjectsV2StatusUpdateEditedChanges(
        @Nullable GitHubWebhookMemberEditedChangesPermission body,
        @Nullable GitHubWebhookMemberEditedChangesPermission startDate,
        @Nullable GitHubWebhookProjectsV2StatusUpdateEditedChangesStatus status,
        @Nullable GitHubWebhookMemberEditedChangesPermission targetDate) {}
