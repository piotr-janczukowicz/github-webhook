package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The set of permissions for the GitHub app
 *
 * @param checks checks
 * @param contents contents
 * @param deployments deployments
 * @param issues issues
 * @param metadata metadata
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/app/properties/permissions")
public record GitHubWebhookGitHubAppPermissions(
        @Nullable String checks,
        @Nullable String contents,
        @Nullable String deployments,
        @Nullable String issues,
        @Nullable String metadata) {}
