package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * An actor allowed to dismiss pull request reviews
 *
 * @param id ID of the actor that can dismiss reviews.
 * @param type The type of the actor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters/properties/dismissal_restriction/properties/allowed_actors/items")
public record GitHubWebhookActor(long id, GitHubWebhookActorType type) {
    public GitHubWebhookActor {
        requireNonNull(type, "type");
    }
}
