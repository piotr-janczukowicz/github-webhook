package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 edited changes payload.
 *
 * @param description description
 * @param publicValue public
 * @param shortDescription short_description
 * @param title title
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-edited/requestBody/properties/changes")
public record GitHubWebhookProjectsV2EditedChanges(
        @Nullable GitHubWebhookMemberEditedChangesPermission description,
        @Nullable @JsonProperty("public") GitHubWebhookProjectsV2EditedChangesPublic publicValue,
        @Nullable GitHubWebhookMemberEditedChangesPermission shortDescription,
        @Nullable GitHubWebhookMemberEditedChangesPermission title) {}
