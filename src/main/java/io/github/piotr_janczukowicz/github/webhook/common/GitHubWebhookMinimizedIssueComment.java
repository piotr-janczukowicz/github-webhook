package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * Details about why an issue comment was minimized.
 *
 * @param reason The reason the comment was minimized.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/comment/properties/minimized")
public record GitHubWebhookMinimizedIssueComment(@Nullable String reason) {}
