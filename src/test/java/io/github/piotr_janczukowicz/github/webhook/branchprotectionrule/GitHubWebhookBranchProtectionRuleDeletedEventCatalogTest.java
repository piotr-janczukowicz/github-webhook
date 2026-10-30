package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleDeletedEvent();
    }
}
