package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMilestoneState;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectsV2StatusUpdate;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * A projects v2 project
 *
 * @param closedAt The time when the project was closed.
 * @param createdAt The time when the project was created.
 * @param creator A GitHub user.
 * @param deletedAt The time when the project was deleted.
 * @param deletedBy deleted_by
 * @param description A short description of the project.
 * @param id The unique identifier of the project.
 * @param isTemplate Whether this project is a template
 * @param latestStatusUpdate latest_status_update
 * @param nodeId The node ID of the project.
 * @param number The project number.
 * @param owner A GitHub user.
 * @param publicValue Whether the project is visible to anyone with access to the owner.
 * @param shortDescription A concise summary of the project.
 * @param state The current state of the project.
 * @param title The project title.
 * @param updatedAt The time when the project was last updated.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-closed/requestBody/properties/projects_v2")
public record GitHubWebhookProjectsV2Project(
        @Nullable Instant closedAt,
        Instant createdAt,
        GitHubWebhookSimpleUser creator,
        @Nullable Instant deletedAt,
        @Nullable GitHubWebhookSimpleUser deletedBy,
        @Nullable String description,
        double id,
        @Nullable Boolean isTemplate,
        @Nullable GitHubWebhookProjectsV2StatusUpdate latestStatusUpdate,
        String nodeId,
        long number,
        GitHubWebhookSimpleUser owner,
        @JsonProperty("public") boolean publicValue,
        @Nullable String shortDescription,
        @Nullable GitHubWebhookMilestoneState state,
        String title,
        Instant updatedAt) {
    public GitHubWebhookProjectsV2Project {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(creator, "creator");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(owner, "owner");
        requireNonNull(title, "title");
        requireNonNull(updatedAt, "updatedAt");
    }
}
