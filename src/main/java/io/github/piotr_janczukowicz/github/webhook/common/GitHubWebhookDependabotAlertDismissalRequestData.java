package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Dependabot alerts that have dismissal requests.
 *
 * @param data The data related to the Dependabot alerts that have dismissal requests.
 * @param type The type of request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/4")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookDependabotAlertDismissalRequestData(
        @Nullable List<GitHubWebhookDependabotAlertDismissalRequestDataItem> data,
        @Nullable GitHubWebhookDependabotAlertDismissalRequestDataType type)
        implements GitHubWebhookExemptionRequestExemptionRequestData {}
