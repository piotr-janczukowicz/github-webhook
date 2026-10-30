package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestEditedChangesBaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestEditedChangesBase.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-edited-changes-base.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-edited-changes-base-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestEditedChangesBase();
    }
}
