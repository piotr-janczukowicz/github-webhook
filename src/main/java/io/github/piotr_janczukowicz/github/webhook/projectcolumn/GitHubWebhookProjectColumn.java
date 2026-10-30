package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The project column payload.
 *
 * @param afterId after_id
 * @param cardsUrl cards_url
 * @param createdAt created_at
 * @param id The unique identifier of the project column
 * @param name Name of the project column
 * @param nodeId node_id
 * @param projectUrl project_url
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-column-created/requestBody/properties/project_column")
public record GitHubWebhookProjectColumn(
        @Nullable Long afterId,
        String cardsUrl,
        Instant createdAt,
        long id,
        String name,
        String nodeId,
        String projectUrl,
        Instant updatedAt,
        String url) {
    public GitHubWebhookProjectColumn {
        requireNonNull(cardsUrl, "cardsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(projectUrl, "projectUrl");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
