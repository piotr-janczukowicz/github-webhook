package io.github.piotr_janczukowicz.github.webhook.checkrun;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckRunPullRequest;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookGitHubApp;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A suite of checks performed on the code of a given code change
 *
 * @param after after
 * @param app GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user
 *     accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks.
 *     GitHub apps are first class actors within GitHub.
 * @param before before
 * @param conclusion conclusion
 * @param createdAt created_at
 * @param headBranch head_branch
 * @param headSha The SHA of the head commit that is being checked.
 * @param id id
 * @param nodeId node_id
 * @param pullRequests pull_requests
 * @param repository Minimal Repository
 * @param status status
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite")
public record GitHubWebhookCheckRunCheckSuite(
        @Nullable String after,
        @Nullable GitHubWebhookGitHubApp app,
        @Nullable String before,
        @Nullable GitHubWebhookCheckRunCheckSuiteConclusion conclusion,
        @Nullable Instant createdAt,
        @Nullable String headBranch,
        @Nullable String headSha,
        @Nullable Long id,
        @Nullable String nodeId,
        @Nullable List<GitHubWebhookCheckRunPullRequest> pullRequests,
        @Nullable GitHubWebhookMinimalRepository repository,
        @Nullable GitHubWebhookCheckRunCheckSuiteStatus status,
        @Nullable Instant updatedAt,
        @Nullable String url) {}
