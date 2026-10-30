package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Color-coded labels help you categorize and filter your issues (just like labels in Gmail).
 *
 * @param archivedAt Timestamp indicating when the label was archived, or {@code null} if it has not been archived.
 * @param archivedBy The user who archived the label, or {@code null} if it has not been archived.
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
@CatalogSchema("webhooks/discussion-answered/requestBody/properties/discussion/properties/labels/items")
public record GitHubWebhookIssuesEditedLabel(
        @Nullable Instant archivedAt,
        @Nullable GitHubWebhookSimpleUser archivedBy,
        String color,
        @JsonProperty("default") boolean defaultValue,
        @Nullable String description,
        long id,
        String name,
        String nodeId,
        String url) {
    public GitHubWebhookIssuesEditedLabel {
        requireNonNull(color, "color");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(url, "url");
    }
}
