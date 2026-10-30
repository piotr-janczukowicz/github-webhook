package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The projects v2 item reordered changes payload.
 *
 * @param previousProjectsV2ItemNodeId previous_projects_v2_item_node_id
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/projects-v2-item-reordered/requestBody/properties/changes")
public record GitHubWebhookProjectsV2ItemReorderedChanges(
        @Nullable GitHubWebhookMemberEditedChangesPermission previousProjectsV2ItemNodeId) {}
