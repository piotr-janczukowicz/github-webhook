package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ProjectCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2Project.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-project.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-project-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2CatalogFixtures.webhookProjectsV2Project();
    }
}
