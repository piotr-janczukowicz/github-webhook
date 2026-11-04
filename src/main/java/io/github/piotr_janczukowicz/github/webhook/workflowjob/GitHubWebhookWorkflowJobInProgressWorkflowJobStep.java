package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.openapi.model.SuppressSchemaTypeMismatch;
import java.time.Instant;
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
        @Nullable @SuppressSchemaTypeMismatch("type rule: date-time (completed_at)")
        Instant completedAt,

        @Nullable GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion conclusion,
        String name,
        long number,

        @Nullable @SuppressSchemaTypeMismatch("type rule: date-time (started_at)")
        Instant startedAt,

        GitHubWebhookWorkflowJobInProgressWorkflowJobStepStatus status) {
    public GitHubWebhookWorkflowJobInProgressWorkflowJobStep {
        requireNonNull(name, "name");
        requireNonNull(status, "status");
    }
}
