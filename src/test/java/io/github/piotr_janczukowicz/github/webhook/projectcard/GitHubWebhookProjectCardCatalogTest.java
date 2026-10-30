package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCard.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCard();
    }
}
