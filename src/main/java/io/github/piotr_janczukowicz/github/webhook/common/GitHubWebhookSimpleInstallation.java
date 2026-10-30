package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The GitHub App installation. Webhook payloads contain the {@code installation} property when the event is configured
 * for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 * Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 *
 * @param id The ID of the installation.
 * @param nodeId The global node ID of the installation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-configuration-disabled/requestBody/properties/installation")
public record GitHubWebhookSimpleInstallation(long id, String nodeId) {
    public GitHubWebhookSimpleInstallation {
        requireNonNull(nodeId, "nodeId");
    }
}
