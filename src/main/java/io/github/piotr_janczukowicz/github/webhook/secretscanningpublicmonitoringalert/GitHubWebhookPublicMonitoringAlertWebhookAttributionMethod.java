package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The method used to attribute the alert to the enterprise. */
@CatalogSchema(
        "webhooks/secret-scanning-public-monitoring-alert-created/requestBody/properties/alert/properties/attribution/properties/method")
@Flavors({GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod {
    MEMBER_ACTIVITY("member_activity"),
    VERIFIED_DOMAIN("verified_domain"),
    /** A value this library version does not know. */
    UNRECOGNIZED("unrecognized");

    private static final EnumUtils.WireIndex<GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod.class,
                    GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod::wireValue);

    private final String wireValue;

    GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod(final String wireValue) {
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
     * The public monitoring alert webhook attribution method from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNRECOGNIZED} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookPublicMonitoringAlertWebhookAttributionMethod fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNRECOGNIZED);
    }
}
