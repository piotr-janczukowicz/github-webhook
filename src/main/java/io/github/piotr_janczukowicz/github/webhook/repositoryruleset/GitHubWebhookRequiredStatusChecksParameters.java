package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The required status checks parameters payload.
 *
 * @param doNotEnforceOnCreate Allow repositories and branches to be created if a check would otherwise prohibit it.
 * @param requiredStatusChecks Status checks that are required.
 * @param strictRequiredStatusChecksPolicy Whether pull requests targeting a matching branch must be tested with the
 *     latest code. This setting will not take effect unless at least one status check is enabled.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/8/properties/parameters")
public record GitHubWebhookRequiredStatusChecksParameters(
        @Nullable Boolean doNotEnforceOnCreate,
        List<GitHubWebhookStatusCheckConfiguration> requiredStatusChecks,
        boolean strictRequiredStatusChecksPolicy) {
    public GitHubWebhookRequiredStatusChecksParameters {
        requireNonNull(requiredStatusChecks, "requiredStatusChecks");
    }
}
