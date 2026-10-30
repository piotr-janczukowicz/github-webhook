package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestEditedChanges();
    }
}
