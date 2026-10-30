package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow run conclusion. */
@CatalogSchema("webhooks/workflow-run-completed/requestBody/properties/workflow_run/properties/conclusion")
public enum GitHubWebhookWorkflowRunConclusion {
    ACTION_REQUIRED("action_required"),
    CANCELLED("cancelled"),
    FAILURE("failure"),
    NEUTRAL("neutral"),
    SKIPPED("skipped"),
    STALE("stale"),
    SUCCESS("success"),
    TIMED_OUT("timed_out"),
    STARTUP_FAILURE("startup_failure"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowRunConclusion> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookWorkflowRunConclusion.class, GitHubWebhookWorkflowRunConclusion::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowRunConclusion(final String wireValue) {
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
     * The workflow run conclusion from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowRunConclusion fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
