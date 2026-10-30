package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning push protection exemption request data item location payload.
 *
 * @param branch The branch where the secret was detected
 * @param commit The commit SHA where the secret was detected
 * @param path The path of the file where the secret was detected
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/1/properties/data/items/properties/locations/items")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemLocation(
        @Nullable String branch,
        @Nullable String commit,
        @Nullable String path) {}
