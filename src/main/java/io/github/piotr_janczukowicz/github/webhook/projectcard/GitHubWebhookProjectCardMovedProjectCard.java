package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The project card moved project card payload.
 *
 * @param afterId after_id
 * @param archived archived
 * @param columnId column_id
 * @param columnUrl column_url
 * @param contentUrl content_url
 * @param createdAt created_at
 * @param creator creator
 * @param id id
 * @param nodeId node_id
 * @param note note
 * @param projectUrl project_url
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-card-moved/requestBody/properties/project_card")
public record GitHubWebhookProjectCardMovedProjectCard(
        @Nullable Long afterId,
        boolean archived,
        long columnId,
        String columnUrl,
        @Nullable String contentUrl,
        String createdAt,
        @Nullable GitHubWebhookProjectCardMovedProjectCardCreator creator,
        long id,
        String nodeId,
        @Nullable String note,
        String projectUrl,
        String updatedAt,
        String url) {
    public GitHubWebhookProjectCardMovedProjectCard {
        requireNonNull(columnUrl, "columnUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(projectUrl, "projectUrl");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
