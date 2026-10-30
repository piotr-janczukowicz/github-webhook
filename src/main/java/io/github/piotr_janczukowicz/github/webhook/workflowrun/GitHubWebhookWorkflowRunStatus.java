package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow run status. */
@CatalogSchema("webhooks/workflow-run-completed/requestBody/properties/workflow_run/properties/status")
public enum GitHubWebhookWorkflowRunStatus {
    REQUESTED("requested"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    PENDING("pending"),
    WAITING("waiting"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowRunStatus> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookWorkflowRunStatus.class, GitHubWebhookWorkflowRunStatus::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowRunStatus(final String wireValue) {
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
     * The workflow run status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowRunStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
