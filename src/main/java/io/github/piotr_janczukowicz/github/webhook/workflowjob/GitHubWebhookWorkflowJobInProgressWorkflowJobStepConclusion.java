package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The workflow job in progress workflow job step conclusion. */
@CatalogSchema(
        "webhooks/workflow-job-in-progress/requestBody/properties/workflow_job/properties/steps/items/properties/conclusion")
public enum GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion {
    FAILURE("failure"),
    SKIPPED("skipped"),
    SUCCESS("success"),
    CANCELLED("cancelled"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion.class,
                    GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion::wireValue);

    private final String wireValue;

    GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion(final String wireValue) {
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
     * The workflow job in progress workflow job step conclusion from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookWorkflowJobInProgressWorkflowJobStepConclusion fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
