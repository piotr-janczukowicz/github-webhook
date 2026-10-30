package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUnlabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUnlabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-unlabeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-unlabeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUnlabeledEvent();
    }
}
