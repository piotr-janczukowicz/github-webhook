package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * License compliance alerts that have closure requests.
 *
 * @param data The data related to the License compliance alerts that have closure requests.
 * @param type The type of request
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/5")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookLicenseComplianceAlertClosureRequestData(
        @Nullable List<GitHubWebhookDependabotAlertDismissalRequestDataItem> data,
        @Nullable GitHubWebhookLicenseComplianceAlertClosureRequestDataType type)
        implements GitHubWebhookExemptionRequestExemptionRequestData {}
