package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/**
 * When the specified actor can bypass the ruleset. {@code pull_request} means that an actor can only bypass rules on
 * pull requests. {@code pull_request} is not applicable for the {@code DeployKey} actor type. Also,
 * {@code pull_request} is only applicable to branch rulesets. When {@code bypass_mode} is {@code exempt}, rules will
 * not be run for that actor and a bypass audit entry will not be created.
 */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/bypass_actors/items/properties/bypass_mode")
public enum GitHubWebhookRepositoryRulesetBypassActorBypassMode {
    ALWAYS("always"),
    PULL_REQUEST("pull_request"),
    EXEMPT("exempt"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetBypassActorBypassMode> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositoryRulesetBypassActorBypassMode.class,
                    GitHubWebhookRepositoryRulesetBypassActorBypassMode::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetBypassActorBypassMode(final String wireValue) {
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
     * The repository ruleset bypass actor bypass mode from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetBypassActorBypassMode fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
