package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The token status as of the latest validity check. */
@CatalogSchema("webhooks/secret-scanning-alert-assigned/requestBody/properties/alert/properties/validity")
public enum GitHubWebhookSecretScanningAlertCreatedAlertValidity {
    ACTIVE("active"),
    INACTIVE("inactive"),
    UNKNOWN("unknown"),
    /** A value this library version does not know. */
    UNRECOGNIZED("unrecognized");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningAlertCreatedAlertValidity> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookSecretScanningAlertCreatedAlertValidity.class,
                    GitHubWebhookSecretScanningAlertCreatedAlertValidity::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningAlertCreatedAlertValidity(final String wireValue) {
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
     * The secret scanning alert created alert validity from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNRECOGNIZED} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningAlertCreatedAlertValidity fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNRECOGNIZED);
    }
}
