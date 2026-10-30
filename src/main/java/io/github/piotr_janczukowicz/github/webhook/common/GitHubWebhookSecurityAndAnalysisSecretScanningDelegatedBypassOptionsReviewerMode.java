package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The bypass mode for the reviewer */
@CatalogSchema(
        "webhooks/check-run-completed/requestBody/properties/check_run/properties/check_suite/properties/repository/properties/security_and_analysis/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/properties/mode")
public enum GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode {
    ALWAYS("ALWAYS"),
    EXEMPT("EXEMPT"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<
                    GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode.class,
                    GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode::wireValue);

    private final String wireValue;

    GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode(final String wireValue) {
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
     * The security and analysis secret scanning delegated bypass options reviewer mode from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecurityAndAnalysisSecretScanningDelegatedBypassOptionsReviewerMode fromWire(
            final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
