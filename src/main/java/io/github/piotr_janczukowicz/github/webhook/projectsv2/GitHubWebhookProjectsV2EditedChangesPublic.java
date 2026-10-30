package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 edited changes public payload.
 *
 * @param from from
 * @param to to
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-edited/requestBody/properties/changes/properties/public")
public record GitHubWebhookProjectsV2EditedChangesPublic(
        @Nullable Boolean from, @Nullable Boolean to) {}
