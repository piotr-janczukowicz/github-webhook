package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The secret scanning alert created alert metadata payload.
 *
 * @param key The metadata key.
 * @param value The metadata value.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-alert-assigned/requestBody/properties/alert/properties/metadata/items")
public record GitHubWebhookSecretScanningAlertCreatedAlertMetadata(String key, String value) {
    public GitHubWebhookSecretScanningAlertCreatedAlertMetadata {
        requireNonNull(key, "key");
        requireNonNull(value, "value");
    }
}
