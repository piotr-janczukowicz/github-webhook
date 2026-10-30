package io.github.piotr_janczukowicz.github.webhook.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The changes to the comment.
 *
 * @param body body
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-edited/requestBody/properties/changes")
public record GitHubWebhookIssueCommentEditedChanges(
        @Nullable GitHubWebhookIssuesEditedChangesBody body) {}
