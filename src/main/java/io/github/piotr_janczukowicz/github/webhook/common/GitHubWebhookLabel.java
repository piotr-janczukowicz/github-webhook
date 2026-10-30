package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The label payload.
 *
 * @param color 6-character hex code, without the leading #, identifying the color
 * @param defaultValue default
 * @param description description
 * @param id id
 * @param name The name of the label.
 * @param nodeId node_id
 * @param url URL for the label
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/labels/items")
public record GitHubWebhookLabel(
        String color,
        @JsonProperty("default") boolean defaultValue,
        @Nullable String description,
        long id,
        String name,
        String nodeId,
        String url) {
    public GitHubWebhookLabel {
        requireNonNull(color, "color");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(url, "url");
    }
}
