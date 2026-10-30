package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Prevent commits that include changes in specified file and folder paths from being pushed to the commit graph. This
 * includes absolute paths that contain file names.
 *
 * @param parameters parameters
 * @param type type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/21")
public record GitHubWebhookFilePathRestriction(
        @Nullable GitHubWebhookFilePathRestrictionParameters parameters, GitHubWebhookFilePathRestrictionType type)
        implements GitHubWebhookRepositoryRulesetRule {
    public GitHubWebhookFilePathRestriction {
        requireNonNull(type, "type");
    }
}
