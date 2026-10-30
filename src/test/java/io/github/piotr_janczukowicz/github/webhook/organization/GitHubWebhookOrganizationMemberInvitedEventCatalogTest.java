package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationMemberInvitedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationMemberInvitedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-member-invited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-member-invited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationMemberInvitedEvent();
    }
}
