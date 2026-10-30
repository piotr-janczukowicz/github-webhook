package io.github.piotr_janczukowicz.github.webhook.issues;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The previous field value, present when an existing value was updated.
 *
 * @param issueFieldValue The previous issue field value data.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issues-field-added/requestBody/properties/changes")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookIssuesFieldAddedChanges(
        @Nullable GitHubWebhookIssuesFieldAddedChangesIssueFieldValue issueFieldValue) {}
