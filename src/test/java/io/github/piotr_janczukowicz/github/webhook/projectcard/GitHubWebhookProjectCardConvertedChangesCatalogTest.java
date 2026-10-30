package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardConvertedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardConvertedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-converted-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-converted-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardConvertedChanges();
    }
}
