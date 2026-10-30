package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNamesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-protection-rule-edited-changes-authorized-actor-names.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-protection-rule-edited-changes-authorized-actor-names-schema.json";
    }

    @Override
    protected Object expected() {
        return BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedChangesAuthorizedActorNames();
    }
}
