package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The code coverage parameters payload.
 *
 * @param maxCoverageDrop The maximum percentage points that line coverage may drop relative to the default branch. Pull
 *     requests that reduce line coverage by more than this amount will be blocked.
 * @param minimumCoverage The absolute minimum line coverage percentage required. Pull requests with line coverage below
 *     this threshold will be blocked.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/18/properties/parameters")
public record GitHubWebhookCodeCoverageParameters(
        @Nullable Double maxCoverageDrop, @Nullable Double minimumCoverage) {}
