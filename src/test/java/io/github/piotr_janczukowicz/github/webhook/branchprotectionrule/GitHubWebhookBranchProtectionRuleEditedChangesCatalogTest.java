package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedChanges();
    }
}
