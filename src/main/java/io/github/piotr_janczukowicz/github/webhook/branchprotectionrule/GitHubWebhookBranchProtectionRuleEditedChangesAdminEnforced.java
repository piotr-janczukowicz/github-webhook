package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The branch protection rule edited changes admin enforced payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/branch-protection-rule-edited/requestBody/properties/changes/properties/admin_enforced")
public record GitHubWebhookBranchProtectionRuleEditedChangesAdminEnforced(
        @Nullable Boolean from) {}
