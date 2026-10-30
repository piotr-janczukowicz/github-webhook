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
 * @param dismissedComment The dismissal comment associated with the dismissal of the alert.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param instancesUrl instances_url
 * @param mostRecentInstance most_recent_instance
 * @param number The code scanning alert number.
 * @param rule rule
 * @param state State of a code scanning alert. Events for alerts found outside the default branch will return a
 *     {@code null} value until they are dismissed or fixed.
 * @param tool tool
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/code-scanning-alert-created/requestBody/properties/alert")
public record GitHubWebhookCodeScanningAlertCreatedAlert(
        @Nullable List<GitHubWebhookSimpleUser> assignees,
        @Nullable Instant createdAt,
        @Nullable String dismissedComment,
        String htmlUrl,
        @Nullable String instancesUrl,
        @Nullable GitHubWebhookAlertInstance mostRecentInstance,
        long number,
        GitHubWebhookCodeScanningAlertFixedAlertRule rule,
        @Nullable GitHubWebhookCodeScanningAlertCreatedAlertState state,
        @Nullable GitHubWebhookCodeScanningAlertFixedAlertTool tool,
        @Nullable String updatedAt,
        String url) {
    public GitHubWebhookCodeScanningAlertCreatedAlert {
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(rule, "rule");
        requireNonNull(url, "url");
    }
}
