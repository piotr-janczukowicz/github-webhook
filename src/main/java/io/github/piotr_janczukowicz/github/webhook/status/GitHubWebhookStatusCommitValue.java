package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The status commit value payload.
 *
 * @param author author
 * @param commentCount comment_count
 * @param committer committer
 * @param message message
 * @param tree tree
 * @param url url
 * @param verification verification
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit/properties/commit")
public record GitHubWebhookStatusCommitValue(
        GitHubWebhookCommitter author,
        long commentCount,
        GitHubWebhookCommitter committer,
        String message,
        GitHubWebhookStatusCommitValueTree tree,
        String url,
        GitHubWebhookStatusCommitValueVerification verification) {
    public GitHubWebhookStatusCommitValue {
        requireNonNull(author, "author");
        requireNonNull(committer, "committer");
        requireNonNull(message, "message");
        requireNonNull(tree, "tree");
        requireNonNull(url, "url");
        requireNonNull(verification, "verification");
    }
}
