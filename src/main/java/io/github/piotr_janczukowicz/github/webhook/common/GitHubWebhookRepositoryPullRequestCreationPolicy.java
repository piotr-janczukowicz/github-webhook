package io.github.piotr_janczukowicz.github.webhook.common;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The policy controlling who can create pull requests: all or collaborators_only. */
@CatalogSchema(
        "webhooks/branch-protection-configuration-disabled/requestBody/properties/repository/properties/pull_request_creation_policy")
public enum GitHubWebhookRepositoryPullRequestCreationPolicy {
    ALL("all"),
    COLLABORATORS_ONLY("collaborators_only"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryPullRequestCreationPolicy> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositoryPullRequestCreationPolicy.class,
                    GitHubWebhookRepositoryPullRequestCreationPolicy::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryPullRequestCreationPolicy(final String wireValue) {
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
     * The repository pull request creation policy from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryPullRequestCreationPolicy fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
