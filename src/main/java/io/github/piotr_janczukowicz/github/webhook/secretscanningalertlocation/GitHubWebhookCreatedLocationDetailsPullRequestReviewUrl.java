package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents a 'pull_request_review' secret scanning location type. This location type shows that a secret was detected
 * in a review on a pull request.
 *
 * @param htmlUrl The GitHub URL for the pull request review where the secret was detected.
 * @param pullRequestReviewUrl The API URL to get the pull request review where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/11")
public record GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl(
        @Nullable String htmlUrl, String pullRequestReviewUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl {
        requireNonNull(pullRequestReviewUrl, "pullRequestReviewUrl");
    }
}
