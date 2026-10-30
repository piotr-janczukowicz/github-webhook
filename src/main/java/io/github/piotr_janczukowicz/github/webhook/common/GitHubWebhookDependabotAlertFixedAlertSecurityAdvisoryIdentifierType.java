package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of advisory identifier. */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/security_advisory/properties/identifiers/items/properties/type")
public enum GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType {
    CVE("CVE"),
    GHSA("GHSA"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType.class,
                    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType(final String wireValue) {
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
     * The dependabot alert fixed alert security advisory identifier type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
