package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The deployment review approved workflow job run payload.
 *
 * @param createdAt created_at
 * @param environment environment
 * @param htmlUrl html_url
 * @param id id
 * @param status status
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-approved/requestBody/properties/workflow_job_run")
public record GitHubWebhookDeploymentReviewApprovedWorkflowJobRun(
        String createdAt, String environment, String htmlUrl, long id, String status, String updatedAt) {
    public GitHubWebhookDeploymentReviewApprovedWorkflowJobRun {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(environment, "environment");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(status, "status");
        requireNonNull(updatedAt, "updatedAt");
    }
}
