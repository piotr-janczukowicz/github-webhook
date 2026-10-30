package io.github.piotr_janczukowicz.github.webhook.checkrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookGitHubApp;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * A deployment created as the result of an Actions check run from a workflow that references an environment
 *
 * @param createdAt created_at
 * @param description description
 * @param environment Name for the target deployment environment.
 * @param id Unique identifier of the deployment
 * @param nodeId node_id
 * @param originalEnvironment original_environment
 * @param performedViaGithubApp performed_via_github_app
 * @param productionEnvironment Specifies if the given environment is one that end-users directly interact with.
 *     Default: false.
 * @param repositoryUrl repository_url
 * @param statusesUrl statuses_url
 * @param task Parameter to specify a task to execute
 * @param transientEnvironment Specifies if the given environment is will no longer exist at some point in the future.
 *     Default: false.
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/check-run-completed/requestBody/properties/check_run/properties/deployment")
public record GitHubWebhookDeployment(
        Instant createdAt,
        @Nullable String description,
        String environment,
        long id,
        String nodeId,
        @Nullable String originalEnvironment,
        @Nullable GitHubWebhookGitHubApp performedViaGithubApp,
        @Nullable Boolean productionEnvironment,
        String repositoryUrl,
        String statusesUrl,
        String task,
        @Nullable Boolean transientEnvironment,
        Instant updatedAt,
        String url) {
    public GitHubWebhookDeployment {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(environment, "environment");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(task, "task");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
