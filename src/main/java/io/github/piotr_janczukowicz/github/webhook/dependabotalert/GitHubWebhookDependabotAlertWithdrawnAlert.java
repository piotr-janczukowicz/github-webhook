package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;

/**
 * Identifiers for a withdrawn Dependabot alert, captured before deletion so that consumers can reconcile external
 * records. This is not a full alert representation.
 *
 * @param createdAt The time that the alert was created in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param dependency Details for the vulnerable dependency.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param id The unique identifier of the withdrawn alert.
 * @param nodeId The GraphQL node ID of the withdrawn alert.
 * @param number The security alert number.
 * @param securityAdvisory Identifiers of the advisory that produced the withdrawn alert.
 * @param state The state of the Dependabot alert.
 * @param url The REST API URL of the alert resource.
 * @param withdrawnAt The time that the alert was withdrawn in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}. This is
 *     not the advisory's withdrawal time.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-withdrawn/requestBody/properties/alert")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookDependabotAlertWithdrawnAlert(
        Instant createdAt,
        GitHubWebhookDependabotAlertWithdrawnAlertDependency dependency,
        String htmlUrl,
        long id,
        String nodeId,
        long number,
        GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisory securityAdvisory,
        GitHubWebhookDependabotAlertWithdrawnAlertState state,
        String url,
        Instant withdrawnAt) {
    public GitHubWebhookDependabotAlertWithdrawnAlert {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(dependency, "dependency");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(securityAdvisory, "securityAdvisory");
        requireNonNull(state, "state");
        requireNonNull(url, "url");
        requireNonNull(withdrawnAt, "withdrawnAt");
    }
}
