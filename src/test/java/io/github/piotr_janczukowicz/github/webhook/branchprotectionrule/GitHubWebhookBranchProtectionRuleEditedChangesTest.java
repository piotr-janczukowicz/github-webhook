package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionRuleEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookBranchProtectionRuleEditedChanges fixture =
                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleEditedChanges();

        final GitHubWebhookBranchProtectionRuleEditedChanges copy =
                GitHubWebhookBranchProtectionRuleEditedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
