package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The summary conclusion for all check runs that are part of the check suite. This value will be {@code null} until the
 * check run has completed.
 */
@CatalogSchema("webhooks/check-suite-rerequested/requestBody/properties/check_suite/properties/conclusion")
public enum GitHubWebhookDeploymentWorkflowRunConclusion {
    SUCCESS("success"),
    FAILURE("failure"),
    NEUTRAL("neutral"),
    CANCELLED("cancelled"),
    TIMED_OUT("timed_out"),
    ACTION_REQUIRED("action_required"),
    STALE("stale"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDeploymentWorkflowRunConclusion> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookDeploymentWorkflowRunConclusion.class,
            GitHubWebhookDeploymentWorkflowRunConclusion::wireValue);

    private final String wireValue;

    GitHubWebhookDeploymentWorkflowRunConclusion(final String wireValue) {
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
     * The deployment workflow run conclusion from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDeploymentWorkflowRunConclusion fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
