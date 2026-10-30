package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The operator to use for matching. */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/10/properties/parameters/properties/operator")
public enum GitHubWebhookTagNamePatternParametersOperator {
    STARTS_WITH("starts_with"),
    ENDS_WITH("ends_with"),
    CONTAINS("contains"),
    REGEX("regex"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookTagNamePatternParametersOperator> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookTagNamePatternParametersOperator.class,
                    GitHubWebhookTagNamePatternParametersOperator::wireValue);

    private final String wireValue;

    GitHubWebhookTagNamePatternParametersOperator(final String wireValue) {
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
     * The tag name pattern parameters operator from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookTagNamePatternParametersOperator fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
