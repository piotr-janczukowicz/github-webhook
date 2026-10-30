package io.github.piotr_janczukowicz.github.webhook.project;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The project payload.
 *
 * @param body Body of the project
 * @param columnsUrl columns_url
 * @param createdAt created_at
 * @param creator creator
 * @param htmlUrl html_url
 * @param id id
 * @param name Name of the project
 * @param nodeId node_id
 * @param number number
 * @param ownerUrl owner_url
 * @param state State of the project; either 'open' or 'closed'
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-closed/requestBody/properties/project")
public record GitHubWebhookProject(
        @Nullable String body,
        String columnsUrl,
        Instant createdAt,
        @Nullable GitHubWebhookUser creator,
        String htmlUrl,
        long id,
        String name,
        String nodeId,
        long number,
        String ownerUrl,
        GitHubWebhookMilestoneState state,
        Instant updatedAt,
        String url) {
    public GitHubWebhookProject {
        requireNonNull(columnsUrl, "columnsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(ownerUrl, "ownerUrl");
        requireNonNull(state, "state");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
