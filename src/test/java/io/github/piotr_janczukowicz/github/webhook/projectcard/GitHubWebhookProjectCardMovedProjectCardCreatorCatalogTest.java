package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardMovedProjectCardCreatorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardMovedProjectCardCreator.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-moved-project-card-creator.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-moved-project-card-creator-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCardCreator();
    }
}
