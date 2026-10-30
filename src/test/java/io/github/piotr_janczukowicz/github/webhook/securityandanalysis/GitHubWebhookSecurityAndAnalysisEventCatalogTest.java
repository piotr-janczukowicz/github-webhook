package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAndAnalysisEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAndAnalysisEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-and-analysis-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-and-analysis-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAndAnalysisCatalogFixtures.webhookSecurityAndAnalysisEvent();
    }
}
