package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The current status of the check run. Can be {@code queued}, {@code in_progress}, or {@code completed}. */
@CatalogSchema("webhooks/deployment-status-created/requestBody/properties/check_run/properties/status")
public enum GitHubWebhookDeploymentStatusCreatedCheckRunStatus {
    QUEUED("queued"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    WAITING("waiting"),
    PENDING("pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDeploymentStatusCreatedCheckRunStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDeploymentStatusCreatedCheckRunStatus.class,
                    GitHubWebhookDeploymentStatusCreatedCheckRunStatus::wireValue);

    private final String wireValue;

    GitHubWebhookDeploymentStatusCreatedCheckRunStatus(final String wireValue) {
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
     * The deployment status created check run status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDeploymentStatusCreatedCheckRunStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
