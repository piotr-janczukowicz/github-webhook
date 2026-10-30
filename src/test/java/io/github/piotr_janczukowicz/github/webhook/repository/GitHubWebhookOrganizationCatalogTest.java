package io.github.piotr_janczukowicz.github.webhook.repository;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganization.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryCatalogFixtures.webhookOrganization();
    }
}
