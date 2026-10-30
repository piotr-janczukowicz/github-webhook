package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The severity of the advisory. */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/severity")
public enum GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high"),
    CRITICAL("critical"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity.class,
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity(final String wireValue) {
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
     * The dependabot alert fixed alert security advisory severity from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisorySeverity fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
