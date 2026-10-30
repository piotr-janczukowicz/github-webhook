package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The source type of the property */
@CatalogSchema("webhooks/custom-property-created/requestBody/properties/definition/properties/source_type")
public enum GitHubWebhookOrganizationCustomPropertySourceType {
    ORGANIZATION("organization"),
    ENTERPRISE("enterprise"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookOrganizationCustomPropertySourceType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookOrganizationCustomPropertySourceType.class,
                    GitHubWebhookOrganizationCustomPropertySourceType::wireValue);

    private final String wireValue;

    GitHubWebhookOrganizationCustomPropertySourceType(final String wireValue) {
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
     * The organization custom property source type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookOrganizationCustomPropertySourceType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
