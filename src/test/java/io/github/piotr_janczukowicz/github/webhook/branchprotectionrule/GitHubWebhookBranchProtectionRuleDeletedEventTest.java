package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionRuleDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookBranchProtectionRuleDeletedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleDeletedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleDeletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookBranchProtectionRuleDeletedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleDeletedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleDeletedEvent())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBranchProtectionRuleDeletedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleDeletedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
