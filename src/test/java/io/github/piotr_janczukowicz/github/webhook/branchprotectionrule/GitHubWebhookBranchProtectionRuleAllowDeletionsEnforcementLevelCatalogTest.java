package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevelCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.class;
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-allow-deletions-enforcement-level-schema.json";
    }
}
