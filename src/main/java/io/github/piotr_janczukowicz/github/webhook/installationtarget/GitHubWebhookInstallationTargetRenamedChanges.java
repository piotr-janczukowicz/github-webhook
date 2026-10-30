package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookIssuesEditedChangesBody;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The installation target renamed changes payload.
 *
 * @param login login
 * @param slug slug
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/installation-target-renamed/requestBody/properties/changes")
public record GitHubWebhookInstallationTargetRenamedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody login,
        @Nullable GitHubWebhookIssuesEditedChangesBody slug) {}
