package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookIssue;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

final class IssueRelatesToCatalogFixtures {

    private IssueRelatesToCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookIssueRelatesToRelatesToAddedEvent webhookIssueRelatesToRelatesToAddedEvent() {
        return GitHubWebhookIssueRelatesToRelatesToAddedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .issueId(1.5)
                .organization(webhookOrganizationSimple())
                .relatedIssue(webhookIssue())
                .relatedIssueId(1.5)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookIssueRelatesToRelatesToRemovedEvent webhookIssueRelatesToRelatesToRemovedEvent() {
        return GitHubWebhookIssueRelatesToRelatesToRemovedEventBuilder.builder()
                .installation(webhookSimpleInstallation())
                .issue(webhookIssue())
                .issueId(1.5)
                .organization(webhookOrganizationSimple())
                .relatedIssue(webhookIssue())
                .relatedIssueId(1.5)
                .repository(webhookForkRepository())
                .sender(webhookSimpleUser())
                .build();
    }
}
