package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The discussion category payload.
 *
 * @param createdAt created_at
 * @param description description
 * @param emoji emoji
 * @param id id
 * @param isAnswerable is_answerable
 * @param name name
 * @param nodeId node_id
 * @param repositoryId repository_id
 * @param slug slug
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-answered/requestBody/properties/discussion/properties/category")
public record GitHubWebhookDiscussionCategory(
        Instant createdAt,
        String description,
        String emoji,
        long id,
        boolean isAnswerable,
        String name,
        @Nullable String nodeId,
        long repositoryId,
        String slug,
        String updatedAt) {
    public GitHubWebhookDiscussionCategory {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(description, "description");
        requireNonNull(emoji, "emoji");
        requireNonNull(name, "name");
        requireNonNull(slug, "slug");
        requireNonNull(updatedAt, "updatedAt");
    }
}
