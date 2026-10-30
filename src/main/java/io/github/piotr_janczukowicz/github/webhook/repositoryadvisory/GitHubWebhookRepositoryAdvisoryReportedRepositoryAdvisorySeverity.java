package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The severity of the advisory. */
@CatalogSchema("webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/severity")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity {
    CRITICAL("critical"),
    HIGH("high"),
    MEDIUM("medium"),
    LOW("low"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity.class,
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity(final String wireValue) {
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
     * The repository advisory reported repository advisory severity from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisorySeverity fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
