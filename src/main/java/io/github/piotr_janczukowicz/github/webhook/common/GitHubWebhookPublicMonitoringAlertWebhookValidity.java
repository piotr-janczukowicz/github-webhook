package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The token status as of the latest validity check. */
@CatalogSchema("webhooks/secret-scanning-alert-assigned/requestBody/properties/alert/properties/validity")
public enum GitHubWebhookPublicMonitoringAlertWebhookValidity {
    ACTIVE("active"),
    INACTIVE("inactive"),
    UNKNOWN("unknown"),
    /** A value this library version does not know. */
    UNRECOGNIZED("unrecognized");

    private static final EnumUtils.WireIndex<GitHubWebhookPublicMonitoringAlertWebhookValidity> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPublicMonitoringAlertWebhookValidity.class,
                    GitHubWebhookPublicMonitoringAlertWebhookValidity::wireValue);

    private final String wireValue;

    GitHubWebhookPublicMonitoringAlertWebhookValidity(final String wireValue) {
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
     * The public monitoring alert webhook validity from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNRECOGNIZED} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPublicMonitoringAlertWebhookValidity fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNRECOGNIZED);
    }
}
