package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseEditedChanges();
    }
}
