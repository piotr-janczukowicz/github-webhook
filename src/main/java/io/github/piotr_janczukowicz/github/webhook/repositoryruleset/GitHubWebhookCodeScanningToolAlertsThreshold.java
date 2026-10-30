package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The severity level at which code scanning results that raise alerts block a reference update. For more information on
 * alert severity levels, see "[About code scanning
 * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels)."
 */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/16/properties/parameters/properties/code_scanning_tools/items/properties/alerts_threshold")
public enum GitHubWebhookCodeScanningToolAlertsThreshold {
    NONE("none"),
    ERRORS("errors"),
    ERRORS_AND_WARNINGS("errors_and_warnings"),
    ALL("all"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningToolAlertsThreshold> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookCodeScanningToolAlertsThreshold.class,
            GitHubWebhookCodeScanningToolAlertsThreshold::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningToolAlertsThreshold(final String wireValue) {
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
     * The code scanning tool alerts threshold from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningToolAlertsThreshold fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
