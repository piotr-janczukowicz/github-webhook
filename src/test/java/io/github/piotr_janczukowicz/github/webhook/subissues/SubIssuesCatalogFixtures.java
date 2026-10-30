package io.github.piotr_janczukowicz.github.webhook.subissues;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class SubIssuesCatalogFixtures {

    private SubIssuesCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookSubIssuesParentIssueAddedEvent webhookSubIssuesParentIssueAddedEvent() {
        return GitHubWebhookSubIssuesParentIssueAddedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1.5)
                .parentIssueRepo(webhookRepository())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1.5)
                .build();
    }

    static GitHubWebhookSubIssuesParentIssueRemovedEvent webhookSubIssuesParentIssueRemovedEvent() {
        return GitHubWebhookSubIssuesParentIssueRemovedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1.5)
                .parentIssueRepo(webhookRepository())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1.5)
                .build();
    }

    static GitHubWebhookSubIssuesSubIssueAddedEvent webhookSubIssuesSubIssueAddedEvent() {
        return GitHubWebhookSubIssuesSubIssueAddedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1.5)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1.5)
                .subIssueRepo(webhookRepository())
                .build();
    }

    static GitHubWebhookSubIssuesSubIssueRemovedEvent webhookSubIssuesSubIssueRemovedEvent() {
        return GitHubWebhookSubIssuesSubIssueRemovedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1.5)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1.5)
                .subIssueRepo(webhookRepository())
                .build();
    }
}
