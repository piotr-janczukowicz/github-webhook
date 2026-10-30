package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProject.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProject();
    }
}
