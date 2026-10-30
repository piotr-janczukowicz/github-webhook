package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Identifiers of the advisory that produced the withdrawn alert.
 *
 * @param cveId The CVE identifier assigned to the advisory, if any.
 * @param ghsaId The unique GitHub identifier assigned to the advisory.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-withdrawn/requestBody/properties/alert/properties/security_advisory")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisory(
        @Nullable String cveId, String ghsaId) {
    public GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisory {
        requireNonNull(ghsaId, "ghsaId");
    }
}
