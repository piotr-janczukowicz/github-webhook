package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository ruleset links payload.
 *
 * @param html html
 * @param self self
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/_links")
public record GitHubWebhookRepositoryRulesetLinks(
        @Nullable GitHubWebhookRepositoryRulesetLinksHtml html,
        @Nullable GitHubWebhookRepositoryRulesetLinksHtml self) {}
