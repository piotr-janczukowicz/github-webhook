package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneCreatorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneCreator.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-creator.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-creator-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookMilestoneCreator();
    }
}
