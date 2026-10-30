package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The security and analysis secret scanning delegated bypass options payload.
 *
 * @param reviewers The bypass reviewers for secret scanning delegated bypass
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/security_and_analysis/properties/secret_scanning_delegated_bypass_options")
public record GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptions(
        @Nullable List<GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewer> reviewers) {}
