package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryPublishedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryPublishedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-published-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-published-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryPublishedEvent();
    }
}
