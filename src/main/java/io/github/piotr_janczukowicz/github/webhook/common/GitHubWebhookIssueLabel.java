package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issue label payload.
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
        "webhooks/issue-dependencies-blocked-by-added/requestBody/properties/blocked_issue/properties/labels/items/oneOf/1")
public record GitHubWebhookIssueLabel(
        @Nullable GitHubWebhookSimpleUser archivedBy,
        @Nullable String color,
        @Nullable @JsonProperty("default") Boolean defaultValue,
        @Nullable String description,
        @Nullable Long id,
        @Nullable String name,
        @Nullable String nodeId,
        @Nullable String url) {
    /**
     * Reads a bare string, which GitHub sends in place of the object, as the object with only its name.
     *
     * @param text the name
     * @return the object
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static GitHubWebhookIssueLabel ofText(final String text) {
        requireNonNull(text, "text");
        return GitHubWebhookIssueLabelBuilder.builder().name(text).build();
    }
}
