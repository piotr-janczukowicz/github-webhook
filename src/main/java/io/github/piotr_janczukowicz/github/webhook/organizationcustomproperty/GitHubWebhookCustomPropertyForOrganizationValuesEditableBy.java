package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** Who can edit the values of the property */
@CatalogSchema(
        "webhooks/organization-custom-property-created/requestBody/properties/definition/properties/values_editable_by")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public enum GitHubWebhookCustomPropertyForOrganizationValuesEditableBy {
    ENTERPRISE_ACTORS("enterprise_actors"),
    ENTERPRISE_AND_ORG_ACTORS("enterprise_and_org_actors"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookCustomPropertyForOrganizationValuesEditableBy> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.class,
                    GitHubWebhookCustomPropertyForOrganizationValuesEditableBy::wireValue);

    private final String wireValue;

    GitHubWebhookCustomPropertyForOrganizationValuesEditableBy(final String wireValue) {
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
     * The custom property for organization values editable by from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookCustomPropertyForOrganizationValuesEditableBy fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
