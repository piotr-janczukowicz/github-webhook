package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The issues edited changes body payload.
 *
 * @param from The previous permissions of the collaborator if the action was edited.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/discussion-comment-edited/requestBody/properties/changes/properties/body")
public record GitHubWebhookIssuesEditedChangesBody(String from) {
    public GitHubWebhookIssuesEditedChangesBody {
        requireNonNull(from, "from");
    }
}
