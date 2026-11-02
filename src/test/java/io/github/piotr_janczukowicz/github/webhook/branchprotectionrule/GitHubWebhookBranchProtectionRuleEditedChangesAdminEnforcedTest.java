package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforcedTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced fixture =
                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedChangesAdminEnforced();

        final GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced copy =
                GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforcedBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
