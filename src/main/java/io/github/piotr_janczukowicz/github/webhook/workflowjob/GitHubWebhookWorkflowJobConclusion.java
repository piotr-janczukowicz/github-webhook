package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow job conclusion. */
@CatalogSchema("webhooks/workflow-job-completed/requestBody/properties/workflow_job/properties/conclusion")
public enum GitHubWebhookWorkflowJobConclusion {
    SUCCESS("success"),
    FAILURE("failure"),
    SKIPPED("skipped"),
    CANCELLED("cancelled"),
    ACTION_REQUIRED("action_required"),
    NEUTRAL("neutral"),
    TIMED_OUT("timed_out"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowJobConclusion> WIRE_INDEX =
            EnumUtils.index(GitHubWebhookWorkflowJobConclusion.class, GitHubWebhookWorkflowJobConclusion::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowJobConclusion(final String wireValue) {
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
     * The workflow job conclusion from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowJobConclusion fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
