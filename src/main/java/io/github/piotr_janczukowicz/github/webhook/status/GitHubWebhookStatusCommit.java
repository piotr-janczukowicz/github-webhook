package io.github.piotr_janczukowicz.github.webhook.status;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * The status commit payload.
 *
 * @param author author
 * @param commentsUrl comments_url
 * @param commit commit
 * @param committer committer
 * @param htmlUrl html_url
 * @param nodeId node_id
 * @param parents parents
 * @param sha sha
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/status/requestBody/properties/commit")
public record GitHubWebhookStatusCommit(
        @Nullable GitHubWebhookUser author,
        String commentsUrl,
        GitHubWebhookStatusCommitValue commit,
        @Nullable GitHubWebhookUser committer,
        String htmlUrl,
        String nodeId,
        List<GitHubWebhookStatusCommitParent> parents,
        String sha,
        String url) {
    public GitHubWebhookStatusCommit {
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(commit, "commit");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(parents, "parents");
        requireNonNull(sha, "sha");
        requireNonNull(url, "url");
    }
}
