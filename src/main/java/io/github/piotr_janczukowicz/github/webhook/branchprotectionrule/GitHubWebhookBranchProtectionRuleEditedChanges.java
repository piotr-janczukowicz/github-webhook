package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * If the action was {@code edited}, the changes to the rule.
 *
 * @param adminEnforced admin_enforced
 * @param authorizedActorNames authorized_actor_names
 * @param authorizedActorsOnly authorized_actors_only
 * @param authorizedDismissalActorsOnly authorized_dismissal_actors_only
 * @param linearHistoryRequirementEnforcementLevel linear_history_requirement_enforcement_level
 * @param lockAllowsForkSync lock_allows_fork_sync
 * @param lockBranchEnforcementLevel lock_branch_enforcement_level
 * @param pullRequestReviewsEnforcementLevel pull_request_reviews_enforcement_level
 * @param requireLastPushApproval require_last_push_approval
 * @param requiredStatusChecks required_status_checks
 * @param requiredStatusChecksEnforcementLevel required_status_checks_enforcement_level
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-rule-edited/requestBody/properties/changes")
public record GitHubWebhookBranchProtectionRuleEditedChanges(
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced adminEnforced,
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames authorizedActorNames,
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedActorsOnly,
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced authorizedDismissalActorsOnly,

        @Nullable GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel linearHistoryRequirementEnforcementLevel,

        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced lockAllowsForkSync,
        @Nullable GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel lockBranchEnforcementLevel,
        @Nullable GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel pullRequestReviewsEnforcementLevel,
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced requireLastPushApproval,
        @Nullable GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames requiredStatusChecks,

        @Nullable GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel requiredStatusChecksEnforcementLevel) {}
