package io.github.piotr_janczukowicz.github.webhook.discussion;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The discussion category changed changes payload.
 *
 * @param category category
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-category-changed/requestBody/properties/changes")
public record GitHubWebhookDiscussionCategoryChangedChanges(
        GitHubWebhookDiscussionCategoryChangedChangesCategory category) {
    public GitHubWebhookDiscussionCategoryChangedChanges {
        requireNonNull(category, "category");
    }
}
