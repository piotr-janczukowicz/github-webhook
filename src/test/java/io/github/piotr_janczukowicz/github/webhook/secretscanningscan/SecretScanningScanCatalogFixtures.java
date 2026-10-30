package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;

final class SecretScanningScanCatalogFixtures {

    private SecretScanningScanCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookSecretScanningScanCompletedEvent webhookSecretScanningScanCompletedEvent() {
        return GitHubWebhookSecretScanningScanCompletedEventBuilder.builder()
                .completedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .customPatternName("custom_pattern_name")
                .customPatternScope(GitHubWebhookSecretScanningScanCompletedCustomPatternScope.REPOSITORY)
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .secretTypes(List.of("secret_types"))
                .sender(webhookSimpleUser())
                .source(GitHubWebhookSecretScanningScanCompletedSource.GIT)
                .startedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .type(GitHubWebhookSecretScanningScanCompletedType.BACKFILL)
                .build();
    }
}
