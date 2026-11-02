package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The reachability result for the vulnerability that triggered the alert, indicating whether a vulnerable function is
 * reachable from the repository's own code.
 *
 * @param reason The reason for the reachability verdict. This field is omitted when reachability analysis is disabled
 *     or no result has been computed.
 * @param verdict The reachability verdict for the alert. - {@code reachable}: a path from the repository's code reaches
 *     a vulnerable function. - {@code unreachable}: no path from the repository's code reaches a vulnerable function. -
 *     {@code potentially_reachable}: reachability could not be determined with confidence; review manually. -
 *     {@code unavailable}: no verdict has been computed for the alert yet. - {@code disabled}: reachability analysis is
 *     not enabled for the repository.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/reachability")
public record GitHubWebhookDependabotAlertFixedAlertReachability(
        @Nullable GitHubWebhookDependabotAlertFixedAlertReachabilityReason reason,
        GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict verdict) {
    public GitHubWebhookDependabotAlertFixedAlertReachability {
        requireNonNull(verdict, "verdict");
    }
}
