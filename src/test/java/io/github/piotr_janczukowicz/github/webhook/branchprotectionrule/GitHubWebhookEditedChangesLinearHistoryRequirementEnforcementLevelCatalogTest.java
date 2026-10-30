package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-edited-changes-linear-history-requirement-enforcement-level.json";
    }

    @Override
    protected String schema() {
        return "webhook-edited-changes-linear-history-requirement-enforcement-level-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookEditedChangesLinearHistoryRequirementEnforcementLevel();
    }
}
