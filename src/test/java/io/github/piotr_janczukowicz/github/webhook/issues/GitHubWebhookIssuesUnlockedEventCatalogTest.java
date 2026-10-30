package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUnlockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUnlockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-unlocked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-unlocked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUnlockedEvent();
    }
}
