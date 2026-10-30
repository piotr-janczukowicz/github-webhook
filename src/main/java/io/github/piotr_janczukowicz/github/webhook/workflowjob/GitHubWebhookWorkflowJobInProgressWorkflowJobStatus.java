package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow job in progress workflow job status. */
@CatalogSchema("webhooks/workflow-job-in-progress/requestBody/properties/workflow_job/properties/status")
public enum GitHubWebhookWorkflowJobInProgressWorkflowJobStatus {
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowJobInProgressWorkflowJobStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookWorkflowJobInProgressWorkflowJobStatus.class,
                    GitHubWebhookWorkflowJobInProgressWorkflowJobStatus::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowJobInProgressWorkflowJobStatus(final String wireValue) {
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
     * The workflow job in progress workflow job status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowJobInProgressWorkflowJobStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
