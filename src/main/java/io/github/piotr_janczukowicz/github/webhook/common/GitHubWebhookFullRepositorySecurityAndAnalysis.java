package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The full repository security and analysis payload.
 *
 * @param advancedSecurity Enable or disable GitHub Advanced Security for the repository. For standalone Code Scanning
 *     or Secret Protection products, this parameter cannot be used.
 * @param codeSecurity code_security
 * @param dependabotSecurityUpdates Enable or disable Dependabot security updates for the repository.
 * @param secretScanning secret_scanning
 * @param secretScanningAiDetection secret_scanning_ai_detection
 * @param secretScanningDelegatedAlertDismissal secret_scanning_delegated_alert_dismissal
 * @param secretScanningDelegatedBypass secret_scanning_delegated_bypass
 * @param secretScanningDelegatedBypassOptions secret_scanning_delegated_bypass_options
 * @param secretScanningNonProviderPatterns secret_scanning_non_provider_patterns
 * @param secretScanningPushProtection secret_scanning_push_protection
 * @param secretScanningValidityChecks secret_scanning_validity_checks
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/security_and_analysis")
public record GitHubWebhookFullRepositorySecurityAndAnalysis(
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity advancedSecurity,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity codeSecurity,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity dependabotSecurityUpdates,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanning,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningAiDetection,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningDelegatedAlertDismissal,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningDelegatedBypass,

        @Nullable GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions secretScanningDelegatedBypassOptions,

        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningNonProviderPatterns,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningPushProtection,
        @Nullable GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurity secretScanningValidityChecks) {}
