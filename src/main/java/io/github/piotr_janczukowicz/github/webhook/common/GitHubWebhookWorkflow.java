package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;

/**
 * The workflow payload.
 *
 * @param badgeUrl badge_url
 * @param createdAt created_at
 * @param htmlUrl html_url
 * @param id id
 * @param name name
 * @param nodeId node_id
 * @param path path
 * @param state state
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-created/requestBody/properties/workflow")
public record GitHubWebhookWorkflow(
        String badgeUrl,
        Instant createdAt,
        String htmlUrl,
        long id,
        String name,
        String nodeId,
        String path,
        String state,
        Instant updatedAt,
        String url) {
    public GitHubWebhookWorkflow {
        requireNonNull(badgeUrl, "badgeUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(path, "path");
        requireNonNull(state, "state");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
