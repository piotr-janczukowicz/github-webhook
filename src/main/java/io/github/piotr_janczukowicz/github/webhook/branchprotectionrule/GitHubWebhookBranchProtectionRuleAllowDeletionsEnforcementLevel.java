package io.github.piotr_janczukowicz.github.webhook.branchprotectionrule;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.piotr_janczukowicz.openapi.model.CatalogSchema;
import io.github.piotr_janczukowicz.util.EnumUtils;

/** The branch protection rule allow deletions enforcement level. */
@CatalogSchema(
        "webhooks/branch-protection-rule-created/requestBody/properties/rule/properties/allow_deletions_enforcement_level")
public enum GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel {
    OFF("off"),
    NON_ADMINS("non_admins"),
    EVERYONE("everyone"),
    /** A value this library version does not know. */
    UNKNOWN("unknown");

    private static final EnumUtils.WireIndex<GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel>
            WIRE_INDEX = EnumUtils.index(
                    GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel.class,
                    GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel::wireValue);

    private final String wireValue;

    GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel(final String wireValue) {
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
     * The branch protection rule allow deletions enforcement level from a wire value.
     *
     * @param value JSON value
     * @return matching value, or {@code UNKNOWN} when this library version does not know it
     * @throws NullPointerException if {@code value} is {@code null}
     */
    @JsonCreator
    public static GitHubWebhookBranchProtectionRuleAllowDeletionsEnforcementLevel fromWire(final String value) {
        requireNonNull(value, "value");

        return WIRE_INDEX.fromWire(value, UNKNOWN);
    }
}
