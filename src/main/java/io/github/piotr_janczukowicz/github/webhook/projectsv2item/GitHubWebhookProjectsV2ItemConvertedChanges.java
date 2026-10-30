package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item converted changes payload.
 *
 * @param contentType content_type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-converted/requestBody/properties/changes")
public record GitHubWebhookProjectsV2ItemConvertedChanges(
        @Nullable GitHubWebhookMemberEditedChangesPermission contentType) {}
