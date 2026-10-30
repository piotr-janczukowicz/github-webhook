package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesDemilestonedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDemilestonedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-demilestoned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-demilestoned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesDemilestonedEvent();
    }
}
