package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedEvent();
    }
}
