package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The deployment review requested reviewer payload.
 *
 * @param reviewer reviewer
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-review-requested/requestBody/properties/reviewers/items")
public record GitHubWebhookDeploymentReviewRequestedReviewer(
        @Nullable GitHubWebhookDeploymentReviewRequestedReviewerValue reviewer,
        @Nullable GitHubWebhookDeploymentReviewRequestedReviewerType type) {}
