package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookInstallationCreatedRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;
import java.util.Map;

final class PersonalAccessTokenRequestCatalogFixtures {

    private PersonalAccessTokenRequestCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookPersonalAccessTokenRequest webhookPersonalAccessTokenRequest() {
        return GitHubWebhookPersonalAccessTokenRequestBuilder.builder()
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .id(1L)
                .owner(webhookSimpleUser())
                .permissionsAdded(webhookPersonalAccessTokenRequestPermissionsAdded())
                .permissionsResult(webhookPersonalAccessTokenRequestPermissionsAdded())
                .permissionsUpgraded(webhookPersonalAccessTokenRequestPermissionsAdded())
                .repositories(List.of(webhookInstallationCreatedRepository()))
                .repositoryCount(1L)
                .repositorySelection(GitHubWebhookPersonalAccessTokenRequestRepositorySelection.NONE)
                .tokenExpired(true)
                .tokenExpiresAt(Instant.parse("2026-01-01T00:00:00Z"))
                .tokenId(1L)
                .tokenLastUsedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .tokenName("token_name")
                .build();
    }

    static GitHubWebhookPersonalAccessTokenRequestApprovedEvent webhookPersonalAccessTokenRequestApprovedEvent() {
        return GitHubWebhookPersonalAccessTokenRequestApprovedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .personalAccessTokenRequest(webhookPersonalAccessTokenRequest())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPersonalAccessTokenRequestCancelledEvent webhookPersonalAccessTokenRequestCancelledEvent() {
        return GitHubWebhookPersonalAccessTokenRequestCancelledEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .personalAccessTokenRequest(webhookPersonalAccessTokenRequest())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPersonalAccessTokenRequestCreatedEvent webhookPersonalAccessTokenRequestCreatedEvent() {
        return GitHubWebhookPersonalAccessTokenRequestCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .personalAccessTokenRequest(webhookPersonalAccessTokenRequest())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPersonalAccessTokenRequestDeniedEvent webhookPersonalAccessTokenRequestDeniedEvent() {
        return GitHubWebhookPersonalAccessTokenRequestDeniedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .personalAccessTokenRequest(webhookPersonalAccessTokenRequest())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookPersonalAccessTokenRequestPermissionsAdded webhookPersonalAccessTokenRequestPermissionsAdded() {
        return GitHubWebhookPersonalAccessTokenRequestPermissionsAddedBuilder.builder()
                .organization(Map.of("key", "organization"))
                .other(Map.of("key", "other"))
                .repository(Map.of("key", "repository"))
                .build();
    }
}
