package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReactionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReactions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-reactions.json";
    }

    @Override
    protected String schema() {
        return "webhook-reactions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookReactions();
    }
}
