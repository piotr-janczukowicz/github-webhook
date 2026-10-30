package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeOfConductSimpleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeOfConductSimple.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-of-conduct-simple.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-of-conduct-simple-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAndAnalysisCatalogFixtures.webhookCodeOfConductSimple();
    }
}
