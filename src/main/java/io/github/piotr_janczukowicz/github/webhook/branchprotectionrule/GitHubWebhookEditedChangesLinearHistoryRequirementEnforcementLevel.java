package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The edited changes linear history requirement enforcement level payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/branch-protection-rule-edited/requestBody/properties/changes/properties/linear_history_requirement_enforcement_level")
public record GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel(
        GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel from) {
    public GitHubWebhookEditedChangesLinearHistoryRequirementEnforcementLevel {
        requireNonNull(from, "from");
    }
}
