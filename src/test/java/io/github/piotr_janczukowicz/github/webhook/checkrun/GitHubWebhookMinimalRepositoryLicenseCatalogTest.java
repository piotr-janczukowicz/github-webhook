package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMinimalRepositoryLicenseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMinimalRepositoryLicense.class;
    }

    @Override
    protected String fixture() {
        return "webhook-minimal-repository-license.json";
    }

    @Override
    protected String schema() {
        return "webhook-minimal-repository-license-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookMinimalRepositoryLicense();
    }
}
