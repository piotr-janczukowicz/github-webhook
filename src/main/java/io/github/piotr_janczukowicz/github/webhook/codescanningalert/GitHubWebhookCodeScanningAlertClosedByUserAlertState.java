package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** State of a code scanning alert. */
@CatalogSchema("webhooks/code-scanning-alert-closed-by-user/requestBody/properties/alert/properties/state")
public enum GitHubWebhookCodeScanningAlertClosedByUserAlertState {
    DISMISSED("dismissed"),
    FIXED("fixed"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningAlertClosedByUserAlertState> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCodeScanningAlertClosedByUserAlertState.class,
                    GitHubWebhookCodeScanningAlertClosedByUserAlertState::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningAlertClosedByUserAlertState(final String wireValue) {
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
     * The code scanning alert closed by user alert state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningAlertClosedByUserAlertState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
