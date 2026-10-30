package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The target of the ruleset */
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/target")
public enum GitHubWebhookRepositoryRulesetTarget {
    BRANCH("branch"),
    TAG("tag"),
    PUSH("push"),
    REPOSITORY("repository"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetTarget> WIRE_INDEX = EnumUtils.index(
            GitHubWebhookRepositoryRulesetTarget.class, GitHubWebhookRepositoryRulesetTarget::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetTarget(final String wireValue) {
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
     * The repository ruleset target from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetTarget fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
