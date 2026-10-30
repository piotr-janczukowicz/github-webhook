package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The project card converted changes payload.
 *
 * @param note note
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/project-card-converted/requestBody/properties/changes")
public record GitHubWebhookProjectCardConvertedChanges(GitHubWebhookIssuesEditedChangesBody note) {
    public GitHubWebhookProjectCardConvertedChanges {
        requireNonNull(note, "note");
    }
}
