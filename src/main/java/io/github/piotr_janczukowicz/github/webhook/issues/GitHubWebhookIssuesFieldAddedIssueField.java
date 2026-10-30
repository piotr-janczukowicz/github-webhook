package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The issue field whose value was set or updated on the issue.
 *
 * @param fieldType The data type of the issue field.
 * @param id The unique identifier of the issue field.
 * @param name The name of the issue field.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-field-added/requestBody/properties/issue_field")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedIssueField(
        GitHubWebhookIssuesFieldAddedIssueFieldFieldType fieldType, long id, String name) {
    public GitHubWebhookIssuesFieldAddedIssueField {
        requireNonNull(fieldType, "fieldType");
        requireNonNull(name, "name");
    }
}
