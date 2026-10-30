package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2StatusUpdateEditedChangesStatusCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2StatusUpdateEditedChangesStatus.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-status-update-edited-changes-status.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-status-update-edited-changes-status-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateEditedChangesStatus();
    }
}
