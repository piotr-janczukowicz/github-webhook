package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The security advisory updated security advisory cvss severities cvss v3 payload.
 *
 * @param score The CVSS 3 score.
 * @param vectorString The CVSS 3 vector string.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/cvss_severities/properties/cvss_v3")
public record GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3(
        @Nullable Double score, @Nullable String vectorString) {}
