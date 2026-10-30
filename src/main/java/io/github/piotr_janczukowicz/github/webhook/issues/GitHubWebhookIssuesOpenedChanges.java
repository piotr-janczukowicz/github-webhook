package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The issues opened changes payload.
 *
 * @param oldIssue The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 * @param oldRepository A git repository
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-opened/requestBody/properties/changes")
public record GitHubWebhookIssuesOpenedChanges(
        @Nullable GitHubWebhookIssuesOpenedChangesOldIssue oldIssue,
        GitHubWebhookIssuesOpenedChangesOldRepository oldRepository) {
    public GitHubWebhookIssuesOpenedChanges {
        requireNonNull(oldRepository, "oldRepository");
    }
}
