package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item archived changes archived at payload.
 *
 * @param from from
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-archived/requestBody/properties/changes/properties/archived_at")
public record GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt(
        @Nullable Instant from, @Nullable Instant to) {}
