package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review approved workflow job runs item payload.
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
@CatalogSchema("webhooks/deployment-review-approved/requestBody/properties/workflow_job_runs/items")
public record GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem(
        @Nullable String createdAt,
        @Nullable String environment,
        @Nullable String htmlUrl,
        @Nullable Long id,
        @Nullable String name,
        @Nullable String status,
        @Nullable String updatedAt) {}
