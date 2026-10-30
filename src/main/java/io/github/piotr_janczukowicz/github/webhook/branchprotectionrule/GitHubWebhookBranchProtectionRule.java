package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The branch protection rule. Includes a {@code name} and all the [branch protection
 * settings](https://docs.github.com/github/administering-a-repository/defining-the-mergeability-of-pull-requests/about-protected-branches#about-branch-protection-settings)
 * applied to branches that match the name. Binary settings are boolean. Multi-level configurations are one of
 * {@code off}, {@code non_admins}, or {@code everyone}. Actor and build lists are arrays of strings.
 *
 * @param adminEnforced admin_enforced
 * @param allowDeletionsEnforcementLevel allow_deletions_enforcement_level
 * @param allowForcePushesEnforcementLevel allow_force_pushes_enforcement_level
 * @param authorizedActorNames authorized_actor_names
 * @param authorizedActorsOnly authorized_actors_only
 * @param authorizedDismissalActorsOnly authorized_dismissal_actors_only
 * @param createProtected create_protected
 * @param createdAt created_at
 * @param dismissStaleReviewsOnPush dismiss_stale_reviews_on_push
 * @param id id
 * @param ignoreApprovalsFromContributors ignore_approvals_from_contributors
 * @param linearHistoryRequirementEnforcementLevel linear_history_requirement_enforcement_level
 * @param lockAllowsForkSync Whether users can pull changes from upstream when the branch is locked. Set to {@code true}
 *     to allow users to pull changes from upstream when the branch is locked. This setting is only applicable for
 *     forks.
 * @param lockBranchEnforcementLevel The enforcement level of the branch lock setting. {@code off} means the branch is
 *     not locked, {@code non_admins} means the branch is read-only for non_admins, and {@code everyone} means the
 *     branch is read-only for everyone.
 * @param mergeQueueEnforcementLevel merge_queue_enforcement_level
 * @param name name
 * @param pullRequestReviewsEnforcementLevel pull_request_reviews_enforcement_level
 * @param repositoryId repository_id
 * @param requireCodeOwnerReview require_code_owner_review
 * @param requireLastPushApproval Whether the most recent push must be approved by someone other than the person who
 *     pushed it
 * @param requiredApprovingReviewCount required_approving_review_count
 * @param requiredConversationResolutionLevel required_conversation_resolution_level
 * @param requiredDeploymentsEnforcementLevel required_deployments_enforcement_level
 * @param requiredStatusChecks required_status_checks
 * @param requiredStatusChecksEnforcementLevel required_status_checks_enforcement_level
 * @param signatureRequirementEnforcementLevel signature_requirement_enforcement_level
 * @param strictRequiredStatusChecksPolicy strict_required_status_checks_policy
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-rule-created/requestBody/properties/rule")
public record GitHubWebhookBranchProtectionRule(
        boolean adminEnforced,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel allowDeletionsEnforcementLevel,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel allowForcePushesEnforcementLevel,
        List<String> authorizedActorNames,
        boolean authorizedActorsOnly,
        boolean authorizedDismissalActorsOnly,
        @Nullable Boolean createProtected,
        Instant createdAt,
        boolean dismissStaleReviewsOnPush,
        long id,
        boolean ignoreApprovalsFromContributors,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel linearHistoryRequirementEnforcementLevel,
        @Nullable Boolean lockAllowsForkSync,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel lockBranchEnforcementLevel,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel mergeQueueEnforcementLevel,
        String name,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel pullRequestReviewsEnforcementLevel,
        long repositoryId,
        boolean requireCodeOwnerReview,
        @Nullable Boolean requireLastPushApproval,
        long requiredApprovingReviewCount,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel requiredConversationResolutionLevel,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel requiredDeploymentsEnforcementLevel,
        List<String> requiredStatusChecks,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel requiredStatusChecksEnforcementLevel,
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel signatureRequirementEnforcementLevel,
        boolean strictRequiredStatusChecksPolicy,
        Instant updatedAt) {
    public GitHubWebhookBranchProtectionRule {
        requireNonNull(allowDeletionsEnforcementLevel, "allowDeletionsEnforcementLevel");
        requireNonNull(allowForcePushesEnforcementLevel, "allowForcePushesEnforcementLevel");
        requireNonNull(authorizedActorNames, "authorizedActorNames");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(linearHistoryRequirementEnforcementLevel, "linearHistoryRequirementEnforcementLevel");
        requireNonNull(lockBranchEnforcementLevel, "lockBranchEnforcementLevel");
        requireNonNull(mergeQueueEnforcementLevel, "mergeQueueEnforcementLevel");
        requireNonNull(name, "name");
        requireNonNull(pullRequestReviewsEnforcementLevel, "pullRequestReviewsEnforcementLevel");
        requireNonNull(requiredConversationResolutionLevel, "requiredConversationResolutionLevel");
        requireNonNull(requiredDeploymentsEnforcementLevel, "requiredDeploymentsEnforcementLevel");
        requireNonNull(requiredStatusChecks, "requiredStatusChecks");
        requireNonNull(requiredStatusChecksEnforcementLevel, "requiredStatusChecksEnforcementLevel");
        requireNonNull(signatureRequirementEnforcementLevel, "signatureRequirementEnforcementLevel");
        requireNonNull(updatedAt, "updatedAt");
    }
}
