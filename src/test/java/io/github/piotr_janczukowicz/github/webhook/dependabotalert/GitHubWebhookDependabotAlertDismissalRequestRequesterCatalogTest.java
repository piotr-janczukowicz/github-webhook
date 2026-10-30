package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestRequesterCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequestRequester.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-dismissal-request-requester.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-requester-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertDismissalRequestRequester();
    }
}
