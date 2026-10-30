package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The workflow job in progress workflow job step payload.
 *
 * @param completedAt completed_at
 * @param conclusion conclusion
 * @param name name
 * @param number number
 * @param startedAt started_at
 * @param status status
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/workflow-job-in-progress/requestBody/properties/workflow_job/properties/steps/items")
public record GitHubWebhookWorkflowJobInProgressWorkflowJobStep(
        @Nullable String completedAt,
        @Nullable GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion conclusion,
        String name,
        long number,
        @Nullable String startedAt,
        GitHubWebhookWorkflowJobInProgressWorkflowJobStepStatus status) {
    public GitHubWebhookWorkflowJobInProgressWorkflowJobStep {
        requireNonNull(name, "name");
        requireNonNull(status, "status");
    }
}
