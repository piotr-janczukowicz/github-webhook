package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of credit the user is receiving. */
@CatalogSchema(
        "webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/credits/items/properties/type")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType {
    ANALYST("analyst"),
    FINDER("finder"),
    REPORTER("reporter"),
    COORDINATOR("coordinator"),
    REMEDIATION_DEVELOPER("remediation_developer"),
    REMEDIATION_REVIEWER("remediation_reviewer"),
    REMEDIATION_VERIFIER("remediation_verifier"),
    TOOL("tool"),
    SPONSOR("sponsor"),
    OTHER("other"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType.class,
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType(final String wireValue) {
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
     * The repository advisory reported repository advisory credit type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryCreditType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
