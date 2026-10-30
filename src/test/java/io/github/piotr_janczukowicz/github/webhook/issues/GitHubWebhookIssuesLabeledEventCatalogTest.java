package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLabeledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLabeledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-labeled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-labeled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLabeledEvent();
    }
}
