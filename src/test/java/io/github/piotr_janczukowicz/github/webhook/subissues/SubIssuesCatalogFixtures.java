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
                .parentIssueId(1L)
                .parentIssueRepo(webhookRepository())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1L)
                .build();
    }

    static GitHubWebhookSubIssuesParentIssueRemovedEvent webhookSubIssuesParentIssueRemovedEvent() {
        return GitHubWebhookSubIssuesParentIssueRemovedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1L)
                .parentIssueRepo(webhookRepository())
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1L)
                .build();
    }

    static GitHubWebhookSubIssuesSubIssueAddedEvent webhookSubIssuesSubIssueAddedEvent() {
        return GitHubWebhookSubIssuesSubIssueAddedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1L)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1L)
                .subIssueRepo(webhookRepository())
                .build();
    }

    static GitHubWebhookSubIssuesSubIssueRemovedEvent webhookSubIssuesSubIssueRemovedEvent() {
        return GitHubWebhookSubIssuesSubIssueRemovedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .parentIssue(webhookIssue())
                .parentIssueId(1L)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .subIssue(webhookIssue())
                .subIssueId(1L)
                .subIssueRepo(webhookRepository())
                .build();
    }
}
