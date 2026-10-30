package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The execution scope of the vulnerable dependency. */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dependency/properties/scope")
public enum GitHubWebhookDependabotAlertFixedAlertDependencyScope {
    DEVELOPMENT("development"),
    RUNTIME("runtime"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertDependencyScope> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertDependencyScope.class,
                    GitHubWebhookDependabotAlertFixedAlertDependencyScope::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertDependencyScope(final String wireValue) {
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
     * The dependabot alert fixed alert dependency scope from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertDependencyScope fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
