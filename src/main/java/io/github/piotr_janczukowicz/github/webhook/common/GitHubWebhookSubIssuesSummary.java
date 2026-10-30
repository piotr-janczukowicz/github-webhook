package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The sub issues summary payload.
 *
 * @param completed completed
 * @param percentCompleted percent_completed
 * @param total total
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/issue/properties/sub_issues_summary")
public record GitHubWebhookSubIssuesSummary(long completed, long percentCompleted, long total) {}
