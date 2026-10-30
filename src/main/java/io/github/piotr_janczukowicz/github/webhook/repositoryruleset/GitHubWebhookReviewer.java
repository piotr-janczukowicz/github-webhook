package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * A required reviewing team
 *
 * @param id ID of the reviewer which must review changes to matching files.
 * @param type The type of the reviewer
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/7/properties/parameters/properties/required_reviewers/items/properties/reviewer")
public record GitHubWebhookReviewer(long id, GitHubWebhookReviewerType type) {
    public GitHubWebhookReviewer {
        requireNonNull(type, "type");
    }
}
