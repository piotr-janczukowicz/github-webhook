package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesTypedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesTypedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-typed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-typed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesTypedEvent();
    }
}
