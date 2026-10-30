package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The project column edited changes payload.
 *
 * @param name name
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-column-edited/requestBody/properties/changes")
public record GitHubWebhookProjectColumnEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody name) {}
