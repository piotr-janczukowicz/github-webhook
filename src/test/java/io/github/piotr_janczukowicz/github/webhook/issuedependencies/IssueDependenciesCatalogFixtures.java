package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class IssueDependenciesCatalogFixtures {

    private IssueDependenciesCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookIssueDependenciesBlockedByAddedEvent webhookIssueDependenciesBlockedByAddedEvent() {
        return GitHubWebhookIssueDependenciesBlockedByAddedEventBuilder.builder()
                .blockedIssue(webhookIssue())
                .blockedIssueId(1L)
                .blockingIssue(webhookIssue())
                .blockingIssueId(1L)
                .blockingIssueRepo(webhookRepository())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueDependenciesBlockedByRemovedEvent webhookIssueDependenciesBlockedByRemovedEvent() {
        return GitHubWebhookIssueDependenciesBlockedByRemovedEventBuilder.builder()
                .blockedIssue(webhookIssue())
                .blockedIssueId(1L)
                .blockingIssue(webhookIssue())
                .blockingIssueId(1L)
                .blockingIssueRepo(webhookRepository())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueDependenciesBlockingAddedEvent webhookIssueDependenciesBlockingAddedEvent() {
        return GitHubWebhookIssueDependenciesBlockingAddedEventBuilder.builder()
                .blockedIssue(webhookIssue())
                .blockedIssueId(1L)
                .blockedIssueRepo(webhookRepository())
                .blockingIssue(webhookIssue())
                .blockingIssueId(1L)
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueDependenciesBlockingRemovedEvent webhookIssueDependenciesBlockingRemovedEvent() {
        return GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder.builder()
                .blockedIssue(webhookIssue())
                .blockedIssueId(1L)
                .blockedIssueRepo(webhookRepository())
                .blockingIssue(webhookIssue())
                .blockingIssueId(1L)
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
