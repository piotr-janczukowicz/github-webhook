package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Represents an 'issue_body' secret scanning location type. This location type shows that a secret was detected in the
 * body of an issue.
 *
 * @param htmlUrl The GitHub URL for the issue where the secret was detected.
 * @param issueBodyUrl The API URL to get the issue where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/3")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl(
        @Nullable String htmlUrl, String issueBodyUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueBodyUrl {
        requireNonNull(issueBodyUrl, "issueBodyUrl");
    }
}
