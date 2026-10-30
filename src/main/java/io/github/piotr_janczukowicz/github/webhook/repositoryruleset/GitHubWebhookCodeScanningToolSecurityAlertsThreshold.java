package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The severity level at which code scanning results that raise security alerts block a reference update. For more
 * information on security severity levels, see "[About code scanning
 * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels)."
 */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/16/properties/parameters/properties/code_scanning_tools/items/properties/security_alerts_threshold")
public enum GitHubWebhookCodeScanningToolSecurityAlertsThreshold {
    NONE("none"),
    CRITICAL("critical"),
    HIGH_OR_HIGHER("high_or_higher"),
    MEDIUM_OR_HIGHER("medium_or_higher"),
    ALL("all"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningToolSecurityAlertsThreshold> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCodeScanningToolSecurityAlertsThreshold.class,
                    GitHubWebhookCodeScanningToolSecurityAlertsThreshold::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningToolSecurityAlertsThreshold(final String wireValue) {
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
     * The code scanning tool security alerts threshold from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningToolSecurityAlertsThreshold fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
