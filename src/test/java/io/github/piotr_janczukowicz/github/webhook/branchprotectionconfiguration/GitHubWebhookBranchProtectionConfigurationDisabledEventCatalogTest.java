package io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionConfigurationDisabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionConfigurationDisabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-configuration-disabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-configuration-disabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionConfigurationCatalogFixtures.webhookBranchProtectionConfigurationDisabledEvent();
    }
}
