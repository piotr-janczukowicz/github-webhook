package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The type assigned to the issue. This is only present for issues in repositories where issue types are supported.
 *
 * @param color The color of the issue type.
 * @param createdAt The time the issue type created.
 * @param description The description of the issue type.
 * @param id The unique identifier of the issue type.
 * @param isEnabled The enabled state of the issue type.
 * @param name The name of the issue type.
 * @param nodeId The node identifier of the issue type.
 * @param updatedAt The time the issue type last updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/type")
public record GitHubWebhookIssueType(
        @Nullable GitHubWebhookIssueTypeColor color,
        @Nullable Instant createdAt,
        @Nullable String description,
        long id,
        @Nullable Boolean isEnabled,
        String name,
        String nodeId,
        @Nullable Instant updatedAt) {
    public GitHubWebhookIssueType {
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
    }
}
