package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The classification of the advisory. */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/classification")
public enum GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification {
    GENERAL("general"),
    MALWARE("malware"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification.class,
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification(final String wireValue) {
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
     * The dependabot alert fixed alert security advisory classification from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
