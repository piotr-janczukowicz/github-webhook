package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Information about an active dismissal request for this Dependabot alert.
 *
 * @param createdAt The date and time when the dismissal request was created.
 * @param id The unique identifier of the dismissal request.
 * @param requester The user who requested the dismissal.
 * @param status The current status of the dismissal request.
 * @param url The API URL to get more information about this dismissal request.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dismissal_request")
public record GitHubWebhookDependabotAlertDismissalRequest(
        @Nullable Instant createdAt,
        @Nullable Long id,
        @Nullable GitHubWebhookDependabotAlertDismissalRequestRequester requester,
        @Nullable GitHubWebhookDependabotAlertDismissalRequestStatus status,
        @Nullable String url) {}
