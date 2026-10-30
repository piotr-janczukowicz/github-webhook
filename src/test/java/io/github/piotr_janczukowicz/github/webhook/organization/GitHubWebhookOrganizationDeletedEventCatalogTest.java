package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationDeletedEvent();
    }
}
