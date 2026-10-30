package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemArchivedChangesArchivedAtCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-archived-changes-archived-at.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-archived-changes-archived-at-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemArchivedChangesArchivedAt();
    }
}
