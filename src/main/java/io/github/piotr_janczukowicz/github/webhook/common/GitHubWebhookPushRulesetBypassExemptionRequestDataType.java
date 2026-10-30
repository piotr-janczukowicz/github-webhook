package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of request */
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/exemption_request_data/oneOf/0/properties/type")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public enum GitHubWebhookPushRulesetBypassExemptionRequestDataType {
    PUSH_RULESET_BYPASS("push_ruleset_bypass"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookPushRulesetBypassExemptionRequestDataType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPushRulesetBypassExemptionRequestDataType.class,
                    GitHubWebhookPushRulesetBypassExemptionRequestDataType::wireValue);

    private final String wireValue;

    GitHubWebhookPushRulesetBypassExemptionRequestDataType(final String wireValue) {
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
     * The push ruleset bypass exemption request data type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPushRulesetBypassExemptionRequestDataType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
