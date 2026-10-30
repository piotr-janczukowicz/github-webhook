package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.piotr_janczukowicz.annotation.RecordBuilder;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * A set of rules to apply when specified conditions are met.
 *
 * @param links _links
 * @param bypassActors The actors that can bypass the rules in this ruleset
 * @param conditions conditions
 * @param createdAt created_at
 * @param currentUserCanBypass The bypass type of the user making the API request for this ruleset. This field is only
 *     returned when querying the repository-level endpoint.
 * @param enforcement The enforcement level of the ruleset. {@code evaluate} allows admins to test rules before
 *     enforcing them. Admins can view insights on the Rule Insights page ({@code evaluate} is only available with
 *     GitHub Enterprise).
 * @param id The ID of the ruleset
 * @param name The name of the ruleset
 * @param nodeId node_id
 * @param rules rules
 * @param source The name of the source
 * @param sourceType The type of the source of the ruleset
 * @param target The target of the ruleset
 * @param updatedAt updated_at
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RecordBuilder
@CatalogSchema("webhooks/repository-ruleset-created/requestBody/properties/repository_ruleset")
public record GitHubWebhookRepositoryRuleset(
        @Nullable @JsonProperty("_links") GitHubWebhookRepositoryRulesetLinks links,
        @Nullable List<GitHubWebhookRepositoryRulesetBypassActor> bypassActors,
        @Nullable GitHubWebhookRepositoryRulesetConditions conditions,
        @Nullable Instant createdAt,
        @Nullable GitHubWebhookRepositoryRulesetCurrentUserCanBypass currentUserCanBypass,
        GitHubWebhookRepositoryRulesetEnforcement enforcement,
        long id,
        String name,
        @Nullable String nodeId,
        @Nullable List<GitHubWebhookRepositoryRulesetRule> rules,
        String source,
        @Nullable GitHubWebhookRepositoryRulesetSourceType sourceType,
        @Nullable GitHubWebhookRepositoryRulesetTarget target,
        @Nullable Instant updatedAt) {
    public GitHubWebhookRepositoryRuleset {
        requireNonNull(enforcement, "enforcement");
        requireNonNull(name, "name");
        requireNonNull(source, "source");
    }
}
