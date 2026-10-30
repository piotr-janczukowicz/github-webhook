package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review approved reviewer payload.
 *
 * @param reviewer reviewer
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-approved/requestBody/properties/reviewers/items")
public record GitHubWebhookDeploymentReviewApprovedReviewer(
        @Nullable GitHubWebhookDeploymentReviewApprovedReviewerValue reviewer,
        @Nullable GitHubWebhookDeploymentReviewApprovedReviewerType type) {}
