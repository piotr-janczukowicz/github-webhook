package io.github.piotr_janczukowicz.github.webhook.organization;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationRenamedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationRenamedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-renamed-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-renamed-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCatalogFixtures.webhookOrganizationRenamedChanges();
    }
}
