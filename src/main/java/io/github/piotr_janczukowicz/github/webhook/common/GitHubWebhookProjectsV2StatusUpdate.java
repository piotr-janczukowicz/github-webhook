package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * An status update belonging to a project
 *
 * @param body Body of the status update
 * @param createdAt The time when the status update was created.
 * @param creator A GitHub user.
 * @param id The unique identifier of the status update.
 * @param nodeId The node ID of the status update.
 * @param projectNodeId The node ID of the project that this status update belongs to.
 * @param startDate The start date of the period covered by the update.
 * @param status The current status.
 * @param targetDate The target date associated with the update.
 * @param updatedAt The time when the status update was last updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-closed/requestBody/properties/projects_v2/properties/latest_status_update")
public record GitHubWebhookProjectsV2StatusUpdate(
        @Nullable String body,
        Instant createdAt,
        @Nullable GitHubWebhookSimpleUser creator,
        double id,
        String nodeId,
        @Nullable String projectNodeId,
        @Nullable String startDate,
        @Nullable GitHubWebhookProjectsV2StatusUpdateStatus status,
        @Nullable String targetDate,
        Instant updatedAt) {
    public GitHubWebhookProjectsV2StatusUpdate {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(updatedAt, "updatedAt");
    }
}
