package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * The vulnerable dependency's relationship to your project. &gt; [!NOTE] &gt; We are rolling out support for dependency
 * relationship across ecosystems. This value will be "unknown" for all dependencies in unsupported ecosystems.
 */
@CatalogSchema(
        "webhooks/dependabot-alert-assignees-changed/requestBody/properties/alert/properties/dependency/properties/relationship")
public enum GitHubWebhookDependabotAlertFixedAlertDependencyRelationship {
    UNKNOWN("unknown"),
    DIRECT("direct"),
    TRANSITIVE("transitive"),
    INCONCLUSIVE("inconclusive"),
    /** A value this library version does not know. */
    UNRECOGNIZED("unrecognized");

    private static final EnumUtils.WireIndex<GitHubWebhookDependabotAlertFixedAlertDependencyRelationship> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookDependabotAlertFixedAlertDependencyRelationship.class,
                    GitHubWebhookDependabotAlertFixedAlertDependencyRelationship::wireValue);

    private final String wireValue;

    GitHubWebhookDependabotAlertFixedAlertDependencyRelationship(final String wireValue) {
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
     * The dependabot alert fixed alert dependency relationship from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNRECOGNIZED} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookDependabotAlertFixedAlertDependencyRelationship fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNRECOGNIZED);
    }
}
