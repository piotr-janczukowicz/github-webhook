package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning push protection exemption request metadata payload.
 *
 * @param alertTitle The title of the secret alert
 * @param label The label for the secret type
 * @param reason The reason for the exemption request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/metadata")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadata(
        @Nullable String alertTitle,
        @Nullable String label,
        @Nullable GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason reason) {}
