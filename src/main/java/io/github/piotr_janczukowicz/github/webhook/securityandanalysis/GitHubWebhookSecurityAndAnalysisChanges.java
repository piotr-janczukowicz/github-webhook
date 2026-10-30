package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The security and analysis changes payload.
 *
 * @param from from
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/security-and-analysis/requestBody/properties/changes")
public record GitHubWebhookSecurityAndAnalysisChanges(
        @Nullable GitHubWebhookSecurityAndAnalysisChangesFrom from) {}
