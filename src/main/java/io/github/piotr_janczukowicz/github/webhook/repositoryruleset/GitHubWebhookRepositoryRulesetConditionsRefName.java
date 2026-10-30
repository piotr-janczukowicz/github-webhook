package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset conditions ref name payload.
 *
 * @param exclude Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
 * @param include Array of ref names or patterns to include. One of these patterns must match for the condition to pass.
 *     Also accepts {@code ~DEFAULT_BRANCH} to include the default branch or {@code ~ALL} to include all branches.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/ref_name")
public record GitHubWebhookRepositoryRulesetConditionsRefName(
        @Nullable List<String> exclude, @Nullable List<String> include) {}
