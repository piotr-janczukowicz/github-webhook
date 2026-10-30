package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectsV2StatusUpdateStatus;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 status update edited changes status payload.
 *
 * @param from from
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-status-update-edited/requestBody/properties/changes/properties/status")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookProjectsV2StatusUpdateEditedChangesStatus(
        @Nullable GitHubWebhookProjectsV2StatusUpdateStatus from,
        @Nullable GitHubWebhookProjectsV2StatusUpdateStatus to) {}
