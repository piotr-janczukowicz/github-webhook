package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The type of actor that can bypass a ruleset. */
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/bypass_actors/items/properties/actor_type")
public enum GitHubWebhookRepositoryRulesetBypassActorActorType {
    INTEGRATION("Integration"),
    ORGANIZATIONADMIN("OrganizationAdmin"),
    REPOSITORYROLE("RepositoryRole"),
    TEAM("Team"),
    DEPLOYKEY("DeployKey"),
    USER("User"),
    ENTERPRISEOWNER("EnterpriseOwner"),
    ENTERPRISEROLE("EnterpriseRole"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookRepositoryRulesetBypassActorActorType> WIRE_INDEX =
            EnumUtils.index(
                    GitHubWebhookRepositoryRulesetBypassActorActorType.class,
                    GitHubWebhookRepositoryRulesetBypassActorActorType::wireValue);

    private final String wireValue;

    GitHubWebhookRepositoryRulesetBypassActorActorType(final String wireValue) {
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
     * The repository ruleset bypass actor actor type from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookRepositoryRulesetBypassActorActorType fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
