package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationRenamedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationRenamedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-renamed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-renamed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationRenamedEvent();
    }
}
