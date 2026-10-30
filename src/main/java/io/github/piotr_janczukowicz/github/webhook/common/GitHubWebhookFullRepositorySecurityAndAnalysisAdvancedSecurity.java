package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Enable or disable GitHub Advanced Security for the repository. For standalone Code Scanning or Secret Protection
 * products, this parameter cannot be used.
 *
 * @param status status
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/security_and_analysis/properties/advanced_security")
public record GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity(
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus status) {}
