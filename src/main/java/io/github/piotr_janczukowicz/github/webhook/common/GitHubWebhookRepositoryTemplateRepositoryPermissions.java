package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository template repository permissions payload.
 *
 * @param admin admin
 * @param maintain maintain
 * @param pull pull
 * @param push push
 * @param triage triage
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/template_repository/properties/permissions")
public record GitHubWebhookRepositoryTemplateRepositoryPermissions(
        @Nullable Boolean admin,
        @Nullable Boolean maintain,
        @Nullable Boolean pull,
        @Nullable Boolean push,
        @Nullable Boolean triage) {}
