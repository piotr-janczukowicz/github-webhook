package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset conditions repository name payload.
 *
 * @param exclude Array of repository names or patterns to exclude. The condition will not pass if any of these patterns
 *     match.
 * @param include Array of repository names or patterns to include. One of these patterns must match for the condition
 *     to pass. Also accepts {@code ~ALL} to include all repositories.
 * @param protectedValue Whether renaming of target repositories is prevented.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/conditions/properties/repository_name")
public record GitHubWebhookRepositoryRulesetConditionsRepositoryName(
        @Nullable List<String> exclude,
        @Nullable List<String> include,
        @Nullable @JsonProperty("protected") Boolean protectedValue) {}
