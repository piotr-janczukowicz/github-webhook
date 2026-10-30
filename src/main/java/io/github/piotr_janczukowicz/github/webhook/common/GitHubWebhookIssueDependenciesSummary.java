package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The issue dependencies summary payload.
 *
 * @param blockedBy blocked_by
 * @param blocking blocking
 * @param totalBlockedBy total_blocked_by
 * @param totalBlocking total_blocking
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/issue_dependencies_summary")
public record GitHubWebhookIssueDependenciesSummary(
        long blockedBy, long blocking, long totalBlockedBy, long totalBlocking) {}
