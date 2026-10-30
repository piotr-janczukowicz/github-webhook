package io.github.piotr_janczukowicz.github.webhook.issues;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The previous issue field value data.
 *
 * @param from The previous value of the issue field before the update.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-field-added/requestBody/properties/changes/properties/issue_field_value")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedChangesIssueFieldValue(GitHubWebhookIssuesFieldAddedIssueFieldValue from) {
    public GitHubWebhookIssuesFieldAddedChangesIssueFieldValue {
        requireNonNull(from, "from");
    }
}
