package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.github.webhook.Flavors;
import io.github.piotr_janczukowicz.github.webhook.GitHubWebhookFlavor;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The state of the advisory. */
@CatalogSchema("webhooks/repository-advisory-published/requestBody/properties/repository_advisory/properties/state")
@Flavors({GitHubWebhookFlavor.CLOUD, GitHubWebhookFlavor.GHEC})
public enum GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState {
    PUBLISHED("published"),
    CLOSED("closed"),
    WITHDRAWN("withdrawn"),
    DRAFT("draft"),
    TRIAGE("triage"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState.class,
                    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState(final String wireValue) {
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
     * The repository advisory reported repository advisory state from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryAdvisoryReportedRepositoryAdvisoryState fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
