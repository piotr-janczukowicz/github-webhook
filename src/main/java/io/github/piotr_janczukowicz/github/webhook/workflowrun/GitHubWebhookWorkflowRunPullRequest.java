package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.github.webhook.common.GitHubWebhookCheckRunPullRequestBase;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;

/**
 * The workflow run pull request payload.
 *
 * @param base base
 * @param head head
 * @param id id
 * @param number number
 * @param url url
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/workflow-run-completed/requestBody/properties/workflow_run/properties/pull_requests/items")
public record GitHubWebhookWorkflowRunPullRequest(
        GitHubWebhookCheckRunPullRequestBase base,
        GitHubWebhookCheckRunPullRequestBase head,
        double id,
        double number,
        String url) {
    public GitHubWebhookWorkflowRunPullRequest {
        requireNonNull(base, "base");
        requireNonNull(head, "head");
        requireNonNull(url, "url");
    }
}
