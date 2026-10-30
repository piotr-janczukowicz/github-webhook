package io.github.piotr_janczukowicz.github.webhook.securityandanalysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookFullRepositorySecurityAndAnalysis;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The security and analysis changes from payload.
 *
 * @param securityAndAnalysis security_and_analysis
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/security-and-analysis/requestBody/properties/changes/properties/from")
public record GitHubWebhookSecurityAndAnalysisChangesFrom(
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysis securityAndAnalysis) {}
