package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.OffsetDateTime;
import org.jspecify.annotations.Nullable;

/**
 * A commit.
 *
 * @param author Information about the Git author
 * @param committer Information about the Git committer
 * @param id SHA for the commit
 * @param message Message describing the purpose of the commit
 * @param timestamp Timestamp of the commit
 * @param treeId SHA for the commit's tree
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/merge-group-checks-requested/requestBody/properties/merge_group/properties/head_commit")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public record GitHubWebhookSimpleCommit(
        @Nullable GitHubWebhookSimpleCommitAuthor author,
        @Nullable GitHubWebhookSimpleCommitAuthor committer,
        String id,
        String message,

        @SuppressSchemaTypeMismatch("a git commit time keeps the UTC offset of its author, read as an OffsetDateTime")
        OffsetDateTime timestamp,

        String treeId) {
    public GitHubWebhookSimpleCommit {
        requireNonNull(id, "id");
        requireNonNull(message, "message");
        requireNonNull(timestamp, "timestamp");
        requireNonNull(treeId, "treeId");
    }
}
