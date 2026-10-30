package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import org.jspecify.annotations.Nullable;

/**
 * An actor that can bypass rules in a ruleset
 *
 * @param actorId The ID of the actor that can bypass a ruleset. Required for {@code Integration},
 *     {@code RepositoryRole}, {@code Team}, and {@code User} actor types. If {@code actor_type} is
 *     {@code OrganizationAdmin}, {@code actor_id} is ignored. If {@code actor_type} is {@code DeployKey}, this should
 *     be null. {@code OrganizationAdmin} is not applicable for personal repositories.
 * @param actorType The type of actor that can bypass a ruleset.
 * @param bypassMode When the specified actor can bypass the ruleset. {@code pull_request} means that an actor can only
 *     bypass rules on pull requests. {@code pull_request} is not applicable for the {@code DeployKey} actor type. Also,
 *     {@code pull_request} is only applicable to branch rulesets. When {@code bypass_mode} is {@code exempt}, rules
 *     will not be run for that actor and a bypass audit entry will not be created.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema(
        "webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset/properties/bypass_actors/items")
public record GitHubWebhookRepositoryRulesetBypassActor(
        @Nullable Long actorId,
        GitHubWebhookRepositoryRulesetBypassActorActorType actorType,
        @Nullable GitHubWebhookRepositoryRulesetBypassActorBypassMode bypassMode) {
    public GitHubWebhookRepositoryRulesetBypassActor {
        requireNonNull(actorType, "actorType");
    }
}
