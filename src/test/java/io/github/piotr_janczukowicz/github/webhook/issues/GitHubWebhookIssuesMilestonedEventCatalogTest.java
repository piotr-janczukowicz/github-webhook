package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesMilestonedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesMilestonedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-milestoned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-milestoned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesMilestonedEvent();
    }
}
