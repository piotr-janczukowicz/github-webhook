package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of request. */
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/request_type")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public enum GitHubWebhookExemptionRequestRequestType {
    PUSH_RULESET_BYPASS("push_ruleset_bypass"),
    SECRET_SCANNING("secret_scanning"),
    SECRET_SCANNING_CLOSURE("secret_scanning_closure"),
    CODE_SCANNING_ALERT_DISMISSAL("code_scanning_alert_dismissal"),
    DEPENDABOT_ALERT_DISMISSAL("dependabot_alert_dismissal"),
    LICENSE_COMPLIANCE_DISMISSAL("license_compliance_dismissal"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookExemptionRequestRequestType> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookExemptionRequestRequestType.class, GitHubWebhookExemptionRequestRequestType::wireValue);

    private final String wireValue;

    GitHubWebhookExemptionRequestRequestType(final String wireValue) {
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
     * The exemption request request type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookExemptionRequestRequestType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
