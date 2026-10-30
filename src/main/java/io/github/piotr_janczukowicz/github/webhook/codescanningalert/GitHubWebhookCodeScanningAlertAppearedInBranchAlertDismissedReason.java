package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason for dismissing or closing the alert. */
@CatalogSchema(
        "webhooks/code-scanning-alert-appeared-in-branch/requestBody/properties/alert/properties/dismissed_reason")
public enum GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason {
    FALSE_POSITIVE("false positive"),
    WON_T_FIX("won't fix"),
    USED_IN_TESTS("used in tests"),
    MITIGATED("mitigated"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason.class,
                    GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason::wireValue);

    private final String wireValue;

    GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason(final String wireValue) {
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
     * The code scanning alert appeared in branch alert dismissed reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCodeScanningAlertAppearedInBranchAlertDismissedReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
