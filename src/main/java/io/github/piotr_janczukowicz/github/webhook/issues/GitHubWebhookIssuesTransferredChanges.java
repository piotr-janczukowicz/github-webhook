package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The issues transferred changes payload.
 *
 * @param newIssue The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
 * @param newRepository A git repository
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-transferred/requestBody/properties/changes")
public record GitHubWebhookIssuesTransferredChanges(
        GitHubWebhookIssuesPinnedIssue newIssue, GitHubWebhookIssuesTransferredChangesNewRepository newRepository) {
    public GitHubWebhookIssuesTransferredChanges {
        requireNonNull(newIssue, "newIssue");
        requireNonNull(newRepository, "newRepository");
    }
}
