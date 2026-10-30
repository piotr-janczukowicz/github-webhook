package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason for resolving the alert. */
@CatalogSchema("webhooks/secret-scanning-alert-assigned/requestBody/properties/alert/properties/resolution")
public enum GitHubWebhookSecretScanningAlertCreatedAlertResolution {
    FALSE_POSITIVE("false_positive"),
    WONT_FIX("wont_fix"),
    REVOKED("revoked"),
    USED_IN_TESTS("used_in_tests"),
    PATTERN_DELETED("pattern_deleted"),
    PATTERN_EDITED("pattern_edited"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningAlertCreatedAlertResolution> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookSecretScanningAlertCreatedAlertResolution.class,
                    GitHubWebhookSecretScanningAlertCreatedAlertResolution::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningAlertCreatedAlertResolution(final String wireValue) {
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
     * The secret scanning alert created alert resolution from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningAlertCreatedAlertResolution fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
