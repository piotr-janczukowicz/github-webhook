package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The summary status for all check runs that are part of the check suite. Can be {@code requested},
 * {@code in_progress}, or {@code completed}.
 */
@CatalogSchema("webhooks/check-suite-completed/requestBody/properties/check_suite/properties/status")
public enum GitHubWebhookCheckSuiteCompletedCheckSuiteStatus {
    REQUESTED("requested"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    PENDING("pending"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCheckSuiteCompletedCheckSuiteStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCheckSuiteCompletedCheckSuiteStatus.class,
                    GitHubWebhookCheckSuiteCompletedCheckSuiteStatus::wireValue);

    private final String wireValue;

    GitHubWebhookCheckSuiteCompletedCheckSuiteStatus(final String wireValue) {
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
     * The check suite completed check suite status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCheckSuiteCompletedCheckSuiteStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
