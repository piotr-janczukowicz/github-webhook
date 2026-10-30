package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * Context around who pinned an issue comment and when it was pinned.
 *
 * @param pinnedAt pinned_at
 * @param pinnedBy pinned_by
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/issue-comment-created/requestBody/properties/comment/properties/pin")
public record GitHubWebhookPinnedIssueComment(
        Instant pinnedAt, @Nullable GitHubWebhookSimpleUser pinnedBy) {
    public GitHubWebhookPinnedIssueComment {
        requireNonNull(pinnedAt, "pinnedAt");
    }
}
