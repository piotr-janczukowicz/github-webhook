package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.OffsetDateTime;

/**
 * The simple commit payload.
 *
 * @param author Metaproperties for Git author/committer information.
 * @param committer Metaproperties for Git author/committer information.
 * @param id id
 * @param message message
 * @param timestamp timestamp
 * @param treeId tree_id
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-suite-completed/requestBody/properties/check_suite/properties/head_commit")
public record GitHubWebhookSimpleCommit(
        GitHubWebhookCommitter author,
        GitHubWebhookCommitter committer,
        String id,
        String message,

        @SuppressSchemaTypeMismatch("a git commit time keeps the UTC offset of its author, read as an OffsetDateTime")
        OffsetDateTime timestamp,

        String treeId) {
    public GitHubWebhookSimpleCommit {
        requireNonNull(author, "author");
        requireNonNull(committer, "committer");
        requireNonNull(id, "id");
        requireNonNull(message, "message");
        requireNonNull(timestamp, "timestamp");
        requireNonNull(treeId, "treeId");
    }
}
