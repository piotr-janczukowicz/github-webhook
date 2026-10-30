package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The full repository security and analysis advanced security status. */
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/security_and_analysis/properties/advanced_security/properties/status")
public enum GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus {
    ENABLED("enabled"),
    DISABLED("disabled"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus.class,
                    GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus::wireValue);

    private final String wireValue;

    GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus(final String wireValue) {
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
     * The full repository security and analysis advanced security status from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookFullRepositorySecurityAndAnalysisAdvancedSecurityStatus fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
