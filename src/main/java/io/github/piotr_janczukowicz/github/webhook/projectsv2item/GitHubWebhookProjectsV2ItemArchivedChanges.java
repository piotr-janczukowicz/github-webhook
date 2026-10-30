package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item archived changes payload.
 *
 * @param archivedAt archived_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-archived/requestBody/properties/changes")
public record GitHubWebhookProjectsV2ItemArchivedChanges(
        @Nullable GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt archivedAt) {}
