package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents an 'issue_comment' secret scanning location type. This location type shows that a secret was detected in a
 * comment on an issue.
 *
 * @param htmlUrl The GitHub URL for the issue comment where the secret was detected.
 * @param issueCommentUrl The API URL to get the issue comment where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/4")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl(
        @Nullable String htmlUrl, String issueCommentUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl {
        requireNonNull(issueCommentUrl, "issueCommentUrl");
    }
}
