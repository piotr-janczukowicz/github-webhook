package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2EditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2EditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2CatalogFixtures.webhookProjectsV2EditedChanges();
    }
}
