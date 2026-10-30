package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The workflows parameters payload.
 *
 * @param doNotEnforceOnCreate Allow repositories and branches to be created if a check would otherwise prohibit it.
 * @param workflows Workflows that must pass for this rule to pass.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/15/properties/parameters")
public record GitHubWebhookWorkflowsParameters(
        @Nullable Boolean doNotEnforceOnCreate, List<GitHubWebhookWorkflowFileReference> workflows) {
    public GitHubWebhookWorkflowsParameters {
        requireNonNull(workflows, "workflows");
    }
}
