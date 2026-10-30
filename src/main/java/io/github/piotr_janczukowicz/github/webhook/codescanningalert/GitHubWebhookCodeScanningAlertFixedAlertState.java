package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * State of a code scanning alert. Events for alerts found outside the default branch will return a {@code null} value
 * until they are dismissed or fixed.
 */
@CatalogSchema("webhooks/code-scanning-alert-fixed/requestBody/properties/alert/properties/state")
public enum GitHubWebhookCodeScanningAlertFixedAlertState {
    FIXED("fixed"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningAlertFixedAlertState> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCodeScanningAlertFixedAlertState.class,
                    GitHubWebhookCodeScanningAlertFixedAlertState::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningAlertFixedAlertState(final String wireValue) {
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
     * The code scanning alert fixed alert state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningAlertFixedAlertState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
