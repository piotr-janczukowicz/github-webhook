package io.github.piotr_janczukowicz.github.webhook.member;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookMemberEditedChangesPermission;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the collaborator permissions
 *
 * @param oldPermission old_permission
 * @param permission permission
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/member-edited/requestBody/properties/changes")
public record GitHubWebhookMemberEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody oldPermission,
        @Nullable GitHubWebhookMemberEditedChangesPermission permission) {}
