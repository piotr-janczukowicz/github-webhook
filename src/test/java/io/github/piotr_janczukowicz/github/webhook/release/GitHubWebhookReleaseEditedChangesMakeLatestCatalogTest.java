package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseEditedChangesMakeLatestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseEditedChangesMakeLatest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-edited-changes-make-latest.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-edited-changes-make-latest-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseEditedChangesMakeLatest();
    }
}
