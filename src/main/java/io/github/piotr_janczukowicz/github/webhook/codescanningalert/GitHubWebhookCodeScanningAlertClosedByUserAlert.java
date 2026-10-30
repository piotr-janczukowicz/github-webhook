package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The code scanning alert involved in the event.
 *
 * @param assignees assignees
 * @param createdAt The time that the alert was created in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ.}
 * @param dismissalApprovedBy dismissal_approved_by
 * @param dismissedAt The time that the alert was dismissed in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param dismissedBy dismissed_by
 * @param dismissedComment The dismissal comment associated with the dismissal of the alert.
 * @param dismissedReason The reason for dismissing or closing the alert.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param mostRecentInstance most_recent_instance
 * @param number The code scanning alert number.
 * @param rule rule
 * @param state State of a code scanning alert.
 * @param tool tool
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-closed-by-user/requestBody/properties/alert")
public record GitHubWebhookCodeScanningAlertClosedByUserAlert(
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        Instant createdAt,
        @Nullable GitHubWebhookUser dismissalApprovedBy,
        Instant dismissedAt,
        @Nullable GitHubWebhookUser dismissedBy,
        @Nullable String dismissedComment,
        @Nullable GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason dismissedReason,
        String htmlUrl,
        @Nullable GitHubWebhookAlertInstance mostRecentInstance,
        long number,
        GitHubWebhookCodeScanningAlertFixedAlertRule rule,
        GitHubWebhookCodeScanningAlertClosedByUserAlertState state,
        GitHubWebhookCodeScanningAlertFixedAlertTool tool,
        String url) {
    public GitHubWebhookCodeScanningAlertClosedByUserAlert {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(dismissedAt, "dismissedAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(rule, "rule");
        requireNonNull(state, "state");
        requireNonNull(tool, "tool");
        requireNonNull(url, "url");
    }
}
