package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardMovedProjectCardCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardMovedProjectCard.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-moved-project-card.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-moved-project-card-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardMovedProjectCard();
    }
}
