package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryWithdrawnEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryWithdrawnEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-withdrawn-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-withdrawn-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnEvent();
    }
}
