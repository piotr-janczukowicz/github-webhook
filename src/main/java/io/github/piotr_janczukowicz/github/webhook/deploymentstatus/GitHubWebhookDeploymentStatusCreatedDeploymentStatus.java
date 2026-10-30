package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The [deployment status](https://docs.github.com/rest/deployments/statuses#list-deployment-statuses).
 *
 * @param createdAt created_at
 * @param creator creator
 * @param deploymentUrl deployment_url
 * @param description The optional human-readable description added to the status.
 * @param environment environment
 * @param environmentUrl environment_url
 * @param id id
 * @param logUrl log_url
 * @param nodeId node_id
 * @param performedViaGithubApp GitHub apps are a new way to extend GitHub. They can be installed directly on
 *     organizations and user accounts and granted access to specific repositories. They come with granular permissions
 *     and built-in webhooks. GitHub apps are first class actors within GitHub.
 * @param repositoryUrl repository_url
 * @param state The new state. Can be {@code pending}, {@code success}, {@code failure}, or {@code error}.
 * @param targetUrl The optional link added to the status.
 * @param updatedAt updated_at
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-status-created/requestBody/properties/deployment_status")
public record GitHubWebhookDeploymentStatusCreatedDeploymentStatus(
        String createdAt,
        @Nullable GitHubWebhookUser creator,
        String deploymentUrl,
        String description,
        String environment,
        @Nullable String environmentUrl,
        long id,
        @Nullable String logUrl,
        String nodeId,
        @Nullable GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp performedViaGithubApp,
        String repositoryUrl,
        String state,
        String targetUrl,
        String updatedAt,
        String url) {
    public GitHubWebhookDeploymentStatusCreatedDeploymentStatus {
        requireNonNull(createdAt, "createdAt");
        requireNonNull(deploymentUrl, "deploymentUrl");
        requireNonNull(description, "description");
        requireNonNull(environment, "environment");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(repositoryUrl, "repositoryUrl");
        requireNonNull(state, "state");
        requireNonNull(targetUrl, "targetUrl");
        requireNonNull(updatedAt, "updatedAt");
        requireNonNull(url, "url");
    }
}
