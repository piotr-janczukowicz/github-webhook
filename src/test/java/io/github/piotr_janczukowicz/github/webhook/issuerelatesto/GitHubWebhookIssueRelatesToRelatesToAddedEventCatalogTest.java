package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueRelatesToRelatesToAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueRelatesToRelatesToAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-relates-to-relates-to-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-relates-to-relates-to-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueRelatesToCatalogFixtures.webhookIssueRelatesToRelatesToAddedEvent();
    }
}
