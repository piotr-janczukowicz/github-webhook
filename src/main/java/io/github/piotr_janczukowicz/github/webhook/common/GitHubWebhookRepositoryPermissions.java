package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The repository permissions payload.
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
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/permissions")
public record GitHubWebhookRepositoryPermissions(
        boolean admin,
        @Nullable Boolean maintain,
        boolean pull,
        boolean push,
        @Nullable Boolean triage) {}
