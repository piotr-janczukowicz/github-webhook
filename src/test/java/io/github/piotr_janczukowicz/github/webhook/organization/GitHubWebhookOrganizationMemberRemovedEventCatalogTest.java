package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationMemberRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationMemberRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-member-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-member-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationMemberRemovedEvent();
    }
}
