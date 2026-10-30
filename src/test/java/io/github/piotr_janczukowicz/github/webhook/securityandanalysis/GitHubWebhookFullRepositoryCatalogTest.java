package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFullRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFullRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-full-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-full-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAndAnalysisCatalogFixtures.webhookFullRepository();
    }
}
