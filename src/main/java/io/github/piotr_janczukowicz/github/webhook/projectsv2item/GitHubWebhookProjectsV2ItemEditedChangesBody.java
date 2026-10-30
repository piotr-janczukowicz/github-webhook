package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The projects v2 item edited changes body payload.
 *
 * @param body body
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-edited/requestBody/properties/changes/oneOf/1")
public record GitHubWebhookProjectsV2ItemEditedChangesBody(GitHubWebhookMemberEditedChangesPermission body)
        implements GitHubWebhookProjectsV2ItemEditedChanges {
    public GitHubWebhookProjectsV2ItemEditedChangesBody {
        requireNonNull(body, "body");
    }
}
