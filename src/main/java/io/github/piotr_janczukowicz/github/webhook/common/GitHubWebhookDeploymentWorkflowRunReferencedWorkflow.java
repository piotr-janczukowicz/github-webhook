package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment workflow run referenced workflow payload.
 *
 * @param path path
 * @param ref ref
 * @param sha sha
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-created/requestBody/properties/workflow_run/properties/referenced_workflows/items")
public record GitHubWebhookDeploymentWorkflowRunReferencedWorkflow(
        String path, @Nullable String ref, String sha) {
    public GitHubWebhookDeploymentWorkflowRunReferencedWorkflow {
        requireNonNull(path, "path");
        requireNonNull(sha, "sha");
    }
}
