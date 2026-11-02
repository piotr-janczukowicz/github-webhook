package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The reachability verdict for the alert. - {@code reachable}: a path from the repository's code reaches a vulnerable
 * function. - {@code unreachable}: no path from the repository's code reaches a vulnerable function. -
 * {@code potentially_reachable}: reachability could not be determined with confidence; review manually. -
 * {@code unavailable}: no verdict has been computed for the alert yet. - {@code disabled}: reachability analysis is not
 * enabled for the repository.
 */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/reachability/properties/verdict")
public enum GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict {
    REACHABLE("reachable"),
    UNREACHABLE("unreachable"),
    POTENTIALLY_REACHABLE("potentially_reachable"),
    UNAVAILABLE("unavailable"),
    DISABLED("disabled"),
    /** A value this library version does not know. */
    UNRECOGNIZED("unrecognized");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict.class,
                    GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict(final String wireValue) {
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
     * The dependabot alert fixed alert reachability verdict from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNRECOGNIZED} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertReachabilityVerdict fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNRECOGNIZED);
    }
}
