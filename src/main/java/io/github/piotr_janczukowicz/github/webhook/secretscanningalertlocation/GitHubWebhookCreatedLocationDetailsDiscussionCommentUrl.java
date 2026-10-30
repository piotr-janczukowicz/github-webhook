package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * Represents a 'discussion_comment' secret scanning location type. This location type shows that a secret was detected
 * in a comment on a discussion.
 *
 * @param discussionCommentUrl The API URL to get the discussion comment where the secret was detected.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/secret-scanning-alert-location-created/requestBody/properties/location/properties/details/oneOf/7")
public record GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl(String discussionCommentUrl)
        implements GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails {
    public GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl {
        requireNonNull(discussionCommentUrl, "discussionCommentUrl");
    }
}
