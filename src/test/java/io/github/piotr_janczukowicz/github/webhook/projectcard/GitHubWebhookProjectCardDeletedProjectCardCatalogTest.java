package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardDeletedProjectCardCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardDeletedProjectCard.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-deleted-project-card.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-deleted-project-card-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardDeletedProjectCard();
    }
}
