package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforcedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-edited-changes-admin-enforced.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-edited-changes-admin-enforced-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedChangesAdminEnforced();
    }
}
