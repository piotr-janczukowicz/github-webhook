package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;

/**
 * The branch protection rule edited changes authorized actor names payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/branch-protection-rule-edited/requestBody/properties/changes/properties/authorized_actor_names")
public record GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames(List<String> from) {
    public GitHubWebhookBranchProtectionRuleEditedChangesAuthorizedActorNames {
        requireNonNull(from, "from");
    }
}
