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
@CatalogSchema("webhooks/code-scanning-alert-reopened-by-user/requestBody/properties/alert/properties/state")
public enum GitHubWebhookCodeScanningAlertReopenedByUserAlertState {
    OPEN("open"),
    FIXED("fixed"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningAlertReopenedByUserAlertState> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCodeScanningAlertReopenedByUserAlertState.class,
                    GitHubWebhookCodeScanningAlertReopenedByUserAlertState::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningAlertReopenedByUserAlertState(final String wireValue) {
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
     * The code scanning alert reopened by user alert state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningAlertReopenedByUserAlertState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
