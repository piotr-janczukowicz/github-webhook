package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The pull request label payload.
 *
 * @param archivedBy The user who archived the label, or {@code null} if it has not been archived.
 * @param color color
 * @param defaultValue default
 * @param description description
 * @param id id
 * @param name name
 * @param nodeId node_id
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/deployment-protection-rule-requested/requestBody/properties/pull_requests/items/properties/labels/items")
public record GitHubWebhookPullRequestLabel(
        @Nullable GitHubWebhookSimpleUser archivedBy,
        String color,
        @JsonProperty("default") boolean defaultValue,
        @Nullable String description,
        long id,
        String name,
        String nodeId,
        String url) {
    public GitHubWebhookPullRequestLabel {
        requireNonNull(color, "color");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(url, "url");
    }
}
