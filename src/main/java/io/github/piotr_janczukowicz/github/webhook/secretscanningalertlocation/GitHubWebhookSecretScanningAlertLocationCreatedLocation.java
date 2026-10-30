package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning alert location created location payload.
 *
 * @param details details
 * @param type The location type. Because secrets may be found in different types of resources (ie. code, comments,
 *     issues, pull requests, discussions), this field identifies the type of resource where the secret was found.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-alert-location-created/requestBody/properties/location")
public record GitHubWebhookSecretScanningAlertLocationCreatedLocation(
        @Nullable GitHubWebhookSecretScanningAlertLocationCreatedLocationDetails details,
        @Nullable GitHubWebhookSecretScanningAlertLocationCreatedLocationType type) {}
