package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * A request for a specific ref(branch,sha,tag) to be deployed
 *
 * @param createdAt created_at
 * @param creator creator
 * @param description description
 * @param environment Name for the target deployment environment.
 * @param id Unique identifier of the deployment
 * @param nodeId node_id
 * @param originalEnvironment original_environment
 * @param payload payload
 * @param performedViaGithubApp performed_via_github_app
 * @param productionEnvironment Specifies if the given environment is one that end-users directly interact with.
 *     Default: false.
 * @param ref The ref to deploy. This can be a branch, tag, or sha.
 * @param repositoryUrl repository_url
 * @param sha sha
 * @param statusesUrl statuses_url
 * @param task Parameter to specify a task to execute
 * @param transientEnvironment Specifies if the given environment is will no longer exist at some point in the future.
 *     Default: false.
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-protection-rule-requested/requestBody/properties/deployment")
public record GitHubWebhookDeployment(
        Instant createdAt,
        @Nullable GitHubWebhookSimpleUser creator,
        @Nullable String description,
        String environment,
        long id,
        String nodeId,
        @Nullable String originalEnvironment,

        @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> payload,

        @Nullable GitHubWebhookGitHubApp performedViaGithubApp,
        @Nullable Boolean productionEnvironment,
        String ref,
        String repositoryUrl,
        String sha,
        String statusesUrl,
        String task,
        @Nullable Boolean transientEnvironment,
        Instant updatedAt,
        String url) {
    public GitHubWebhookDeployment {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(environment, "environment");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(payload, "payload");
        requireNonNull(ref, "ref");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(sha, "sha");
        requireNonNull(statusesUrl, "statusesUrl");
        requireNonNull(task, "task");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
