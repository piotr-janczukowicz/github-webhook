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
                .blockedIssueId(1.5)
                .blockingIssue(webhookIssue())
                .blockingIssueId(1.5)
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
                .blockedIssueId(1.5)
                .blockingIssue(webhookIssue())
                .blockingIssueId(1.5)
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
                .blockedIssueId(1.5)
                .blockedIssueRepo(webhookRepository())
                .blockingIssue(webhookIssue())
                .blockingIssueId(1.5)
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueDependenciesBlockingRemovedEvent webhookIssueDependenciesBlockingRemovedEvent() {
        return GitHubWebhookIssueDependenciesBlockingRemovedEventBuilder.builder()
                .blockedIssue(webhookIssue())
                .blockedIssueId(1.5)
                .blockedIssueRepo(webhookRepository())
                .blockingIssue(webhookIssue())
                .blockingIssueId(1.5)
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
