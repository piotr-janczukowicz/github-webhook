package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMembershipCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMembership.class;
    }

    @Override
    protected String fixture() {
        return "webhook-membership.json";
    }

    @Override
    protected String schema() {
        return "webhook-membership-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookMembership();
    }
}
