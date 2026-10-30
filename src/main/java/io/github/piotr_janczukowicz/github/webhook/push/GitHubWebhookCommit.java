package io.github.piotr_janczukowicz.github.webhook.push;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCommitter;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.OffsetDateTime;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The commit payload.
 *
 * @param added An array of files added in the commit. A maximum of 3000 changed files will be reported per commit.
 * @param author Metaproperties for Git author/committer information.
 * @param committer Metaproperties for Git author/committer information.
 * @param distinct Whether this commit is distinct from any that have been pushed before.
 * @param id id
 * @param message The commit message.
 * @param modified An array of files modified by the commit. A maximum of 3000 changed files will be reported per
 *     commit.
 * @param removed An array of files removed in the commit. A maximum of 3000 changed files will be reported per commit.
 * @param timestamp The ISO 8601 timestamp of the commit.
 * @param treeId tree_id
 * @param url URL that points to the commit API resource.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/push/requestBody/properties/commits/items")
public record GitHubWebhookCommit(
        @Nullable List<String> added,
        GitHubWebhookCommitter author,
        GitHubWebhookCommitter committer,
        boolean distinct,
        String id,
        String message,
        @Nullable List<String> modified,
        @Nullable List<String> removed,

        @SuppressSchemaTypeMismatch("a git commit time keeps the UTC offset of its author, read as an OffsetDateTime")
        OffsetDateTime timestamp,

        String treeId,
        String url) {
    public GitHubWebhookCommit {
        requireNonNull(author, "author");
        requireNonNull(committer, "committer");
        requireNonNull(id, "id");
        requireNonNull(message, "message");
        requireNonNull(timestamp, "timestamp");
        requireNonNull(treeId, "treeId");
        requireNonNull(url, "url");
    }
}
