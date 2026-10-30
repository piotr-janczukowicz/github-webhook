package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The secret scanning alert created alert payload.
 *
 * @param assignedTo assigned_to
 * @param closureRequestComment An optional comment from the closure request author.
 * @param closureRequestReviewer closure_request_reviewer
 * @param closureRequestReviewerComment An optional comment from the closure request reviewer.
 * @param createdAt The time that the alert was created in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param htmlUrl The GitHub URL of the alert resource.
 * @param locationsUrl The REST API URL of the code locations for this alert.
 * @param metadata A list of metadata key/value pairs associated with the secret scanning alert.
 * @param multiRepo Whether the detected secret was found in multiple repositories in the same organization or business.
 * @param number The security alert number.
 * @param provider The provider of the secret that was detected.
 * @param providerSlug The slug identifier for the provider of the secret that was detected.
 * @param publiclyLeaked Whether the detected secret was publicly leaked.
 * @param pushProtectionBypassRequestComment An optional comment when requesting a push protection bypass.
 * @param pushProtectionBypassRequestHtmlUrl The URL to a push protection bypass request.
 * @param pushProtectionBypassRequestReviewer push_protection_bypass_request_reviewer
 * @param pushProtectionBypassRequestReviewerComment An optional comment when reviewing a push protection bypass.
 * @param pushProtectionBypassed Whether push protection was bypassed for the detected secret.
 * @param pushProtectionBypassedAt The time that push protection was bypassed in ISO 8601 format:
 *     {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param pushProtectionBypassedBy push_protection_bypassed_by
 * @param resolution The reason for resolving the alert.
 * @param resolutionComment An optional comment to resolve an alert.
 * @param resolvedAt The time that the alert was resolved in ISO 8601 format: {@code YYYY-MM-DDTHH:MM:SSZ}.
 * @param resolvedBy resolved_by
 * @param secretCategory The category of the detected secret. {@code default} covers specific provider patterns and
 *     custom patterns; {@code generic} covers non-specific patterns and AI-detected secrets.
 * @param secretType The type of secret that secret scanning detected.
 * @param secretTypeDisplayName User-friendly name for the detected secret, matching the {@code secret_type}. For a list
 *     of built-in patterns, see "[Supported secret scanning
 *     patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets)."
 * @param updatedAt updated_at
 * @param url The REST API URL of the alert resource.
 * @param validity The token status as of the latest validity check.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-alert-assigned/requestBody/properties/alert")
public record GitHubWebhookSecretScanningAlertCreatedAlert(
        @Nullable GitHubWebhookSimpleUser assignedTo,
        @Nullable String closureRequestComment,
        @Nullable GitHubWebhookSimpleUser closureRequestReviewer,
        @Nullable String closureRequestReviewerComment,
        @Nullable Instant createdAt,
        @Nullable String htmlUrl,
        @Nullable String locationsUrl,
        @Nullable List<GitHubWebhookSecretScanningAlertCreatedAlertMetadata> metadata,
        @Nullable Boolean multiRepo,
        @Nullable Long number,
        @Nullable String provider,
        @Nullable String providerSlug,
        @Nullable Boolean publiclyLeaked,
        @Nullable String pushProtectionBypassRequestComment,
        @Nullable String pushProtectionBypassRequestHtmlUrl,
        @Nullable GitHubWebhookSimpleUser pushProtectionBypassRequestReviewer,
        @Nullable String pushProtectionBypassRequestReviewerComment,
        @Nullable Boolean pushProtectionBypassed,
        @Nullable Instant pushProtectionBypassedAt,
        @Nullable GitHubWebhookSimpleUser pushProtectionBypassedBy,
        @Nullable GitHubWebhookSecretScanningAlertCreatedAlertResolution resolution,
        @Nullable String resolutionComment,
        @Nullable Instant resolvedAt,
        @Nullable GitHubWebhookSimpleUser resolvedBy,
        @Nullable GitHubWebhookSecretScanningAlertCreatedAlertSecretCategory secretCategory,
        @Nullable String secretType,
        @Nullable String secretTypeDisplayName,
        @Nullable Instant updatedAt,
        @Nullable String url,
        @Nullable GitHubWebhookSecretScanningAlertCreatedAlertValidity validity) {}
