package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The EPSS scores as calculated by the [Exploit Prediction Scoring System](https://www.first.org/epss).
 *
 * @param percentage percentage
 * @param percentile percentile
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/epss")
public record GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss(
        @Nullable Double percentage, @Nullable Double percentile) {}
