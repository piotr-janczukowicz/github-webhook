package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldRemovedEvent();
    }
}
