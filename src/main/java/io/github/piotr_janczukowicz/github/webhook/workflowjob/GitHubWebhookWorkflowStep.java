package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * The workflow step payload.
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
@CatalogSchema("webhooks/workflow-job-completed/requestBody/properties/workflow_job/properties/steps/items")
public record GitHubWebhookWorkflowStep(
        @Nullable String completedAt,
        @Nullable GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion conclusion,
        String name,
        long number,
        @Nullable String startedAt,
        GitHubWebhookWorkflowJobInProgressWorkflowJobStatus status) {
    public GitHubWebhookWorkflowStep {
        requireNonNull(name, "name");
        requireNonNull(status, "status");
    }
}
