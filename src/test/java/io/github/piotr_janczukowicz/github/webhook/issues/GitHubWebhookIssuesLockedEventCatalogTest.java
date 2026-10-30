package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLockedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLockedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-locked-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-locked-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLockedEvent();
    }
}
