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
 * @param dismissedAt The time that the alert was dismissed in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param dismissedBy dismissed_by
 * @param dismissedComment The dismissal comment associated with the dismissal of the alert.
 * @param dismissedReason The reason for dismissing or closing the alert.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param instancesUrl instances_url
 * @param mostRecentInstance most_recent_instance
 * @param number The code scanning alert number.
 * @param rule rule
 * @param state State of a code scanning alert. Events for alerts found outside the default branch will return a
 *     {@code null} value until they are dismissed or fixed.
 * @param tool tool
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-fixed/requestBody/properties/alert")
public record GitHubWebhookCodeScanningAlertFixedAlert(
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        Instant createdAt,
        @Nullable Instant dismissedAt,
        @Nullable GitHubWebhookUser dismissedBy,
        @Nullable String dismissedComment,
        @Nullable GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason dismissedReason,
        String htmlUrl,
        @Nullable String instancesUrl,
        @Nullable GitHubWebhookAlertInstance mostRecentInstance,
        long number,
        GitHubWebhookCodeScanningAlertFixedAlertRule rule,
        @Nullable GitHubWebhookCodeScanningAlertFixedAlertState state,
        GitHubWebhookCodeScanningAlertFixedAlertTool tool,
        String url) {
    public GitHubWebhookCodeScanningAlertFixedAlert {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(rule, "rule");
        requireNonNull(tool, "tool");
        requireNonNull(url, "url");
    }
}
