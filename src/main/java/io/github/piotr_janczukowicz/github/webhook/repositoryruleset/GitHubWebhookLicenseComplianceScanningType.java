package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The license compliance scanning type. */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/rules/items/oneOf/20/properties/type")
public enum GitHubWebhookLicenseComplianceScanningType {
    LICENSE_COMPLIANCE_SCANNING("license_compliance_scanning"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookLicenseComplianceScanningType> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookLicenseComplianceScanningType.class, GitHubWebhookLicenseComplianceScanningType::wireValue);

    private final String wireValue;

    GitHubWebhookLicenseComplianceScanningType(final String wireValue) {
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
     * The license compliance scanning type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookLicenseComplianceScanningType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
