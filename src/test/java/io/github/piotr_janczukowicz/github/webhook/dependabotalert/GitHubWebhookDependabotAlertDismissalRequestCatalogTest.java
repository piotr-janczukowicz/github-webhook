package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-dismissal-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertDismissalRequest();
    }
}
