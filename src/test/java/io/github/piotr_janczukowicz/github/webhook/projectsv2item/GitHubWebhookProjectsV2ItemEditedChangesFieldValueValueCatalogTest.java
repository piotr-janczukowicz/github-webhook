package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-edited-changes-field-value-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-edited-changes-field-value-value-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemEditedChangesFieldValueValue();
    }
}
