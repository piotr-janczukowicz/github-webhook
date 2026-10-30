package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleCreatedEvent();
    }
}
