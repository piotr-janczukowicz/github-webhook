package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review requested workflow job run payload.
 *
 * @param createdAt created_at
 * @param environment environment
 * @param htmlUrl html_url
 * @param id id
 * @param name name
 * @param status status
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-requested/requestBody/properties/workflow_job_run")
public record GitHubWebhookDeploymentReviewRequestedWorkflowJobRun(
        @SuppressSchemaTypeMismatch("type rule: date-time (created_at)")
        Instant createdAt,

        String environment,
        String htmlUrl,
        long id,
        @Nullable String name,
        String status,

        @SuppressSchemaTypeMismatch("type rule: date-time (updated_at)")
        Instant updatedAt) {
    public GitHubWebhookDeploymentReviewRequestedWorkflowJobRun {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(environment, "environment");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(status, "status");
        requireNonNull(updatedAt, "updatedAt");
    }
}
