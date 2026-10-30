package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedEvent();
    }
}
