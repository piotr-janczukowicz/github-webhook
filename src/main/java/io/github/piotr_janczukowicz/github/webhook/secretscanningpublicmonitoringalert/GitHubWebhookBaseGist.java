package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookSimpleUser;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * Base Gist
 *
 * @param comments comments
 * @param commentsEnabled comments_enabled
 * @param commentsUrl comments_url
 * @param commitsUrl commits_url
 * @param createdAt created_at
 * @param description description
 * @param files files
 * @param forksUrl forks_url
 * @param gitPullUrl git_pull_url
 * @param gitPushUrl git_push_url
 * @param htmlUrl html_url
 * @param id id
 * @param nodeId node_id
 * @param owner A GitHub user.
 * @param publicValue public
 * @param truncated truncated
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/gist")
@Flavors({GitHubWebhookFlavor.GHEC})
public record GitHubWebhookBaseGist(
        long comments,
        @Nullable Boolean commentsEnabled,
        String commentsUrl,
        String commitsUrl,
        Instant createdAt,
        @Nullable String description,
        Map<String, GitHubWebhookBaseGistFiles> files,
        String forksUrl,
        String gitPullUrl,
        String gitPushUrl,
        String htmlUrl,
        String id,
        String nodeId,
        @Nullable GitHubWebhookSimpleUser owner,
        @JsonProperty("public") boolean publicValue,
        @Nullable Boolean truncated,
        Instant updatedAt,
        String url) {
    public GitHubWebhookBaseGist {
        requireNonNull(commentsUrl, "commentsUrl");
        requireNonNull(commitsUrl, "commitsUrl");
        requireNonNull(createdAt, "createdAt");
        requireNonNull(files, "files");
        requireNonNull(forksUrl, "forksUrl");
        requireNonNull(gitPullUrl, "gitPullUrl");
        requireNonNull(gitPushUrl, "gitPushUrl");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(id, "id");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
