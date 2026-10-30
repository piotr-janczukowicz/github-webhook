package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of the value for the property */
@CatalogSchema("webhooks/custom-property-created/requestBody/properties/definition/properties/value_type")
public enum GitHubWebhookOrganizationCustomPropertyValueType {
    STRING("string"),
    SINGLE_SELECT("single_select"),
    MULTI_SELECT("multi_select"),
    TRUE_FALSE("true_false"),
    URL("url"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookOrganizationCustomPropertyValueType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookOrganizationCustomPropertyValueType.class,
                    GitHubWebhookOrganizationCustomPropertyValueType::wireValue);

    private final String wireValue;

    GitHubWebhookOrganizationCustomPropertyValueType(final String wireValue) {
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
     * The organization custom property value type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookOrganizationCustomPropertyValueType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
