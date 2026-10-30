package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents a 'pull_request_comment' secret scanning location type. This location type shows that a secret was
 * detected in a comment on a pull request.
 *
 * @param htmlUrl The GitHub URL for the pull request comment where the secret was detected.
 * @param pullRequestCommentUrl The API URL to get the pull request comment where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/10")
public record GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl(
        @Nullable String htmlUrl, String pullRequestCommentUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl {
        requireNonNull(pullRequestCommentUrl, "pullRequestCommentUrl");
    }
}
