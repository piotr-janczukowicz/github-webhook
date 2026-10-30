package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookOptionsReviewerReviewerTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOptionsReviewerReviewerType.class;
    }

    @Override
    protected String schema() {
        return "webhook-options-reviewer-reviewer-type-schema.json";
    }
}
