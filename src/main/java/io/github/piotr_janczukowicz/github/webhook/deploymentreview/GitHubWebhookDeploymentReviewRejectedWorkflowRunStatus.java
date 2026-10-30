package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The deployment review rejected workflow run status. */
@CatalogSchema("webhooks/deployment-review-rejected/requestBody/properties/workflow_run/properties/status")
public enum GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus {
    REQUESTED("requested"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    WAITING("waiting"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus.class,
                    GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus::wireValue);

    private final String wireValue;

    GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus(final String wireValue) {
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
     * The deployment review rejected workflow run status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDeploymentReviewRejectedWorkflowRunStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
