package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Required status check
 *
 * @param context The status check context name that must be present on the commit.
 * @param integrationId The optional integration ID that this status check must originate from.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/8/properties/parameters/properties/required_status_checks/items")
public record GitHubWebhookStatusCheckConfiguration(
        String context, @Nullable Long integrationId) {
    public GitHubWebhookStatusCheckConfiguration {
        requireNonNull(context, "context");
    }
}
