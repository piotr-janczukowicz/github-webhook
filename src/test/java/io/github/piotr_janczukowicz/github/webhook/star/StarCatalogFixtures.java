package io.github.piotr_janczukowicz.github.webhook.star;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;

final class StarCatalogFixtures {

    private StarCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookStarCreatedEvent webhookStarCreatedEvent() {
        return GitHubWebhookStarCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .starredAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookStarDeletedEvent webhookStarDeletedEvent() {
        return GitHubWebhookStarDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
