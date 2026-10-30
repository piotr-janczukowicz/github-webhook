package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason that the alert was dismissed. */
@CatalogSchema("webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dismissed_reason")
public enum GitHubWebhookDependabotAlertFixedAlertDismissedReason {
    FIX_STARTED("fix_started"),
    INACCURATE("inaccurate"),
    NO_BANDWIDTH("no_bandwidth"),
    NOT_USED("not_used"),
    TOLERABLE_RISK("tolerable_risk"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertDismissedReason> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertDismissedReason.class,
                    GitHubWebhookDependabotAlertFixedAlertDismissedReason::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertDismissedReason(final String wireValue) {
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
     * The dependabot alert fixed alert dismissed reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertDismissedReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
