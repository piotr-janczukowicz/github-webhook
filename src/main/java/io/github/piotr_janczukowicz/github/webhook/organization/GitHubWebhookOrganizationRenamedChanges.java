package io.github.piotr_janczukowicz.github.webhook.organization;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookProjectCardEditedChangesNote;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The organization renamed changes payload.
 *
 * @param login login
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/organization-renamed/requestBody/properties/changes")
public record GitHubWebhookOrganizationRenamedChanges(
        @Nullable GitHubWebhookProjectCardEditedChangesNote login) {}
