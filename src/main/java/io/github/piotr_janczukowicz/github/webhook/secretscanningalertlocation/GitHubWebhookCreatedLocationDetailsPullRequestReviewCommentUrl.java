package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents a 'pull_request_review_comment' secret scanning location type. This location type shows that a secret was
 * detected in a review comment on a pull request.
 *
 * @param htmlUrl The GitHub URL for the pull request review comment where the secret was detected.
 * @param pullRequestReviewCommentUrl The API URL to get the pull request review comment where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/12")
public record GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrl(
        @Nullable String htmlUrl, String pullRequestReviewCommentUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookCreatedLocationDetailsPullRequestReviewCommentUrl {
        requireNonNull(pullRequestReviewCommentUrl, "pullRequestReviewCommentUrl");
    }
}
