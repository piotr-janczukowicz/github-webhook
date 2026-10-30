package io.github.piotr_janczukowicz.github.webhook.checksuite;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The summary status for all check runs that are part of the check suite. Can be {@code requested},
 * {@code in_progress}, or {@code completed}.
 */
@CatalogSchema("webhooks/check-suite-requested/requestBody/properties/check_suite/properties/status")
public enum GitHubWebhookCheckSuiteRequestedCheckSuiteStatus {
    REQUESTED("requested"),
    IN_PROGRESS("in_progress"),
    COMPLETED("completed"),
    QUEUED("queued"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCheckSuiteRequestedCheckSuiteStatus> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCheckSuiteRequestedCheckSuiteStatus.class,
                    GitHubWebhookCheckSuiteRequestedCheckSuiteStatus::wireValue);

    private final String wireValue;

    GitHubWebhookCheckSuiteRequestedCheckSuiteStatus(final String wireValue) {
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
     * The check suite requested check suite status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCheckSuiteRequestedCheckSuiteStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
