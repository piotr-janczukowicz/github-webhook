package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookEnterprise;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookForkRepository;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookOrganizationSimple;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleInstallation;
import static io.github.piotr_janczukowicz.github.webhook.common.CommonCatalogFixtures.webhookSimpleUser;

import java.time.Instant;
import java.util.List;

final class BranchProtectionRuleCatalogFixtures {

    private BranchProtectionRuleCatalogFixtures() {
        throw new UnsupportedOperationException("Utility class");
    }

    static GitHubWebhookBranchProtectionRule webhookBranchProtectionRule() {
        return GitHubWebhookBranchProtectionRuleBuilder.builder()
                .adminEnforced(true)
                .allowDeletionsEnforcementLevel(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .allowForcePushesEnforcementLevel(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .authorizedActorNames(List.of("authorized_actor_names"))
                .authorizedActorsOnly(true)
                .authorizedDismissalActorsOnly(true)
                .createProtected(true)
                .createdAt(Instant.parse("2026-01-01T00:00:00Z"))
                .dismissStaleReviewsOnPush(true)
                .id(1L)
                .ignoreApprovalsFromContributors(true)
                .linearHistoryRequirementEnforcementLevel(
                        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .lockAllowsForkSync(true)
                .lockBranchEnforcementLevel(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .mergeQueueEnforcementLevel(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .name("name")
                .pullRequestReviewsEnforcementLevel(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .repositoryId(1L)
                .requireCodeOwnerReview(true)
                .requireLastPushApproval(true)
                .requiredApprovingReviewCount(1L)
                .requiredConversationResolutionLevel(
                        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .requiredDeploymentsEnforcementLevel(
                        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .requiredStatusChecks(List.of("required_status_checks"))
                .requiredStatusChecksEnforcementLevel(
                        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .signatureRequirementEnforcementLevel(
                        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .strictRequiredStatusChecksPolicy(true)
                .updatedAt(Instant.parse("2026-01-01T00:00:00Z"))
                .build();
    }

    static GitHubWebhookBranchProtectionRuleCreatedEvent webhookBranchProtectionRuleCreatedEvent() {
        return GitHubWebhookBranchProtectionRuleCreatedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .rule(webhookBranchProtectionRule())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBranchProtectionRuleDeletedEvent webhookBranchProtectionRuleDeletedEvent() {
        return GitHubWebhookBranchProtectionRuleDeletedEventBuilder.builder()
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .rule(webhookBranchProtectionRule())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookBranchProtectionRuleEditedChanges webhookBranchProtectionRuleEditedChanges() {
        return GitHubWebhookBranchProtectionRuleEditedChangesBuilder.builder()
                .adminEnforced(webhookBranchProtectionRuleEditedChangesAdminEnforced())
                .authorizedActorNames(webhookBranchProtectionRuleEditedChangesAuthorizedActorNames())
                .authorizedActorsOnly(webhookBranchProtectionRuleEditedChangesAdminEnforced())
                .authorizedDismissalActorsOnly(webhookBranchProtectionRuleEditedChangesAdminEnforced())
                .linearHistoryRequirementEnforcementLevel(
                        webhookEditedChangesLinearHistoryRequirementEnforcementLevel())
                .lockAllowsForkSync(webhookBranchProtectionRuleEditedChangesAdminEnforced())
                .lockBranchEnforcementLevel(webhookEditedChangesLinearHistoryRequirementEnforcementLevel())
                .pullRequestReviewsEnforcementLevel(webhookEditedChangesLinearHistoryRequirementEnforcementLevel())
                .requireLastPushApproval(webhookBranchProtectionRuleEditedChangesAdminEnforced())
                .requiredStatusChecks(webhookBranchProtectionRuleEditedChangesAuthorizedActorNames())
                .requiredStatusChecksEnforcementLevel(webhookEditedChangesLinearHistoryRequirementEnforcementLevel())
                .build();
    }

    static GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced
            webhookBranchProtectionRuleEditedChangesAdminEnforced() {
        return GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforcedBuilder.builder()
                .from(true)
                .build();
    }

    static GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames
            webhookBranchProtectionRuleEditedChangesAuthorizedActorNames() {
        return GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNamesBuilder.builder()
                .from(List.of("from"))
                .build();
    }

    static GitHubWebhookBranchProtectionRuleEditedEvent webhookBranchProtectionRuleEditedEvent() {
        return GitHubWebhookBranchProtectionRuleEditedEventBuilder.builder()
                .changes(webhookBranchProtectionRuleEditedChanges())
                .enterprise(webhookEnterprise())
                .installation(webhookSimpleInstallation())
                .organization(webhookOrganizationSimple())
                .repository(webhookForkRepository())
                .rule(webhookBranchProtectionRule())
                .sender(webhookSimpleUser())
                .build();
    }

    static GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel
            webhookEditedChangesLinearHistoryRequirementEnforcementLevel() {
        return GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevelBuilder.builder()
                .from(GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.OFF)
                .build();
    }
}
