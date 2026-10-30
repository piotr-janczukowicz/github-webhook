package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookInstallationRepositorySelectionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationRepositorySelection.class;
    }

    @Override
    protected String schema() {
        return "webhook-installation-repository-selection-schema.json";
    }
}
