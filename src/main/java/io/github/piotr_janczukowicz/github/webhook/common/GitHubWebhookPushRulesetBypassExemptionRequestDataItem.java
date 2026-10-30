package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The push ruleset bypass exemption request data item payload.
 *
 * @param ruleType The type of rule that was violated
 * @param rulesetId The ID of the ruleset for the rules that were violated
 * @param rulesetName The name of the ruleset for the rules that were violated
 * @param totalViolations The number of violations
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/0/properties/data/items")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public record GitHubWebhookPushRulesetBypassExemptionRequestDataItem(
        @Nullable String ruleType,
        @Nullable Long rulesetId,
        @Nullable String rulesetName,
        @Nullable Long totalViolations) {}
