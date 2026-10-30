package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationMemberAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationMemberAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-member-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-member-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationMemberAddedEvent();
    }
}
