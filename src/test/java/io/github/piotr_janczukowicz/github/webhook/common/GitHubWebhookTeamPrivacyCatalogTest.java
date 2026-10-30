package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookTeamPrivacyCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamPrivacy.class;
    }

    @Override
    protected String schema() {
        return "webhook-team-privacy-schema.json";
    }
}
