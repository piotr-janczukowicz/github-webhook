package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * An item belonging to a project
 *
 * @param archivedAt The time when the item was archived.
 * @param contentNodeId The node ID of the content represented by this item.
 * @param contentType The type of content tracked in a project item
 * @param createdAt The time when the item was created.
 * @param creator A GitHub user.
 * @param id The unique identifier of the project item.
 * @param nodeId The node ID of the project item.
 * @param projectNodeId The node ID of the project that contains this item.
 * @param updatedAt The time when the item was last updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-archived/requestBody/properties/projects_v2_item")
public record GitHubWebhookProjectsV2Item(
        @Nullable Instant archivedAt,
        String contentNodeId,
        GitHubWebhookProjectsV2ItemContentType contentType,
        Instant createdAt,
        @Nullable GitHubWebhookSimpleUser creator,
        double id,
        @Nullable String nodeId,
        @Nullable String projectNodeId,
        Instant updatedAt) {
    public GitHubWebhookProjectsV2Item {
        requireNonNull(contentNodeId, "contentNodeId");
        requireNonNull(contentType, "contentType");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(updatedAt, "updatedAt");
    }
}
