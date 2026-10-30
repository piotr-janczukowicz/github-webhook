package io.github.piotr_janczukowicz.github.webhook.projectcard;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The project card moved changes column id payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-card-moved/requestBody/properties/changes/properties/column_id")
public record GitHubWebhookProjectCardMovedChangesColumnId(long from) {}
