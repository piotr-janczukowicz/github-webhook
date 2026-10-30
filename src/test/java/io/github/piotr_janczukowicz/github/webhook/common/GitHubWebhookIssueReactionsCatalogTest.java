package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueReactionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueReactions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-reactions.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-reactions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueReactions();
    }
}
