package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Represents a 'discussion_title' secret scanning location type. This location type shows that a secret was detected in
 * the title of a discussion.
 *
 * @param discussionTitleUrl The URL to the discussion where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/5")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl(
        String discussionTitleUrl) implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl {
        requireNonNull(discussionTitleUrl, "discussionTitleUrl");
    }
}
