package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

/**
 * The deployment status created check run payload.
 *
 * @param completedAt completed_at
 * @param conclusion The result of the completed check run. This value will be {@code null} until the check run has
 *     completed.
 * @param detailsUrl details_url
 * @param externalId external_id
 * @param headSha The SHA of the commit that is being checked.
 * @param htmlUrl html_url
 * @param id The id of the check.
 * @param name The name of the check run.
 * @param nodeId node_id
 * @param startedAt started_at
 * @param status The current status of the check run. Can be {@code queued}, {@code in_progress}, or {@code completed}.
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/deployment-status-created/requestBody/properties/check_run")
public record GitHubWebhookDeploymentStatusCreatedCheckRun(
        @Nullable Instant completedAt,
        @Nullable GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion conclusion,
        String detailsUrl,
        String externalId,
        String headSha,
        String htmlUrl,
        long id,
        String name,
        String nodeId,
        Instant startedAt,
        GitHubWebhookDeploymentStatusCreatedCheckRunStatus status,
        String url) {
    public GitHubWebhookDeploymentStatusCreatedCheckRun {
        requireNonNull(detailsUrl, "detailsUrl");
        requireNonNull(externalId, "externalId");
        requireNonNull(headSha, "headSha");
        requireNonNull(htmlUrl, "htmlUrl");
        requireNonNull(name, "name");
        requireNonNull(nodeId, "nodeId");
        requireNonNull(startedAt, "startedAt");
        requireNonNull(status, "status");
        requireNonNull(url, "url");
    }
}
