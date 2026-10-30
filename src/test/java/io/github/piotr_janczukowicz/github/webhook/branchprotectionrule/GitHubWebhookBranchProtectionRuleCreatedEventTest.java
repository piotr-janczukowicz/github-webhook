package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionRuleCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookBranchProtectionRuleCreatedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleCreatedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRuleNull() {
        final GitHubWebhookBranchProtectionRuleCreatedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleCreatedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleCreatedEvent())
                        .rule(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("rule");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBranchProtectionRuleCreatedEventBuilder builder =
                GitHubWebhookBranchProtectionRuleCreatedEventBuilder.builder(
                                BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRuleCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
