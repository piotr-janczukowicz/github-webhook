package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow job waiting workflow job step status. */
@CatalogSchema(
        "webhooks/workflow-job-waiting/requestBody/properties/workflow_job/properties/steps/items/properties/status")
public enum GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus {
    COMPLETED("completed"),
    IN_PROGRESS("in_progress"),
    QUEUED("queued"),
    PENDING("pending"),
    WAITING("waiting"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus.class,
                    GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus(final String wireValue) {
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
     * The workflow job waiting workflow job step status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowJobWaitingWorkflowJobStepStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
