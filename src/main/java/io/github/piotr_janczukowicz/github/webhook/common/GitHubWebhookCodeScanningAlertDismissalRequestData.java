package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Code scanning alerts that have dismissal requests.
 *
 * @param data The data related to the code scanning alerts that have dismissal requests.
 * @param type The type of request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/3")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookCodeScanningAlertDismissalRequestData(
        @Nullable List<GitHubWebhookDependabotAlertDismissalRequestDataItem> data,
        @Nullable GitHubWebhookCodeScanningAlertDismissalRequestDataType type)
        implements GitHubWebhookExemptionRequestExemptionRequestData {}
