package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueRelatesToRelatesToRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueRelatesToRelatesToRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-relates-to-relates-to-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-relates-to-relates-to-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueRelatesToCatalogFixtures.webhookIssueRelatesToRelatesToRemovedEvent();
    }
}
