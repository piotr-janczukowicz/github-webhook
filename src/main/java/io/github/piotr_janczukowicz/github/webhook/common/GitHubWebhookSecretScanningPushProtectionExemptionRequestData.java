package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Secret scanning push protections that are being requested to be bypassed.
 *
 * @param data The data pertaining to the secret scanning push protections that are being requested to be bypassed.
 * @param type The type of request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/1")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookSecretScanningPushProtectionExemptionRequestData(
        @Nullable List<GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItem> data,
        @Nullable GitHubWebhookSecretScanningPushProtectionExemptionRequestDataType type)
        implements GitHubWebhookExemptionRequestExemptionRequestData {}
