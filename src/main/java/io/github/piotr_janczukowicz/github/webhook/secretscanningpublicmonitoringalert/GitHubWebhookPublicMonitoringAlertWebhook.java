package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookPublicMonitoringAlertWebhookValidity;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * A public monitoring alert as delivered via webhook.
 *
 * @param attribution Attribution information for the alert.
 * @param createdAt The time that the secret was detected in ISO 8601 format.
 * @param gist gist
 * @param number The enterprise-scoped number of the public monitoring alert.
 * @param repository repository
 * @param secretType The type of secret that secret scanning detected.
 * @param secretTypeDisplayName User-friendly name for the detected secret, matching the {@code secret_type}. For a list
 *     of built-in patterns, see "[Supported secret scanning
 *     patterns](https://docs.github.com/enterprise-cloud@latest/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets)."
 * @param url The REST API URL of the alert resource.
 * @param validity The validity status of the secret as of the latest validity check for the enterprise alert.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookPublicMonitoringAlertWebhook(
        GitHubWebhookPublicMonitoringAlertWebhookAttribution attribution,
        Instant createdAt,
        @Nullable GitHubWebhookBaseGist gist,
        long number,
        @Nullable GitHubWebhookPublicMonitoringAlertWebhookRepository repository,
        String secretType,
        String secretTypeDisplayName,
        String url,
        GitHubWebhookPublicMonitoringAlertWebhookValidity validity) {
    public GitHubWebhookPublicMonitoringAlertWebhook {
        requireNonNull(attribution, "attribution");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(secretType, "secretType");
        requireNonNull(secretTypeDisplayName, "secretTypeDisplayName");
        requireNonNull(url, "url");
        requireNonNull(validity, "validity");
    }
}
