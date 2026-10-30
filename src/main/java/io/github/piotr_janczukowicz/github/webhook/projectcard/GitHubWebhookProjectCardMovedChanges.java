package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The project card moved changes payload.
 *
 * @param columnId column_id
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-card-moved/requestBody/properties/changes")
public record GitHubWebhookProjectCardMovedChanges(GitHubWebhookProjectCardMovedChangesColumnId columnId) {
    public GitHubWebhookProjectCardMovedChanges {
        requireNonNull(columnId, "columnId");
    }
}
