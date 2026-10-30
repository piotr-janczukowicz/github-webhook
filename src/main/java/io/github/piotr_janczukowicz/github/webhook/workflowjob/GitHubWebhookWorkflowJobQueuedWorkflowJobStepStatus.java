package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow job queued workflow job step status. */
@CatalogSchema(
        "webhooks/workflow-job-queued/requestBody/properties/workflow_job/properties/steps/items/properties/status")
public enum GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus {
    COMPLETED("completed"),
    IN_PROGRESS("in_progress"),
    QUEUED("queued"),
    PENDING("pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus.class,
                    GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus(final String wireValue) {
        this.wireValue = wireValue;
    }

    /**
     * Value GitHub sends in JSON.
     *
     * @return wire string
     */
    @JsonValue
    public String wireValue() {
        return wireValue;
    }

    /**
     * The workflow job queued workflow job step status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowJobQueuedWorkflowJobStepStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
