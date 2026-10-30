package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBranchProtectionRuleTest {

    @Test
    void constructor_shouldThrow_whenAllowDeletionsEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .allowDeletionsEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("allowDeletionsEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenAllowForcePushesEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .allowForcePushesEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("allowForcePushesEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenAuthorizedActorNamesNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .authorizedActorNames(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("authorizedActorNames");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenLinearHistoryRequirementEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .linearHistoryRequirementEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("linearHistoryRequirementEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenLockBranchEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .lockBranchEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("lockBranchEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenMergeQueueEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .mergeQueueEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("mergeQueueEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestReviewsEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .pullRequestReviewsEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("pullRequestReviewsEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenRequiredConversationResolutionLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .requiredConversationResolutionLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("requiredConversationResolutionLevel");
    }

    @Test
    void constructor_shouldThrow_whenRequiredDeploymentsEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .requiredDeploymentsEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("requiredDeploymentsEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenRequiredStatusChecksNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .requiredStatusChecks(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requiredStatusChecks");
    }

    @Test
    void constructor_shouldThrow_whenRequiredStatusChecksEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .requiredStatusChecksEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("requiredStatusChecksEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenSignatureRequirementEnforcementLevelNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .signatureRequirementEnforcementLevel(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown)
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("signatureRequirementEnforcementLevel");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookBranchProtectionRuleBuilder builder = GitHubWebhookBranchProtectionRuleBuilder.builder(
                        BranchProtectionRuleCatalogFixtures.webhookBranchProtectionRule())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
