package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookEnterprise;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookForkRepository;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookOrganizationSimple;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleInstallation;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning scan completed event payload.
 *
 * @param completedAt The time that the alert was resolved in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param customPatternName If the scan was triggered by a custom pattern update, this will be the name of the pattern
 *     that was updated
 * @param customPatternScope If the scan was triggered by a custom pattern update, this will be the scope of the pattern
 *     that was updated
 * @param enterprise An enterprise on GitHub. Webhook payloads contain the {@code enterprise} property when the webhook
 *     is configured on an enterprise account or an organization that's part of an enterprise account. For more
 *     information, see "[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts)."
 * @param installation The GitHub App installation. Webhook payloads contain the {@code installation} property when the
 *     event is configured for and sent to a GitHub App. For more information, see "[Using webhooks with GitHub
 *     Apps](https://docs.github.com/apps/creating-github-apps/registering-a-github-app/using-webhooks-with-github-apps)."
 * @param organization A GitHub organization. Webhook payloads contain the {@code organization} property when the
 *     webhook is configured for an organization, or when the event occurs from activity in a repository owned by an
 *     organization.
 * @param repository The repository on GitHub where the event occurred. Webhook payloads contain the {@code repository}
 *     property when the event occurs from activity in a repository.
 * @param secretTypes List of patterns that were updated. This will be empty for normal backfill scans or custom pattern
 *     updates
 * @param sender A GitHub user.
 * @param source What type of content was scanned
 * @param startedAt The time that the alert was resolved in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param type What type of scan was completed
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-scan-completed/requestBody")
public record GitHubWebhookSecretScanningScanCompletedEvent(
        Instant completedAt,
        @Nullable String customPatternName,
        @Nullable GitHubWebhookSecretScanningScanCompletedCustomPatternScope customPatternScope,
        @Nullable GitHubWebhookEnterprise enterprise,
        @Nullable GitHubWebhookSimpleInstallation installation,
        @Nullable GitHubWebhookOrganizationSimple organization,
        @Nullable GitHubWebhookForkRepository repository,
        @Nullable List<String> secretTypes,
        @Nullable GitHubWebhookSimpleUser sender,
        GitHubWebhookSecretScanningScanCompletedSource source,
        Instant startedAt,
        GitHubWebhookSecretScanningScanCompletedType type)
        implements GitHubWebhookSecretScanningScanEvent {
    public GitHubWebhookSecretScanningScanCompletedEvent {
        requireNonNull(completedAt, "completedAt");
        requireNonNull(source, "source");
        requireNonNull(startedAt, "startedAt");
        requireNonNull(type, "type");
    }
}
