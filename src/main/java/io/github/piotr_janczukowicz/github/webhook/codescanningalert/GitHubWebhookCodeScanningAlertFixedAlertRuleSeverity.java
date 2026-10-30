package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The severity of the alert. */
@CatalogSchema(
        "webhooks/code-scanning-alert-closed-by-user/requestBody/properties/alert/properties/rule/properties/severity")
public enum GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity {
    NONE("none"),
    NOTE("note"),
    WARNING("warning"),
    ERROR("error"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity.class,
                    GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity(final String wireValue) {
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
     * The code scanning alert fixed alert rule severity from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningAlertFixedAlertRuleSeverity fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
