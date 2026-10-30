package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The reason for the exemption request */
@CatalogSchema(
        "webhooks/bypass-request-secret-scanning-cancelled/requestBody/properties/exemption_request/properties/metadata/properties/reason")
@Flavors({GitHubWebhookFlavor.GHEC, GitHubWebhookFlavor.GHES})
public enum GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason {
    FIXED_LATER("fixed_later"),
    FALSE_POSITIVE("false_positive"),
    TESTS("tests"),
    REVOKED("revoked"),
    FALSE_POSITIVE_WITH_SPACES("false positive"),
    WON_T_FIX("won't fix"),
    USED_IN_TESTS("used in tests"),
    FIX_STARTED("fix_started"),
    INACCURATE("inaccurate"),
    NO_BANDWIDTH("no_bandwidth"),
    NOT_USED("not_used"),
    TOLERABLE_RISK("tolerable_risk"),
    AMENDMENT("amendment"),
    PRIVATE_PACKAGE("private package"),
    INACCURATE_LICENSE("inaccurate license"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason.class,
                    GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason::wireValue);

    private final String wireValue;

    GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason(final String wireValue) {
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
     * The secret scanning push protection exemption request metadata reason from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
