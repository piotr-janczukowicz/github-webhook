package io.github.piotr_janczukowicz.github.webhook.deployment;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.util.Map;
import org.jspecify.annotations.Nullable;

/**
 * The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).
 *
 * @param createdAt created_at
 * @param creator creator
 * @param description description
 * @param environment environment
 * @param id id
 * @param nodeId node_id
 * @param originalEnvironment original_environment
 * @param payload payload
 * @param performedViaGithubApp GitHub apps are a new way to extend GitHub. They can be installed directly on
 *     organizations and user accounts and granted access to specific repositories. They come with granular permissions
 *     and built-in webhooks. GitHub apps are first class actors within GitHub.
 * @param productionEnvironment production_environment
 * @param ref ref
 * @param repositoryUrl repository_url
 * @param sha sha
 * @param statusesUrl statuses_url
 * @param task task
 * @param transientEnvironment transient_environment
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-created/requestBody/properties/deployment")
public record GitHubWebhookDeployment(
        String createdAt,
        @Nullable GitHubWebhookUser creator,
        @Nullable String description,
        String environment,
        long id,
        String nodeId,
        String originalEnvironment,

        @SuppressSchemaTypeMismatch(
                "a string or number or boolean is read as the value of `value` of a free-form object")
        Map<String, Object> payload,

        @Nullable GitHubWebhookApp performedViaGithubApp,
        @Nullable Boolean productionEnvironment,
        String ref,
        String repositoryUrl,
        String sha,
        String statusesUrl,
        String task,
        @Nullable Boolean transientEnvironment,
        String updatedAt,
        String url) {
    public GitHubWebhookDeployment {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(environment, "environment");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(originalEnvironment, "originalEnvironment");
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
