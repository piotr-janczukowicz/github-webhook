package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The deployment workflow run status. */
@CatalogSchema("webhooks/deployment-created/requestBody/properties/workflow_run/properties/status")
public enum GitHubWebhookDeploymentWorkflowRunStatus {
    REQUESTED("requested"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    WAITING("waiting"),
    PENDING("pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDeploymentWorkflowRunStatus> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookDeploymentWorkflowRunStatus.class, GitHubWebhookDeploymentWorkflowRunStatus::wireValue);

    private final String wireValue;

    GitHubWebhookDeploymentWorkflowRunStatus(final String wireValue) {
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
     * The deployment workflow run status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDeploymentWorkflowRunStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
