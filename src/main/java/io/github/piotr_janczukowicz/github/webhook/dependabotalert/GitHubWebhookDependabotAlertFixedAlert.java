package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A Dependabot alert.
 *
 * @param assignees The users assigned to this alert.
 * @param autoDismissedAt The time that the alert was auto-dismissed in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param createdAt The time that the alert was created in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param dependency Details for the vulnerable dependency.
 * @param dismissalRequest Information about an active dismissal request for this Dependabot alert.
 * @param dismissedAt The time that the alert was dismissed in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param dismissedBy dismissed_by
 * @param dismissedComment An optional comment associated with the alert's dismissal.
 * @param dismissedReason The reason that the alert was dismissed.
 * @param fixedAt The time that the alert was no longer detected and was considered fixed in ISO 8601 format:
 *     {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param number The security alert number.
 * @param securityAdvisory Details for the GitHub Security Advisory.
 * @param securityVulnerability Details pertaining to one vulnerable version range for the advisory.
 * @param state The state of the Dependabot alert.
 * @param updatedAt The time that the alert was last updated in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param url The REST API URL of the alert resource.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert")
public record GitHubWebhookDependabotAlertFixedAlert(
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        @Nullable Instant autoDismissedAt,
        Instant createdAt,
        GitHubWebhookDependabotAlertFixedAlertDependency dependency,
        @Nullable GitHubWebhookDependabotAlertDismissalRequest dismissalRequest,
        @Nullable Instant dismissedAt,
        @Nullable GitHubWebhookSimpleUser dismissedBy,
        @Nullable String dismissedComment,
        @Nullable GitHubWebhookDependabotAlertFixedAlertDismissedReason dismissedReason,
        @Nullable Instant fixedAt,
        String htmlUrl,
        long number,
        GitHubWebhookDependabotAlertFixedAlertSecurityAdvisory securityAdvisory,
        GitHubWebhookDependabotAlertFixedAlertSecurityVulnerability securityVulnerability,
        GitHubWebhookDependabotAlertFixedAlertState state,
        Instant updatedAt,
        String url) {
    public GitHubWebhookDependabotAlertFixedAlert {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(dependency, "dependency");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(securityAdvisory, "securityAdvisory");
        requireNonNull(securityVulnerability, "securityVulnerability");
        requireNonNull(state, "state");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
