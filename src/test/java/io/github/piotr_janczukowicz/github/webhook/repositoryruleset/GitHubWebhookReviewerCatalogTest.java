package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReviewerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReviewer.class;
    }

    @Override
    protected String fixture() {
        return "webhook-reviewer.json";
    }

    @Override
    protected String schema() {
        return "webhook-reviewer-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookReviewer();
    }
}
