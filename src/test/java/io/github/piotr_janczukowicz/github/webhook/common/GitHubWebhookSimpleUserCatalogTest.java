package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimpleUserCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimpleUser.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-user.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-user-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSimpleUser();
    }
}
