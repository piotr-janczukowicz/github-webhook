package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The security advisory updated security advisory cvss severities payload.
 *
 * @param cvssV3 cvss_v3
 * @param cvssV4 cvss_v4
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/cvss_severities")
public record GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities(
        @Nullable GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3 cvssV3,
        @Nullable GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3 cvssV4) {}
