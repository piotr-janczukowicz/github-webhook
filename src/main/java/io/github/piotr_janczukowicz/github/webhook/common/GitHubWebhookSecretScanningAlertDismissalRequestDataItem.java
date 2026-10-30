package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning alert dismissal request data item payload.
 *
 * @param alertNumber The number of the alert that was detected
 * @param reason The reason for the dismissal request
 * @param secretType The type of secret that was detected
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/2/properties/data/items")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookSecretScanningAlertDismissalRequestDataItem(
        @Nullable String alertNumber,
        @Nullable GitHubWebhookSecretScanningAlertDismissalRequestDataItemReason reason,
        @Nullable String secretType) {}
