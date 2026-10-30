package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestConvertedToDraftEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestConvertedToDraftEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-converted-to-draft-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-converted-to-draft-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestConvertedToDraftEvent();
    }
}
