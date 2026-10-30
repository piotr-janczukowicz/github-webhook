package io.github.piotr_janczukowicz.github.webhook.label;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The archived label payload.
 *
 * @param archivedAt Timestamp indicating when the label was archived.
 * @param archivedBy The user who archived the label.
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
@CatalogSchema("webhooks/label-archived/requestBody/properties/label")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookArchivedLabel(
        Instant archivedAt,
        GitHubWebhookSimpleUser archivedBy,
        String color,
        @JsonProperty("default") boolean defaultValue,
        @Nullable String description,
        long id,
        String name,
        String nodeId,
        String url) {
    public GitHubWebhookArchivedLabel {
        requireNonNull(archivedAt, "archivedAt");
        requireNonNull(archivedBy, "archivedBy");
        requireNonNull(color, "color");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(url, "url");
    }
}
