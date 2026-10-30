package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The project card deleted project card payload.
 *
 * @param afterId after_id
 * @param archived Whether or not the card is archived
 * @param columnId column_id
 * @param columnUrl column_url
 * @param contentUrl content_url
 * @param createdAt created_at
 * @param creator creator
 * @param id The project card's ID
 * @param nodeId node_id
 * @param note note
 * @param projectUrl project_url
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-card-deleted/requestBody/properties/project_card")
public record GitHubWebhookProjectCardDeletedProjectCard(
        @Nullable Long afterId,
        boolean archived,
        @Nullable Long columnId,
        String columnUrl,
        @Nullable String contentUrl,
        Instant createdAt,
        @Nullable GitHubWebhookProjectCardMovedProjectCardCreator creator,
        long id,
        String nodeId,
        @Nullable String note,
        String projectUrl,
        Instant updatedAt,
        String url) {
    public GitHubWebhookProjectCardDeletedProjectCard {
        requireNonNull(columnUrl, "columnUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(projectUrl, "projectUrl");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
