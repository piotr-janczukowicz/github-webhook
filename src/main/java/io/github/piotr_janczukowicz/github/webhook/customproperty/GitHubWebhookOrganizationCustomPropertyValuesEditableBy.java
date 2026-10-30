package io.github.piotr_janczukowicz.github.webhook.customproperty;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** Who can edit the values of the property */
@CatalogSchema("webhooks/custom-property-created/requestBody/properties/definition/properties/values_editable_by")
public enum GitHubWebhookOrganizationCustomPropertyValuesEditableBy {
    ORG_ACTORS("org_actors"),
    ORG_AND_REPO_ACTORS("org_and_repo_actors"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookOrganizationCustomPropertyValuesEditableBy> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookOrganizationCustomPropertyValuesEditableBy.class,
                    GitHubWebhookOrganizationCustomPropertyValuesEditableBy::wireValue);

    private final String wireValue;

    GitHubWebhookOrganizationCustomPropertyValuesEditableBy(final String wireValue) {
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
     * The organization custom property values editable by from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookOrganizationCustomPropertyValuesEditableBy fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
