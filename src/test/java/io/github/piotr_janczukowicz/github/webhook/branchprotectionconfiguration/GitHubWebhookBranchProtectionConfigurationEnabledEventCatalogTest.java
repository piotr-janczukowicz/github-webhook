package io.github.piotr_janczukowicz.github.webhook.branchprotectionconfiguration;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionConfigurationEnabledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionConfigurationEnabledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-configuration-enabled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-configuration-enabled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionConfigurationCatalogFixtures.webhookBranchProtectionConfigurationEnabledEvent();
    }
}
