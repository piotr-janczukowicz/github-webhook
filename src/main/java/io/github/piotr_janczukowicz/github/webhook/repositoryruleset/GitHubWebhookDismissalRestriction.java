package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Specify people, teams, or apps allowed to dismiss pull request reviews.
 *
 * @param allowedActors Specify people, teams, or apps allowed to dismiss pull request reviews.
 * @param enabled Whether to restrict review dismissal to specific actors.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters/properties/dismissal_restriction")
public record GitHubWebhookDismissalRestriction(@Nullable List<GitHubWebhookActor> allowedActors, boolean enabled) {}
